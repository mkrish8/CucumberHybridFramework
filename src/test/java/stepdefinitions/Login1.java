package stepdefinitions;



import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class Login1 {
	WebDriver driver;
	HomePage homepage;
	LoginPage lp;
	AccountPage ap;
	
	
	
	@Given("User  navigates to login page")
	public void user_navigates_to_login_page() {
		driver=DriverFactory.getDriver();
		homepage = new HomePage(driver);
		homepage.clickOnLoginLink();
		
	}

//	@When("User has clicked on Login Link")
//	public void user_has_clicked_on_login_link() {
//	}

	@When("User enters valid email Id {string} into email field")
	public void user_enters_valid_email_id_into_email_field(String emailId) {
	  lp = new LoginPage(driver);
	  lp.enterEmailId(emailId);
	   
	}

	@When("User has entered valid password {string} into password field")
	public void user_has_entered_valid_password_into_password_field(String password) {
		lp.enterPassword(password);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		lp.clickSubmitButton();
		
	   }

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		ap.displayedLogout();
		 }


    public String getEmailWithTimeStamp() {
    	Date date = new Date();
    	return "rast"+date.toString().replace("", "").replace(":", "_")+"@gmail.com";
    }
	
	
	}
