import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{
    By addToCartButtonLocater=By.id("insider-worker");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocater);
    }

    public void addToCart() {
        click(addToCartButtonLocater);
    }
}
