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

public class TC_276_Check_shipping_address_firstname_not_accept_numeric_value_displays_error_msg extends Base {

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
	@FindBy(xpath = "//input[@id=\"shipping[first_name]\"]")
	private WebElement firstname;
	@FindBy(xpath = "//button[@value=\"Place Order\"]")
	private WebElement placeorder;
	@FindBy(xpath = "//label[@for=\"shipping[first_name]\"]")
	private WebElement validationmsgfirtname;
	
	public TC_276_Check_shipping_address_firstname_not_accept_numeric_value_displays_error_msg () {
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
	public void first_name_numeric_value() throws InterruptedException {
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
		firstname.clear();
		firstname.sendKeys("25466");
		placeorder.click();
		String expectedmsg=validationmsgfirtname.getText();
		Assert.assertEquals("Please enter only alphabet characters", expectedmsg);
		
		
	}
	@Test

	public void check_first_name_not_accept_numeric_shipp_add() throws InterruptedException, AWTException {
		TC_276_Check_shipping_address_firstname_not_accept_numeric_value_displays_error_msg ob = new TC_276_Check_shipping_address_firstname_not_accept_numeric_value_displays_error_msg();
		ob.clickoncollection();
		ob.first_name_numeric_value();
		Log.info("Checking shipping address first name not accept numeric value and displays error msg");
	}
	
}
