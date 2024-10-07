package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformation {

    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement txtFirstname;

    @FindBy(id = "last-name")
    WebElement txtLastname;

    @FindBy(id = "postal-code")
    WebElement txtZipCode;

    @FindBy(id = "continue")
    WebElement btnContinue;

    public YourInformation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void fillInDetails(String Firstname,String Lastname,String Zipcode)
    {
        txtFirstname.sendKeys(Firstname);
        txtLastname.sendKeys(Lastname);
        txtZipCode.sendKeys(Zipcode);
    }

    public void continueCheckout()
    {
        btnContinue.click();
    }
}
