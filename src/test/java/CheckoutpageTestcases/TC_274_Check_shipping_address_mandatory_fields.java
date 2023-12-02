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

public class TC_274_Check_shipping_address_mandatory_fields extends Base{
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
	
	public TC_274_Check_shipping_address_mandatory_fields () {
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
	public void shipping_address_mandatory_fields() throws InterruptedException {
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
		String firstname=firstnameheading.getText();
		Assert.assertEquals("First Name *", firstname);
		if (firstname.contains("*")) {
			System.out.println("Mandatory field marked in first name");
		}
		else {
			System.out.println("Not marked");
		}
		String lastname=lastnameheading.getText();
		Assert.assertEquals("Last Name *", lastname);
		if (lastname.contains("*")) {
			System.out.println("Mandatory field marked in last name");
		}
		else {
			System.out.println("Not marked");
		}
		String phonenumber=phonenumberhead.getText();
		Assert.assertEquals("Phone Number *", phonenumber);
		if (phonenumber.contains("*")) {
			System.out.println("Mandatory field marked in phone number");
		}
		else {
			System.out.println("Not marked");
		}
		String country=countryheading.getText();
		Assert.assertEquals("Country *", country);
		if (country.contains("*")) {
			System.out.println("Mandatory field marked in country");
		}
		else {
			System.out.println("Not marked");
		}
		String streetaddress=streetaddresshead.getText();
		Assert.assertEquals("Street Address *", streetaddress);
		if (streetaddress.contains("*")) {
			System.out.println("Mandatory field marked in street address");
		}
		else {
			System.out.println("Not marked");
		}
		String city=cityhead.getText();
		Assert.assertEquals("City *", city);
		if (city.contains("*")) {
			System.out.println("Mandatory field marked in city");
		}
		else {
			System.out.println("Not marked");
		}
		String zipcode=zipcodeheading.getText();
		Assert.assertEquals("ZIP Code*", zipcode);
		if (zipcode.contains("*")) {
			System.out.println("Mandatory field marked in Zip code");
		}
		else {
			System.out.println("Not marked");
		}
			

			
}

	@Test

	public void check_shipping_address_mandatory_fields() throws InterruptedException, AWTException {
		TC_274_Check_shipping_address_mandatory_fields ob = new TC_274_Check_shipping_address_mandatory_fields ();
		ob.clickoncollection();
		ob.shipping_address_mandatory_fields();
		Log.info("Checking checkout page shipping address mandatory fields");
	}
	


	

}
