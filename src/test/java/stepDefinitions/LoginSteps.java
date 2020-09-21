package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	@Given("^Open login page$")
	public void openLoginPage()  {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
	    
	}

	@Given("^click to Login button$")
	public void clickToLoginButton()  {
	    
	    
	}

	@When("^Input empty email and password$")
	public void inputEmptyEmailAndPassword()  {
	    
	    
	}

	@When("^click to Submit button$")
	public void clickToSubmitButton()  {
	    
	    
	}

	@Then("^Popup error message is displayed$")
	public void popupErrorMessageIsDisplayed()  {
	    
	    
	}

}
