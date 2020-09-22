package bankGuru.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterAndLoginSteps {
	private static WebDriver driver;
	private static String loginPageUrl, userIDValue, passwordValue;

	@Given("^I open application$")
	public void iOpenApplication() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    driver.get("http://demo.guru99.com/v4");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	}

	@Given("^I get Login page Url$")
	public void iGetLoginPageUrl() {
		loginPageUrl = driver.getCurrentUrl();
	    
	}

	@When("^I click to here link$")
	public void iClickToHereLink() {
		driver.findElement(By.xpath("//a[text()='here']")).click();
	    
	    
	}

	@When("^I input to email textbox with data \"([^\"]*)\"$")
	public void iInputToEmailTextboxWithData(String emailValue) {
		driver.findElement(By.name("emailid")).sendKeys(emailValue + "@gmail.com");
	    
	}

	@When("^I click to Submit button at Register page$")
	public void iClickToSubmitButtonAtRegisterPage() {
		driver.findElement(By.name("btnLogin")).click();
	    
	}

	@Then("^I get UserID infor$")
	public void iGetUserIDInfor() {
		userIDValue = driver.findElement(By.xpath("//td[text()='User ID :']/following-sibling::td")).getText();
	    
	}

	@Then("^I get Password infor$")
	public void iGetPasswordInfor() {
		passwordValue = driver.findElement(By.xpath("//td[text()='Password :']/following-sibling::td")).getText();
	    
	}

	@When("^I open Login page again$")
	public void iOpenLoginPageAgain() {
	    driver.get(loginPageUrl);
	    
	}

	@Given("^I input to Username textbox$")
	public void iInputToUsernameTextbox() {
	    driver.findElement(By.name("uid")).sendKeys(userIDValue);
	    
	}

	@Given("^I input to Password textbox$")
	public void iInputToPasswordTextbox() {
		driver.findElement(By.name("password")).sendKeys(passwordValue);
	    
	    
	}

	@Given("^I click to Login button at Login page$")
	public void iClickToLoginButtonAtLoginPage() {
		driver.findElement(By.name("btnLogin")).click();
	    
	}

	@Then("^Verify Home page displayed with message \"([^\"]*)\"$")
	public void verifyHomePageDisplayedWithMessage(String welcomMessage) {
	    Assert.assertTrue(driver.findElement(By.xpath("//marquee[@class='heading3' and text()=\"" + welcomMessage + "\"]")).isDisplayed());
	    
	}

	@Given("^I open New Customer page$")
	public void iOpenNewCustomerPage() {
	    
	    
	}

	@When("^Input to New Customer form with data$")
	public void inputToNewCustomerFormWithData(DataTable arg1) {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@When("^I sleep some times$")
	public void iSleepSomeTimes() {
	    
	    
	}

}
