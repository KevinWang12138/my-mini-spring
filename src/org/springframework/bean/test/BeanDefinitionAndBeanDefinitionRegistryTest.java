package org.springframework.bean.test;

import org.junit.jupiter.api.Test;
import org.springframework.bean.config.BeanDefinition;
import org.springframework.bean.support.DefaultListableBeanFactory;

public class BeanDefinitionAndBeanDefinitionRegistryTest {
    @Test
    public void testBeanFactory() throws Exception{
        DefaultListableBeanFactory listableBeanFactory=new DefaultListableBeanFactory();
        BeanDefinition beanDefinition=new BeanDefinition(AService.class);
        listableBeanFactory.registerBeanDefinition("aService",beanDefinition);
        Object aService=listableBeanFactory.getBean("aService");
        System.out.println(aService);
    }

}
