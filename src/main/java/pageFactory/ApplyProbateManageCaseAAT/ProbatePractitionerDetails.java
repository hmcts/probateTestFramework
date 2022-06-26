package pageFactory.ApplyProbateManageCaseAAT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProbatePractitionerDetails {
    WebDriver driver;

    public ProbatePractitionerDetails(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='solsSolicitorWillSignSOT_Yes']")
    WebElement probatePractitionerSignStatementYes;
    public WebElement getProbatePractitionerSignStatementYes(){return probatePractitionerSignStatementYes;}

    @FindBy(xpath = "//input[@id='solsSolicitorWillSignSOT_No']")
    WebElement probatePractitionerSignStatementNo;
    public WebElement getProbatePractitionerSignStatementNo(){return probatePractitionerSignStatementNo;}

    @FindBy(xpath = "//input[@id='solsForenames']")
    WebElement probatePractitionerSignStatementNoName;
    public WebElement getProbatePractitionerSignStatementNoName(){return probatePractitionerSignStatementNoName;}

    @FindBy(xpath = "//input[@id='solsSurname']")
    WebElement probatePractitionerSignStatementNoSurname;
    public WebElement getProbatePractitionerSignStatementNoSurname(){return probatePractitionerSignStatementNoSurname;}


    @FindBy(xpath = "//input[@id='solsSOTForenames']" )
    WebElement probatePractitionerFirstName;
    public WebElement getProbatePractitionerFirstName(){return probatePractitionerFirstName;}

    @FindBy(xpath = "//input[@id='solsSOTSurname']")
    WebElement probatePractitionerLastName;
    public WebElement getProbatePractitionerLastName(){return probatePractitionerLastName;}

    @FindBy(xpath = "//input[@id='solsSOTForenames']")
    WebElement probatePractitionerNamedExecutorYes;
    public WebElement getProbatePractitionerNamedExecutorYes(){return probatePractitionerNamedExecutorYes;}

    @FindBy(xpath = "//input[@id='solsSolicitorIsExec_No']")
    WebElement probatePractitionerNamedExecutorNo;
    public WebElement getProbatePractitionerNamedExecutorNo(){return probatePractitionerNamedExecutorNo;}

    @FindBy(xpath = "//input[@id='solsSolicitorIsExec_No']")
    WebElement probatePractitionerActingExecutorYes;
    public WebElement getProbatePractitionerActingExecutorYes(){return probatePractitionerActingExecutorYes;}

    @FindBy(xpath = "//input[@id='solsSolicitorIsApplying_No']")
    WebElement probatePractitionerActingExecutorNo;
    public WebElement getProbatePractitionerActingExecutorNo(){return probatePractitionerActingExecutorNo;}

    @FindBy(xpath = "//input[@id='solsSolicitorFirmName']")
    WebElement probatePractitionerFirmName;
    public WebElement getProbatePractitionerFirmName(){return probatePractitionerFirmName;}

    @FindBy(xpath = "//input[@id='solsSolicitorAddress_solsSolicitorAddress_postcodeInput']")
    WebElement probatePractitionerFirmAddressPostcode;
    public WebElement getProbatePractitionerFirmAddressPostcode(){return probatePractitionerFirmAddressPostcode;}

    @FindBy(xpath = "//button[normalize-space()='Find address']")
    WebElement findAddressButton;
    public WebElement getFindAddressButton(){return findAddressButton;}

    @FindBy(xpath = "//select[@id='solsSolicitorAddress_solsSolicitorAddress_addressList']")
    WebElement selectAddress;
    public WebElement getSelectAddress(){return selectAddress;}

    //Address Manual
    //input[@id='solsSolicitorAddress__detailAddressLine1']
    @FindBy(xpath = "//a[@class='manual-link bottom-30']")
    WebElement selectManualAddress;
    public WebElement getSelectManualAddress(){return selectManualAddress;}


    @FindBy(xpath = "//a[@class='manual-link bottom-30 ng-star-inserted']")
    WebElement selectManualAddressCase2;
    public WebElement getSelectManualAddressCase2(){return selectManualAddressCase2;}

    @FindBy(xpath = "//input[@id='solsSolicitorAddress__detailAddressLine1']")
    WebElement selectBuildingStreet;
    public WebElement getSelectBuildingStreet(){return selectBuildingStreet;}

    @FindBy(xpath = "//input[@id='solsSolicitorAddress__detailAddressLine2']")
    WebElement selectAddressLine2;
    public WebElement getSelectAddressLine2(){return selectAddressLine2;}

    @FindBy(xpath = "//input[@id='solsSolicitorAddress__detailAddressLine3']")
    WebElement selectAddressLine3;
    public WebElement getSelectAddressLine3(){return selectAddressLine3;}

    @FindBy(xpath = "//input[@id='solsSolicitorAddress__detailPostTown']")
    WebElement selectTownCity;
    public WebElement getSelectTownCity(){return selectTownCity;}

    @FindBy(xpath = "//input[@id='solsSolicitorAddress__detailCounty']")
    WebElement selectCounty;
    public WebElement getSelectCounty(){return selectCounty;}

    @FindBy(xpath = "//input[@id='solsSolicitorAddress__detailPostCode']")
    WebElement selectPostCode;
    public WebElement getSelectPostCode(){return selectPostCode;}

    @FindBy(xpath = "//input[@id='solsSolicitorAddress__detailCountry']")
    WebElement selectCountry;
    public WebElement getSelectCountry(){return selectCountry;}



    @FindBy(xpath = "//input[@id='solsSolicitorEmail']")
    WebElement probatePractitionerEmailAddress;
    public WebElement getProbatePractitionerEmailAddress(){return probatePractitionerEmailAddress;}

    @FindBy(xpath = "//input[@id='solsSolicitorPhoneNumber']")
    WebElement probatePractitionerPhoneNumber;
    public WebElement getProbatePractitionerPhoneNumber(){return probatePractitionerPhoneNumber;}

    @FindBy(xpath = "//input[@id='solsSolicitorAppReference']")
    WebElement probatePractitionerReferenceForApplication;
    public WebElement getProbatePractitionerReferenceForApplication(){return probatePractitionerReferenceForApplication;}



}
