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

public class TC_273_Check_checkout_page_shipping_address_fields extends Base{
	
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
	@FindBy(xpath = "//form[@id=\"form-shipping-form\"]/descendant::label[contains(text(),'First Name *')]")
	private WebElement firstnameheading;
	@FindBy(xpath = "//form[@id=\"form-shipping-form\"]/descendant::label[contains(text(),'Last Name *')]")
	private WebElement lastnameheading;;
	@FindBy(xpath = "//form[@id=\"form-shipping-form\"]/descendant::label[contains(text(),'Phone Number *')]")
	private WebElement phonenumberhead;;
	@FindBy(xpath = "//form[@id=\"form-shipping-form\"]/descendant::label[contains(text(),'Country *')]")
	private WebElement countryheading;;
	@FindBy(xpath = "//form[@id=\"form-shipping-form\"]/descendant::label[contains(text(),'Search address by ZIP Code')]")
	private WebElement zipcodesearchhead;
	@FindBy(xpath = "//form[@id=\"form-shipping-form\"]/descendant::label[contains(text(),'Company Name (If Trade)')]")
	private WebElement companynamehead;
	@FindBy(xpath = "//form[@id=\"form-shipping-form\"]/descendant::label[contains(text(),'Street Address *')]")
	private WebElement streetaddresshead;
	@FindBy(xpath = "//form[@id=\"form-shipping-form\"]/descendant::label[contains(text(),'City *')]")
	private WebElement cityhead;
	@FindBy(xpath = "//form[@id=\"form-shipping-form\"]/descendant::label[contains(text(),'State')]")
	private WebElement stateheading;
	@FindBy(xpath = "//form[@id=\"form-shipping-form\"]/descendant::label[contains(text(),'ZIP Code*')]")
	private WebElement zipcodeheading;
	@FindBy(xpath = "//button[contains(text(),'+ New Address')]")
	private WebElement newaddress;
	
	
	
	
	
	public TC_273_Check_checkout_page_shipping_address_fields() {
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
	public void shipping_address_required_fields() throws InterruptedException {
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
		Boolean expected=firstnameheading.isDisplayed();
		Assert.assertTrue(expected);
		expected=lastnameheading.isDisplayed();
		Assert.assertTrue(expected);
		expected=phonenumberhead.isDisplayed();
		Assert.assertTrue(expected);
		expected=countryheading.isDisplayed();
		Assert.assertTrue(expected);
		expected=zipcodesearchhead.isDisplayed();
		Assert.assertTrue(expected);
		expected=companynamehead.isDisplayed();
		Assert.assertTrue(expected);
		expected=cityhead.isDisplayed();
		Assert.assertTrue(expected);
		expected=stateheading.isDisplayed();
		Assert.assertTrue(expected);
		expected=zipcodeheading.isDisplayed();
		Assert.assertTrue(expected);
		expected=newaddress.isDisplayed();
		Assert.assertTrue(expected);
		expected=streetaddresshead.isDisplayed();
		Assert.assertTrue(expected);
		
	
		
		
}

	@Test

	public void check_checkout_shipping_address_fields() throws InterruptedException, AWTException {
		TC_273_Check_checkout_page_shipping_address_fields ob = new TC_273_Check_checkout_page_shipping_address_fields();
		ob.clickoncollection();
		ob.shipping_address_required_fields();
		Log.info("Checking checkout page shipping address fields");
	}
	




}
