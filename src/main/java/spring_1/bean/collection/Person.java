package spring_1.bean.collection;

import java.util.List;

/**
 * @program: spring4
 * @description: person
 * @author: Jun Wang
 * @create: 2019-03-04 10:13
 */
public class Person {
    private String name;
    private List<Car> car;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String na) {
        this.name = na;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, List<Car> car, int age) {
        this.name = name;
        this.car = car;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", age=" + age +
                '}';
    }
}
