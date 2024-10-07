package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    WebDriver driver;

    @FindBy(css = ".login_logo")
    private WebElement swagLabs;

    @FindBy(id = "user-name")
    WebElement txtUsername;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement btnLogin;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void validatePage(){

        swagLabs.isDisplayed();
    }

    public void loginCredentails(String username,String password){

        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);

    }
    public void clickOnLogin(){
        btnLogin.click();
    }

}
