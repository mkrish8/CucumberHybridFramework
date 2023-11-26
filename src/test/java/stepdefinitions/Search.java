package stepdefinitions;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.SearchPage;

public class Search {
	WebDriver driver;
	SearchPage sp;
	@Given("User opens the Application")
	public void user_opens_the_application() {
		driver=DriverFactory.getDriver();
		
	    
	}

	//@When("User enters valid product {string} into seatch box field")
	@When("^User enters valid product (.+) into seatch box field$")
	public void user_enters_valid_product_into_seatch_box_field(String searchProduct) throws Exception {
	    //driver.findElement(By.name("search")).sendKeys(searchProduct);
	   //driver.findElement(By.name("search-product")).sendKeys(searchProduct);
	   sp = new SearchPage(driver);
	   Thread.sleep(5000);
	   sp.searchProduct(searchProduct);
	}

	@When("User cliks on searh button")
	public void user_cliks_on_searh_button() {
		//driver.findElement(By.xpath("//button[contains(@class,'btn-default')]")).click();
		//driver.findElement(By.id("search_submit")).click();
		sp.clickOnSearch();
	}

	@Then("User should get valid product displayed in search results")
	public void user_should_get_valid_product_displayed_in_search_results() {
	    //Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	    Assert.assertTrue(sp.displayStatusOfTheProduct());
	    //System.out.println(sp.displayStatusOfTheProduct());
		
	    
	}
	@Then("User should get a valid product message")
	public void User_should_get_a_valid_product_message() {
		Assert.assertEquals("CSA C22.1:24",sp.getMessageText());
	} 

}
