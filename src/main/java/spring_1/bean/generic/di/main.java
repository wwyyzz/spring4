package spring_1.bean.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-generic-di.xml");

        UserService userService = (UserService)ctx.getBean("userService");
        userService.add();


    }
}
