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

public class Password1 extends TestBase {


   // @Given("^I am on the application login page$")
   // public void iAmOnTheApplicationLoginPage() {
      //  System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
       // driver=new ChromeDriver();
        /// driver.navigate().to("http://automationpractice.com/index.php");
    //}

   // @When("^I click on sign in$")
    //public void iClickOnSignIn() {
        //driver.findElement(By.className("login")).click();
    //}

    @And("^I enter a valid email address$")
    public void iEnterAValidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys("humblecat4real@yahoo.com");
    }

    @When("^I click on the Forgot Password link$")
    public void iClickOnTheForgotPasswordLink() {
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a")).click();
    }

    @Then("^I should be redirected to a retrieve password page$")
    public void iShouldBeRedirectedToARetrievePasswordPage() {
        String ExpectedLandingPage = "Please enter the email address you used to register. We will then send you a new password.";
        String ActualLandingPage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p")).getText();
        Assert.assertEquals(ExpectedLandingPage, ActualLandingPage );

    }
}
