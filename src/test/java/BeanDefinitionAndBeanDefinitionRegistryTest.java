
import org.junit.Test;
import org.springframework.bean.config.BeanDefinition;
import org.springframework.bean.support.DefaultListableBeanFactory;

public class BeanDefinitionAndBeanDefinitionRegistryTest {
    @Test
    public void testBeanFactory() throws Exception{
        DefaultListableBeanFactory listableBeanFactory=new DefaultListableBeanFactory();
        BeanDefinition beanDefinition=new BeanDefinition(AService.class);
        listableBeanFactory.registerBeanDefinition("aService",beanDefinition);
        Object aService1=listableBeanFactory.getBean("aService");
        Object aService2=listableBeanFactory.getBean("aService");
        System.out.println(aService1);
        System.out.println(aService2);
    }

}
