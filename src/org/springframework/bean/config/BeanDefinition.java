package org.springframework.bean.config;

/**
 * 一个简单的BeanDefinition
 * BeanDefinition用来描述一个bean，简化的BeanDefinition只包含bean的类
 */
public class BeanDefinition {
    private Class beanClass;

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public BeanDefinition(Class beanClass){
        this.beanClass=beanClass;
    }
}
