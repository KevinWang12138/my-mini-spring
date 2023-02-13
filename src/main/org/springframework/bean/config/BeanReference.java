package org.springframework.bean.config;

public class BeanReference {
    private String beanName;

    public BeanReference(String name){
        this.beanName=name;
    }

    public String getBeanName() {
        return beanName;
    }
}
