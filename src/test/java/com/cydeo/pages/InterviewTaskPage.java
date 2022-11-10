package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InterviewTaskPage {
    public InterviewTaskPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//span[.='Search network'])[2]")
    public WebElement searchButton;

    @FindBy (xpath = "(//div[@class='fieldMessages_field__hR-R1'])[1]")
    public WebElement firstSelectOption;

    @FindBy (xpath = "//div[.='2023']")
    public WebElement select2023;

    @FindBy (xpath = "(//div[@class='fieldMessages_field__hR-R1'])[2]")
    public WebElement secondSelectOption;

    @FindBy (xpath = "//div[.='Employer-provided']")
    public WebElement selectEmployerProvider;

    @FindBy (xpath = "(//div[@class='fieldMessages_field__hR-R1'])[3]")
    public WebElement thirdSelectOption;

    @FindBy (xpath = "//li[@id='OSCAROscar']")
    public WebElement selectOscar;

    @FindBy (xpath = "(//div[@class='fieldMessages_field__hR-R1'])[4]")
    public WebElement fourthSelectOption;

    @FindBy (xpath = "//li[@id='New JerseyNew Jersey']")
    public WebElement selectNewJersey;

    @FindBy (xpath = "//button[@type='button'][2]")
    public WebElement clickContinueBtn;

}
