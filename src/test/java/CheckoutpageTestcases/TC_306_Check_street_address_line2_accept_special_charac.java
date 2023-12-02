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

public class TC_306_Check_street_address_line2_accept_special_charac extends Base{
	
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
	@FindBy(xpath = "//button[@value=\"Place Order\"]")
	private WebElement placeorder;
	@FindBy(xpath = "//div[@class=\"title-button justify-content-between\"]/descendant::span[contains(text(),'Checkout')]")
	private WebElement topcheckout;
	@FindBy(xpath = "//input[@id=\"shipping_address_1\"]")
	private WebElement streetaddress2;
	@FindBy(xpath = "//label[@for=\"shipping_address_1\"]")
	private WebElement validationerror2;
	
	public TC_306_Check_street_address_line2_accept_special_charac() {
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
	public void enterstreetaddressline2() throws InterruptedException {
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
		Thread.sleep(2000);
		streetaddress2.sendKeys("%$#@*");
		Thread.sleep(1000);
		String expected=streetaddress2.getAttribute("value");
		Assert.assertEquals("%$#@*", expected);
	}
	

	@Test

	public void check_street_add_line2_accept_special_charac() throws InterruptedException, AWTException {
		 TC_306_Check_street_address_line2_accept_special_charac ob = new  TC_306_Check_street_address_line2_accept_special_charac();
		ob.clickoncollection();
		ob.enterstreetaddressline2();
		Log.info("Checking street address line2 accepts alphanumeric");
	}

	
	
	

}
