package main.IOC;

import java.util.HashMap;

/**
 * 定义一个简单的bean容器BeanFactory，内部包含一个map用以保存bean，只有注册bean和获取bean两个方法
 */
public class BeanFactory {
    private HashMap<String,Object> factory=new HashMap<>();
    public Object getBean(String name){
        return factory.get(name);
    }
    public void registerBean(String name,Object object){
        factory.put(name,object);
    }
}
