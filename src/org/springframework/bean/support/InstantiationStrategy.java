package org.springframework.bean.support;

import org.springframework.bean.config.BeanDefinition;

/**
 * 之前创建一个bean使用的方式是简单的反射，通过对应bean的class对象的newInstance()方法实例化对象
 * 这种方法使用的是默认的构造函数，没有参数，现在约束一个接口，需要实现接口的类提供实例化bean的方法
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition) throws Exception;
}
