package springframework.beans.factory.config;

import springframework.beans.BeanException;
import springframework.beans.factory.config.BeanDefinition;
import springframework.beans.factory.support.AbstractBeanFactory;

/**
 * 抽象自动实例化bean的工厂
 * 继承了抽象bean工厂，实现里面的createBean的抽象方法，同时因为抽象bean工厂类继承了默认单例注册器类，因此可以直接调用注册单例的方法
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeanException{
        Object bean = null;
        try{
            Class beanClass=beanDefinition.getBeanClass();
            bean = beanClass.newInstance();
        }catch (Exception e){
            throw new BeanException("初始化bean失败",e);
        }
        addSingleton(beanName,bean);
        return bean;
    }
}
