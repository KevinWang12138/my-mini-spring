package springframework.beans.factory.config;

public class BeanDefinition {
    private Class beanClass;

    public Class getBeanClass() {
        return beanClass;
    }

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }
}
