package pageFactory.landingPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCasesPage {

    WebDriver driver;

    public ManageCasesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Create case")
    WebElement createCase;
    public WebElement createCaseSelect(){
        return createCase;
    }
    @FindBy(xpath = "//select[@id='wb-jurisdiction']")
    WebElement searchFilterJurisdiction;
    public WebElement searchJurisdiction(){
        return searchFilterJurisdiction;
    }

    @FindBy(xpath = "//select[@id='wb-case-type']")
    WebElement searchFilterCaseType;
    public WebElement searchCaseType(){
        return searchFilterCaseType;
    }

    @FindBy(xpath = " //select[@id='wb-case-state']")
    WebElement searchFilterState;
    public WebElement searchState(){
        return searchFilterState;
    }

    @FindBy(xpath = "//button[normalize-space()='Apply']")
    WebElement searchApplyButton;
    public WebElement searchApply(){
        return searchApplyButton;
    }



}
