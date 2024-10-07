package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {

    WebDriver driver;

    @FindBy(css = ".cart_quantity_label")
    WebElement getQuantity;

    @FindBy(id = "checkout")
    WebElement btnCheckout;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getQuantityText()
    {
        return getQuantity.getText();
    }

    public void checkOutItems()
    {
        btnCheckout.click();
    }
}
