package spring_1.bean.properties;

import com.mchange.v2.c3p0.DataSources;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_1.bean.Car;
import spring_1.bean.Person;

import javax.sql.DataSource;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-properties.xml");

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource.getConnection());

    }
}
