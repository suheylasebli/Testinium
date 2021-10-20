import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class  Basetest {
    static WebDriver driver ;


    @BeforeAll
    public static void setup()
    {
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
          driver.get("https://www.lcwaikiki.com/tr-TR/TR");
          driver.manage().window().maximize();
    }

    @AfterAll
    public void teardown()
    {driver.quit();}
}
