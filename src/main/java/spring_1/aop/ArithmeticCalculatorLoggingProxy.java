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

        //代理对象由哪一个类加载器负责加载
        ClassLoader loader = target.getClass().getClassLoader();

        //代理对象其中有哪些方法
        Class[] interfaces = new Class[]{ArithmeticCalculator.class};


        InvocationHandler h = new InvocationHandler() {
            // proxy-正在返回的那个代理对象，一般情况下，在invoke方法中都不使用该对象;
            // Method-正在被调用的方法;
            // args-调用方法时，传入的参数
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
