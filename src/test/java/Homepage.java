import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.naming.directory.DirContext;

public class Homepage extends BasePage{
    SearchBox searchBox;
    By cartCountLocator= By.id("serverName");
    By cartContainerLocator=By.id("divCartSlider");
    public Homepage(WebDriver driver) {
        super(driver);
        searchBox=new SearchBox(driver);
    }

    public SearchBox searchbox() {
        return this.searchbox();

    }

    public boolean isProductCountUp() {
        return getCardCount()>0;
    }

    public void goGoCart() {
        click(cartContainerLocator);
    }
    private int getCardCount()
    {
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);

    }
}
