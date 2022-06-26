package pageFactory.PA1PPA1ASolicitorsManual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PA1PPA1ASolicitorsManualInheritanceTax {
    WebDriver driver;

    public PA1PPA1ASolicitorsManualInheritanceTax(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//IHT Form completed Online
    @FindBy (xpath = "//input[@id='ihtFormCompletedOnline_Yes']")
    WebElement ihtFormCompletedOnlineYes;
    public WebElement getIhtFormCompletedOnlineYes(){return ihtFormCompletedOnlineYes;}

    @FindBy (xpath = "//input[@id='ihtFormCompletedOnline_No']")
    WebElement ihtFormCompletedOnlineNo;
    public WebElement getIhtFormCompletedOnlineNo(){return ihtFormCompletedOnlineNo;}

//Did the person who has died own any foreign assets? (Optional)

    @FindBy(xpath = "//input[@id='foreignAsset_Yes']")
    WebElement diedPersonForeignAssetYes;
    public WebElement getDiedPersonForeignAssetYes(){return diedPersonForeignAssetYes;}

    @FindBy(xpath = "//input[@id='foreignAsset_No']")
    WebElement diedPersonForeignAssetNo;
    public WebElement getDiedPersonForeignAssetNo(){return diedPersonForeignAssetNo;}

//Continue

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement inheritanceTaxContinueButton;
    public WebElement getInheritanceTaxContinueButton(){return inheritanceTaxContinueButton;}


}
