package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(className = "login")
    WebElement linkLogin;
    @FindBy(name = "username")
    WebElement txtEmail;
    @FindBy(name = "password")
    WebElement txtPassword;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSubmit;
    @FindBy(className = "logout")
    public WebElement linkLogout;

    WebDriver driver;

    public  LoginPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String email, String password){

       // linkLogin.click();
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnSubmit.click();
    }
}
