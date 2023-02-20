package springframework.beans.factory.support;

import springframework.beans.BeanException;
import springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 实例化策略接口，提供实例化的方法，需要知道beanDefinition，对应的构造方法，构造方法需要的参数
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeanException;
}
