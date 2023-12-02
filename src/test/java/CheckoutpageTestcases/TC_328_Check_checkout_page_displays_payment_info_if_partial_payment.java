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

public class TC_328_Check_checkout_page_displays_payment_info_if_partial_payment extends Base {
	
	@FindBy(xpath = "//li[@id=\"installment\"]")
	private WebElement partial;
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
	@FindBy(xpath = "//td[contains(text(),'Grand ')]")
    private WebElement grandtotal;	
	@FindBy(xpath = "//strong[contains(text(),'FIRST')]")
    private WebElement firstpayment;
	@FindBy(xpath = "//strong[contains(text(),'SECOND')]")
    private WebElement secondpayment;
	
	
	public  TC_328_Check_checkout_page_displays_payment_info_if_partial_payment() {
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
	public void displayhandlingcharge() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("20");
		lgthft.sendKeys("30");
		Thread.sleep(1000);
		partial.click();
		Thread.sleep(1000);
		addtocart.click();
		Thread.sleep(2000);
		viewcart.click();
		Thread.sleep(1000);	
		topcheckout.click();
		Thread.sleep(2000);
		String expected=grandtotal.getText();
		Assert.assertEquals("GRAND TOTAL",expected);
		expected=firstpayment.getText();
		Assert.assertEquals("FIRST PAYMENT",expected);
		expected=secondpayment.getText();
		Assert.assertEquals("SECOND PAYMENT",expected);
		
		

	}
	
	@Test

	public void checkout_pg_displays_handling_charge() throws InterruptedException, AWTException {
		TC_328_Check_checkout_page_displays_payment_info_if_partial_payment ob = new TC_328_Check_checkout_page_displays_payment_info_if_partial_payment ();
		ob.clickoncollection();
		ob.displayhandlingcharge();
		Log.info("Checking checkout page displays payment info for partial payment");
	}
	
}
