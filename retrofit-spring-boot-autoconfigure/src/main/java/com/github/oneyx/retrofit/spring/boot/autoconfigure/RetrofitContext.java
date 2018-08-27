package com.github.oneyx.retrofit.spring.boot.autoconfigure;

/**
 * TODO 类描述
 *
 * @author baitouweng
 */
public class RetrofitContext extends NamedContextFactory<RetrofitClientSpecification> {

    public RetrofitContext() {
        super(RetrofitClientsConfiguration.class, "retrofit", "retrofit.client.name");
    }
}
