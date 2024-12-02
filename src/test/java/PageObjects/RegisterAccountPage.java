package PageObjects;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccountPage extends BasePage{
    public RegisterAccountPage(WebDriver driver) {
        super(driver);
    }

    //Also specify the locators and the action methods related

    By firstNameTxt = By.xpath("//input[@id='input-firstname']");
    By lastNameTxt= By.xpath("//input[@id='input-lastname']");
    By EmailTxt= By.xpath("//input[@id='input-email']");
    By PasswordTxt = By.xpath("//input[@id='input-password']");
    By SubscribeBtn =By.xpath("//input[@id='input-newsletter']");
    By privacyPolicy =By.xpath("//input[@name='agree']");

    By ContinueBtn =By.xpath("//button[normalize-space()='Continue']");

    By confirmsg =By.xpath("");

    //ActionMethods

    public void setFirstName (String firstName)
    {
        driver.findElement(firstNameTxt).sendKeys(firstName);
    }
    public void setLastName (String lastName)
    {
        driver.findElement(lastNameTxt).sendKeys(lastName);
    }
    public void setEmail (String Email)
    {
        driver.findElement(EmailTxt).sendKeys(Email);
    }
    public void setPassword (String password)
    {
        driver.findElement(PasswordTxt).sendKeys(password);
    }
    public void click_PrivacyPolicy()
    {
        driver.findElement(privacyPolicy).click();
    }
    public void click_subscribe()
    {
        driver.findElement(SubscribeBtn).click();
    }
    public void click_continue()
    {
        driver.findElement(ContinueBtn).click();
    }
    public String getconfirmsg(){
        try {
           return(driver.findElement(confirmsg).getText());
        }
        catch (Exception e)
        {
            return(e.getMessage());
        }
    }
}
