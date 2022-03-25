

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent {

    /*@BeforeMethod
    void mm()
    {
        System.out.println("opening browser");
    }
    @Test
    void set()
    {
        System.out.println("1");
    }
    @Test
    void setup()
    {
        System.out.println("1");
    }
    @AfterMethod
            void cose()
    {
        System.out.println("close");
    }*/

    public static  WebDriver driver;

    @BeforeTest
    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mihirsharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.saucedemo.com/");
        /*WebElement email = driver.findElement(By.xpath("//input[@id='user-name']"));
        email.sendKeys("standard_user");
        Thread.sleep(5000);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        Thread.sleep(5000);
        WebElement LoginButton = driver.findElement(By.xpath("//input[@name='login-button']"));
        LoginButton.click();*/

    }


    @Test
    public static  void readFile() throws IOException, InterruptedException {
        String excelPathFile= "C:\\Users\\mihirsharma\\Desktop\\datafiles\\USERDETAILS.xlsx";
        FileInputStream fis = new FileInputStream(excelPathFile);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow row=null;
        XSSFCell cell=null;
        String email = null;
        String password =null;
        for(int i=1; i<-sheet.getLastRowNum(); i++)
        {
            row = sheet.getRow(i);
            for(int j=0; j< row.getLastCellNum(); j++)
            {
                cell = row.getCell(j);
                if(j==0)
                {
                    email = cell.getStringCellValue();
                }
                if(j==1)
                {
                    password=cell.getStringCellValue();
                }
            }
            System.out.println("****************Reading Data From The Excel File**************");
            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(email);
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
            Thread.sleep(10000);
            driver.findElement(By.xpath("//input[@name='login-button']")).click();
            String result =null;
            String actualurl = driver.getCurrentUrl();
            Boolean  isloggedin= actualurl.equals("https://www.saucedemo.com/");
            if(isloggedin==true)
            {
                result ="SuccessFul";
                System.out.println("Email : " + email +"........ "  + password +"....... "+ result);
                driver.close();
            }
            else{
                result="Login Failed";
                System.out.println("Email : " + email +"........ "  + password +"....... "+ result);

            }



        }

    }


    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
