package springframework.beans.factory.support;

import springframework.beans.BeanException;
import springframework.beans.factory.config.BeanDefinition;
import springframework.beans.factory.support.AbstractBeanFactory;

import java.lang.reflect.Constructor;

/**
 * 抽象自动实例化bean的工厂
 * 继承了抽象bean工厂，实现里面的createBean的抽象方法，同时因为抽象bean工厂类继承了默认单例注册器类，因此可以直接调用注册单例的方法
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    //使用jdk动态代理
    private InstantiationStrategy strategy=new SimpleInstantiationStrategy();
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeanException{
        Object bean = null;
        try{
            bean = createBeanInstance(beanDefinition,beanName,args);
        }catch (Exception e){
            throw new BeanException("初始化bean失败",e);
        }
        addSingleton(beanName,bean);
        return bean;
    }
    protected Object createBeanInstance(BeanDefinition beanDefinition,String beanName,Object[] args){
        Class beanClass=beanDefinition.getBeanClass();
        Constructor constructor=null;
        try{
            for(Constructor c:beanClass.getConstructors()){
                //简化版的判断，仅仅通过比较参数数量选择构造方法
                if(c.getParameterCount()==args.length){
                    constructor=c;
                    break;
                }
            }
            return strategy.instantiate(beanDefinition,beanName,constructor,args);
        }catch (Exception e){
            throw new BeanException("构建失败",e);
        }
    }
}
