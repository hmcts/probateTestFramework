package pageFactory.PA1PPA1ASolicitorsManual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PA1PPA1ASolicitorsManualPage {

    WebDriver driver;

    public PA1PPA1ASolicitorsManualPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='registryLocation']")
    WebElement registryLocation;
    public WebElement getRegistryLocation(){
        return registryLocation;
    }



    @FindBy(xpath = "//select[@id='applicationType']")
    WebElement applicationType;
    public WebElement getApplicationType(){
        return applicationType;
    }

    @FindBy(xpath = "//input[@id='applicationSubmittedDate-day']")
    WebElement applicationSubmissionDay;
    public WebElement getApplicationSubmissionDay(){
        return applicationSubmissionDay;
    }

    @FindBy(xpath = "//input[@id='applicationSubmittedDate-month']")
    WebElement applicationSubmissionMonth;
    public WebElement getApplicationSubmissionMonth(){
        return applicationSubmissionMonth;
    }

    @FindBy(xpath = "//input[@id='applicationSubmittedDate-year']")
    WebElement applicationSubmissionYear;
    public WebElement getApplicationSubmissionYear(){
        return applicationSubmissionYear;
    }

    @FindBy(xpath = "//select[@id='caseType']")
    WebElement caseType;
    public WebElement getCaseType(){
        return caseType;
    }

    @FindBy(xpath = "//input[@id='paperForm_Yes']")
    WebElement paperFormYes;
    public WebElement getPaperFormYes(){
        return paperFormYes;
    }

    @FindBy(xpath = "//input[@id='paperForm_No']")
    WebElement paperFormNo;
    public WebElement getPaperFormNo(){
        return paperFormNo;
    }

    @FindBy(xpath = "//input[@id='languagePreferenceWelsh_No']")
    WebElement languagePreferenceWelshNo;
    public WebElement getLanguagePreferenceWelshNo(){return languagePreferenceWelshNo;}

    @FindBy(xpath = "//input[@id='extraCopiesOfGrant']")
    WebElement extraUKcopiesNumber;
    public WebElement getExtraUKcopiesNumber(){
        return extraUKcopiesNumber;
    }

    @FindBy(xpath = "//input[@id='outsideUKGrantCopies']")
    WebElement outsideUKsealedCertifiedCopies;
    public WebElement getOutsideUKsealedCertifiedCopies(){return outsideUKsealedCertifiedCopies;}

    @FindBy(xpath = "//input[@id='otherExecutorExists_Yes']")
    WebElement moreExecutorsYes;
    public WebElement getMoreExecutorsYes(){
        return moreExecutorsYes;
    }

    @FindBy(xpath = "//input[@id='otherExecutorExists_No']")
    WebElement moreExecutorsNo;
    public WebElement getMoreExecutorsNo(){
        return moreExecutorsNo;
    }

