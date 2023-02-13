package org.springframework.bean.support;

import org.springframework.bean.config.BeanDefinition;

import java.util.HashMap;

public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{
    public HashMap<String,BeanDefinition> definitionHashMap=new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String name) {
        return definitionHashMap.get(name);
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        definitionHashMap.put(beanName,beanDefinition);
    }
}
