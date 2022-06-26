package pageFactory.PA1PPA1ASolicitorsManual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PA1PPA1ASolicitorsManualCheckAnswers {
    WebDriver driver;

    public PA1PPA1ASolicitorsManualCheckAnswers(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    WebElement checkAnswerPageSubmitButton;
    public WebElement getCheckAnswerPageSubmitButton(){return checkAnswerPageSubmitButton;}
}
