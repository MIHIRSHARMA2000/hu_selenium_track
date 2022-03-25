import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class removeproduct {
     WebDriver driver;
    By cart = By.xpath("//a[@class='shopping_cart_link']");

    By removeProduct = By.xpath("//*[@id='remove-sauce-labs-fleece-jacket']");
    By continueShopping = By.id("continue-shopping");
      public removeproduct(WebDriver driver)
      {
          this.driver=driver;
      }
      public void verifyProduct(WebDriver driver)
      {
          WebElement element1=driver.findElement(removeProduct);
          element1.sendKeys();
      }
      public  void verifyContinueShopping(WebDriver driver)
      {
          WebElement element1=driver.findElement(continueShopping);
      }

}
