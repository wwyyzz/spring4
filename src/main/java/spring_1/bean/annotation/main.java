package spring_1.bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_1.bean.annotation.controller.UserController;
import spring_1.bean.annotation.repository.UserRepository;
import spring_1.bean.annotation.service.UserService;


public class main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-annotation.xml");


        TestObject to = (TestObject)ctx.getBean("testObject");

        System.out.println(to);

        UserController userController = (UserController)ctx.getBean("userController");
        userController.execute();
//
//        UserService userService =(UserService)ctx.getBean("userService");
//        System.out.println(userService);
//
//        UserRepository userRepository =(UserRepository)ctx.getBean("userRepository");
//        System.out.println(userRepository);

    }
}
