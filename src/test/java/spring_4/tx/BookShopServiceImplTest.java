package spring_4.tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BookShopServiceImplTest {
    private ApplicationContext ctx = null;
    private BookShopDao bookShopDao = null;
    private BookShopService bookShopService = null;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContext-tx.xml");
        bookShopDao= ctx.getBean(BookShopDao.class);
        bookShopService = ctx.getBean(BookShopService.class);
    }

    @Test
    public void purchase() {
        bookShopService.purchase("AA","1001");

    }
}