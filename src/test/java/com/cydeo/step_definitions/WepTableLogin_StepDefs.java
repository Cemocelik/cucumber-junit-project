package com.cydeo.step_definitions;

import com.cydeo.pages.WeptableLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WepTableLogin_StepDefs {

    WeptableLoginPage weptableLoginPage = new WeptableLoginPage();
    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {

        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        weptableLoginPage.inputUsername.sendKeys(string);

    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        weptableLoginPage.inputPassword.sendKeys(string);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        weptableLoginPage.loginButton.click();
    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Driver.getDriver().getCurrentUrl().contains("Order");


    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String userName, String password) {
//        weptableLoginPage.inputUsername.sendKeys(userName);
//        weptableLoginPage.inputPassword.sendKeys(password);
//        weptableLoginPage.loginButton.click();

        weptableLoginPage.login(userName,password);
    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String ,String> credentials) {
    weptableLoginPage.inputUsername.sendKeys(credentials.get("username"));
    weptableLoginPage.inputPassword.sendKeys(credentials.get("password"));
    weptableLoginPage.loginButton.click();

    }
}
