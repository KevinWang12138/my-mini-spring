package springframework.test;

import org.junit.Test;
import springframework.BeanDefinition;
import springframework.BeanFactory;
import springframework.test.bean.UserService;

public class ApiTest {
    @Test
    public void testBeanDefinition(){
        //1.创建容器
        BeanFactory factory=new BeanFactory();
        //2.注册bean的定义
        BeanDefinition userServiceBeanDefinition=new BeanDefinition(new UserService());
        factory.registerBeanDefinition("userService",userServiceBeanDefinition);
        //3.获取bean对象
        System.out.println(factory.getBean("userService"));
    }
}
