package spring_1.bean.spel;

/**
 * @program: spring4
 * @description: address
 * @author: Jun Wang
 * @create: 2019-03-04 13:48
 */
public class Address {
    private String city;
    private String streat;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreat() {
        return streat;
    }

    public void setStreat(String streat) {
        this.streat = streat;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", streat='" + streat + '\'' +
                '}';
    }
}
