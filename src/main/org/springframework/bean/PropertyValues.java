package org.springframework.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 属性值集合
 */
public class PropertyValues {
    private List<PropertyValue> propertyValueList=new ArrayList<>();
    public void addPropertyValue(PropertyValue value){
        propertyValueList.add(value);
    }
    public PropertyValue[] getPropertyValueList(){
        return propertyValueList.toArray(new PropertyValue[0]);
    }
    public PropertyValue getPropertyValue(String name){
        for(PropertyValue value:propertyValueList){
            if(value.getName().equals(name)){
                return value;
            }
        }
        return null;
    }
}
