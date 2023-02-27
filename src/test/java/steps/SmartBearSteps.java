package steps;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.SMLoginPage;
import pages.SMMainPage;
import utils.Driver;
import utils.DropdownHandler;
import utils.TableHandler;

import java.util.List;

public class SmartBearSteps {
    WebDriver driver;
    SMLoginPage smLoginPage;
    SMMainPage smMainPage;
    List<WebElement> tableRow;

    @Before
    public void setup(){
        driver = Driver.getDriver();
        smLoginPage = new SMLoginPage();
        smMainPage = new SMMainPage();
    }


    @Given("user is on {string}")
    public void userNavigatesTo(String url) {
       driver.get(url);
    }

    @When("user enters username as {string}")
    public void user_enters_username_as(String username) {
        smLoginPage.loginInputs.get(0).sendKeys(username);
    }

    @When("user enters password as {string}")
    public void user_enters_password_as(String password) {
        smLoginPage.loginInputs.get(1).sendKeys(password);
    }

    @When("user clicks on Login button")
    public void user_clicks_on_Login_button() {
        smLoginPage.loginButton.click();
    }

    @Then("user should see {string}")
    public void user_should_see_message(String message) {
        smLoginPage.errorMessage.isDisplayed();
        Assert.assertEquals(message, smLoginPage.errorMessage.getText());
    }

    @Then("user should be routed to {string}")
    public void user_should_be_routed_to_another_page(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @Then("validate below menu items are displayed")
    public void validate_below_menu_items_are_displayed(DataTable items) {
        for (int i = 0; i < items.asList().size(); i++) {
            Assert.assertEquals(items.asList().get(i), smMainPage.menuItems.get(i).getText());

        }
    }

    @When("user clicks on {string} button")
    public void user_clicks_on_button(String button) {
        switch(button) {
            case "Check All":
                smMainPage.checkAllButton.click();
                break;
            case "Uncheck All":
                smMainPage.uncheckAllButton.click();
                break;
            case "Process":
                smMainPage.processButton.click();
                break;
            case "Delete Selected":
                smMainPage.deleteSelectedButton.click();
                break;
            default:
                throw new RuntimeException("This button doesn't exist!");
        }
    }

    @Then("all rows should be checked")
    public void all_rows_should_be_checked() {
            for (int i = 0; i < smMainPage.checkBoxes.size(); i++) {
                Assert.assertTrue(smMainPage.checkBoxes.get(i).isSelected());
            }
    }

    @Then("all rows should be unchecked")
    public void all_rows_should_be_unchecked() {
        for (int i = 0; i < smMainPage.checkBoxes.size(); i++) {
            Assert.assertFalse(smMainPage.checkBoxes.get(i).isSelected());
        }
    }

    @When("user clicks on {string} menu item")
    public void user_clicks_on_menu_item(String order) {
        switch(order) {
            case "Order":
                smMainPage.menu.get(2).click();
                break;
            default:
                throw new RuntimeException("There is no such a menu!!!");
        }
    }

    @When("user selects {string} as product")
    public void user_selects_as_product(String product) {
        DropdownHandler.selectByVisibleText(smMainPage.dropDown, product);
    }

    @When("user enters {int} as quantity")
    public void user_enters_as_quantity() {
        smMainPage.quantity.sendKeys("2");
    }

    @When("user enters all address information")
    public void user_enters_all_address_information(DataTable addressTable) {
        for (int i = 0; i < addressTable.asList().size(); i++) {
            smMainPage.addressInputs.get(i).sendKeys(addressTable.asList().get(i));
        }
    }

    @When("user enters all payment information")
    public void user_enters_all_payment_information() {
        smMainPage.cardRadioButtons.get(0).click();
        smMainPage.cardNumberInput.sendKeys("123456789012345");
        smMainPage.expireDateInput.sendKeys("12/25");
    }


    @Then("user should see their order displayed in the {string} table")
    public void user_should_see_their_order_displayed_in_the_table() {
        tableRow = TableHandler.getTableRow(driver, 2);
        for (int i = 0; i < tableRow.size()-1; i++) {
            Assert.assertFalse(tableRow.get(i).isDisplayed());
        }
    }

    @Then("validate all information entered displayed correct with the order")
    public void validate_all_information_entered_displayed_correct_with_the_order(DataTable order) {
        tableRow = TableHandler.getTableRow(driver, 2);
        for (int i = 0; i < tableRow.size()-1; i++) {
            Assert.assertEquals(order.asList().get(i), tableRow.get(i).getText());
        }
    }

    @Then("validate all orders are deleted from the {string}")
    public void validate_all_orders_are_deleted_from_the() {
        tableRow = TableHandler.getTableRow(driver, 2);
        for (int i = 0; i < tableRow.size()-1; i++) {
            Assert.assertTrue(tableRow.get(i).isDisplayed());
        }
    }

    @And("validate user sees {string} message")
    public void validate_user_sees_List_of_orders_is_empty_In_order_to_add_new_order_use_this_link_message(String message) {
            Assert.assertEquals(message, smMainPage.listOrderMessage.getText());

    }




}
