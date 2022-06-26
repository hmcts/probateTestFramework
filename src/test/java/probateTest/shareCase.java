package probateTest;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageFactory.ApplyProbateManageCaseAAT.CaseListPageManageCaseAAT;
import pageFactory.ApplyProbateManageCaseAAT.CheckYourAnswersManageCaseAAT;
import pageFactory.ApplyProbateManageCaseAAT.ProbatePractitionerDetails;
import pageFactory.landingPages.ApplyForProbate;
import pageFactory.landingPages.CreateCasePage;
import pageFactory.landingPages.LoginPage;
import pageFactory.landingPages.ManageCasesPage;
import pageFactory.shareCaseGOP.ShareCasePageGOP;
import webDrivers.DriverBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class shareCase {
    public static class ShareCase extends DriverBase {

        public Properties prop = new Properties();
        public WebDriver driver = initializeDriver();

        public void waitSendKeys(WebDriver driver, WebElement element, Duration timeout, String value){
            new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
            element.sendKeys(value);
        }
        public void waitClick(WebDriver driver, WebElement element, Duration timeout){
            new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        }

        public void waitDisplay(WebDriver driver, WebElement element, Duration timeout){
            new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
            element.isDisplayed();
        }
        public ShareCase() throws IOException {
            FileInputStream fis = new FileInputStream("src/main/resources/pagesProperties/shareCase.properties");
            prop.load(fis);
            driver.get(prop.getProperty("URL"));
            //Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(10000)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
        }
        @Test

        @Given("Gop case1 and GOP case2")
        public void gop_case1_and_gop_case2() throws InterruptedException {


            LoginPage rh = new LoginPage(driver);
            waitSendKeys(driver,rh.LoginId(),Duration.ofSeconds(10), prop.getProperty("LoginId"));

            rh.LoginPassword().sendKeys(prop.getProperty("LoginPassword"));
            rh.signInButton().click();


            ManageCasesPage rh1 = new ManageCasesPage(driver);

            rh1.createCaseSelect().click();
            CreateCasePage cc = new CreateCasePage(driver);
            waitDisplay(driver, cc.getCreateCaseJurisdiction(), Duration.ofSeconds(20));
         Thread.sleep(7000);
            driver.findElement(By.xpath("//option[@value='PROBATE']")).click();
           // List<WebElement> jurisdictionType = getJurisdictionType(cc);
            List<WebElement> caseType = getCreateCaseCaseType(cc);
            List<WebElement> eventType =getEventType(cc);
            waitClick(driver, cc.getCreateCaseStart(), Duration.ofSeconds(20));
            cc.getCreateCaseStart().click();
            ApplyForProbate rh2 = new ApplyForProbate(driver);
            rh2.getSaveContinueButton().click();
            ProbatePractitionerDetails sc = new ProbatePractitionerDetails(driver);
            sc.getProbatePractitionerSignStatementNo().click();
            sc.getProbatePractitionerSignStatementNoName().sendKeys(prop.getProperty("getProbatePractitionerSignStatementNoName"));
            sc.getProbatePractitionerSignStatementNoSurname().sendKeys(prop.getProperty("getProbatePractitionerSignStatementNoSurname"));
            sc.getProbatePractitionerFirstName().sendKeys(prop.getProperty("getProbatePractitionerFirstName"));
            sc.getProbatePractitionerLastName().sendKeys(prop.getProperty("getProbatePractitionerLastName"));
            sc.getProbatePractitionerActingExecutorNo().click();
            sc.getProbatePractitionerActingExecutorYes().click();
            sc.getProbatePractitionerFirmName().sendKeys(prop.getProperty("getProbatePractitionerFirmName"));
            sc.getSelectManualAddress().click();
            sc.getSelectBuildingStreet().sendKeys(prop.getProperty("getSelectBuildingStreet"));
            sc.getSelectAddressLine2().sendKeys(prop.getProperty("getSelectAddressLine2"));
            sc.getSelectAddressLine3().sendKeys(prop.getProperty("getSelectAddressLine3"));
            sc.getSelectTownCity().sendKeys(prop.getProperty("getSelectTownCity"));
            sc.getSelectPostCode().sendKeys(prop.getProperty("getSelectPostCode"));
            sc.getProbatePractitionerEmailAddress().sendKeys(prop.getProperty("getProbatePractitionerEmailAddress"));
            sc.getProbatePractitionerPhoneNumber().sendKeys(prop.getProperty("getProbatePractitionerPhoneNumber"));
            sc.getProbatePractitionerReferenceForApplication().sendKeys(prop.getProperty("getProbatePractitionerReferenceForApplication"));
            Thread.sleep(3000);
            //sc.getSaveAndContinueButton().click();


            CheckYourAnswersManageCaseAAT sc1 = new CheckYourAnswersManageCaseAAT(driver);
            sc1.getSaveContinueButton().click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            WebElement caseOne = driver.findElement(By.xpath("//div[@class='column-one-half']//ccd-case-header"));
            String caseRefOne = caseOne.getText();

            caseRefOne = caseRefOne.replaceAll("\\D+","");




            Thread.sleep(6000);
            rh1.createCaseSelect().click();

            Thread.sleep(6000);

            //jurisdictionType = getJurisdictionType(cc);
            caseType = getCreateCaseCaseType(cc);
            eventType = getEventType(cc);
            Thread.sleep(3000);
            cc.getCreateCaseStart().click();

            rh2.getSaveContinueButton().click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            sc.getProbatePractitionerSignStatementNo().click();
            sc.getProbatePractitionerSignStatementNoName().sendKeys(prop.getProperty("getProbatePractitionerSignStatementNoName"));
            sc.getProbatePractitionerSignStatementNoSurname().sendKeys(prop.getProperty("getProbatePractitionerSignStatementNoSurname"));
            sc.getProbatePractitionerFirstName().sendKeys(prop.getProperty("getProbatePractitionerFirstName"));
            sc.getProbatePractitionerLastName().sendKeys(prop.getProperty("getProbatePractitionerLastName"));
            sc.getProbatePractitionerActingExecutorNo().click();
            sc.getProbatePractitionerActingExecutorYes().click();
            sc.getProbatePractitionerFirmName().sendKeys(prop.getProperty("getProbatePractitionerFirmName"));
            sc.getSelectManualAddressCase2().click();
            sc.getSelectBuildingStreet().sendKeys(prop.getProperty("getSelectBuildingStreet"));
            sc.getSelectAddressLine2().sendKeys(prop.getProperty("getSelectAddressLine2"));
            sc.getSelectAddressLine3().sendKeys(prop.getProperty("getSelectAddressLine3"));
            sc.getSelectTownCity().sendKeys(prop.getProperty("getSelectTownCity"));
            sc.getSelectPostCode().sendKeys(prop.getProperty("getSelectPostCode"));
            sc.getProbatePractitionerEmailAddress().sendKeys(prop.getProperty("getProbatePractitionerEmailAddress"));
            sc.getProbatePractitionerPhoneNumber().sendKeys(prop.getProperty("getProbatePractitionerPhoneNumber"));
            sc.getProbatePractitionerReferenceForApplication().sendKeys(prop.getProperty("getProbatePractitionerReferenceForApplication"));
            Thread.sleep(3000);
            //sc.getSaveAndContinueButton().click();

            Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Check your answers']")).getText(), "Check your answers");

            sc1.getSaveContinueButton().click();
            WebElement caseTwo = driver.findElement(By.xpath("//div[@class='column-one-half']//ccd-case-header"));

            String caseRefTwo = caseTwo.getText();

            caseRefTwo = caseRefTwo.replaceAll("\\D+","");

            System.out.println(caseRefTwo);
            System.out.println(caseRefOne);

            CaseListPageManageCaseAAT rh3 = new CaseListPageManageCaseAAT(driver);
            rh3.getCaseListSelect().click();
            Thread.sleep(4000);
            List<WebElement> caseTypeNew = getSelectCaseCaseType(rh3);
            Thread.sleep(5000);
            rh3.getApplyButton().click();

            By case1Select = By.xpath("//input[@id='select-"+caseRefOne+"']");
            WebElement element = driver.findElement(case1Select);
            element.click();

            By case2Select = By.xpath("//input[@id='select-"+caseRefTwo+"']");
            WebElement element2 = driver.findElement(case2Select);
            element2.click();
            CaseListPageManageCaseAAT rh4 = new CaseListPageManageCaseAAT(driver);
            rh4.getSelectShareCase().click();
            ShareCasePageGOP rh5 = new ShareCasePageGOP(driver);
            rh5.getShareCaseEmailAddressBox().click();
            rh5.getSelectOpenAll().sendKeys("pp");
            driver.findElement(By.xpath("//span[normalize-space()='ProbatePPTwo Org2 - probate.pp2.org2@gmail.com']")).click();
            Thread.sleep(3000);
            rh5.getSelectAddButton().click();

            rh5.getSelectOpenAll().click();
            Assert.assertEquals(driver.findElement(By.xpath("//td[@id='user-email-pendingShares-1']")).getText(),"probate.pp2.org2@gmail.com");
            rh5.getSelectContinueButton().click();
            Thread.sleep(3000);
            rh5.getSelectConfirmButton().click();
            Assert.assertEquals(driver.findElement(By.xpath("//h1[normalize-space()='Your cases have been updated']")).getText(),"Your cases have been updated");
        }

        @AfterAll
        @When("user select Share A case Button")
        public void userSelectShareACaseButton() {

            CaseListPageManageCaseAAT rh4 = new CaseListPageManageCaseAAT(driver);
            rh4.getSelectShareCase().click();

        }

        @Test
        @And("Enter another PP{int} email address to share case")
        public void enterAnotherPPEmailAddressToShareCase(int arg0) throws InterruptedException {
            ShareCasePageGOP rh4 = new ShareCasePageGOP(driver);
            rh4.getShareCaseEmailAddressBox().sendKeys("probate.pp2.org2@gmail.com");
            rh4.getSelectAddButton().click();
            rh4.getSelectOpenAll().click();
            Assert.assertEquals(driver.findElement(By.xpath("//td[@id='user-email-pendingShares-1']")).getText(),"probate.pp2.org2@gmail.com");
            rh4.getSelectContinueButton().click();
            Thread.sleep(3000);
            rh4.getSelectConfirmButton().click();
            Assert.assertEquals(driver.findElement(By.xpath("//h1[normalize-space()='Your cases have been updated']")).getText(),"Your cases have been updated");


        }

        @Then("Both PP{int} and PP{int} User should be able to view case reference")
        public void bothPPAndPPUserShouldBeAbleToViewCaseReference(int arg0, int arg1) {
        }

        private List<WebElement> getCreateCaseCaseType( CreateCasePage cc){
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

        private List<WebElement> getJurisdictionType(CreateCasePage cc){
            WebElement option = cc.getCreateCaseJurisdiction();
            Select se1 = new Select(option);
            List<WebElement> selectEventType = se1.getOptions();
            for (WebElement webElement : selectEventType) {
                if (webElement.getText().equalsIgnoreCase("Manage probate application")) {
                    webElement.click();
                    break;
                }
            }
            return selectEventType;
        }

        private List<WebElement> getAddressProbate(ProbatePractitionerDetails sc){
            WebElement option = sc.getSelectAddress();
            Select se1 = new Select(option);
            List<WebElement> selectAddress = se1.getOptions();
            for (WebElement webElement : selectAddress) {
                if (webElement.getText().equalsIgnoreCase("Apartment 201, Islington Gates, 4 Fleet Street, Birmingham")) {
                    webElement.click();
                    break;
                }
            }
            return selectAddress;
        }

        private List<WebElement> getSelectCaseCaseType(CaseListPageManageCaseAAT rh3){
            WebElement option = rh3.getSelectCaseType();
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
    }
}



