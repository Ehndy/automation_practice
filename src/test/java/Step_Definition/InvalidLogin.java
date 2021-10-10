package Step_Definition;

import Base.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  InvalidLogin extends TestBase {

   // @Given("^I arrive at the homepage$")
    //public void iArriveAtTheHomepage() {
      //  System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
      //  driver=new ChromeDriver();
       // driver.manage().window().maximize();
        //driver.navigate().to("http://automationpractice.com/index.php");
   // }

   // @And("^I navigate to the sign in page$")
    //public void iNavigateToTheSignInPage() {
       // driver.findElement(By.className("login")).click();
    //}

    @And("^I enter user \"([^\"]*)\" in the email field$")
    public void iEnterUserInTheEmailField(String email) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(email);

    }

    @And("^I enter user \"([^\"]*)\" in the password field$")
    public void iEnterUserInThePasswordField(String password) throws Throwable {
        driver.findElement(By.id("passwd")).sendKeys(password);

    }

    @When("^I click on login$")
    public void iClickOnLogin() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
    }

    @Then("^I should get the correct \"([^\"]*)\"$")
    public void iShouldGetTheCorrect(String ErrorMessage) throws Throwable {
        String ExpectedErrorMessage = ErrorMessage;
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage );
        System.out.println(ActualErrorMessage);

    }
}
