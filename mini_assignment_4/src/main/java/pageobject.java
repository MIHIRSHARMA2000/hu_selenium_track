
    import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

    public class pageobject {
        protected WebDriver driver;

        public pageobject(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
    }


