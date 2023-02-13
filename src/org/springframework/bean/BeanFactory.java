package org.springframework.bean;

/**
 * BeanFactory接口
 * 包含获取bean的方法接口
 */
public interface BeanFactory {
    public Object getBean(String beanName) throws Exception;
}
