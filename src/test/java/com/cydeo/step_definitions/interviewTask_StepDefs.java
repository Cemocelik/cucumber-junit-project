package com.cydeo.step_definitions;

import com.cydeo.pages.InterviewTaskPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class interviewTask_StepDefs {

    InterviewTaskPage interviewTaskPage = new InterviewTaskPage();

    @Given("user on hioscar home page")
    public void user_on_hioscar_home_page() {
        Driver.getDriver().get("https://www.hioscar.com/care-options ");
    }
    @When("user click search network")
    public void user_click_search_network() {
    interviewTaskPage.searchButton.click();
    }
    @When("user select from Coverage year dropdown Select 2023 option")
    public void user_select_from_coverage_year_dropdown_select_option() {
        interviewTaskPage.firstSelectOption.click();
        interviewTaskPage.select2023.click();

    }
    @When("user select from Coverage access dropdown Select Employer-provided option")
    public void user_select_from_coverage_access_dropdown_select_employer_provided_option() {

        interviewTaskPage.secondSelectOption.click();
        interviewTaskPage.selectEmployerProvider.click();
    }
    @When("user select from Network partner dropdown Select Oscar option")
    public void user_select_from_network_partner_dropdown_select_oscar_option() {
        interviewTaskPage.thirdSelectOption.click();
        interviewTaskPage.selectOscar.click();
    }
    @When("user select from Coverage area dropdown Select New Jersey")
    public void user_select_from_coverage_area_dropdown_select_new_jersey() {
        interviewTaskPage.fourthSelectOption.click();
        interviewTaskPage.selectNewJersey.click();
    }
    @When("user click continue button")
    public void user_click_continue_button() {
        interviewTaskPage.clickContinueBtn.click();

    }
    @Then("user see title contains “Oscar”")
    public void user_see_title_contains_oscar() {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains("Oscar"));

    }
}
