package org.springframework.bean.support;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * 读取beandefinition的接口
 * 有了资源加载器，我们就能从资源中获取beandefinition的注册信息
 */
public interface BeanDefinitionReader {
    //获取beanDefinition的注册器
    BeanDefinitionRegistry getRegistry();
    //获取资源加载器
    ResourceLoader getResourceLoader();
    //不同的加载beanDefinition的方法
    void loadBeanDefinitions(Resource resource) throws Exception;

    void loadBeanDefinitions(String location) throws Exception;

    void loadBeanDefinitions(String[] locations) throws Exception;
}
