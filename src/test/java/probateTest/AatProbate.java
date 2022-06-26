package probateTest;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageFactory.PA1PPA1ASolicitorsManual.PA1PPA1ASolicitorsManualCheckAnswers;
import pageFactory.PA1PPA1ASolicitorsManual.PA1PPA1ASolicitorsManualInheritanceTax;
import pageFactory.PA1PPA1ASolicitorsManual.PA1PPA1ASolicitorsManualPage;
import pageFactory.PA1PPA1ASolicitorsManual.PA1PPA1ASolicitorsManualValueOfEstate;
import pageFactory.landingPages.CreateCasePage;
import pageFactory.landingPages.LoginPage;
import pageFactory.landingPages.ManageCasesPage;
import webDrivers.DriverBase;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;




public class AatProbate extends DriverBase {

    public WebDriver driver = initializeDriver();

    public AatProbate() throws IOException {
        driver.get("https://manage-case.aat.platform.hmcts.net");

    }

    @Given("THAT I am on the Assemble a letter screen")
    public void thatIAmOnTheAssembleALetterScreen() throws InterruptedException {
        LoginPage rh = new LoginPage(driver);
        rh.LoginId().sendKeys("probatebackoffice@gmail.com");
        rh.LoginPassword().sendKeys("Monday01");
        rh.signInButton().click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        ManageCasesPage rh1 = new ManageCasesPage(driver);
        Thread.sleep(4000);
        rh1.createCaseSelect().click();
        CreateCasePage cc = new CreateCasePage(driver);
        Thread.sleep(4000);

        List<WebElement> caseType = getCreateCaseCaseType(cc);
        List<WebElement> eventType =getEventType(cc);
        Thread.sleep(3000);
        cc.getCreateCaseStart().click();
        PA1PPA1ASolicitorsManualPage cc1 = new PA1PPA1ASolicitorsManualPage(driver);
        List<WebElement> registryLocation = getRegistryLocation(cc1);
        List<WebElement> applicationType = getApplicationType(cc1);

        //Thread.sleep(2000);
        cc1.getApplicationSubmissionDay().sendKeys("20");
        cc1.getApplicationSubmissionMonth().sendKeys("04");
        cc1.getApplicationSubmissionYear().sendKeys("2021");
        cc1.getSolicitorFirmName().sendKeys("xyz");
        cc1.getProbatePractitionerAsExecutorYes().click();
        cc1.getProbatePractitionerActingAsExecutorYes().click();
        cc1.getProbatePractitionerFirstName().sendKeys("Hrishikesh");
        cc1.getProbatePractitionerLastName().sendKeys("Gawde");
        cc1.getSolicitorAddManual().click();
        cc1.getProbatePractitionerFirmBuildingStreet().sendKeys("123 Bitterne Street");
        cc1.getProbatePractitionerFirmAddressLine2().sendKeys("Horton Heath");
        cc1.getProbatePractitionerFirmAddressLine3().sendKeys("1211");
        cc1.getProbatePractitionerFirmTownCity().sendKeys("Eastleigh");
        cc1.getProbatePractitionerFirmCounty().sendKeys("Hampshire");
        cc1.getProbatePractitionerFirmPostCode().sendKeys("SO50 7HQ");
        cc1.getProbatePractitionerFirmCountry().sendKeys("United Kingdom");
        cc1.getProbatePractitionerApplicationReference().sendKeys("11253422");
        cc1.getProbatePractitionerEmail().sendKeys("xyz@gmail.com");

        List<WebElement> caseTypes = getCaseTypes(cc1);
        cc1.getPaperFormNo().click();
        cc1.getLanguagePreferenceWelshNo().click();
        cc1.getExtraUKcopiesNumber().sendKeys("2");
        cc1.getMoreExecutorsNo().click();
        cc1.getTitleopt().sendKeys("Mr");
        cc1.getFirstName().sendKeys("Simon");
        cc1.getLastName().sendKeys("Johnson");
        cc1.getDeceasedAddManual().click();
        cc1.getDeceasedAddressBuildingStreet().sendKeys("123 High Street");
        cc1.getDeceasedAddressLine2().sendKeys("upper Road");
        cc1.getDeceasedAddressLine3().sendKeys("Down Street");
        cc1.getDeceasedAddressTownCity().sendKeys("Birmingham");
        cc1.getDeceasedAddressCounty().sendKeys("West Midlands");
        cc1.getDeceasedAddressPostCode().sendKeys("BH21 1SY");
        cc1.getDeceasedAddressCountry().sendKeys("United Kingdom");
        cc1.getDateOfBirthDay().sendKeys("01");
        cc1.getDateOfBirthMonth().sendKeys("05");
        cc1.getDateOfBirthYear().sendKeys("1950");
        List<WebElement>typeOfDateOfDeath = getTypeOfDateOfDeath(cc1);
        cc1.getDateOfDeathDay().sendKeys("01");
        cc1.getDateOfdeathMonth().sendKeys("07");
        cc1.getDateOfDeathYear().sendKeys("2020");
        cc1.getDeceasedAssetsAnyOtherNamesNo().click();
        cc1.getDeceasedDomicileInEngWalesNo().click();
        cc1.getContinueButton().click();

        PA1PPA1ASolicitorsManualInheritanceTax cc2 = new PA1PPA1ASolicitorsManualInheritanceTax(driver);

        cc2.getDiedPersonForeignAssetNo().click();
        cc2.getIhtFormCompletedOnlineYes().click();
        cc2.getInheritanceTaxContinueButton().click();

        PA1PPA1ASolicitorsManualValueOfEstate cc3 = new PA1PPA1ASolicitorsManualValueOfEstate(driver);
        cc3.getGrossValueOfEstate().sendKeys("700000");
        cc3.getNetValueOfEstate().sendKeys("500000");
        cc3.getValueOfEstateContinueButton().click();

        PA1PPA1ASolicitorsManualCheckAnswers cc4 = new PA1PPA1ASolicitorsManualCheckAnswers(driver);

        Thread.sleep(3000);
        cc4.getCheckAnswerPageSubmitButton().click();



        //Write code above


        Thread.sleep(20000);
       // driver.quit();

    }
//Methods for Loops


