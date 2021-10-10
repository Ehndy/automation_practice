package Step_Definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin extends TestBase {


   // @Given("^I am on the application homepage$")
   // public void iAmOnTheApplicationHomepage() {
      //  System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
      //  driver=new ChromeDriver();
       // driver.manage().window().maximize();
      //  driver.navigate().to("http://automationpractice.com/index.php");
   // }

   // @And("^I click on the sign in link$")
   // public void iClickOnTheSignInLink() {

        //driver.findElement(By.className("login")).click();
   // }

    @When("^I enter a valid username$")
    public void iEnterAValidUsername() {
        driver.findElement(By.name("email")).sendKeys("humblecat4real@yahoo.com");
    }

    @And("^I enter a valid Password$")
    public void iEnterAValidPassword() {
        driver.findElement(By.id("passwd")).sendKeys("Hunter");
    }

    @When("^I click the login button$")
    public void iClickTheLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() {
        String ExpectedLoggedInUser = "Hunter Doe";
        String ActualLoggedInUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser );
        System.out.println(ActualLoggedInUser);

        driver.quit();
    }

}
