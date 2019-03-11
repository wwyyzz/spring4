package spring_4.tx;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bookShopDao")
public class BookShopDaoImpl implements BookShopDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int findBookPriceBIsbn(String isbn) {
        String sql = "SELECT price FROM book WHERE isbn = ?";


        return jdbcTemplate.queryForObject(sql, Integer.class, isbn);
    }

    public void updateBookStore(String isbn) {
        String sql2 = "SELECT stock FROM book_stock WHERE isbn = ?";
        int stock = jdbcTemplate.queryForObject(sql2, Integer.class, isbn);

        if (stock == 0)
        {
            throw new BookStockException();
        }
        String sql1 = "UPDATE book_stock SET stock = stock - 1 WHERE isbn = ?";
        jdbcTemplate.update(sql1, isbn);
    }

    public void updateUserAccount(String username, int price) {
        String sql2 = "SELECT balance FROM account WHERE username = ?";
        int balance = jdbcTemplate.queryForObject(sql2, Integer.class, username);

        if (balance < price)
        {
            throw new UserAccountException();
        }


        String sql = "UPDATE account SET balance = balance - ? WHERE username = ?";
        jdbcTemplate.update(sql, price, username);
    }
}
