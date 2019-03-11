package spring_5.hibernate.entities;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import javax.sql.DataSource;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class mainTest {
    private ApplicationContext ctx = null;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContext-hb.xml");
    }

    @Test
    public void testDataSource() throws SQLException {
        DataSource dataSource;
        dataSource = (DataSource) ctx.getBean("DataSource.class");
        System.out.println(dataSource);
    }
}