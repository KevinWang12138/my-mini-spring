package springframework.test;

import org.junit.Test;
import springframework.beans.factory.config.BeanDefinition;
import springframework.beans.factory.support.DefaultListableBeanFactory;
import springframework.test.bean.UserService;

public class ApiTest {
    @Test
    public void testBeanDefinition(){
        //1.创建容器
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        //2.注册bean的定义
        BeanDefinition userServiceBeanDefinition=new BeanDefinition(UserService.class);
        factory.registerBeanDefinition("userService",userServiceBeanDefinition);
        //3.获取bean对象
        UserService userService=(UserService) factory.getBean("userService",new String[]{"kevin"});
        userService.hello();
    }
}
