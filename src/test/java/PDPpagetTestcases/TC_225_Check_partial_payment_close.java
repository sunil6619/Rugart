package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class TC_225_Check_partial_payment_close extends Base  {
	
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//li[@id=\"installment\"]")
	private WebElement partial;
	@FindBy(xpath = "//div[@id=\"close-table\"]")
	private WebElement closepartialpay;
	
	public  TC_225_Check_partial_payment_close  () {
		PageFactory.initElements(driver, this);
	}
	public void clickoncollection() throws InterruptedException, AWTException {

		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(2);
		first.click();
//		zoomin();
	}
	public void click_close_partial_payment() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		pagedown();
		partial.click();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		closepartialpay.click();
		
		
	}
	
	TC_225_Check_partial_payment_close ob;
	//@Parameters ("url")
	@BeforeTest



	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_225_Check_partial_payment_close ();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_partial_payment_close() throws InterruptedException, AWTException {

		ob.clickoncollection();
		ob.click_close_partial_payment();
		Log.info("Clicking on collection FOF and checking partial payment close icon");
	}

}
