package sample;

import com.github.oneyx.retrofit.spring.boot.autoconfigure.EnableRetrofitClients;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * TODO 类描述
 *
 * @author baitouweng
 */
@SpringBootApplication
@EnableRetrofitClients
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet(){
        return new ServletRegistrationBean(new HystrixMetricsStreamServlet(), "/hystrix.stream");
    }
}
