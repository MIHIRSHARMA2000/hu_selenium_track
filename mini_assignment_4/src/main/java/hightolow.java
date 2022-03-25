import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class hightolow {
    WebDriver driver;
    By sort = By.xpath("//*[@id='header_container']//span/select");
    By HighToLow = By.xpath("//*[@id='header_container']//select/option[4]");
    By HighestPricedProduct = By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']");
    public hightolow(WebDriver driver)
    {
        this.driver=driver;
    }



}
