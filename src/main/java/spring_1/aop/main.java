package spring_1.aop;

/**
 * @program: spring4
 * @description:
 * @author: Jun Wang
 * @create: 2019-03-07 16:24
 */
public class main {

    private ArithmeticCalculator target;


    public static void main(String[] args) {
        ArithmeticCalculator target = new ArithmeticCalculatorImpl();

        ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();

        int result = proxy.add(1, 2);
        System.out.println("-->" + result);

        result = proxy.div(4, 2);
        System.out.println("-->" + result);
    }
}
