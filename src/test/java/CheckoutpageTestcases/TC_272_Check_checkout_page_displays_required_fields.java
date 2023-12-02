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

public class TC_272_Check_checkout_page_displays_required_fields extends Base{
	
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
	@FindBy(xpath = "//h4[contains(text(),'Shipping Address')]")
	private WebElement shippingaddress;
	@FindBy(xpath = "//h4[contains(text(),'Payment Method')]")
	private WebElement paymentmethod;
	@FindBy(xpath = "//h4[contains(text(),'Order Summary')]")
	private WebElement ordersummary;
	@FindBy(xpath = "//td[contains(text(),'Subtotal')]")
	private WebElement subtotal;
	@FindBy(xpath = "//td[contains(text(),'Grand Total')]")
	private WebElement grandtotal;
	@FindBy(xpath = "//p[contains(text(),'Stripe Payments')]")
	private WebElement stripepayment;
	@FindBy(xpath = "//label[contains(text(),'Credit Card Number *')]")
	private WebElement ccnumber;
	@FindBy(xpath = "//label[contains(text(),'Expiration Date *')]")
	private WebElement expiredate;
	@FindBy(xpath = "//label[contains(text(),'Card Verification Number *')]")
	private WebElement cardverifi;
	
	
	
	public TC_272_Check_checkout_page_displays_required_fields () {
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
	public void checkout_page_required_fields() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		Thread.sleep(1000);
		addtocart.click();
		Thread.sleep(2000);
		checkout.click();
		Thread.sleep(1000);
		Boolean expected=shippingaddress.isDisplayed();
		Assert.assertTrue(expected);
		expected=paymentmethod.isDisplayed();
		Assert.assertTrue(expected);
		expected=ordersummary.isDisplayed();
		Assert.assertTrue(expected);
		expected=subtotal.isDisplayed();
		Assert.assertTrue(expected);
		expected=grandtotal.isDisplayed();
		Assert.assertTrue(expected);
		expected=stripepayment.isDisplayed();
		Assert.assertTrue(expected);
		expected=ccnumber.isDisplayed();
		Assert.assertTrue(expected);
		expected=expiredate.isDisplayed();
		Assert.assertTrue(expected);
		expected=cardverifi.isDisplayed();
		Assert.assertTrue(expected);
		
	
		
		
}

	@Test

	public void check_proceed_checkout_displays() throws InterruptedException, AWTException {
		TC_272_Check_checkout_page_displays_required_fields ob = new TC_272_Check_checkout_page_displays_required_fields();
		ob.clickoncollection();
		ob.checkout_page_required_fields();
		Log.info("Checking checkout page required fields");
	}
	



	

}
