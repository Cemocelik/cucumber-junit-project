package com.cydeo.step_definitions;

import com.cydeo.pages.US10UpdateSettingPage;
import com.cydeo.pages.US_1_Login_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import javax.lang.model.element.Element;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class US10UpdateSetting_StepDefs {
    US_1_Login_Page us_1_login_page = new US_1_Login_Page();
    US10UpdateSettingPage us10UpdateSettingPage = new US10UpdateSettingPage();


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        us_1_login_page.login();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us10UpdateSettingPage.filesHoverOver).perform();
        us10UpdateSettingPage.filesHoverOver.click();
    }
    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {

        us10UpdateSettingPage.settingBtn.click();
    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {
    us10UpdateSettingPage.richWorkspaceCheckbox.click();
    us10UpdateSettingPage.recommendationsCheckbox.click();
    us10UpdateSettingPage.showHiddenFilesCheckbox.click();

    }


    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {
    String oldUsage1 = us10UpdateSettingPage.oldUsage.getText();
    }
    @When("user  uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() throws AWTException {
    us10UpdateSettingPage.plusBtn.click();



        us10UpdateSettingPage.uploadFile.click();
        StringSelection ss = new StringSelection("C:\\Users\\Brosct\\Desktop\\demoUpload2.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot = new Robot();
        BrowserUtils.sleep(10);
        robot.mouseMove(2,130);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        BrowserUtils.sleep(5);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    //us10UpdateSettingPage.uploadFile.sendKeys("C:\\Users\\Brosct\\Desktop\\demoUpload1.txt");
        BrowserUtils.waitForInvisibilityOf(us10UpdateSettingPage.uploadProgressBar);

//
        BrowserUtils.sleep(3);
    }


    @When("user refresh the page")
    public void user_refresh_the_page() {

    Driver.getDriver().navigate().refresh();
    }
    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {

       String newUsage = us10UpdateSettingPage.newUsage.getText();

       Assert.assertNotEquals(newUsage,us10UpdateSettingPage.oldUsage);

    }
}