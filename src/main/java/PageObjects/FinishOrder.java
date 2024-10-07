package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishOrder {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[1]")
    WebElement lblDetailPurchase;

    @FindBy(id = "finish")
    WebElement btnFinish;

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    WebElement lblCheckOutComplete;


    public FinishOrder(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String confirmDetails()
    {
       return lblDetailPurchase.getText();
    }

    public void FinishOrderOnClick()
    {
        btnFinish.click();
    }

    public String thankMessage()
    {
        return  lblCheckOutComplete.getText();
    }

}
