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

public class Password2 extends TestBase {



   // @Given("^that I am on the retrieve password landing page$")
   // public void thatIAmOnTheRetrievePasswordLandingPage() {
      //  System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
       // driver=new ChromeDriver();
       // driver.manage().window().maximize();
       // driver.navigate().to("http://automationpractice.com/index.php?controller=password");
   // }

   // @When("^I enter my email address$")
   // public void iEnterMyEmailAddress() {
       // driver.findElement(By.id("email")).sendKeys("humblecat4real@yahoo.com");
   // }

    @And("^click on retrieve password$")
    public void clickOnRetrievePassword() {
        driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button/span")).click();
    }

    @Then("^I should see a confirmation message that password has been sent$")
    public void iShouldSeeAConfirmationMessageThatPasswordHasBeenSent() {
        String ExpectedMessage = "A confirmation email has been sent to your address: humblecat4real@yahoo.com";
        String ActualMessage= driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p")).getText();
        Assert.assertEquals(ExpectedMessage,ActualMessage );
        System.out.println(ActualMessage);

    }
}
