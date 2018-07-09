package com.kz.dubbo.consumer;

import com.kz.dubbo.consumer.config.ConsumerServletContextInitializer;
import com.kz.dubbo.consumer.config.SpringUtilConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.*;


@Configuration
@EnableAutoConfiguration
@ComponentScan(
        basePackages = "com.kz.dubbo")
@EnableMBeanExport(defaultDomain = "consumer.kz.dubbo.com")
@Import(SpringUtilConfig.class)
public class ConsumerApplication extends SpringBootServletInitializer {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Bean
    public ServletContextInitializer initializer() {
        return new ConsumerServletContextInitializer();
    }

}
