package pageFactory.landingPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyForProbate {

    WebDriver driver;

    public ApplyForProbate(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Save and continue']")
    WebElement saveContinueButton;
    public WebElement getSaveContinueButton(){return saveContinueButton;}

}
