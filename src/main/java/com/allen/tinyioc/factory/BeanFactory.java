package com.allen.tinyioc.factory;

import com.allen.tinyioc.BeanDefinition;

/**
 * bean的容器
 */
public interface BeanFactory {

    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;
}
