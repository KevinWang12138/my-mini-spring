package org.springframework.bean.support;

import com.sun.org.apache.bcel.internal.Const;
import org.springframework.bean.config.BeanDefinition;

import java.lang.reflect.Constructor;

public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws Exception {
        /**
         * 简单的构造策略，通过无参实例进行构造
         */
        Class beanClass = beanDefinition.getBeanClass();
        Object bean = null;
        try {
            Constructor constructor=beanClass.getDeclaredConstructor();
            bean = constructor.newInstance();
        } catch (Exception e) {
            throw e;
        }
        return bean;
    }
}
