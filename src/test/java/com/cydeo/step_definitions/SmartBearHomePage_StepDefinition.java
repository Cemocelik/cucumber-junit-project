package com.cydeo.step_definitions;


import com.cydeo.pages.SmartBearOrderProcessPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SmartBearHomePage_StepDefinition {

    SmartBearOrderProcessPage smartBearOrderProcessPage = new SmartBearOrderProcessPage();

    @Given("user is on the smart bear login page")
    public void user_is_on_the_smart_bear_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smartBearUrl"));
    }
    @When("user enters tester username")
    public void user_enters_tester_username() {
        smartBearOrderProcessPage.userName.sendKeys(ConfigurationReader.getProperty("smartBearUsername"));
    }
    @When("user enters tester password")
    public void user_enters_tester_password() {
        smartBearOrderProcessPage.password.sendKeys(ConfigurationReader.getProperty("smartBearPassword"));
    }

    @And("user click login button")
    public void userClickLoginButton() {
        smartBearOrderProcessPage.loginButton.click();
    }
    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        smartBearOrderProcessPage.orderButton.click();
    }
    @When("User fills out the form as followed")
    public void user_fills_out_the_form_as_followed() {


    }
    @When("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
       Select select = new Select(smartBearOrderProcessPage.productDropDown);
       select.selectByValue("FamilyAlbum");
    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
       smartBearOrderProcessPage.quantity.sendKeys(string);
    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
      smartBearOrderProcessPage.customerName.sendKeys(string);
    }
    @When("User enters {string} Ave to street")
    public void user_enters_ave_to_street(String string) {
       smartBearOrderProcessPage.street.sendKeys(string);
    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
     smartBearOrderProcessPage.city.sendKeys(string);
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
    smartBearOrderProcessPage.state.sendKeys(string);
    }
    @When("User enters {string}")
    public void user_enters(String string) {
        smartBearOrderProcessPage.zipCode.sendKeys(string);
    }
    @When("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {
       smartBearOrderProcessPage.cardType.click();
    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
       smartBearOrderProcessPage.cardNumber.sendKeys(string);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
       smartBearOrderProcessPage.expirationDate.sendKeys(string);
    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
       smartBearOrderProcessPage.processButton.click();

    }
    @Then("User verifies John Wick is in the list")
    public void user_verifies_john_wick_is_in_the_list() {
      smartBearOrderProcessPage.viewAllOrders.click();
      String actual = smartBearOrderProcessPage.verifyJohnWick.getText();
      String expected = "John Wick";
        Assert.assertEquals(expected,actual);
    }
}
