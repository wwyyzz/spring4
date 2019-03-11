package spring_4.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.transaction.annotation.Propagation.REQUIRES_NEW;

@Service("bookShopService")
public class BookShopServiceImpl implements BookShopService{

    @Autowired
    private BookShopDao bookShopDao;

    @Transactional(propagation = REQUIRES_NEW)
    public void purchase(String username, String isbn) {
        int price = bookShopDao.findBookPriceBIsbn(isbn);

        bookShopDao.updateBookStore(isbn);

        bookShopDao.updateUserAccount(username, price);
    }
}
