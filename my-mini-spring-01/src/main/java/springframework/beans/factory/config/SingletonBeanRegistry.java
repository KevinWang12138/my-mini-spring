package springframework.beans.factory.config;

/**
 * 单例bean注册器，提供获取单例bean的接口
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
