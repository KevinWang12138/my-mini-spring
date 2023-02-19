package springframework.beans.factory;

import springframework.beans.BeanException;

/**
 * 定义beanFactory的接口，需要实现获取bean的方法
 */
public interface BeanFactory {
    Object getBean(String name) throws BeanException;
}
