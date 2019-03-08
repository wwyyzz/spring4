package spring_1.aop.impl;

import org.springframework.stereotype.Component;

/**
 * @program: spring4
 * @description:
 * @author: Jun Wang
 * @create: 2019-03-07 16:17
 */

@Component("arithmeticCalculator")
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

    public int add(int i, int j) {
        int result = i + j;
        return result;
    }


    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }


    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }


    public int div(int i, int j) {
        int result = i / j;
        return result;
    }
}
