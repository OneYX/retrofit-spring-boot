package com.github.oneyx.retrofit.spring.boot.autoconfigure;

/**
 * @author baitouweng
 */

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(RetrofitClientsRegistrar.class)
public @interface EnableRetrofitClients {

    String[] value() default {};

    String[] basePackages() default {};

    Class<?>[] basePackageClasses() default {};
}
