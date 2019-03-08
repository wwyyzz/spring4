package spring_1.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @program: spring4
 * @description:
 * @author: Jun Wang
 * @create: 2019-03-08 11:24
 */
@Order(2)
@Aspect
@Component
public class VlidationAspect {

    @Before("execution(* spring_1.aop.impl.ArithmeticCalculatorImpl.*(..))")
    public void volidationArgs(JoinPoint joinPoint){

        System.out.println("validation: " + Arrays.asList(joinPoint.getArgs()));
    }
}
