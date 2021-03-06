import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class method {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mihirsharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.com/demo");

        String actualTitle = driver.getTitle();


        String expectedTitle = "PHPTRAVELS";
        if(actualTitle.contains(expectedTitle))
            //Pass
            System.out.println("PASS");
        else
            //Fail
            System.out.println("FAIL ");


        String parentWindow = driver.getWindowHandle();
        WebElement login = driver.findElement(By.xpath("/html/body/header/div/nav/a[4]"));
        login.click();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        String actualTitleNext = driver.getTitle();

        String expectedTitleNext= "Login";
        if(actualTitleNext.contains(expectedTitleNext))
            //Pass
            System.out.println("PASS");
        else
            //Fail
            System.out.println("FAIL");

        driver.switchTo().window(parentWindow);
        System.out.println(driver.getCurrentUrl());
        WebElement pricing = driver.findElement(By.xpath("/html/body/header/div/nav/a[2]"));
        pricing.click();
        driver.navigate().back();
        driver.navigate().refresh();


    driver.quit();
    }

}
