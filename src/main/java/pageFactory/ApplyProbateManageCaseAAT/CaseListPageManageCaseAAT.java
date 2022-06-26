package pageFactory.ApplyProbateManageCaseAAT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaseListPageManageCaseAAT {
    WebDriver driver;

    public CaseListPageManageCaseAAT(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Case list']")
    WebElement caseListSelect;
    public WebElement getCaseListSelect(){return caseListSelect;}

    @FindBy (xpath = "//select[@id='wb-case-type']")
    WebElement selectCaseType;
    public WebElement getSelectCaseType(){return selectCaseType;}

    @FindBy(xpath = "//button[normalize-space()='Apply']")
    WebElement applyButton;
    public WebElement getApplyButton(){return applyButton;}

    @FindBy(xpath = "//button[@id='btn-share-button']")
    WebElement selectShareCase;
    public WebElement getSelectShareCase(){return selectShareCase;}

}
