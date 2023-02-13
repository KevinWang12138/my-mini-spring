package org.springframework.bean.support;

import org.springframework.bean.config.BeanDefinition;

/**
 * 继承抽象bean工厂类，实现其中的创建bean的方法
 * 同时保留了父类没被实现的获取beanDefinition的方法
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition) throws Exception{
        return doCreateBean(beanName,beanDefinition);
    }

    /**
     * 创建bean之后要将其写到单例集合中
     */
    public Object doCreateBean(String beanName, BeanDefinition beanDefinition) throws Exception{
        Class beanClass=beanDefinition.getBeanClass();
        Object bean = null;
        try{
            bean=beanClass.newInstance();
        }catch (Exception e){
            throw e;
        }
        addSingleton(beanName,bean);
        return bean;
    }

}
