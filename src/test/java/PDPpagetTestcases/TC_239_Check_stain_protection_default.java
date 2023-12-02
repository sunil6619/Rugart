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

public class TC_239_Check_stain_protection_default extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//input[@type=\"checkbox\"and @name=\"stain-protection\"]")
	private WebElement stainproteccheckbox;

	public   TC_239_Check_stain_protection_default () {
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
	}
	public void stain_protection() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		pagedown();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Boolean expected=stainproteccheckbox.isSelected();
		Assert.assertFalse(expected);
	}

	//	TC_239_Check_stain_protection_default ob;
	//	//@Parameters ("url")
	//	@BeforeTest
	//
	//
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new  TC_239_Check_stain_protection_default();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_stain_protection_default() throws InterruptedException, AWTException {
		TC_239_Check_stain_protection_default ob= new  TC_239_Check_stain_protection_default();
		ob.clickoncollection();
		ob.stain_protection();
		Log.info("Checking small rug price in PDP page");
	}
}
