package pageFactory.caveatCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RaiseCaveatDeceasedDetails {

        WebDriver driver;

    public RaiseCaveatDeceasedDetails(WebDriver driver) {
        this.driver = driver;
    PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@id='deceasedForenames']")
    WebElement caveatDeceasedForename;
    public WebElement getCaveatDeceasedForename(){return caveatDeceasedForename;}

    @FindBy(xpath = "//input[@id='deceasedSurname']")
    WebElement caveatDeceasedSurname;
    public WebElement getCaveatDeceasedSurname(){return caveatDeceasedSurname;}

    @FindBy(xpath = "//input[@id='deceasedDateOfDeath-day']")
    WebElement deceasedDateOfDeathDay;
    public WebElement getDeceasedDateOfDeathDay(){return deceasedDateOfDeathDay;}

    @FindBy(xpath = "//input[@id='deceasedDateOfDeath-month']")
    WebElement deceasedDateOfDeathMonth;
    public WebElement getDeceasedDateOfDeathMonth(){return deceasedDateOfDeathMonth;}

    @FindBy(xpath = "//input[@id='deceasedDateOfDeath-year']")
    WebElement deceasedDateOfDeathYear;
    public  WebElement getDeceasedDateOfDeathYear(){return deceasedDateOfDeathYear;}

    @FindBy(xpath = "//input[@id='deceasedDateOfBirth-day']")
    WebElement deceasedDateOfBirthDay;
    public WebElement getDeceasedDateOfBirthDay(){return deceasedDateOfBirthDay;}

    @FindBy(xpath = "//input[@id='deceasedDateOfBirth-month']")
    WebElement deceasedDateOfBirthMonth;
    public WebElement getDeceasedDateOfBirthMonth(){return deceasedDateOfBirthMonth;}

    @FindBy(xpath = "//input[@id='deceasedDateOfBirth-year']")
    WebElement deceasedDateOfBirthYear;
    public WebElement getDeceasedDateOfBirthYear(){return deceasedDateOfBirthYear;}

    @FindBy(xpath = "//input[@id='deceasedAnyOtherNames_Yes']")
    WebElement deceasedAssetsOtherNamesYes;
    public WebElement getDeceasedAssetsOtherNamesYes(){return deceasedAssetsOtherNamesYes;}

    @FindBy(xpath = "//input[@id='deceasedAnyOtherNames_No']")
    WebElement deceasedAssetsOtherNamesNo;
    public WebElement getDeceasedAssetsOtherNamesNo(){return deceasedAssetsOtherNamesNo;}

    @FindBy(xpath = "//a[@class='manual-link bottom-30']")
    WebElement deceasedAddressManual;
    public WebElement getDeceasedAddressManual(){return deceasedAddressManual;}

    @FindBy(css ="#deceasedAddress__detailAddressLine1")
    WebElement deceasedAddressBuildingStreet;
    public WebElement getDeceasedAddressBuildingStreet(){return deceasedAddressBuildingStreet;}

    @FindBy(xpath = "//input[@id='deceasedAddress__detailAddressLine2']")
    WebElement deceasedAddressLine2;
    public WebElement getDeceasedAddressLine2(){return deceasedAddressLine2;}

    @FindBy(xpath = "//input[@id='deceasedAddress__detailAddressLine3']")
    WebElement deceasedAddressLine3;
    public WebElement getDeceasedAddressLine3(){return deceasedAddressLine3;}

    @FindBy(xpath = "//input[@id='deceasedAddress__detailPostTown']")
    WebElement deceasedAddressTownCity;
    public WebElement getDeceasedAddressTownCity(){return deceasedAddressTownCity;}

    @FindBy(xpath = "//input[@id='deceasedAddress__detailCounty']")
    WebElement deceasedAddressCounty;
    public WebElement getDeceasedAddressCounty(){return deceasedAddressCounty;}

    @FindBy(xpath = "//input[@id='deceasedAddress__detailPostCode']")
    WebElement deceasedAddressPostCode;
    public WebElement getDeceasedAddressPostCode(){return deceasedAddressPostCode;}

    @FindBy(xpath = "//input[@id='deceasedAddress__detailCountry']")
    WebElement deceasedAddressCountry;
    public WebElement getDeceasedAddressCountry(){return deceasedAddressCountry;}

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    public WebElement getContinueButton(){return continueButton;}





}
