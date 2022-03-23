import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
    public static void main(String[] args) {
        //*[@id="checkin"]
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mihirsharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get(" https://www.phptravels.net/hotels");
        WebElement calender = driver.findElement(By.xpath("//input[@id='Checkin']//parent::span"));
        WebElement checkout = driver.findElement(By.xpath("//input[@id='Checkout']//parent::span"));
        WebElement adultminus = driver.findElement(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]//child::i"));
        WebElement adultplus = driver.findElement(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/i//ancestor::form"));
        WebElement childminus = driver.findElement(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/div/div[3]/div/div/div[1]//child::i"));
        WebElement childplus = driver.findElement(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/div/div[3]/div/div/div[2]//parent::div"));
    }
}
