package CheckoutpageTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_282_Check_shipping_address_lastname_not_accept_special_charc_displays_error_msg extends Base{

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
	@FindBy(xpath = "//label[@for=\"shipping[last_name]\"]")
	private WebElement validationmsglastname;
	
	public TC_282_Check_shipping_address_lastname_not_accept_special_charc_displays_error_msg () {
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
	
	public void last_name_alphanumeric_value() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		Thread.sleep(1000);
		addtocart.click();
		Thread.sleep(2000);
		checkout.click();
		Thread.sleep(1000);
		newaddress.click();
		Thread.sleep(1000);
		lastname.clear();
		lastname.sendKeys("@#$%^*");
		Thread.sleep(2000);
		placeorder.click();
		String expectedmsg=validationmsglastname.getText();
		Assert.assertEquals("Please enter only alphabet characters", expectedmsg);
		
		
	}
	@Test

	public void check_last_name_not_accept_alphanumeric_displays_msg() throws InterruptedException, AWTException {
		TC_282_Check_shipping_address_lastname_not_accept_special_charc_displays_error_msg ob = new TC_282_Check_shipping_address_lastname_not_accept_special_charc_displays_error_msg();
		ob.clickoncollection();
		ob.last_name_alphanumeric_value();
		Log.info("Checking shipping address last name not accept alphanumeric value and displays error msg");
	}
	
	
}
