package pageFactory.caveatCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RaiseCaveatCaseCheckAnswers {

        WebDriver driver;

    public RaiseCaveatCaseCheckAnswers(WebDriver driver) {
        this.driver = driver;
    PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@id='field-trigger-summary']")
    WebElement caveatEventSummery;
    public WebElement getCaveatEventSummery(){return caveatEventSummery;}

    @FindBy(xpath = "//textarea[@id='field-trigger-description']")
    WebElement caveatEventDescription;
    public WebElement getCaveatEventDescription(){return caveatEventDescription;}

    @FindBy(xpath = "//button[normalize-space()='Submit application']")
    WebElement caveatSubmitApplication;
    public WebElement getCaveatSubmitApplication(){return caveatSubmitApplication;}


}
