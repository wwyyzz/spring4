package spring_1.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: spring4
 * @description: staticfactory
 * @author: Jun Wang
 * @create: 2019-03-05 16:35
 */
public class StaticCarFactory {

    private static Map<String, Car> cars= new HashMap();

    static{
        cars.put("audi", new Car("audi", 300000));
        cars.put("ford", new Car("audi", 200000));
    }

    public static Car getCar(String name){

        return cars.get(name);
    }
}
