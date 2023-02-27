package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class SMMainPage {
    public SMMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css ="ul[id='ctl00_menu']>li")
    public List<WebElement> menuItems;

    @FindBy(css ="a[id$='btnCheckAll']")
    public WebElement checkAllButton;

    @FindBy(css ="a[id$='btnUncheckAll']")
    public WebElement uncheckAllButton;

    @FindBy(css = "input[id*='OrderSelector']")
    public List<WebElement> checkBoxes;

    @FindBy(css = "ul[id*= 'ctl00_menu'] a")
    public List<WebElement> menu;

    @FindBy(css = "select[id*='ddlProduct']")
    public WebElement dropDown;

    @FindBy(css = "input[id*='txtQuantity']")
    public WebElement quantity;

    @FindBy(css = "//ol[2]//input")
    public List<WebElement> addressInputs;

    @FindBy(css = "input[id*='cardList']")
    public List<WebElement> cardRadioButtons;

    @FindBy(css = "input[id*= 'TextBox6']")
    public WebElement cardNumberInput;

    @FindBy(css = "input[id*= 'TextBox1']")
    public WebElement expireDateInput;

    @FindBy(css = "a[id*= 'InsertButton']")
    public WebElement processButton;

    @FindBy(css = "input[id*= 'btnDelete']")
    public WebElement deleteSelectedButton;

    @FindBy(css = "input[id*='btnDelete']")
    public WebElement listOrderMessage;


}
