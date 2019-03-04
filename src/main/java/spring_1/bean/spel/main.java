package spring_1.bean.spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-spel.xml");

        Address address = (Address)ctx.getBean("address");
        System.out.println(address);

        Car car = (Car)ctx.getBean("car");
        System.out.println(car);

        Person person = (Person)ctx.getBean("person");
        System.out.println(person);
    }
}
