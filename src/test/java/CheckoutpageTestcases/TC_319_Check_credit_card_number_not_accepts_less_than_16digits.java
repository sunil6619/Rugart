package CheckoutpageTestcases;

import java.awt.AWTException;
import java.util.List;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
 

import resources.Base;

public class TC_319_Check_credit_card_number_not_accepts_less_than_16digits extends Base{
	
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
	@FindBy(xpath = "//div[@id=\"card-number-error\"]")
	private WebElement validationerror;
	@FindBy(xpath = "//input[@id=\"shipping[phone]\"]")
	private WebElement phonenumber;
	@FindBy(xpath = "//input[@id=\"shipping_address_0\"]")
	private WebElement streetaddress;
	@FindBy(xpath = "//input[@id=\"shipping[city]\"]")
	private WebElement city;
	@FindBy(xpath = "//input[@id=\"shipping[postcode]\"]")
	private WebElement zipcode;
	@FindBy(name = "cardnumber")
	private WebElement ccinput;
	@FindBy(xpath = "//iframe[@title=\"Secure card number input frame\"]")
	private WebElement iframe;
	
	public TC_319_Check_credit_card_number_not_accepts_less_than_16digits() {
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
	public void entercreditcard() throws InterruptedException {
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
		Thread.sleep(1000);
		phonenumber.sendKeys("0124588514");
		streetaddress.sendKeys("14533 London");
		city.sendKeys("New York");
		zipcode.sendKeys("20500");
		pageup();
		Thread.sleep(3000);
		driver.switchTo().frame(iframe);
		ccinput.sendKeys("424242424242424");
		String expected=ccinput.getAttribute("value");
		Assert.assertEquals("4242 4242 4242 424",expected);
//		Thread.sleep(2000);
//		placeorder.click();
//		Thread.sleep(4000);
//		String expected=validationerror.getText();
//		Assert.assertEquals("Your card number is incomplete.",expected);
	

	}
	
	
	@Test

	public void check_creditcard_not_accept_less_than_16digits_verifymsg() throws InterruptedException, AWTException {
		TC_319_Check_credit_card_number_not_accepts_less_than_16digits ob = new TC_319_Check_credit_card_number_not_accepts_less_than_16digits();
		ob.clickoncollection();
		ob.entercreditcard();
		Log.info("Checking credit card not accept less than 16 digits");
	}


}
