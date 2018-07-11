package com.kz.dubbo.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.kz.dubbo.consumer.config.ConsumerServletContextInitializer;
import com.kz.dubbo.consumer.config.SpringUtilConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.*;


@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(
        basePackages = "com.kz.dubbo")
@EnableMBeanExport(defaultDomain = "consumer.kz.dubbo.com")
@Import(SpringUtilConfig.class)
@DubboComponentScan(basePackages = "com.kz.dubbo.consumer.service")
public class ConsumerApplication {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Bean
    public ServletContextInitializer initializer() {
        return new ConsumerServletContextInitializer();
    }

}