// About the person who has died

    @FindBy(xpath = "//input[@id='boDeceasedTitle']")
    WebElement titleopt;
    public WebElement getTitleopt(){
        return titleopt;
    }

    @FindBy(xpath = "//input[@id='deceasedForenames']")
    WebElement firstName;
    public WebElement getFirstName(){
        return firstName;
    }

    @FindBy(xpath = "//input[@id='deceasedSurname']")
    WebElement lastName;
    public WebElement getLastName(){
        return lastName;
    }

    @FindBy(xpath = "//input[@id='boDeceasedHonours']")
    WebElement honoursOpt;
    public WebElement getHonoursOpt(){
        return honoursOpt;
    }

  //Permanent address of deceased at time of death
    @FindBy(xpath = "//input[@id='deceasedAddress_deceasedAddress_postcodeInput']")
    WebElement ukPostcode;
    public WebElement getUkPostcode(){
        return ukPostcode;
    }

    @FindBy(xpath = "//input[@id='deceasedDateOfBirth-day']")
    WebElement dateOfBirthDay;
    public WebElement getDateOfBirthDay(){
        return dateOfBirthDay;
    }

    @FindBy(xpath = "//input[@id='deceasedDateOfBirth-month']")
    WebElement dateOfBirthMonth;
    public WebElement getDateOfBirthMonth(){
        return dateOfBirthMonth;
    }

    @FindBy(xpath = "//input[@id='deceasedDateOfBirth-year']")
    WebElement dateOfBirthYear;
    public WebElement getDateOfBirthYear(){
        return dateOfBirthYear;
    }

    @FindBy(xpath = "//select[@id='dateOfDeathType']")
    WebElement dateOfDeathType;
    public WebElement getDateOfDeathType(){
        return dateOfDeathType;
    }

    @FindBy(xpath = "//input[@id='deceasedDateOfDeath-day']")
    WebElement dateOfDeathDay;
    public WebElement getDateOfDeathDay(){
        return dateOfDeathDay;
    }

    @FindBy(xpath = "//input[@id='deceasedDateOfDeath-month']")
    WebElement dateOfdeathMonth;
    public WebElement getDateOfdeathMonth(){
        return dateOfdeathMonth;
    }

    @FindBy(xpath = "//input[@id='deceasedDateOfDeath-year']")
    WebElement dateOfDeathYear;
    public WebElement getDateOfDeathYear(){
        return dateOfDeathYear;
    }

    @FindBy(xpath = "//input[@id='deceasedAnyOtherNames_Yes']")
    WebElement deceasedAssetsAnyOtherNamesYes;
    public WebElement getDeceasedAssetsAnyOtherNamesYes(){
        return deceasedAssetsAnyOtherNamesYes;
    }

    @FindBy(xpath = "//input[@id='deceasedAnyOtherNames_No']")
    WebElement deceasedAssetsAnyOtherNamesNo;
    public WebElement getDeceasedAssetsAnyOtherNamesNo(){
        return deceasedAssetsAnyOtherNamesNo;
    }

    @FindBy(xpath = "//input[@id='deceasedDomicileInEngWales_Yes']")
    WebElement deceasedDomicileInEngWalesYes;
    public WebElement getDeceasedDomicileInEngWalesYes(){
        return deceasedDomicileInEngWalesYes;
    }

    @FindBy(xpath = "//input[@id='deceasedDomicileInEngWales_No']")
    WebElement deceasedDomicileInEngWalesNo;
    public WebElement getDeceasedDomicileInEngWalesNo(){
        return deceasedDomicileInEngWalesNo;
    }

    @FindBy(xpath = "//textarea[@id='applicationGrounds']")
    WebElement applicationGroundInfoSupport;
    public WebElement getApplicationGroundInfoSupport(){
        return applicationGroundInfoSupport;
    }

    @FindBy(xpath = "//button[normalize-space()='Previous']")
    WebElement previousButton;
    public WebElement getPreviousButton(){
        return previousButton;
    }

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    public WebElement getContinueButton(){
        return continueButton;
    }

    @FindBy(xpath = "//a[normalize-space()='Cancel']")
    WebElement cancelLink;
    public WebElement getCancelLink(){
        return cancelLink;
    }

// Probate practitioner Executor --> yes

    @FindBy(xpath = "//input[@id='solsSolicitorFirmName']")
    WebElement solicitorFirmName;
    public WebElement getSolicitorFirmName(){
        return solicitorFirmName;
    }

