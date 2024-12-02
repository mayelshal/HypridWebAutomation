package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //here first specify the locators and the action methods on them
    By MyAccountLocator = By.xpath("//i[@class='fa-solid fa-user']");
    By RegisterLocator = By.xpath("//a[normalize-space()='Register']");


    //Action methods
    public void clickMyAccount() {
        driver.findElement(MyAccountLocator).click();
    }
    public void clickRegister() {
        driver.findElement(RegisterLocator).click();
    }
}
