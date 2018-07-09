package com.kz.dubbo.consumer.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * 以静态变量保存Spring ApplicationContext, 可在任何代码任何地方任何时候中取出ApplicaitonContext.
 *
 */
@Configuration
public class SpringContextHolder implements ApplicationContextAware {

    /**
     * 设置为静态变量
     */
    private static ApplicationContext applicationContext;

    /**
     * 获取ApplicationContext.
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        SpringContextHolder.applicationContext = applicationContext;
    }

    /**
     * 根据bean name获取bean
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {
        return (T) applicationContext.getBean(name);
    }

    /**
     * 根据bean name获取bean，在spring容器初始化过程中使用
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name, ApplicationContext applicationContext) {
        return (T) applicationContext.getBean(name);
    }

    /**
     * 根据bean class获取bean,如果多个符合则取第一个
     */
    public static <T> T getBean(Class<T> clazz) {
        Map<String, T> beanMaps = applicationContext.getBeansOfType(clazz);
        if (beanMaps != null && !beanMaps.isEmpty()) {
            return beanMaps.values().iterator().next();
        } else {
            return null;
        }
    }

    /**
     * 根据bean class获取bean,如果多个符合则取第一个，在spring容器初始化过程中使用
     */
    public static <T> T getBean(Class<T> clazz, ApplicationContext applicationContext) {
        Map<String, T> beanMaps = applicationContext.getBeansOfType(clazz);
        if (beanMaps != null && !beanMaps.isEmpty()) {
            return beanMaps.values().iterator().next();
        } else {
            return null;
        }
    }

}