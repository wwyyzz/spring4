package spring_1.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_1.helloworld.HelloWorld;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-collect.xml");


        Car car = (Car)ctx.getBean("car");
        System.out.println(car);

        Car car2 = (Car)ctx.getBean("car2");
        System.out.println(car2);

        Car car3 = (Car)ctx.getBean("car3");
        System.out.println(car3);

//        Car car4 = (Car)ctx.getBean("car4");
//        System.out.println(car4);

        Person p1 = (Person)ctx.getBean("person");
        System.out.println(p1);

        Person p2 = (Person)ctx.getBean("person2");
        System.out.println(p2);

    }
}
