package springframework.beans.factory.support;

import springframework.beans.factory.BeanFactory;
import springframework.beans.factory.config.BeanDefinition;

/**
 * 抽象bean工厂类，实现了beanFactory接口，继承了默认单例注册器类
 * 在实现获取bean的方法的时候调用单例注册器的方法
 * 提供两个抽象接口供实现，分别是获取beanDefinition和创建bean
 *
 * 这个类叫做模版抽象类，定义了抽象方法供继承者来实现，但是继承者无需关心这两个方法是怎么调用的
 */
public abstract class AbstractBeanFactory extends DefaultSingletonRegistry implements BeanFactory {
    @Override
    public Object getBean(String beanName){
        Object bean = getSingleton(beanName);
        if(bean!=null){
            return bean;
        }
        BeanDefinition beanDefinition=getBeanDefinition(beanName);
        bean = createBean(beanName,beanDefinition);
        return bean;
    }
    protected abstract BeanDefinition getBeanDefinition(String beanName);
    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition);
}
