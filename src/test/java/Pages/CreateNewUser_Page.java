package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.time.Year;
import java.time.YearMonth;

public class CreateNewUser_Page {
    public int random;

    //Declare your locators here
    @FindBy(how = How.CLASS_NAME, using = "login")
    public static WebElement SignInLink;

    @FindBy(how = How.ID, using = "email_create")
    public static WebElement CreateNewUserField;

    @FindBy(how = How.ID, using = "SubmitCreate")
    public static WebElement CreateUserButton;

    @FindBy(how = How.NAME, using = "customer_firstname")
    public static WebElement CustomerFirstName;

    @FindBy(how = How.ID, using = "id_gender1")
    public static WebElement CustomerGender;

    @FindBy(how = How.NAME, using = "customer_lastname")
    public static WebElement CustomerLastName;

    @FindBy(how = How.ID, using = "passwd")
    public static WebElement CustomerPassword;

    @FindBy(how = How.ID, using = "days")
    public static WebElement DobDays;

    @FindBy(how = How.ID, using = "months")
    public static WebElement DobMonths;

    @FindBy(how = How.ID, using = "years")
    public static WebElement DobYears;

    @FindBy(how = How.NAME, using = "address1")
    public static WebElement UserAddress;

    @FindBy(how = How.NAME, using = "city")
    public static WebElement UserCity;

    @FindBy(how = How.ID, using = "id_state")
    public static WebElement UserState;

    @FindBy(how = How.NAME, using = "postcode")
    public static WebElement UserPostcode;

    @FindBy(how = How.NAME, using = "phone_mobile")
    public static WebElement PhoneNumber;

    @FindBy(how = How.NAME, using = "alias")
    public static WebElement UserAlias;

    @FindBy(how = How.NAME, using = "submitAccount")
    public static WebElement RegisterButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    public static WebElement SignedInUser;

//Declare your methods here

    public void ClickSignInLink() {SignInLink.click();}
    public void EnterEmailToCreateUser() {
        random= 100 + (int) (Math.random()* (1000-1) + 1);
        CreateNewUserField.sendKeys("humblecat4real2" + random + "@yahoo.com");
    }

    public void ClickCreateAccountButton() {CreateUserButton.click();}
    public void TypeCustomerFirstName() {CustomerFirstName.sendKeys("Hunter");}
    public void SelectCustomerGender() {CustomerGender.click();}
    public void TypeCustomerLastname() {CustomerLastName.sendKeys("Jeff");}
    public void TypeUserPassword() {CustomerPassword.sendKeys("Hunter");}
    public void SelectUserDateOfBirth() {
        Select Days = new Select(DobDays);
        Days.selectByIndex(25);
    }
    public void SelectUserMonthOfBirth() {
        Select Month = new Select(DobMonths);
        Month.selectByIndex(12);
    }
    public void SelectUserYearOfBirth() {
        Select Year = new Select(DobYears);
        Year.selectByValue("2000");
    }
    public void TypeUserAddress() {UserAddress.sendKeys("1 testing avenue");}
    public void TypeUserCity() {UserCity.sendKeys("Chicago");}

    public void SelectUserState() {
        Select State = new Select(UserState);
        State.selectByVisibleText("Illinois");
    }
    public void TypeUserPostcode() {UserPostcode.sendKeys("00000");}
    public void TypeUserPhoneNumber() {PhoneNumber.sendKeys("987654321");}
    public void TypeUserAlias() {UserAlias.sendKeys("Testing Headquarters");}
    public void ClickRegisterButton() {RegisterButton.click();}
    public void AssertLoggedInAccount () {
        String ExpectedLoggedInUser = "Hunter Jeff";
        String ActualLoggedInUser = SignedInUser.getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser );
        System.out.println(ActualLoggedInUser);
    }


}
