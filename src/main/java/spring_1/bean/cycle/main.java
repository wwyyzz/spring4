package spring_1.bean.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-cycle.xml");

        Car car = (Car)ctx.getBean("car");
        System.out.println(car);

        ctx.close();

    }
}
