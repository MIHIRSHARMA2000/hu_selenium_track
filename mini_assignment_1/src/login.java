import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mihirsharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get(" https://www.phptravels.net/hotels");
       WebElement  logo=  driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[1]/a/img"));

        WebElement home= driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[1]/a"));
        //home.click();
      WebElement flight=  driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a"));
      //flight.click();
        WebElement tours=driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[4]/a"));
        //tours.click();
        WebElement company= driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[8]/a"));
        //company.click();
       WebElement signup= driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[1]/div/div/div[2]/div/div/a[1]"));
       //signup.click();
        WebElement login = driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[1]/div/div/div[2]/div/div/a[2]"));
        //login.click();
       WebElement agent= driver.findElement(By.xpath("//*[@id=\"agents\"]"));
       //agent.click();




    }
}
