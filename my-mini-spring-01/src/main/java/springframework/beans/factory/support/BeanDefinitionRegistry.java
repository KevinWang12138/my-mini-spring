package springframework.beans.factory.support;

import springframework.beans.factory.config.BeanDefinition;

/**
 * 定义注册bean的方法
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
