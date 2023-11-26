package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	public void enterEmailId(String emailId) {
		emailTextField.sendKeys(emailId);
	}

	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}
	
	@FindBy(xpath="(//input[@type=\\\"submit\\\"])[2]")
	private WebElement clickOnSubmit;
	
	public void clickSubmitButton() {
		clickOnSubmit.click();
	}
}
