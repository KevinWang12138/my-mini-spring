package org.springframework.bean.support;

import org.springframework.bean.config.BeanDefinition;

/**
 * 继承抽象bean工厂类，实现其中的创建bean的方法
 * 同时保留了父类没被实现的获取beanDefinition的方法
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    private InstantiationStrategy instantiationStrategy = new SimpleInstantiationStrategy();
    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition) throws Exception{
        return doCreateBean(beanName,beanDefinition);
    }

    /**
     * 创建bean之后要将其写到单例集合中
     */
    public Object doCreateBean(String beanName, BeanDefinition beanDefinition) throws Exception{
        //Class beanClass=beanDefinition.getBeanClass();
        Object bean = null;
        try{
            //bean=beanClass.newInstance();
            //改为使用更加高级的构造方法创建bean对象
            bean = createBeanInstance(beanDefinition);
        }catch (Exception e){
            throw e;
        }
        addSingleton(beanName,bean);
        return bean;
    }
    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return getInstantiationStrategy().instantiate(beanDefinition);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }
    //可以自己创建bean工厂，自己约定使用哪种实例化bean的类
    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }

}
