package steps;

import PageObjects.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FailedLognAttemptSteps {

    WebDriver driver;
    FailedLoginAttempt failedLoginAttempt;


    @Before
    public void setUp(){

        failedLoginAttempt = new FailedLoginAttempt(driver);
    }


    @Then("I login should fail with error Message {string}.")
    public void i_login_should_fail_with_error_message(String string) {
        Assert.assertEquals("Swag Labs", failedLoginAttempt.failedLoginvalidaion());
    }
}
