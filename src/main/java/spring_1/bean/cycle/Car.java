package spring_1.bean.cycle;

/**
 * @program: spring4
 * @description: car
 * @author: Jun Wang
 * @create: 2019-03-04 09:41
 */
public class Car {
    private String brand;


    public Car() {
        System.out.println("Car's constructor...");
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("setBrand...");
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public void inti(){
        System.out.println("init...");
    }

    public void destory(){
        System.out.println("destory...");
    }
}
