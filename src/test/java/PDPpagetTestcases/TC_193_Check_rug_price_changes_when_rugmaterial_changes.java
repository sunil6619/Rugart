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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_193_Check_rug_price_changes_when_rugmaterial_changes extends Base {
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@data-colors=\"#859F9C\"]/descendant::div[@class=\"select selected-material\"]")
	private WebElement rugmaterial2;
	@FindBy(xpath = "//div[@data-colors=\"#C8A894\"]/descendant::div[@class=\"select selected-material\"]")
	private WebElement rugmaterial1;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"New Zealand Wool\"]")
	private WebElement newzealandwool;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Silk\"]")
	private WebElement puresilk;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Bamboo Silk\"]")
	private WebElement bamboosilk;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Wool\"]")
	private WebElement purewool;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy (xpath = "//div[@class=\"pdp-top-bar-item price priceValue txtBx\"]/descendant::span[@class=\"regular-price\"]")
	private WebElement rugprice;
	
	public  TC_193_Check_rug_price_changes_when_rugmaterial_changes () {
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
	
	public void rugprice_change() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("4");
		Thread.sleep(1000);
		lgthft.sendKeys("6");
		pageup();
		rugmaterial1.click();
		Thread.sleep(1000);
		zoomin();
		newzealandwool.click();
		Thread.sleep(2000);
		String expectedrugprice=rugprice.getText();
		Assert.assertEquals("$1056", expectedrugprice);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		rugmaterial1.click();
		Thread.sleep(2000);
		puresilk.click();
		Thread.sleep(2000);
		expectedrugprice=rugprice.getText();
		Assert.assertEquals("$1338",expectedrugprice);
		Thread.sleep(2000);
		rugmaterial1.click();
		Thread.sleep(2000);
		bamboosilk.click();
		Thread.sleep(2000);
		expectedrugprice=rugprice.getText();
		Assert.assertEquals("$1078",expectedrugprice);
		Thread.sleep(2000);
		rugmaterial1.click();
		Thread.sleep(2000);
		purewool.click();
		Thread.sleep(2000);
		expectedrugprice=rugprice.getText();
		Assert.assertEquals("$864",expectedrugprice);
		
			
	}
	TC_193_Check_rug_price_changes_when_rugmaterial_changes ob;
	@Parameters ("url")
	@BeforeTest

	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_193_Check_rug_price_changes_when_rugmaterial_changes();
				Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_rug_price_changes() throws InterruptedException, AWTException {
		ob.clickoncollection();
		ob.rugprice_change();
				Log.info("Clicking on collection FOF and changing rug materials,checking rug price");




	}


}
