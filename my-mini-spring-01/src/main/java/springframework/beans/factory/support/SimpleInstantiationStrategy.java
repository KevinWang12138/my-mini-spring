package springframework.beans.factory.support;

import springframework.beans.BeanException;
import springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeanException {
        try{
            Class clazz=beanDefinition.getBeanClass();
            if(constructor!=null){
                //如果有构造器，则调用构造器
                return clazz.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
            }else{
                //如果没有，则说明应该使用无参构造进行构建
                return clazz.getDeclaredConstructor().newInstance();
            }
        }catch (Exception e){
            throw new BeanException("构建bean错误",e);
        }
    }
}
