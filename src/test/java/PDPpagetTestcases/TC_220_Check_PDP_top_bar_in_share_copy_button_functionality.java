package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class TC_220_Check_PDP_top_bar_in_share_copy_button_functionality extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"tb2Opn\"]")
	private WebElement pdptopbardropdown;
	@FindBy(xpath = "//a[@id=\"pdp-share-btn\"]")
	private WebElement share;
	@FindBy(xpath = "//input[@id=\"share-url\"]")
	private WebElement shareurl;
	@FindBy(xpath = "//button[@title=\"Copy\"]")
	private WebElement copybutton;

	public  TC_220_Check_PDP_top_bar_in_share_copy_button_functionality  () {
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
		zoomin();
	}
	public void copy_button_functionality() throws InterruptedException {

		Thread.sleep(1000);
		pagedown();
		pdptopbardropdown.click();
		Thread.sleep(1000);
		share.click();
		Thread.sleep(1000);
		Boolean expected=copybutton.isDisplayed();
		Assert.assertTrue(expected);
		copybutton.click();
		Thread.sleep(1000);
		String expect=copybutton.getText();
		Assert.assertEquals("COPIED", expect);

	}
	//	TC_220_Check_PDP_top_bar_in_share_copy_button_functionality ob;
	//	//@Parameters ("url")
	//	@BeforeTest
	//
	//
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_220_Check_PDP_top_bar_in_share_copy_button_functionality();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_topbar_share_link() throws InterruptedException, AWTException {
		TC_220_Check_PDP_top_bar_in_share_copy_button_functionality ob= new TC_220_Check_PDP_top_bar_in_share_copy_button_functionality();
		ob.clickoncollection();
		ob.copy_button_functionality();
		Log.info("Clicking on collection FOF and checking copy button in share link");
	}
}
