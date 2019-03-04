package spring_1.bean.spel;



/**
 * @program: spring4
 * @description: person
 * @author: Jun Wang
 * @create: 2019-03-04 10:13
 */
public class Person {
    private String name;
    private Car car;
    private String city;
    private String info;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String na) {
        this.name = na;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }



    public Person() {
    }

    public Person(String name, Car car, String city) {
        this.name = name;
        this.car = car;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", city='" + city + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
