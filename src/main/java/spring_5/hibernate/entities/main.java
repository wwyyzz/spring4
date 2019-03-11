package spring_5.hibernate.entities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {

        ApplicationContext ctx = null;
        DataSource dataSource = null;
        System.out.println("main");


        {
            ctx = new ClassPathXmlApplicationContext("applicationContext-hb.xml");
        }

            dataSource = (DataSource) ctx.getBean("DataSource.class");
            System.out.println(dataSource.getConnection());
        }
}
