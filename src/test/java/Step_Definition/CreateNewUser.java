package Step_Definition;

import Base.TestBase;
import Pages.CreateNewUser_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewUser extends TestBase {

    //@Given("^I get on the homepage$")
   // public void iGetOnTheHomepage() {
        //System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
       // driver=new ChromeDriver();
       // driver.manage().window().maximize();
       // driver.navigate().to("http://automationpractice.com/index.php");
   // }

   // @And("^I select the sign in link$")
   // public void iSelectTheSignInLink() {
        //CreateNewUser_Page Admin = PageFactory.initElements(driver, CreateNewUser_Page.class);
        //Admin.ClickSignInLink();
        // driver.findElement(By.className("login")).click();
   // }

    @And("^I enter email address for new user$")
    public void iEnterEmailAddressForNewUser() {
        CreateNewUser_Page Admin = PageFactory.initElements(driver, CreateNewUser_Page.class);
        Admin.EnterEmailToCreateUser();
        //random= 100 + (int) (Math.random()* (1000-1) + 1);
        //driver.findElement(By.id("email_create")).sendKeys("humblecat4real2" + random + "@yahoo.com");
    }

    @And("^I click on the create account button$")
    public void iClickOnTheCreateAccountButton() {
        CreateNewUser_Page Admin = PageFactory.initElements(driver, CreateNewUser_Page.class);
        Admin.ClickCreateAccountButton();

        //driver.findElement(By.id("SubmitCreate")).click();
    }

    @When("^I provide all the necessary information$")
    public void iProvideAllTheNecessaryInformation() throws InterruptedException {
        Thread.sleep(6000);
        CreateNewUser_Page Admin = PageFactory.initElements(driver, CreateNewUser_Page.class);
        Admin.SelectCustomerGender();
        Admin.TypeCustomerFirstName();
        Admin.TypeCustomerLastname();
        Admin.TypeUserPassword();
        Admin.SelectUserDateOfBirth();
        Admin.SelectUserMonthOfBirth();
        Admin.SelectUserYearOfBirth();
        Admin.TypeUserAddress();
        Admin.TypeUserCity();
        Admin.SelectUserState();
        Admin.TypeUserPostcode();
        Admin.TypeUserPhoneNumber();
        Admin.TypeUserAlias();
        //driver.findElement(By.id("id_gender1")).click();
       // driver.findElement(By.name("customer_firstname")).sendKeys("Hunter");
        //driver.findElement(By.name("customer_lastname")).sendKeys("Jeff");
        //driver.findElement(By.id("passwd")).sendKeys("Hunter");
        //new Select(driver.findElement(By.id("days"))).selectByIndex(25);
       // new Select(driver.findElement(By.id("months"))).selectByIndex(12);
       // new Select(driver.findElement(By.id("years"))).selectByValue("2000");
       // driver.findElement(By.name("address1")).sendKeys("1 testing avenue");
        //driver.findElement(By.name("city")).sendKeys("Chicago");
       // new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Illinois");
        //driver.findElement(By.name("postcode")).sendKeys("00000");
        //driver.findElement(By.name("phone_mobile")).sendKeys("987654321");
        //driver.findElement(By.name("alias")).sendKeys("Testing Headquarters");

    }

    @And("^I click on the register button$")
    public void iClickOnTheRegisterButton() {
        CreateNewUser_Page Admin = PageFactory.initElements(driver, CreateNewUser_Page.class);
        Admin.ClickRegisterButton();

        //driver.findElement(By.name("submitAccount")).click();
    }

    @Then("^my account should be created successfully$")
    public void myAccountShouldBeCreatedSuccessfully() {
        CreateNewUser_Page Admin = PageFactory.initElements(driver, CreateNewUser_Page.class);
        Admin.AssertLoggedInAccount();
        //String ExpectedLoggedInUser = "Hunter Jeff";
        //String ActualLoggedInUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        //Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser );
        //System.out.println(ActualLoggedInUser);
    }


}
