package pageFactory.PA1PPA1ASolicitorsManual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PA1PPA1ASolicitorsManualValueOfEstate {

    WebDriver driver;

    public PA1PPA1ASolicitorsManualValueOfEstate(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='ihtGrossValue']")
    WebElement grossValueOfEstate;
    public WebElement getGrossValueOfEstate(){return grossValueOfEstate;}

    @FindBy(xpath = "//input[@id='ihtNetValue']")
    WebElement netValueOfEstate;
    public WebElement getNetValueOfEstate(){return netValueOfEstate;}

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement valueOfEstateContinueButton;
    public WebElement getValueOfEstateContinueButton(){return valueOfEstateContinueButton;}



}

