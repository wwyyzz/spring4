package spring_1.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: spring4
 * @description:
 * @author: Jun Wang
 * @create: 2019-03-07 16:20
 */
public class ArithmeticCalculatorLoggingProxy {
    private ArithmeticCalculator target;

    public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator target) {
        this.target = target;
    }

    public ArithmeticCalculator getLoggingProxy(){

        ArithmeticCalculator proxy = null;
        ClassLoader loader = target.getClass().getClassLoader();
        Class[] interfaces = new Class[]{ArithmeticCalculator.class};

        InvocationHandler h = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                System.out.println("The method " + methodName + " begin with " + Arrays.asList(args));
                Object result = method.invoke(target, args);
                return result;
            }
        };
        proxy = (ArithmeticCalculator)Proxy.newProxyInstance(loader, interfaces, h);
        return proxy;

    }
}
