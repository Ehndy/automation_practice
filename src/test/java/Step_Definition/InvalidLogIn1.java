package Step_Definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class InvalidLogIn1 extends TestBase {



    //@Given("^I am on the application Landing page$")
   // public void iAmOnTheApplicationLandingPage() {
       // System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
       // driver=new ChromeDriver();
       // driver.manage().window().maximize();
       // driver.navigate().to("http://automationpractice.com/index.php");
   // }

  //  @When("^I press the sign in link$")
   // public void iPressTheSignInLink() {

       // driver.findElement(By.className("login")).click();
   // }

    @And("^I enter correct Username$")
    public void iEnterCorrectUsername() {

        driver.findElement(By.name("email")).sendKeys("humblecat4real@yahoo.com");
    }

    @And("^I enter Incorrect password$")
    public void iEnterIncorrectPassword() {

        driver.findElement(By.id("passwd")).sendKeys("Huntes");
    }

    @When("^I press the Log in button$")
    public void iPressTheLogInButton() {

        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
    }

    @Then("^I should get an error message$")
    public void iShouldGetAnErrorMessage() {
        String ExpectedErrorMessage = "Authentication failed.";
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage );
        System.out.println(ActualErrorMessage);
    }
}
