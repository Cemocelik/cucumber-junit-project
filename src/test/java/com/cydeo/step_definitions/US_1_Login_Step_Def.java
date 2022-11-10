package com.cydeo.step_definitions;

import com.cydeo.pages.US_1_Login_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_1_Login_Step_Def {
    US_1_Login_Page us_1_login_page = new US_1_Login_Page();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String username, String password) {
    us_1_login_page.login(username,password);
    }
    @When("user click the login button")
    public void user_click_the_login_button() {

    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        BrowserUtils.verifyTitle("Dashboard - Trycloud");

    }


}
