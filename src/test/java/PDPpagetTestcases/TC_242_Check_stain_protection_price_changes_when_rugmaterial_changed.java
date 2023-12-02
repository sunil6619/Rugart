package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class TC_242_Check_stain_protection_price_changes_when_rugmaterial_changed extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//span[@class=\"stain-protection-price\"]")
	private WebElement stainprotectionprice;
	@FindBy(xpath = "//div[@data-colors=\"#859F9C\"]/descendant::div[@class=\"select selected-material\"]")
	private WebElement rugmaterialdropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"New Zealand Wool\"]")
	private WebElement newzealandwooldropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Silk\"]")
	private WebElement puresilkdropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Bamboo Silk\"]")
	private WebElement bamboosilkdropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Wool\"]")
	private WebElement purewooldropdown;


	public   TC_242_Check_stain_protection_price_changes_when_rugmaterial_changed () {
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
	public void change_rugmaterial() throws InterruptedException {
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
		String expected=stainprotectionprice.getText();
		Assert.assertEquals("(+$166)", expected);
		pageup();
		Thread.sleep(2000);
		pageup();
		Thread.sleep(1000);
		rugmaterialdropdown.click();
		Thread.sleep(1000);
		newzealandwooldropdown.click();
		pagedown();
		Thread.sleep(1000);
		expected=stainprotectionprice.getText();
		Assert.assertEquals("(+$203)", expected);

	}

	//	TC_242_Check_stain_protection_price_changes_when_rugmaterial_changed ob;
	//	//@Parameters ("url")
	//	@BeforeTest
	//
	//
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_242_Check_stain_protection_price_changes_when_rugmaterial_changed ();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_stain_protection_price_when_rugmaterial_changes() throws InterruptedException, AWTException {
		TC_242_Check_stain_protection_price_changes_when_rugmaterial_changed ob= new TC_242_Check_stain_protection_price_changes_when_rugmaterial_changed ();
		ob.clickoncollection();
		ob.change_rugmaterial();
		Log.info("Checking stain protection price when rugmaterial is changed");
	}
}
