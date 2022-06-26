package pageFactory.landingPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    PageFactory.initElements(driver, this);

    }

    @FindBy(id = "username")
    WebElement loginEmailAddress;
    @FindBy(id = "password")
    WebElement loginPassword;
    @FindBy(css = "input[value='Sign in']")
    WebElement singIn;
    @FindBy(xpath ="//a[normalize-space()='create an account']")
    WebElement createAccount;
    @FindBy(xpath = "//a[normalize-space()='Forgotten password?']" )
    WebElement forgotPassword;

    public WebElement LoginId(){
        return loginEmailAddress;
    }
    public WebElement LoginPassword(){
        return loginPassword;
    }
    public WebElement signInButton(){
        return singIn;
    }
    public WebElement forgottenPassword(){
        return forgotPassword;
    }
    public WebElement createAnAccount(){
        return createAccount;
    }
}
