package spring_4.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class CashierImpl implements Cashier{
    @Autowired
    private  BookShopService bookShopService;

    @Transactional
    public void checkout(String username, List<String> isbns) {
        for (String isbn:isbns
             ) {
            bookShopService.purchase(username, isbn);
        }
    }
}
