package springframework.beans.factory.config;

/**
 * 定义注册bean的方法
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
