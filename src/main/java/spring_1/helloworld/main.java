package spring_1.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

        HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld");

        helloWorld.hello();
    }
}
