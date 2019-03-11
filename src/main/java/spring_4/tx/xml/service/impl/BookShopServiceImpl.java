package spring_4.tx.xml.service.impl;

import spring_4.tx.xml.BookShopDao;
import spring_4.tx.xml.service.BookShopService;


public class BookShopServiceImpl implements BookShopService {


    private BookShopDao bookShopDao;

    public void setBookShopDao(BookShopDao bookShopDao) {
        this.bookShopDao = bookShopDao;
    }

    public void purchase(String username, String isbn) {
        int price = bookShopDao.findBookPriceBIsbn(isbn);

        bookShopDao.updateBookStore(isbn);

        bookShopDao.updateUserAccount(username, price);
    }
}
