package org.springframework.bean.support;

import org.springframework.bean.config.SingletonBeanRegistry;

import java.util.HashMap;

/**
 * 实现单例bean注册器接口，实现获取单例对象的方法。
 * 一个单例对象注册器需要一个集合来保存所有的单例对象，需要获取和写入单例对象的方法
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private HashMap<String,Object> singletonBeanMap=new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonBeanMap.getOrDefault(beanName,null);
    }
    public void addSingleton(String beanName,Object singleton){
        singletonBeanMap.put(beanName,singleton);
    }

}
