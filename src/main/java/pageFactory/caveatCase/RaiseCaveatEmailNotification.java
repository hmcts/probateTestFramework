package pageFactory.caveatCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RaiseCaveatEmailNotification {

        WebDriver driver;

    public RaiseCaveatEmailNotification(WebDriver driver) {
        this.driver = driver;
    PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@id='caveatRaisedEmailNotificationRequested_Yes']")
    WebElement caveatEmailNotificationYes;
    public WebElement getCaveatEmailNotificationYes(){return caveatEmailNotificationYes;}

    @FindBy(xpath = "//input[@id='caveatRaisedEmailNotificationRequested_No']")
    WebElement caveatEmailNotificationNo;
    public WebElement getCaveatEmailNotificationNo(){return caveatEmailNotificationNo;}

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    public WebElement getContinueButton(){return continueButton;}

}
