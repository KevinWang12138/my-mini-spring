package org.springframework.bean.config;

import org.springframework.bean.PropertyValues;

/**
 * 一个简单的BeanDefinition
 * BeanDefinition用来描述一个bean，简化的BeanDefinition只包含bean的类
 *
 * 让BeanDefinition更复杂一些，加上他的属性值
 */
public class BeanDefinition {
    private Class beanClass;
    //对于Bean的描述不仅限于类，还要加上属性值
    private PropertyValues propertyValues;

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public BeanDefinition(Class beanClass){
        this(beanClass, null);
    }
    public BeanDefinition(Class beanClass, PropertyValues propertyValues){
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }
}
