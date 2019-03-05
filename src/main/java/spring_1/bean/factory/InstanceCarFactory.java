package spring_1.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: spring4
 * @description: instance
 * @author: Jun Wang
 * @create: 2019-03-05 16:47
 */
public class InstanceCarFactory {
    private Map<String, Car> cars= null;

    public InstanceCarFactory() {
        cars = new HashMap<String, Car>();
        cars.put("audi", new Car("audi", 300000));
        cars.put("ford", new Car("audi", 200000));
    }

    public Car getCar(String brand){

        return cars.get(brand);
    }
}
