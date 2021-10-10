package Step_Definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice_logo extends TestBase {

    //@Given("^I launch my browser$")
    //public void iLaunchMyBrowser() {
       // System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        //driver=new ChromeDriver();
       // driver.manage().window().maximize();
    //}

   // @When("^I enter the application URL$")
   // public void iEnterTheApplicationURL() {
       // driver.navigate().to("http://automationpractice.com/index.php");

   // }

    @And("^I wait for (\\d+) seconds$")
    public void iWaitForSeconds(int arg0) throws InterruptedException {
        Thread.sleep(5000);
    }

    @Then("^I should see the application logo$")
    public void iShouldSeeTheApplicationLogo() {
        driver.findElement(By.id("header_logo")).isDisplayed();
        driver.close();

    }

}
