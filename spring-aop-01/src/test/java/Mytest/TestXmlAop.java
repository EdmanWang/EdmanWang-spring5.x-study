package Mytest;

import com.wgx.xmlAop.userService.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlAop {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService =(UserService) context.getBean("userService");
        userService.select();
    }
}
