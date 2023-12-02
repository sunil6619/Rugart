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

public class TC_263_Check_checkout_directs_to_checkout_page extends Base{
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
	@FindBy(xpath = "//div[@class=\"title-button justify-content-between\"]/descendant::span[contains(text(),'Checkout')]")
	private WebElement topcheckout;
	@FindBy(xpath = "//div[@class=\"totals\"]/descendant::span[contains(text(),'Checkout')]")
	private WebElement bottomcheckout;
	@FindBy(xpath = "//h3[contains(text(),'Checkout')]")
	private WebElement checkoutpage;
	@FindBy(xpath = "//span[contains(text(),'Go back to the cart')]")
	private WebElement backtocart;
	
	public  TC_263_Check_checkout_directs_to_checkout_page() {
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
	
	public void click_checkout() throws InterruptedException {

		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		Thread.sleep(1000);
		addtocart.click();
		Thread.sleep(3000);
		viewcart.click();
		Thread.sleep(1000);
		topcheckout.click();
		Thread.sleep(1000);
		String expectedpage=checkoutpage.getText();
		Assert.assertEquals("CHECKOUT",expectedpage);
		backtocart.click();
		Thread.sleep(1000);
		pagedown();
		bottomcheckout.click();
		Thread.sleep(1000);
		expectedpage=checkoutpage.getText();
		Assert.assertEquals("CHECKOUT",expectedpage);
		
		
		
	
		
	

	}
	
	@Test

	public void check_checkout_directs_checkout_page() throws InterruptedException, AWTException {
		TC_263_Check_checkout_directs_to_checkout_page ob = new TC_263_Check_checkout_directs_to_checkout_page();
		ob.clickoncollection();
		ob.click_checkout();
		Log.info("Checking check out directs to checkout page");
	}

}
