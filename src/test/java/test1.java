import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class test1<Homepage> extends Basepage{
    Homepage homepage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    @Test
    @Order(1)
    public void search_a_product()
    {
        homepage=new Homepage(driver);
        productPage=new ProductPage(driver);
        homepage.searchbox().search("pantolon");
        Assertions.assertTrue(productPage.isOnproductpage(),"Not on Products page!");
    }
    @Test
    @Order(2)
    public void select_a_product()
    {
        productPage.selectProduct(1);
        productDetailPage=new ProductDetailPage(driver);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on Products page");
    }
    @Test
    @Order(3)
    public void add_product_to_cart()
    {
        productDetailPage.addToCart();
        Assertions.assertTrue(homepage.isProductCountUp(),"product count did not increase");
    }
    @Test
    @Order(4)
    public void go_to_cart()
    {
        homepage.goGoCart();
        cartPage=new CartPage(driver);
        Assertions.assertTrue(cartPage.checkIfProductAdded(),"product was not to cart");
    }
}
