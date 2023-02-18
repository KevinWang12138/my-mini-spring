package springframework;

public class BeanDefinition {
    private Object bean;

    public Object getBean() {
        return bean;
    }

    public BeanDefinition(Object bean){
        this.bean = bean;
    }
}
