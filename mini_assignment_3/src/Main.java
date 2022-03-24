import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import java.io.File;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mihirsharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //framehandling(driver);
        //DragAndDrop(driver);
        //alerthandling(driver);
        scenario4(driver);
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
    public static void alerthandling(WebDriver driver)  {
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

    public static void scenario4(WebDriver driver) throws InterruptedException {
        driver.get("https://www.goibibo.com/");
        Actions action = new Actions(driver);

        WebElement roundTripButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/ul/li[2]/span[1]"));
        roundTripButton.click();
        WebElement From = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div/p"));
        From.click();
        WebElement FromText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div/input"));
        FromText.click();
        FromText.sendKeys("New York (NYC)");
        Thread.sleep(2000);

        WebElement selectFrom = driver.findElement(By.xpath("//*[@id=\"autoSuggest-list\"]/li[1]"));
        action.click(selectFrom).build().perform();

        Thread.sleep(2000);

        WebElement toText = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"));

        toText.sendKeys("Seattle (SEA)");
        Thread.sleep(2000);
        WebElement tofrom = driver.findElement(By.xpath("//*[@id=\"autoSuggest-list\"]/li[1]/div/div[1]/div/p[1]/span[1]"));
        action.click(tofrom).build().perform();
        while(!driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div")).getText().contains("June")){
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
        }
        //24 June date is selected
        WebElement date24=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]/div[6]"));
        date24.click();
        Thread.sleep(1500);

        //Click on done button
        WebElement done=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[3]/span[2]"));
        done.click();
        Thread.sleep(1500);

        //click on done button
        WebElement done1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[5]/div[2]/div[3]/a[2]"));
        done1.click();
        Thread.sleep(1500);
        WebElement returndate=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div/p"));
        returndate.click();
        Thread.sleep(1500);

        //8 July date is selected
        WebElement date8=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/div[6]/p"));
        date8.click();
        Thread.sleep(1500);

        WebElement Done=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div[2]/div[3]/span[2]"));
        Done.click();
        Thread.sleep(1500);

        WebElement done2=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[5]/div[2]/div[3]/a[2]"));
        done2.click();
        Thread.sleep(1500);

        //Click on SearchFlight Button
        WebElement SearchFlight=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[3]/span"));
        SearchFlight.click();
        System.out.println("search operation is completed");
        Thread.sleep(1500);

        Take Screenshot and save as jpg
        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("C:\\Users\\mihirsharma\\hu_selenium_track\\mini_assignment_3"));
        Thread.sleep(2000);*/
        WebElement Book=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/button"));
        Book.click();
        driver.quit();

    }
}
