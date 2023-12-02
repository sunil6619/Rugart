package CheckoutpageTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_287_Check_shipping_address_phonenumber_country_code_search_from_dropdown extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//ul[@class=\"links\"]/li/span[text()='Sign in']")
	private WebElement signin;
	@FindBy(xpath = "//input[@id=\"email\"]")
	private WebElement emailinput;
	@FindBy(xpath = "//input[@id=\"password\"]")
	private WebElement passinput;
	@FindBy(xpath = "//button[@id=\"btn-submit\"]")
	private WebElement login;
	@FindBy(xpath = "//img[@alt=\"shopping bag\"]")
	private WebElement shopcart;
	@FindBy(xpath = "//a[contains(text(),'View and Edit Cart')]")
	private WebElement viewcart;
	@FindBy(xpath = "//button[@title=\"Buy Now\"]")
	private WebElement addtocart;
	@FindBy(xpath = "//a[contains(text(),'Proceed to Checkout')]")
	private WebElement checkout;
	@FindBy(xpath = "//button[contains(text(),'+ New Address')]")
	private WebElement newaddress;
	@FindBy(xpath = "//input[@id=\"shipping[last_name]\"]")
	private WebElement lastname;
	@FindBy(xpath = "//button[@value=\"Place Order\"]")
	private WebElement placeorder;
	@FindBy(xpath = "//label[@for=\"shipping[phone]\"]")
	private WebElement validationmsgphonenumber;
	@FindBy(xpath = "//span[@id=\"select2-shippingphone_code-container\"]")
	private WebElement countrycodedropdown;
	@FindBy(xpath = "//input[@class=\"select2-search__field\"]")
	private WebElement searchcountrycode;
	@FindBy(xpath = "//span[@class=\"select2-results\"]/descendant::span[text()='United Kingdom']")
	private WebElement searchresult1;
	@FindBy(xpath = "//span[@class=\"select2-results\"]/descendant::span[text()='India']")
	private WebElement searchresult2;
	@FindBy(xpath = "//div[@class=\"title-button justify-content-between\"]/descendant::span[contains(text(),'Checkout')]")
	private WebElement topcheckout;
	
	public TC_287_Check_shipping_address_phonenumber_country_code_search_from_dropdown() {
		PageFactory.initElements(driver, this);
	}
	public void clickoncollection() throws InterruptedException, AWTException {

		signin.click();
		Thread.sleep(1000);
		emailinput.sendKeys(getreaddata("email"));
		passinput.sendKeys(getreaddata("password"));
		login.click();
		Thread.sleep(1000);
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(2);
		first.click();
	}
	public void country_code_dropdown_search() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		Thread.sleep(1000);
		addtocart.click();
		Thread.sleep(2000);
		viewcart.click();
		Thread.sleep(1000);	
		topcheckout.click();
		Thread.sleep(2000);
		newaddress.click();
		Thread.sleep(3000);
		countrycodedropdown.click();
		Thread.sleep(1000);
		searchcountrycode.sendKeys("+44");
		String expected=searchresult1.getText();
	    Assert.assertEquals("United Kingdom", expected);
	    Actions act= new Actions(driver);
	    act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		countrycodedropdown.click();
		Thread.sleep(1000);
		searchcountrycode.sendKeys("India");
		expected=searchresult2.getText();
	    Assert.assertEquals("India", expected);
	    act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		
		
//		Select sel= new Select(countrycodedropdown);
//		sel.selectByVisibleText("United Kingdom");
	
		
		
	}
	@Test

	public void check_phonenumber_country_code_dropdown_search() throws InterruptedException, AWTException {
		TC_287_Check_shipping_address_phonenumber_country_code_search_from_dropdown ob = new TC_287_Check_shipping_address_phonenumber_country_code_search_from_dropdown();
		ob.clickoncollection();
		ob.country_code_dropdown_search();
		Log.info("Checking shipping address phone number country code dropdown search");
	}
	

}
