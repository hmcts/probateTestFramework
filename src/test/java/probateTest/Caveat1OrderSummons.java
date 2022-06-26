package probateTest;


import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pageFactory.caveatCase.*;
import pageFactory.landingPages.CreateCasePage;
import pageFactory.landingPages.LoginPage;
import pageFactory.landingPages.ManageCasesPage;
import webDrivers.DriverBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;




public class Caveat1OrderSummons extends DriverBase {
    public Properties prop = new Properties();
       public WebDriver driver = initializeDriver();
    public Caveat1OrderSummons() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/pagesProperties/shareCase.properties");
        prop.load(fis);
        driver.get(prop.getProperty("URL"));
    }



    @Test
    @Given("THAT I am on the Assemble a letter screen")
    public void thatIAmOnTheAssembleALetterScreen() throws InterruptedException, IOException {


        LoginPage rh = new LoginPage(driver);

        rh.LoginId().sendKeys(prop.getProperty("LoginIDAAT"));
        rh.LoginPassword().sendKeys(prop.getProperty("LoginPasswordAAT"));
        rh.signInButton().click();
        ManageCasesPage rh1 = new ManageCasesPage(driver);

        //wait.until(ExpectedConditions.elementToBeClickable(rh1.createCaseSelect()));
        Thread.sleep(6000);
        rh1.createCaseSelect().click();

        CreateCasePage cc = new CreateCasePage(driver);
        Thread.sleep(4000);
        List<WebElement> caseType = getCreateCaseCaseType(cc);
        List<WebElement> eventType =getEventType(cc);
        cc.getCreateCaseStart().click();

        RaiseCaveatCaseDetails ph = new RaiseCaveatCaseDetails(driver);
        Thread.sleep(5000);
        //wait.until(ExpectedConditions.elementToBeClickable(ph.getCaveatCaseApplicationType()));
        List<WebElement> applicationType =getApplicationType(ph);
        List<WebElement> registryLocation = getRegistryLocation(ph);
        ph.getCaveatCaseDetailsPageContinue().click();
// Deceased Details

        RaiseCaveatDeceasedDetails co = new RaiseCaveatDeceasedDetails(driver);

        co.getCaveatDeceasedForename().sendKeys(prop.getProperty("getCaveatDeceasedForename"));
        co.getCaveatDeceasedSurname().sendKeys(prop.getProperty("getCaveatDeceasedSurname"));
        co.getDeceasedDateOfDeathDay().sendKeys(prop.getProperty("getDeceasedDateOfDeathDay"));
        co.getDeceasedDateOfDeathMonth().sendKeys(prop.getProperty("getDeceasedDateOfDeathMonth"));
        co.getDeceasedDateOfDeathYear().sendKeys(prop.getProperty("getDeceasedDateOfDeathYear"));
        co.getDeceasedDateOfBirthDay().sendKeys(prop.getProperty("getDeceasedDateOfBirthDay"));
        co.getDeceasedDateOfBirthMonth().sendKeys(prop.getProperty("getDeceasedDateOfBirthMonth"));
        co.getDeceasedDateOfBirthYear().sendKeys(prop.getProperty("getDeceasedDateOfBirthYear"));
        co.getDeceasedAssetsOtherNamesYes().click();
        co.getDeceasedAddressManual().click();
        co.getDeceasedAddressBuildingStreet().sendKeys(prop.getProperty("getDeceasedAddressBuildingStreet"));
        co.getDeceasedAddressLine2().sendKeys(prop.getProperty("getDeceasedAddressLine2"));
        co.getDeceasedAddressTownCity().sendKeys(prop.getProperty("getDeceasedAddressTownCity"));
        co.getDeceasedAddressPostCode().sendKeys(prop.getProperty("getDeceasedAddressPostCode"));
        co.getDeceasedAddressCountry().sendKeys(prop.getProperty("getDeceasedAddressCountry"));
        co.getContinueButton().click();

        // Caveator Details

        RaiseCaveatCaveatorDetails co1 = new RaiseCaveatCaveatorDetails(driver);

        co1.getCaveatorForeName().sendKeys(prop.getProperty("getCaveatorForeName"));
        co1.getCaveatorSurname().sendKeys(prop.getProperty("getCaveatorSurname"));
        co1.getCaveatorEmail().sendKeys(prop.getProperty("getCaveatorEmail"));
        co1.getReferenceForApplication().sendKeys(prop.getProperty("getReferenceForApplication"));
        co1.getCaveatorAddressManual().click();
        co1.getCaveatorAddressBuildingStreet().sendKeys(prop.getProperty("getCaveatorAddressBuildingStreet"));
        co1.getCaveatorAddressLine2().sendKeys(prop.getProperty("getCaveatorAddressLine2"));
        co1.getCaveatorAddressLine3().sendKeys(prop.getProperty("getCaveatorAddressLine3"));
        co1.getCaveatorAddressCounty().sendKeys(prop.getProperty("getCaveatorAddressCounty"));
        co1.getCaveatorAddressPostCode().sendKeys(prop.getProperty("getCaveatorAddressPostCode"));
        co1.getCaveatorAddressCountry().sendKeys(prop.getProperty("getCaveatorAddressCountry"));
        co1.getLanguageWelshNo().click();
        co1.getContinueButton().click();
        RaiseCaveatEmailNotification co2 = new RaiseCaveatEmailNotification(driver);

        co2.getCaveatEmailNotificationYes().click();
        co2.getContinueButton().click();

        RaiseCaveatCaseCheckAnswers co3 = new RaiseCaveatCaseCheckAnswers(driver);

        co3.getCaveatEventDescription().sendKeys(prop.getProperty("getCaveatEventDescription"));
        co3.getCaveatEventSummery().sendKeys(prop.getProperty("getCaveatEventSummery"));
        co3.getCaveatSubmitApplication().click();




    }


















    private List<WebElement> getCreateCaseCaseType(CreateCasePage cc){
        WebElement option = cc.getCreateCaseCaseType();
        Select se1 = new Select(option);
        List<WebElement> selectCaseType = se1.getOptions();
        for (WebElement webElement : selectCaseType) {
            if (webElement.getText().equalsIgnoreCase("Caveat")) {
                webElement.click();
                break;

            }
        }
        return selectCaseType;
    }
// Loop Methods

    private List<WebElement> getEventType(CreateCasePage cc){
        WebElement option = cc.getCreateCaseEvent();
        Select se1 = new Select(option);
        List<WebElement> selectEventType = se1.getOptions();
        for (WebElement webElement : selectEventType) {
            if (webElement.getText().equalsIgnoreCase("Raise a caveat")) {
                webElement.click();
                break;
            }
        }
        return selectEventType;
    }

    private List<WebElement> getApplicationType(RaiseCaveatCaseDetails ph){
        WebElement option = ph.getCaveatCaseApplicationType();
        Select se1 = new Select(option);
        List<WebElement> selectApplicationType = se1.getOptions();
        for (WebElement webElement : selectApplicationType) {
            if (webElement.getText().equalsIgnoreCase("Personal")) {
                webElement.click();
                break;
            }
        }
        return selectApplicationType;
    }

    private List<WebElement> getRegistryLocation(RaiseCaveatCaseDetails ph){
        WebElement option = ph.getCaveatCaseRegistryLocation();
        Select se1 = new Select(option);
        List<WebElement> selectRegistryLocation = se1.getOptions();
        for (WebElement webElement : selectRegistryLocation) {
            if (webElement.getText().equalsIgnoreCase("Birmingham")) {
                webElement.click();
                break;
            }
        }
        return selectRegistryLocation;
    }
}
