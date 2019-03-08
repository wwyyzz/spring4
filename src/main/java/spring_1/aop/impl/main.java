package spring_1.aop.impl;


import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring4
 * @description:
 * @author: Jun Wang
 * @create: 2019-03-07 16:24
 */
public class main {

    private ArithmeticCalculator target;


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");

        int result = arithmeticCalculator.add(3, 6);

        System.out.println("result = " + result);

//        result = arithmeticCalculator.sub(3, 6);
//
//        System.out.println("result = " + result);

    }
}
