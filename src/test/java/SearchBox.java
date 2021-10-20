import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {
    By searchBoxLocater=By.id("serverName");
    By submitButtonLocater=By.id("header__container");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String pantolon) {
        type(searchBoxLocater, pantolon);
        click(submitButtonLocater);
    }
}