    private List<WebElement> getCaseTypes(PA1PPA1ASolicitorsManualPage cc1){
        WebElement option = cc1.getCaseType();
        Select se1 = new Select(option);
        List<WebElement> selectCaseType = se1.getOptions();
        for (WebElement webElement : selectCaseType) {
            if (webElement.getText().equalsIgnoreCase("Grant of Probate")) {
                webElement.click();
                break;
            }
        }
        return selectCaseType;
    }
    private List<WebElement> getRegistryLocation(PA1PPA1ASolicitorsManualPage cc1){
        WebElement option = cc1.getRegistryLocation();
        Select se1 = new Select(option);
        List<WebElement> selectRegistrylocation = se1.getOptions();
        for (WebElement webElement : selectRegistrylocation) {
            if(webElement.getText().equalsIgnoreCase("Birmingham")){
                webElement.click();
                break;
            }
        }

        return selectRegistrylocation;
    }

    private List<WebElement> getApplicationType(PA1PPA1ASolicitorsManualPage cc1){

        WebElement option = cc1.getApplicationType();
        Select se1 = new Select(option);
        List<WebElement> selectApplicationType = se1.getOptions();
        for (WebElement webElement : selectApplicationType) {
            if (webElement.getText().equalsIgnoreCase("Solicitor")) {
                webElement.click();
                break;
            }
        }
        return selectApplicationType;
    }

    private List<WebElement> getCreateCaseCaseType(CreateCasePage cc){
        WebElement option = cc.getCreateCaseCaseType();
        Select se1 = new Select(option);
        List<WebElement> selectCaseType = se1.getOptions();
        for (WebElement webElement : selectCaseType) {
            if (webElement.getText().equalsIgnoreCase("Grant of representation")) {
                webElement.click();
                break;

            }
        }
        return selectCaseType;
    }

    private List<WebElement> getEventType(CreateCasePage cc){
        WebElement option = cc.getCreateCaseEvent();
        Select se1 = new Select(option);
        List<WebElement> selectEventType = se1.getOptions();
        for (WebElement webElement : selectEventType) {
            if (webElement.getText().equalsIgnoreCase("PA1P/PA1A/Solicitors Manual")) {
                webElement.click();
                break;
            }
        }
        return selectEventType;
    }

    private List<WebElement>getTypeOfDateOfDeath (PA1PPA1ASolicitorsManualPage cc1){
        WebElement option = cc1.getTypeOfDateOfDeath();
        Select se1 = new Select(option);
        List<WebElement> selectTypeofDateOfDeath = se1.getOptions();
        for (WebElement webElement : selectTypeofDateOfDeath){
            if (webElement.getText().equalsIgnoreCase("Died on")){
                webElement.click();
                break;
            }
        }
        return selectTypeofDateOfDeath;
    }


    @When("I view the page")
    public void iViewThePage() {

    }

    @Then("I should see the question 'What type of letter do you want to assemble?")
    public void iShouldSeeTheQuestionWhatTypeOfLetterDoYouWantToAssemble() {

    }
}
