package spring_1.bean.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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


        Person p3 = (Person)ctx.getBean("person3");
        System.out.println(p3);

        Person p4 = (Person)ctx.getBean("person4");
        System.out.println(p4);

        Person p5 = (Person)ctx.getBean("person5");
        System.out.println(p5);
    }
}
