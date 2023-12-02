package Shopping_cartTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_252_Check_cart_displays_required_fields extends Base {

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
	@FindBy(xpath = "//h3[contains(text(),'Your cart')]")
	private WebElement cart;
	@FindBy(xpath = "//h4[contains(text(),'Items')]")
	private WebElement items;
	@FindBy(xpath = "//h5[contains(text(),'Total ')]")
	private WebElement total;
	@FindBy(xpath = "//div[contains(text(),'Price')]")
	private WebElement price;
	@FindBy(xpath = "//div[contains(text(),'Qty')]")
	private WebElement qty;
	@FindBy(xpath = "//div[contains(text(),'Subtotal')]")
	private WebElement subtotal;
	@FindBy(xpath = "//h2[contains(text(),'ADD-ONS')]")
	private WebElement addons;
	@FindBy(xpath = "//h3[contains(text(),'Stain Protection')]")
	private WebElement stainprotection;
	@FindBy(xpath = "//h2[contains(text(),'Order summary')]")
	private WebElement ordersummary;
	@FindBy(xpath = "//strong[contains(text(),'ORDER TOTAL')]")
	private WebElement ordertotal;
	
	
	
	public  TC_252_Check_cart_displays_required_fields () {
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
	
	public void cart_fields() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		Thread.sleep(1000);
		addtocart.click();
		Thread.sleep(2000);
		viewcart.click();
		Thread.sleep(1000);
		String expected=cart.getText();
		Assert.assertEquals("YOUR CART",expected);
		Boolean expect=items.isDisplayed();
		Assert.assertTrue(expect);
		expect=total.isDisplayed();
		Assert.assertTrue(expect);
		expected=price.getText();
		Assert.assertEquals("Price",expected);
		expected=qty.getText();
		Assert.assertEquals("Qty",expected);
		expected=subtotal.getText();
		Assert.assertEquals("Subtotal",expected);
		expected=addons.getText();
		Assert.assertEquals("ADD-ONS",expected);
		expected=stainprotection.getText();
		Assert.assertEquals("STAIN PROTECTION",expected);
		expected=ordersummary.getText();
		Assert.assertEquals("ORDER SUMMARY",expected);
		expected=ordertotal.getText();
		Assert.assertEquals("ORDER TOTAL",expected);
		
		
	}
	@Test

	public void check_added_products_in_cart() throws InterruptedException, AWTException {
		TC_252_Check_cart_displays_required_fields ob = new TC_252_Check_cart_displays_required_fields();
		ob.clickoncollection();
		ob.cart_fields();
		Log.info("Checking required fields in Cart");
	}
}
