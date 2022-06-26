package probateTest;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pageFactory.ApplyProbateManageCaseAAT.CaseListPageManageCaseAAT;
import pageFactory.landingPages.LoginPage;
import webDrivers.DriverBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class shareACaseSelect extends DriverBase {

    public Properties prop = new Properties();
    public WebDriver driver = initializeDriver();

    public shareACaseSelect() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/pagesProperties/shareCase.properties");
        prop.load(fis);
        driver.get(prop.getProperty("URL"));
    }

    @Test
    @Given("Gop case1 and GOP case2")
    public void gopCaseAndGOPCase() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LoginPage rh = new LoginPage(driver);
        rh.LoginId().sendKeys(prop.getProperty("LoginId"));
        rh.LoginPassword().sendKeys(prop.getProperty("LoginPassword"));
        rh.signInButton().click();

        CaseListPageManageCaseAAT  rh1 = new CaseListPageManageCaseAAT(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        rh1.getCaseListSelect().click();
        Thread.sleep(4000);
        List<WebElement> caseType = getSelectCaseCaseType(rh1);
        Thread.sleep(5000);
        rh1.getApplyButton().click();

        String s ="1655299155937109";

        By xpath = By.xpath("//input[@id='select-"+s+"']");
        WebElement element = driver.findElement(xpath);

        System.out.println(element);
        element.click();

                    /*
                    {
                        driver.findElement(By.xpath("//td[@class='govuk-table__checkbox ng-star-inserted']")).click();
                    }


             }

        */
    }

    private List<WebElement> getSelectCaseCaseType(CaseListPageManageCaseAAT rh1){
        WebElement option = rh1.getSelectCaseType();
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
