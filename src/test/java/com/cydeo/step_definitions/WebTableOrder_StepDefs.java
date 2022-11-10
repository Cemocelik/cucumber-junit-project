package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.pages.WeptableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrder_StepDefs {
    WeptableLoginPage weptableLoginPage = new WeptableLoginPage();
    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();
    BasePage basePage = new BasePage();

    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        weptableLoginPage.login2();
        basePage.orderButtonNavItem.click();

    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {

        Select select = new Select(webTableOrderPage.productType);
        select.selectByVisibleText(string);
    }

    @And("user enters quantity {int}")
    public void userEntersQuantity(Integer int1) {
        webTableOrderPage.quantity.clear();
//        webTableOrderPage.quantity.sendKeys(""+int1);
        webTableOrderPage.quantity.sendKeys(String.valueOf(int1));

    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {

        webTableOrderPage.customerName.sendKeys(string);
    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {

        webTableOrderPage.street.sendKeys(string);
    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {

        webTableOrderPage.city.sendKeys(string);
    }

    @When("user enters state {string}")
    public void user_enters_state(String string) {

        webTableOrderPage.state.sendKeys(string);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {

        webTableOrderPage.zipCode.sendKeys(string);
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
//  if (string.equals("Visa")){
//      webTableOrderPage.creditCardVisa.click();
//  }else if (string.equals("MasterCard")){
//      webTableOrderPage.getCreditCardMasterCard.click();
//  } else if (string.equals("American Express")) {
//      webTableOrderPage.getCreditCardAmericanExpress.click();
//  }
        for (WebElement each : webTableOrderPage.cardType) {
            if (each.getAttribute("value").equalsIgnoreCase(string)){
                each.click();
            }
        }

    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        webTableOrderPage.cardNo.sendKeys(string);
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        webTableOrderPage.cardExp.sendKeys(string);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTableOrderPage.processButton.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {
    String actualCustomerCell = viewAllOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(string, actualCustomerCell);
    }


}
