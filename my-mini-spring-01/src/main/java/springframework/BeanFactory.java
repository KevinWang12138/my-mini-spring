package springframework;

import java.util.HashMap;

public class BeanFactory {
    private HashMap<String,BeanDefinition> beanDefinitionMap = new HashMap<>();
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }
    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }
}
