package Step_Definition;

import Base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Before;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Common extends TestBase {

    @Before
    public void setup()  throws IOException{
        initialize();
    }

    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("^I click on Sign in$")
    public void iClickOnSignIn() {
        driver.findElement(By.className("login")).click();
    }
}
