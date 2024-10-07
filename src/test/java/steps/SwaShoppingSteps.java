package steps;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaShoppingSteps {

    WebDriver driver;
    LandingPage landingPage;
    HomePage homePage;
    ShoppingCart shoppingCart;
    YourInformation yourInformation;
    FinishOrder finishOrder;


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        landingPage = new LandingPage(driver);
        homePage = new HomePage(driver);
        shoppingCart = new ShoppingCart(driver);
        yourInformation = new YourInformation(driver);
        finishOrder = new FinishOrder(driver);

    }

    @Given("Navigate to the website and verify that you are on the correct landing page.")
    public void navigate_to_the_website_and_verify_that_you_are_on_the_correct_landing_page() {
        landingPage.validatePage();
    }
    @When("I enter {string} and {string}.")
    public void i_enter_and(String string, String string2) {
        landingPage.loginCredentails(string,string2);
    }
    @When("I Click on the logon button.")
    public void i_click_on_the_logon_button() {
       landingPage.clickOnLogin();
    }
    @Then("I should see Swag labs product.")
    public void i_should_see_swag_labs_product() {
        Assert.assertEquals("Products", homePage.getProductText());
    }
    @When("I add Sauce Labs Backpack to Cart.")
    public void i_add_sauce_labs_backpack_to_cart() {
        homePage.AddbackpackToCart();
    }
    @When("I Add Sauce Labs Fleece Jacket to Cart.")
    public void i_add_sauce_labs_fleece_jacket_to_cart() {
        homePage.AddFleeceJacketToCart();
    }
    @When("I click on the shopping Cart Image.")
    public void i_click_on_the_shopping_cart_image() {
        homePage.openCart();
    }
    @Then("I should see two quantity added to shopping Cart")
    public void i_should_see_two_quantity_added_to_shopping_cart() {
        Assert.assertEquals("QTY",shoppingCart.getQuantityText());
    }
    @When("I Click checkout button.")
    public void i_click_checkout_button() {
       shoppingCart.checkOutItems();
    }
    @When("I enter {string} , {string} and {string}")
    public void i_enter_and(String firstname, String lastname, String zipCode) {
        yourInformation.fillInDetails(firstname,lastname,zipCode);
    }
    @When("I Click Continue button")
    public void i_clcick_continue_button() {
      yourInformation.continueCheckout();
    }
    @Then("I see product information with total price")
    public void i_see_product_information_with_total_price() {
        finishOrder.confirmDetails();
    }
    @When("I click on Finish button")
    public void i_click_on_finish_button() {
        finishOrder.FinishOrderOnClick();
    }
    @Then("I should see a message states {string}")
    public void i_should_see_a_message_states(String string) {
        Assert.assertEquals("Thank you for your order!",finishOrder.thankMessage());
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
