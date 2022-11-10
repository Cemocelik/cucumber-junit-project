package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US10UpdateSettingPage {
    public US10UpdateSettingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//li[2]")
    public WebElement filesHoverOver;

    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement settingBtn;

    @FindBy(xpath = "//label[@for='webdavurl']")
    public WebElement webDav;


    @FindBy(xpath = "//label[@for='showRichWorkspacesToggle']")
    public WebElement richWorkspaceCheckbox;

    @FindBy(xpath = "//label[@for='recommendationsEnabledToggle']")
    public WebElement recommendationsCheckbox;

    @FindBy(xpath = "//label[@for='showhiddenfilesToggle']")
    public WebElement showHiddenFilesCheckbox;

    @FindBy(xpath = "//*[@id=\"quota\"]/a/p")
    public WebElement oldUsage;


    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusBtn;
//input[@type='file']
    @FindBy(xpath = "//div[contains(@class,'newFileMenu')]//li[1]")
    public WebElement uploadFile;

    @FindBy(xpath = "//*[@id='uploadprogressbar']")
    public WebElement uploadProgressBar;

    @FindBy(xpath = "//*[@id=\"quota\"]/a/p")
    public WebElement newUsage;




}



