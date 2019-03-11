package spring_4.tx.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_4.tx.xml.service.BookShopService;

public class BookShopServiceImplTest {
    private ApplicationContext ctx = null;
    private BookShopDao bookShopDao = null;
    private BookShopService bookShopService = null;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContext-tx-xml.xml");
        bookShopDao= ctx.getBean(BookShopDao.class);
        bookShopService = ctx.getBean(BookShopService.class);
    }

    @Test
    public void purchase() {
        bookShopService.purchase("AA","1001");

    }
}