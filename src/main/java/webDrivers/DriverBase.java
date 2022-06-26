package webDrivers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverBase {

    public WebDriver driver;
@BeforeMethod

    public WebDriver initializeDriver() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/java/webDrivers/data.properties");
        prop.load(fis);
        String browserName =prop.getProperty("browser");

        if(browserName.equals("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "chromeDriver/chromedriver");
            driver= new ChromeDriver();
        }
        else if (browserName.equals("firefox")){

        }
        else if (browserName.equals("IE")) {

        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        return driver;



    }
    public void failed() {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("screenshots"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
