package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class TC_247_Check_wishlist_functionality_with_login_verify extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//span[normalize-space()='Save to Wishlist']")
	private WebElement wishlist;
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
	@FindBy(xpath = "//div[@class=\"alert alert-success\"]")
	private WebElement wishlistmsg;
	@FindBy(xpath = "//ul[@class=\"links\"]/child::li/a[text()='My Wishlist']")
	private WebElement mywishlist;
	@FindBy(xpath = "//a[contains(text(),'Anemone')]")
	private WebElement wishlistproduct;
	
	
	public TC_247_Check_wishlist_functionality_with_login_verify () {
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
	
	public void click_wishlist_when_loggedin() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		pagedown();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		wishlist.click();
		Thread.sleep(1000);
		Boolean expected=wishlistmsg.isDisplayed();
		Assert.assertTrue(expected);
		String text=wishlistmsg.getText();
		System.out.println(text);
		Thread.sleep(3000);
		mywishlist.click();
		Thread.sleep(1000);
		String expectedprod=wishlistproduct.getText();
		Assert.assertEquals("ANEMONE",expectedprod);
	
	}
	TC_247_Check_wishlist_functionality_with_login_verify ob;
	@BeforeTest

	

	public void launchurl() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
		ob= new TC_247_Check_wishlist_functionality_with_login_verify();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_wishlist_functionality_login_verify() throws InterruptedException, AWTException {

		ob.clickoncollection();
		ob.click_wishlist_when_loggedin();
		Log.info("Checking wishlist functionality when logged in,verify");
	}
}
