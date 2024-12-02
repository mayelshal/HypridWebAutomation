package testBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    //we create this method to generate random names and email so the test case will not fail in the second time
    //this through the predefined class through the dependency apache commons
    public String randomString()
    {
        String generatedString= RandomStringUtils.randomAlphabetic(6);
        return generatedString;
    }
    public String randomNumber()
    {
        String generatedNumber=RandomStringUtils.randomNumeric(10);
        return generatedNumber;
    }

    public String randomPassword()
    {
        String generatedString=RandomStringUtils.randomAlphabetic(3);

        String generatedNumber=RandomStringUtils.randomNumeric(6);
        return(generatedString+"@"+generatedNumber);
    }
}
