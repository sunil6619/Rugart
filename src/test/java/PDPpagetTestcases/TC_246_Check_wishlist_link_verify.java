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

public class TC_246_Check_wishlist_link_verify extends Base{

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
	@FindBy(xpath = "//h3[contains(text(),'Sign In')]")
	private WebElement signinbox;

	public TC_246_Check_wishlist_link_verify () {
		PageFactory.initElements(driver, this);
	}
	public void clickoncollection() throws InterruptedException, AWTException {

		Thread.sleep(1000);
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(2);
		first.click();

	}

	public void click_wishlist() throws InterruptedException {
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
		String expected=signinbox.getText();
		Assert.assertEquals("SIGN IN", expected);

	}
	//	TC_246_Check_wishlist_link_verify  ob;
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_246_Check_wishlist_link_verify ();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_wishlist_link() throws InterruptedException, AWTException {
		TC_246_Check_wishlist_link_verify  ob= new TC_246_Check_wishlist_link_verify ();
		ob.clickoncollection();
		ob.click_wishlist();
		Log.info("Checking wishlist link");
	}


}
