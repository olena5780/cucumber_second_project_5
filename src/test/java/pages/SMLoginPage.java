package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class SMLoginPage {

    public SMLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[class='txt']")
    public List<WebElement> loginInputs;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(css = "span[class='error']")
    public WebElement errorMessage;

}
