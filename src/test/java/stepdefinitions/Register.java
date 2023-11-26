package stepdefinitions;

import java.time.Duration;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.ClientConfig;

import driverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.RegisterPage;
import utils.CommonUtils;

public class Register  {
	WebDriver driver;
	RegisterPage rp = new RegisterPage(driver);
	CommonUtils cu = new CommonUtils();
		
	@Given("User navigates to Register account page")
	public void user_navigates_to_register_account_page() {
		driver=DriverFactory.getDriver();
		rp.clickOnMyAccountLink();
		rp.clickOnRegisterLink();
		}

	@When("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) {
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
	    driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("firstName"));
	    driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("lastName"));
	    //driver.findElement(By.id("input-email")).sendKeys(dataMap.get("email"));
	    driver.findElement(By.id("input-email")).sendKeys(cu.getEmailWithTimeStamp());
	    driver.findElement(By.id("input-telephone")).sendKeys(dataMap.get("telephone"));
	    driver.findElement(By.id("input-password")).sendKeys(dataMap.get("password"));
	    driver.findElement(By.id("input-confirm")).sendKeys(dataMap.get("password"));
	    
	}

	@When("User selects Privacy Policy")
	public void user_selects_privacy_policy() {
		driver.findElement(By.name("agree")).click();
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
		Assert.assertEquals("Your Account Has Been Created", driver.findElement(By.xpath("//div[@id='content'/h1")).getText());
	}



}
