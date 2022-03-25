import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends pageobject {
    private final String FIRST_NAME = "standard_user";
    private final String PASS_WORD = "secret_sauce";
    @FindBy(id="user-name")
    private WebElement first_name;
    @FindBy(xpath="//input[@id='password']")
    private WebElement password;
    @FindBy(xpath="//input[@name='login-button']")
            private WebElement button;


    public Login_Page(WebDriver driver)
    {
        super(driver);

    }
    public void enterFirstName(){
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterpassword(){
        this.password.sendKeys(PASS_WORD);
    }

    public void pressSubmitButton(){
        this.button.click();
    }

}
