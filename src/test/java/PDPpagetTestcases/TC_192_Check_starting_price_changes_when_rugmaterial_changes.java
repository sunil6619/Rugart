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

public class TC_192_Check_starting_price_changes_when_rugmaterial_changes extends Base{

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
	@FindBy(xpath = "//span[@itemprop=\"price\"]/ancestor::div[@class=\"price-box start_price float-right\"]")
	private WebElement startingprice;
	@FindBy(xpath = "//div[@class=\"pdp-top-bar-item startfrom\"]/descendant::div[@class=\"price-box start_price\"]")
	private WebElement pdptopbarstartingprice;

	public  TC_192_Check_starting_price_changes_when_rugmaterial_changes () {
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

	public void starting_price_changes_rugmaterial_changed() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		rugmaterial1.click();
		Thread.sleep(1000);
		zoomin();
		newzealandwool.click();
		Thread.sleep(2000);
		String expectedprice=startingprice.getText();
		Assert.assertEquals("$44 ft2", expectedprice);
		expectedprice=pdptopbarstartingprice.getText();
		Assert.assertEquals("$44 ft2", expectedprice);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
        Thread.sleep(2000);
		rugmaterial1.click();
		Thread.sleep(2000);
		puresilk.click();
		Thread.sleep(3000);
	    expectedprice=startingprice.getText();
		Assert.assertEquals("$56 ft2", expectedprice);
		expectedprice=pdptopbarstartingprice.getText();
		Assert.assertEquals("$56 ft2", expectedprice);
		Thread.sleep(1000);
		rugmaterial1.click();
		Thread.sleep(2000);
		bamboosilk.click();
		Thread.sleep(3000);
	    expectedprice=startingprice.getText();
		Assert.assertEquals("$45 ft2", expectedprice);
		expectedprice=pdptopbarstartingprice.getText();
		Assert.assertEquals("$45 ft2", expectedprice);
		Thread.sleep(1000);
		rugmaterial1.click();
		Thread.sleep(2000);
		purewool.click();
		Thread.sleep(3000);
	    expectedprice=startingprice.getText();
		Assert.assertEquals("$36 ft2", expectedprice);
		expectedprice=pdptopbarstartingprice.getText();
		Assert.assertEquals("$36 ft2", expectedprice);
		
	}

	TC_192_Check_starting_price_changes_when_rugmaterial_changes ob;
	@Parameters ("url")
	@BeforeTest

	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_192_Check_starting_price_changes_when_rugmaterial_changes();
				Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_starting_price_changes() throws InterruptedException, AWTException {
		ob.clickoncollection();
		ob.starting_price_changes_rugmaterial_changed();
				Log.info("Clicking on collection FOF and changing rug materials,checking starting price");




	}


}
