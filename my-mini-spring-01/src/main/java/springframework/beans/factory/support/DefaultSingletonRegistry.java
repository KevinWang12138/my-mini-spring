package springframework.beans.factory.support;

import springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;

/**
 * 默认单例注册器，实现单例bean注册器接口，实现其获取单例bean的方法
 * 在本类中还定义了bean的容器
 */
public class DefaultSingletonRegistry implements SingletonBeanRegistry {
    private HashMap<String,Object> singletonObjects=new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }
    //该方法可以被继承此类的方法调用
    protected void addSingleton(String name,Object singletonObject){
        singletonObjects.put(name,singletonObject);
    }
}
