package com.github.oneyx.retrofit.spring.boot.autoconfigure;

import com.github.oneyx.retrofit.spring.boot.autoconfigure.instrument.interceptor.RetryInterceptor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * TODO 类描述
 *
 * @author baitouweng
 */

@Configuration
public class RetrofitClientsConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public OkHttpClient.Builder okHttpClient() {
        return new OkHttpClient.Builder();
    }

    @Bean
    public Interceptor retryInterceptor() {
        return new RetryInterceptor();
    }

    @Bean
    @Scope("prototype")
    @ConditionalOnMissingBean
    public Retrofit.Builder retrofitBuilder() {
        return new Retrofit.Builder();
    }

    @Configuration
    @ConditionalOnClass(GsonConverterFactory.class)
    protected static class CoverterConfiguration {

        @Bean
        @ConditionalOnMissingBean
        public Converter.Factory converterFactory() {
            return GsonConverterFactory.create();
        }
    }
}