// Probate practitioner named in the will as an executor
    @FindBy(xpath = "//input[@id='solsSolicitorIsExec_Yes']" )
    WebElement probatePractitionerAsExecutorYes;
    public  WebElement getProbatePractitionerAsExecutorYes(){return probatePractitionerAsExecutorYes;}

    @FindBy(xpath = "//input[@id='solsSolicitorIsExec_Yes']" )
    WebElement probatePractitionerAsExecutorNo;
    public  WebElement getProbatePractitionerAsExecutorNo(){return probatePractitionerAsExecutorNo;}

    //Probate practitioner acting as an executor

    @FindBy(xpath = "//input[@id='solsSolicitorIsApplying_Yes']")
    WebElement probatePractitionerActingAsExecutorYes;
    public WebElement getProbatePractitionerActingAsExecutorYes(){return probatePractitionerActingAsExecutorYes;}

    @FindBy(xpath = "//input[@id='solsSolicitorIsApplying_No']")
    WebElement probatePractitionerActingAsExecutorNo;
    public WebElement getProbatePractitionerActingAsExecutorNo(){return probatePractitionerActingAsExecutorNo;}



    @FindBy(xpath = "//input[@id='solsSOTForenames']")
    WebElement probatePractitionerFirstName;
    public WebElement getProbatePractitionerFirstName(){
        return probatePractitionerFirstName;
    }

    @FindBy(xpath = "//input[@id='solsSOTSurname']")
    WebElement probatePractitionerLastName;
    public WebElement getProbatePractitionerLastName(){
        return probatePractitionerLastName;
    }

    // Probate practitioner Firm Address Manual

    @FindBy(css = "#solsSolicitorAddress__detailAddressLine1")
    WebElement probatePractitionerFirmBuildingStreet;
    public WebElement getProbatePractitionerFirmBuildingStreet(){return probatePractitionerFirmBuildingStreet;}

    @FindBy(css = "#solsSolicitorAddress__detailAddressLine2")
    WebElement probatePractitionerFirmAddressLine2;
    public WebElement getProbatePractitionerFirmAddressLine2(){return probatePractitionerFirmAddressLine2;}

    @FindBy(css = "#solsSolicitorAddress__detailAddressLine3")
    WebElement probatePractitionerFirmAddressLine3;
    public WebElement getProbatePractitionerFirmAddressLine3(){return probatePractitionerFirmAddressLine3;}

    @FindBy(css = "#solsSolicitorAddress__detailPostTown")
    WebElement probatePractitionerFirmTownCity;
    public WebElement getProbatePractitionerFirmTownCity(){return probatePractitionerFirmTownCity;}

    @FindBy(css = "#solsSolicitorAddress__detailCounty")
    WebElement probatePractitionerFirmCounty;
    public WebElement getProbatePractitionerFirmCounty(){return probatePractitionerFirmCounty;}

    @FindBy(xpath = "//input[@id='solsSolicitorAddress__detailPostCode']")
    WebElement probatePractitionerFirmPostCode;
    public WebElement getProbatePractitionerFirmPostCode(){return probatePractitionerFirmPostCode;}
    @FindBy(xpath = "//input[@id='solsSolicitorAddress__detailCountry']")
    WebElement probatePractitionerFirmCountry;
    public WebElement getProbatePractitionerFirmCountry(){return probatePractitionerFirmCountry;}






    @FindBy(xpath = "//input[@id='solsSolicitorAppReference']")
    WebElement probatePractitionerApplicationReference;
    public WebElement getProbatePractitionerApplicationReference(){
        return probatePractitionerApplicationReference;
    }

    @FindBy(xpath = "//input[@id='solsSolicitorEmail']")
    WebElement probatePractitionerEmail;
    public WebElement getProbatePractitionerEmail(){
        return probatePractitionerEmail;
    }

    //Manual Address Links without Elements

    @FindBy(xpath = "//div[@id='solsSolicitorAddress_solsSolicitorAddress']//a[@class='manual-link bottom-30']")
    WebElement solicitorAddManual;
    public WebElement getSolicitorAddManual(){
        return solicitorAddManual;
    }

    @FindBy(linkText = "I can't enter a UK postcode")
    WebElement deceasedAddManual;
    public WebElement getDeceasedAddManual(){
        return deceasedAddManual;
    }
    // Permanent address of deceased at time of death

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

// Type of Death
    @FindBy(xpath = "//select[@id='dateOfDeathType']")
    WebElement typeOfDateOfDeath;
    public WebElement getTypeOfDateOfDeath(){return typeOfDateOfDeath;}

    @FindBy(xpath = "//option[@value='1: diedOn']")
    WebElement optionDiedOn;
    public WebElement getOptionDiedOn(){return optionDiedOn;}









}
