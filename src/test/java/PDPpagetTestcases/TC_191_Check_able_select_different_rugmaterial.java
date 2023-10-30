package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_191_Check_able_select_different_rugmaterial extends Base{

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

	public  TC_191_Check_able_select_different_rugmaterial () {
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

	public void change_rugmaterials() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		rugmaterial1.click();
		Thread.sleep(1000);
		newzealandwool.click();
		Thread.sleep(1000);
		String expectedmaterial=rugmaterial1.getText();
		Assert.assertEquals("New Zealand Wool", expectedmaterial);
		zoomin();
		Thread.sleep(1000);
		rugmaterial1.click();
		Thread.sleep(2000);
		puresilk.click();
		Thread.sleep(1000);
		expectedmaterial=rugmaterial1.getText();
		Assert.assertEquals("Pure Silk", expectedmaterial);
		Thread.sleep(1000);
		rugmaterial1.click();
		Thread.sleep(2000);
		bamboosilk.click();
		Thread.sleep(1000);
		expectedmaterial=rugmaterial1.getText();
		Assert.assertEquals("Bamboo Silk", expectedmaterial);
		Thread.sleep(1000);
		rugmaterial1.click();
		Thread.sleep(2000);
		purewool.click();
		Thread.sleep(1000);
		expectedmaterial=rugmaterial1.getText();
		Assert.assertEquals("Pure Wool", expectedmaterial);

	}
	TC_191_Check_able_select_different_rugmaterial ob;
	@Parameters ("url")
	@BeforeTest

	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_191_Check_able_select_different_rugmaterial();
		Log.info("Chrome browser and url launch");
	}


	@Test

	public void check_able_select_different_rugmaterials() throws InterruptedException, AWTException {
		ob.clickoncollection();
		ob.change_rugmaterials();
		Log.info("Clicking on collection FOF and changing rug materials");




	}
}
