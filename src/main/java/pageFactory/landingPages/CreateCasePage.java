package pageFactory.landingPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCasePage {

    WebDriver driver;

    public CreateCasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='cc-jurisdiction']")
    WebElement createCaseJurisdiction;
    public WebElement getCreateCaseJurisdiction(){
        return createCaseJurisdiction;
    }

    @FindBy(xpath = "//select[@id='cc-case-type']")
    WebElement createCaseCaseType;
    public WebElement getCreateCaseCaseType(){
        return createCaseCaseType;
    }

    @FindBy(xpath ="//select[@id='cc-event']")
    WebElement createCaseEvent;
    public WebElement getCreateCaseEvent(){return createCaseEvent;}

    @FindBy(css = "button[type='submit']")
    WebElement createCaseStart;
    public WebElement getCreateCaseStart(){return createCaseStart;}





}
