
import org.junit.Test;
import org.springframework.bean.PropertyValue;
import org.springframework.bean.PropertyValues;
import org.springframework.bean.config.BeanDefinition;
import org.springframework.bean.support.DefaultListableBeanFactory;
import static org.assertj.core.api.Assertions.assertThat;

public class PopulateBeanWithPropertyValuesTest{
    @Test
    public void testPopulateBeanWithPropertyValues() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "derek"));
        propertyValues.addPropertyValue(new PropertyValue("age", 18));
        BeanDefinition beanDefinition = new BeanDefinition(Person.class, propertyValues);
        beanFactory.registerBeanDefinition("person", beanDefinition);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
    }
}
