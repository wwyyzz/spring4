package spring_1.bean.relation;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-relation.xml");


        Address address1 = (Address)ctx.getBean("address");
        Address address2 = (Address)ctx.getBean("address2");
        Address address3 = (Address)ctx.getBean("address3");

        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);

        Person person1 = (Person)ctx.getBean("person1");

        System.out.println(person1);
    }
}
