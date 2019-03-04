package spring_1.bean.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-autowire.xml");


        Person p1 = (Person)ctx.getBean("person");
        System.out.println(p1);

        Person p2 = (Person)ctx.getBean("person2");
        System.out.println(p2);

//        Person p3 = (Person)ctx.getBean("person3");
//        System.out.println(p3);
    }
}
