package spring_4.tx.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BookShopDaoImplTest {

    private ApplicationContext ctx = null;
    private BookShopDao bookShopDao = null;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContext-tx-xml.xml");
        bookShopDao= ctx.getBean(BookShopDao.class);
    }

    @Test
    public void testfindBookPriceBIsbn() {
        System.out.println(bookShopDao.findBookPriceBIsbn("1001"));
    }

    @Test
    public void testupdateBookStore() {
        bookShopDao.updateBookStore("1001");
    }

    @Test
    public void testupdateUserAccount() {
        bookShopDao.updateUserAccount("AA", 10);
    }
}