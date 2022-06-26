package pageFactory.caveatCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RaiseCaveatCaveatorDetails {

        WebDriver driver;

    public RaiseCaveatCaveatorDetails(WebDriver driver) {
        this.driver = driver;
    PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@id='caveatorForenames']")
    WebElement caveatorForeName;
    public WebElement getCaveatorForeName(){return caveatorForeName;}

    @FindBy(xpath = "//input[@id='caveatorSurname']")
    WebElement caveatorSurname;
    public WebElement getCaveatorSurname(){return caveatorSurname;}

    @FindBy(xpath = "//input[@id='caveatorEmailAddress']")
    WebElement caveatorEmail;
    public WebElement getCaveatorEmail(){return caveatorEmail;}

    @FindBy(xpath = "//input[@id='solsSolicitorAppReference']")
    WebElement referenceForApplication;
    public WebElement getReferenceForApplication(){return referenceForApplication;}



    @FindBy(xpath = "//a[@class='manual-link bottom-30']")
    WebElement caveatorAddressManual;
    public WebElement getCaveatorAddressManual(){return caveatorAddressManual;}

    @FindBy(css ="#caveatorAddress__detailAddressLine1")
    WebElement caveatorAddressBuildingStreet;
    public WebElement getCaveatorAddressBuildingStreet(){return caveatorAddressBuildingStreet;}

    @FindBy(xpath = "//input[@id='caveatorAddress__detailAddressLine2']")
    WebElement caveatorAddressLine2;
    public WebElement getCaveatorAddressLine2(){return caveatorAddressLine2;}

    @FindBy(xpath = "//input[@id='caveatorAddress__detailAddressLine3']")
    WebElement caveatorAddressLine3;
    public WebElement getCaveatorAddressLine3(){return caveatorAddressLine3;}

    @FindBy(xpath = "//input[@id='caveatorAddress__detailPostTown']")
    WebElement caveatorAddressTownCity;
    public WebElement getCaveatorAddressTownCity(){return caveatorAddressTownCity;}

    @FindBy(xpath = "//input[@id='caveatorAddress__detailCounty']")
    WebElement caveatorAddressCounty;
    public WebElement getCaveatorAddressCounty(){return caveatorAddressCounty;}

    @FindBy(xpath = "//input[@id='caveatorAddress__detailPostCode']")
    WebElement caveatorAddressPostCode;
    public WebElement getCaveatorAddressPostCode(){return caveatorAddressPostCode;}

    @FindBy(xpath = "//input[@id='caveatorAddress__detailCountry']")
    WebElement caveatorAddressCountry;
    public WebElement getCaveatorAddressCountry(){return caveatorAddressCountry;}

    @FindBy(xpath = "//input[@id='languagePreferenceWelsh_Yes']")
    WebElement languageWelshYes;
    public WebElement getLanguageWelshYes(){return languageWelshYes;}

    @FindBy(xpath = "//input[@id='languagePreferenceWelsh_No']")
    WebElement languageWelshNo;
    public WebElement getLanguageWelshNo(){return languageWelshNo;}


    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    public WebElement getContinueButton(){return continueButton;}





}
