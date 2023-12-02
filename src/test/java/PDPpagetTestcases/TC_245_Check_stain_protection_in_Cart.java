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

import Utilities.Readconfig;
import resources.Base;

public class TC_245_Check_stain_protection_in_Cart extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//input[@type=\"checkbox\"and @name=\"stain-protection\"]")
	private WebElement stainproteccheckbox;
	@FindBy(xpath = "//button[@title=\"Buy Now\"]")
	private WebElement addtocart;
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
	@FindBy(xpath = "//h3[contains(text(),'STAIN PROTECTION')]")
	private WebElement stainprocart;		



	public TC_245_Check_stain_protection_in_Cart() {
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

	public void click_stainprotection_verify_cart() throws InterruptedException {

		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		pagedown();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		stainproteccheckbox.click();
		Thread.sleep(1000);
		addtocart.click();
		Thread.sleep(2000);
		viewcart.click();
		Thread.sleep(1000);
		String expected=stainprocart.getText();
		Assert.assertEquals("STAIN PROTECTION", expected);

	}


	//	TC_245_Check_stain_protection_in_Cart ob;
	//
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//
	//		getlaunchurl(getreaddata("url"));
	//			ob= new TC_245_Check_stain_protection_in_Cart();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_stain_protection_in_cart() throws InterruptedException, AWTException {
		TC_245_Check_stain_protection_in_Cart ob= new TC_245_Check_stain_protection_in_Cart();
		ob.clickoncollection();
		ob.click_stainprotection_verify_cart();
		Log.info("Checking stain protection in shopping cart");
	}

}
