package springframework.beans.factory.config;

import springframework.beans.BeanException;

import java.util.HashMap;

/**
 * 这个类就是一系列的抽象和接口的最后落脚点
 * 继承了抽象自动实例化接口，可以调用他的方法，并且实现他的父类的获取beanDefinition的方法
 * 实现了beanDefinition注册器的接口，实现里面的注册方法
 * 提供beanDefinition的容器
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{
    private HashMap<String,BeanDefinition> beanDefinitionMap=new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeanException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeanException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }
}
