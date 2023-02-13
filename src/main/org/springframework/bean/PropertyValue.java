package org.springframework.bean;

/**
 * 属性值
 */
public class PropertyValue {
    private String name;
    private Object value;
    public PropertyValue(String name,Object value){
        this.name = name;
        this.value = value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    public Object getValue(){
        return this.value;
    }
}
