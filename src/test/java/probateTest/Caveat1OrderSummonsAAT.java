package probateTest;


import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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

import static java.time.Duration.ofSeconds;


public class Caveat1OrderSummonsAAT extends DriverBase {

    public WebDriver driver = initializeDriver();

    public Caveat1OrderSummonsAAT() throws IOException {
        driver.get("https://manage-case.aat.platform.hmcts.net");

       // Properties prop = new Properties();
        //FileInputStream fis = new FileInputStream("src/main/java/caveatCase/caveat.properties");
        //prop.load(fis);

    }

    @Test
    @Given("THAT I am on the Assemble a letter screen")
    public void thatIAmOnTheAssembleALetterScreen() throws InterruptedException, IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/java/pagesProperties/caveat.properties");
        prop.load(fis);
        LoginPage rh = new LoginPage(driver);
        WebDriverWait wait = new WebDriverWait(driver,ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(rh.LoginId()));
        rh.LoginId().sendKeys(prop.getProperty("LoginID"));
        rh.LoginPassword().sendKeys(prop.getProperty("LoginPassword"));
        rh.signInButton().click();
        ManageCasesPage rh1 = new ManageCasesPage(driver);
        wait.until(ExpectedConditions.elementToBeClickable(rh1.createCaseSelect()));
        rh1.createCaseSelect().click();
        CreateCasePage cc = new CreateCasePage(driver);
        wait.until(ExpectedConditions.elementToBeClickable(cc.getCreateCaseCaseType()));
        List<WebElement> caseType = getCreateCaseCaseType(cc);
        List<WebElement> eventType =getEventType(cc);
        cc.getCreateCaseStart().click();
        RaiseCaveatCaseDetails ph = new RaiseCaveatCaseDetails(driver);
        wait.until(ExpectedConditions.elementToBeClickable(ph.getCaveatCaseApplicationType()));
        List<WebElement> applicationType =getApplicationType(ph);
        List<WebElement> registryLocation = getRegistryLocation(ph);
        ph.getCaveatCaseDetailsPageContinue().click();
// Deceased Details

        RaiseCaveatDeceasedDetails co = new RaiseCaveatDeceasedDetails(driver);
        wait.until(ExpectedConditions.elementToBeClickable(co.getCaveatDeceasedForename()));
        co.getCaveatDeceasedForename().sendKeys("James");
        co.getCaveatDeceasedSurname().sendKeys("Jones");
        co.getDeceasedDateOfDeathDay().sendKeys("01");
        co.getDeceasedDateOfDeathMonth().sendKeys("05");
        co.getDeceasedDateOfDeathYear().sendKeys("2020");
        co.getDeceasedDateOfBirthDay().sendKeys("01");
        co.getDeceasedDateOfBirthMonth().sendKeys("05");
        co.getDeceasedDateOfBirthYear().sendKeys("1950");
        co.getDeceasedAssetsOtherNamesYes().click();
        co.getDeceasedAddressManual().click();
        co.getDeceasedAddressBuildingStreet().sendKeys("32 High Street");
        co.getDeceasedAddressLine2().sendKeys("High Road");
        co.getDeceasedAddressTownCity().sendKeys("Birmingham");
        co.getDeceasedAddressPostCode().sendKeys("B115SX");
        co.getDeceasedAddressCountry().sendKeys("United Kingdom");
        co.getContinueButton().click();

        // Caveator Details

        RaiseCaveatCaveatorDetails co1 = new RaiseCaveatCaveatorDetails(driver);
        wait.until(ExpectedConditions.elementToBeClickable(co1.getCaveatorForeName()));
        co1.getCaveatorForeName().sendKeys("Caveator1");
        co1.getCaveatorSurname().sendKeys("Caveator Surname");
        co1.getCaveatorEmail().sendKeys("caveator@gmail.com");
        co1.getReferenceForApplication().sendKeys("121145444");
        co1.getCaveatorAddressManual().click();
        co1.getCaveatorAddressBuildingStreet().sendKeys("31 High Street");
        co1.getCaveatorAddressLine2().sendKeys("High Road");
        co1.getCaveatorAddressLine3().sendKeys("Sign");
        co1.getCaveatorAddressCounty().sendKeys("West Midlands");
        co1.getCaveatorAddressPostCode().sendKeys("SO50 7HQ");
        co1.getCaveatorAddressCountry().sendKeys("United Kingdom");
        co1.getLanguageWelshNo().click();
        co1.getContinueButton().click();
        RaiseCaveatEmailNotification co2 = new RaiseCaveatEmailNotification(driver);
        wait.until(ExpectedConditions.elementToBeClickable(co2.getContinueButton()));
        co2.getCaveatEmailNotificationYes().click();
        co2.getContinueButton().click();

        RaiseCaveatCaseCheckAnswers co3 = new RaiseCaveatCaseCheckAnswers(driver);
        wait.until(ExpectedConditions.elementToBeClickable(co3.getCaveatSubmitApplication()));
        co3.getCaveatEventDescription().sendKeys("raise_a_caveat_event_description_text");
        co3.getCaveatEventSummery().sendKeys("raise_a_caveat_event_summary_text");
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
