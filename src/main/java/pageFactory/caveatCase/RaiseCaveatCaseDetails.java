package pageFactory.caveatCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RaiseCaveatCaseDetails {

        WebDriver driver;

    public RaiseCaveatCaseDetails(WebDriver driver) {
        this.driver = driver;
    PageFactory.initElements(driver, this);

    }

   @FindBy(xpath = "//select[@id='applicationType']")
    WebElement caveatCaseApplicationType;
    public WebElement getCaveatCaseApplicationType(){return caveatCaseApplicationType;}

    @FindBy(xpath = "//select[@id='registryLocation']")
    WebElement caveatCaseRegistryLocation;
    public WebElement getCaveatCaseRegistryLocation(){return caveatCaseRegistryLocation;}

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement caveatCaseDetailsPageContinue;
    public WebElement getCaveatCaseDetailsPageContinue(){return caveatCaseDetailsPageContinue;}


}
