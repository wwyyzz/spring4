package spring_4.tx;

public interface BookShopDao {

    public int findBookPriceBIsbn(String isbn);

    public void updateBookStore(String isbn);

    public void updateUserAccount(String username , int price);
}
