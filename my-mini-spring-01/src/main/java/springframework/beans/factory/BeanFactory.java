package springframework.beans.factory;

import springframework.beans.BeanException;

/**
 * 定义beanFactory的接口，需要实现获取bean的方法
 */
public interface BeanFactory {
    Object getBean(String name) throws BeanException;
    //带参数的获取bean的方法，个人理解：因为会在获取bean的时候去创建bean，所以需要这样定义接口
    Object getBean(String name,Object... args) throws BeanException;
}
