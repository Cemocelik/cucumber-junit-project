package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage extends BasePage {
    public WebTableOrderPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Order")
    public WebElement orderButton;

    @FindBy(xpath = "//select[@name='product']")
    public WebElement productType;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantity;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement customerName;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement street;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipCode;

    //    @FindBy(xpath = "//label[@class='radio']//input[@value='Visa']")
//    public WebElement creditCardVisa;
//
//    @FindBy(xpath = "//label[@class='radio']//input[@value='MasterCard']")
//    public WebElement getCreditCardMasterCard;
//
//    @FindBy(xpath = "//label[@class='radio']//input[@value='American Express']")
//    public WebElement getCreditCardAmericanExpress;

    @FindBy(name = "card")
    public List<WebElement> cardType;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement cardNo;

    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement cardExp;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processButton;


}
