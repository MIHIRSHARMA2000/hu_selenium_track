import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mihirsharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //framehandling(driver);
        DragAndDrop(driver);
        //alerthandling(driver);
        //scenatio4(driver);
    }
    public static void framehandling(WebDriver driver)
    {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement frame= driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[22]/a"));
        frame.click();
        WebElement nested = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a"));
        nested.click();
        driver.switchTo().frame("frame_top");
        System.out.println(driver.getTitle());
        driver.close();


    }
    public static void DragAndDrop(WebDriver driver)
    {
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        Actions builder = new Actions(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        builder.dragAndDropBy(driver.findElement(By.xpath("//div[@id=\"draggable\"]")),153,26).perform();
        driver.quit();
    }
    public static void alerthandling(WebDriver driver)
    {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement javaAlert= driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[29]/a"));
        javaAlert.click();
        WebElement jsprompt= driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        jsprompt.click();
        String getalert= driver.switchTo().alert().getText();
        System.out.println(getalert);
        driver. switchTo(). alert(). sendKeys("Test");
         driver.switchTo().alert().accept();
         WebElement result = driver.findElement(By.xpath("//*[@id=\"result\"]"));
         if(result.getText().contains("Test"))
         {
             System.out.println("YES");
         }
         else{
             System.out.println("NO");
         }
         driver.close();;
    }

    public static void scenatio4(WebDriver driver)
    {
        driver.get("https://www.goibibo.com/");
        WebElement roundTrip = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/ul/li[2]/span[1]"));
        roundTrip.click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div/p")).sendKeys("New York");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div/div/p")).sendKeys("Seattle");
        Select object  = new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div/p[1]/span")));
        WebElement navigator = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]"));
        navigator.click();;
        navigator.click();
        WebElement DepartureDate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[4]/div[6]"));
        DepartureDate.click();
        WebElement done = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[3]/span[2]"));
        done.click();
        WebElement navigator2= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div/p[1]/span"));
        navigator2.click();
        WebElement ReturnDate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/div[6]"));
        ReturnDate.click();
        WebElement done1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[3]/span[2]"));
        done1.click();
        WebElement confirm = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[5]/div[2]/div[3]/a[2]"));
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[3]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/button")).click();



    }
}
