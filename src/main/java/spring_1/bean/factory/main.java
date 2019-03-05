package spring_1.bean.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-factory.xml");

        Car car1 = (Car)ctx.getBean("car1");
        System.out.println(car1);



    }
}
