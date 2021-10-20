import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;

import java.util.List;

public class ProductPage extends BasePage{
    By shippingOptionLocator=By.id("insider-worker");
    By productNameLocator=new By.ByCssSelector("insider-worker") {
    };


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnproductpage() {
        return isDisplayed(shippingOptionLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(1).click();
    }
    private List<WebElement> getAllProducts()
    {
      return findAll(productNameLocator);
    }
}
