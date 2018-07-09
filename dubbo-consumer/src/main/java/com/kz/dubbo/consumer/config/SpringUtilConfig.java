package com.kz.dubbo.consumer.config;

import com.kz.dubbo.consumer.util.SpringContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kqhon on 2018/7/6.
 */
@Configuration
@Slf4j
public class SpringUtilConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringUtilConfig.class);
    @Bean
    @Autowired
    public SpringContextHolder springContextHolder(ApplicationContext applicationContext) {
        log.info("spring", "init spring holder");
        SpringContextHolder springContextHolder = new SpringContextHolder();
        springContextHolder.setApplicationContext(applicationContext);
        return springContextHolder;
    }
}
