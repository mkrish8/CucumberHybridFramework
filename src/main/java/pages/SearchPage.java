package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class SearchPage {
	WebDriver driver;
	ElementUtils eu;
	
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eu = new ElementUtils(driver);
	}
	 
	@FindBy(id="txt_search")
	private WebElement searchProduct;
	
	@FindBy(id="search_submit")
	private WebElement clickSubmit;
	
	
	public void searchProduct(String searchProductType) {
		eu.typeTextIntoElement(searchProduct, searchProductType, CommonUtils.EXPLICIT_WAIT_TIME);
		//searchProduct.sendKeys(searchProductType);
	}
	
	public void clickOnSearch() {
		clickSubmit.click();
	}
	
	@FindBy(xpath="(//a[@title='CSA C22.1:24'])[1]")
	private WebElement titleOfSearchProduct;
	
	public boolean displayStatusOfTheProduct() {
		return titleOfSearchProduct.isDisplayed();
	}
	
	@FindBy(xpath="(//a[@title='CSA C22.1:24'])[1]")
	private WebElement messageText;
	
	public String getMessageText() {
		return messageText.getText();
	}
}
