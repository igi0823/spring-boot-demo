package com.intel.config;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import com.intel.component.TestBean;
import io.sentry.spring.SentryExceptionResolver;
import io.sentry.spring.SentryServletContextInitializer;
import javax.annotation.PostConstruct;
import io.sentry.Sentry;


@Configuration
@ComponentScan(basePackages = "com.intel")
public class TestConfiguration {

    public TestConfiguration(){
        System.out.println("i am TestConfiguration");
    }

    @Bean
    public TestBean testBean(){
        return new TestBean();
    }

    @Bean
    public HandlerExceptionResolver sentryExceptionResolver() {
        return new SentryExceptionResolver();
    }

    @Bean
    public ServletContextInitializer sentryServletContextInitializer() {
        return new SentryServletContextInitializer();
    }

//    @PostConstruct
    public void init(){
        Sentry.init("http://f6258f323dbb465ea17f35bb2ee447cd:2bb23d8f77904fa1be54af08933100ba@sentry.qfang.com/2");
    }
}
