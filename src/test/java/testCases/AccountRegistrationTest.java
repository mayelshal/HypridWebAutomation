package testCases;

import PageObjects.HomePage;
import PageObjects.RegisterAccountPage;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.TestBase;

import java.time.Duration;

//here aer our test cases or test scenarios
public class AccountRegistrationTest extends TestBase {


    //first create an object from the class you want to access its locators and methods
    @Test
    public void verify_account_Registration() {
        HomePage HP = new HomePage(driver);
        HP.clickMyAccount();
        HP.clickRegister();

        RegisterAccountPage regpage = new RegisterAccountPage(driver);
        regpage.setFirstName(randomString().toUpperCase());
        regpage.setLastName(randomString().toUpperCase());
        regpage.setEmail(randomString() + "@gmail.com");
        regpage.setPassword(randomPassword());
        regpage.click_PrivacyPolicy();
        regpage.click_continue();

        String msg = regpage.getconfirmsg();
        Assert.assertEquals(msg, "");


    }


}
