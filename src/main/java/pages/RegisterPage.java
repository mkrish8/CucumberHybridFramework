package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountLink;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerLink;
	
	
	
	public void clickOnMyAccountLink() {
		myAccountLink.click();
	}
	
	public void clickOnRegisterLink() {
		registerLink.click();
	}
	
	
//	"input-firstname"
//	"input-lastname"
	
	
	
	
	

}
