package spring_1.bean.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-scope.xml");


        Car car1 = (Car)ctx.getBean("car");
        Car car2 = (Car)ctx.getBean("car");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.equals(car2));

        Car car3 = (Car)ctx.getBean("car-proto");
        Car car4 = (Car)ctx.getBean("car-proto");

        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car3.equals(car4));
    }
}
