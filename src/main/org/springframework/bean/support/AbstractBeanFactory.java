package org.springframework.bean.support;

import org.springframework.bean.BeanFactory;
import org.springframework.bean.config.BeanDefinition;

/**
 * 抽象bean工厂方法，实现了获取bean的接口方法
 * 同时继承了获取/写入单例对象的能力
 * 定义两个新的抽象方法，分别是创建bean和创建beanDefinition
 * 创建一个bean需要beanDefinition
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String beanName) throws Exception{
        Object bean=getSingleton(beanName);
        if(bean!=null){
            return bean;
        }
        BeanDefinition beanDefinition=getBeanDefinition(beanName);
        return createBean(beanName,beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String name);

    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition) throws Exception;
}
