package shareCaseGOP;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageFactory.landingPages.LoginPage;
import pageFactory.shareCaseGOP.ShareCasePageGOP;
import webDrivers.DriverBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class shareCaseGOP extends DriverBase {

    public Properties prop = new Properties();
    public WebDriver driver = initializeDriver();

    private String caseRefOne = "";

   private ShareCasePageGOP sc = new ShareCasePageGOP(driver);



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


    public shareCaseGOP() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/pagesProperties/shareCase.properties");
        prop.load(fis);
        driver.get(prop.getProperty("URL"));


    }


    @Given("PP1 user Log in")
    public void ppUserLogIn() {

        LoginPage rh = new LoginPage(driver);
        rh.LoginId().sendKeys(prop.getProperty("LoginId"));
        rh.LoginPassword().sendKeys(prop.getProperty("LoginPassword"));
        rh.signInButton().click();

    }

    @When("PP2 user create GOP case")
    public void ppUserCreateGOPCase() throws InterruptedException {


        ShareCasePageGOP sc = new ShareCasePageGOP(driver);
        waitDisplay(driver, sc.getClickCreateCase(), Duration.ofSeconds(20));
        sc.getClickCreateCase().click();
        Thread.sleep(3000);
        waitDisplay(driver, sc.getSelectJurisdictionProbateApplication(), Duration.ofSeconds(20));
        sc.getSelectJurisdictionProbateApplication().click();
        sc.getSelectCaseTypeGOP().click();
        sc.getClickStart().click();
        waitDisplay(driver, sc.getClickSaveContinue(), Duration.ofSeconds(20));
        sc.getClickSaveContinue().click();
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
        waitDisplay(driver, sc.getClickSaveContinue(), Duration.ofSeconds(20));
        sc.getClickSaveContinue().click();
        Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Check your answers']")).getText(), "Check your answers");
        waitDisplay(driver, sc.getClickSaveContinue(), Duration.ofSeconds(20));
        sc.getClickSaveContinue().click();

        WebElement caseOne = driver.findElement(By.xpath("//div[@class='column-one-half']//ccd-case-header"));
        caseRefOne = caseOne.getText();

        caseRefOne = caseRefOne.replaceAll("\\D+","");
        waitDisplay(driver, sc.getSelectCaseList(), Duration.ofSeconds(20));
        sc.getSelectCaseList().click();

    }

    @Then("Select a same case and click share")
    public void selectASameCaseAndClickShare() throws InterruptedException {
        System.out.println(caseRefOne);
        Thread.sleep(3000);
        waitDisplay(driver, sc.getSelectFilterCaseTypeGOP(), Duration.ofSeconds(20));
        sc.getSelectFilterCaseTypeGOP().click();
        waitDisplay(driver, sc.getClickApplyButton(),Duration.ofSeconds(20));
        sc.getClickApplyButton().click();

        By case1Select = By.xpath("//input[@id='select-"+caseRefOne+"']");
        WebElement element = driver.findElement(case1Select);
        element.click();
        sc.getSelectShareCaseButton().click();
        Thread.sleep(3000);

    }

    @And("Add PP{int} user and select continue button and confirm")
    public void addPPUserAndSelectContinueButtonAndConfirm(int arg0) throws InterruptedException {
        sc.getShareCaseEmailAddressBox().sendKeys("PP");
        Thread.sleep(2000);
        waitDisplay(driver, sc.getSelectPPTWOEmailAddress(),Duration.ofSeconds(20));
        sc.getSelectPPTWOEmailAddress().click();
        sc.getSelectAddButton().click();
        sc.getClickOpenAllOption().click();
        Assert.assertEquals(driver.findElement(By.xpath("//td[@id='user-email-pendingShares-1']")).getText(), "probate.pp2.org2@gmail.com");
        Assert.assertEquals(driver.findElement(By.xpath("//span[@class='hmcts-badge ng-star-inserted']")).getText(), "TO BE ADDED");
        sc.getSelectContinueButton().click();
        sc.getSelectConfirmButton().click();

        Assert.assertEquals(driver.findElement(By.xpath("//h1[normalize-space()='Your cases have been updated']")).getText(),"Your cases have been updated");
        sc.getSelectSignOut().click();
    }

    @Then("Login as PP{int} user")
    public void loginAsPPUser(int arg0) throws InterruptedException {
        Thread.sleep(3000);
        LoginPage rh = new LoginPage(driver);
        rh.LoginId().sendKeys(prop.getProperty("LoginIdPP2"));
        rh.LoginPassword().sendKeys(prop.getProperty("LoginPasswordPP2"));
        rh.signInButton().click();
        Thread.sleep(4000);
        sc.getSelectCaseList().click();


        By case1Select = By.xpath("//input[@id='select-"+caseRefOne+"']");
        WebElement element = driver.findElement(case1Select);
        element.click();


    }

    @And("Select SHare Case button")
    public void selectSHareCaseButton() {
        sc.getSelectShareCaseButton().click();

    }

    @Then("Confirm Both PP{int} and PP{int} user are listed")
    public void confirmBothPPAndPPUserAreListed(int arg0, int arg1) {
        sc.getSelectOpenAll().click();
        Assert.assertEquals(driver.findElement(By.xpath("//td[@id='user-email-1']")).getText(), "probate.pp2.org2@gmail.com");
        Assert.assertEquals(driver.findElement(By.xpath("//td[@id='user-email-0']")).getText(), "probate.pp1.org2@gmail.com");
    }


}
