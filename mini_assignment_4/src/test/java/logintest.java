import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.reporters.jq.Main;


public class logintest  {

    private static final WebDriver driver = new ChromeDriver();
    @BeforeSuite
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", utils.CHROME_DRIVER_LOCATION);
    }

    @Test
    public void navigate_to_homepage_click_on_getstarted() {
        driver.get(utils.BASE_URL);
        Login_Page lg = new Login_Page(driver);
        lg.enterFirstName();
        lg.enterpassword();
        lg.pressSubmitButton();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }

}