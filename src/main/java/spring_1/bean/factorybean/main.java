package spring_1.bean.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-beanfactory.xml");

        Car car1 = (Car)ctx.getBean("car");
        System.out.println(car1);

    }
}
