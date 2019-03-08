package spring_1.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @program: spring4
 * @description:
 * @author: Jun Wang
 * @create: 2019-03-08 09:46
 */
@Order(1)
@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* spring_1.aop.impl.ArithmeticCalculatorImpl.*(..))")
    public void declareJointPointExpression(){}

//    @Before("execution(public int spring_1.aop.impl.ArithmeticCalculatorImpl.add(int, int))")

//    @Before("declareJointPointExpression()")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method name " + methodName + " begin with " + args);
    }

//    @After("declareJointPointExpression()")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method name " + methodName + " end " );
    }

//    @AfterReturning(value = "declareJointPointExpression()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method name " + methodName + " end with" + result );
    }

//    @AfterThrowing(value = "declareJointPointExpression()", throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method name " + methodName + " occur exception" + ex );
    }


}
