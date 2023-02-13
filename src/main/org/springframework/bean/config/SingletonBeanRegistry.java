package org.springframework.bean.config;

/**
 * 定义单例bean注册器的接口
 * 包含获取单例的方法接口
 */
public interface SingletonBeanRegistry {
    public Object getSingleton(String beanName);
}
