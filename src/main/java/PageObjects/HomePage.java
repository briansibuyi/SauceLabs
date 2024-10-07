package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(css = ".title")
    private WebElement lblProducts;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addbackpack;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement addFleeceJacket;

    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCart;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getProductText(){

        return lblProducts.getText();
    }

    public void AddbackpackToCart()
    {
        addbackpack.click();
    }

    public void AddFleeceJacketToCart()
    {
        addFleeceJacket.click();
    }

    public void openCart()
    {
        shoppingCart.click();
    }
}
