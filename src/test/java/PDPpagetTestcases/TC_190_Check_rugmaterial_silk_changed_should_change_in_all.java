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

public class TC_190_Check_rugmaterial_silk_changed_should_change_in_all extends Base {

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@data-colors=\"#859F9C\"]/descendant::div[@class=\"select selected-material\"]")
	private WebElement rugmaterial2;
	@FindBy(xpath = "//div[@data-colors=\"#C8A894\"]/descendant::div[@class=\"select selected-material\"]")
	private WebElement rugmaterial1;
	@FindBy(xpath = "//div[@data-colors=\"#8A987F\"]/descendant::div[@class=\"select selected-material\"]")
	private WebElement rugmaterial3;
	@FindBy(xpath = "//div[@data-colors=\"#2D3036\"]/descendant::div[@class=\"select selected-material\"]")
	private WebElement rugmaterial4;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Silk\"]")
	private WebElement puresilk;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Bamboo Silk\"]")
	private WebElement bamboosilk;

	public  TC_190_Check_rugmaterial_silk_changed_should_change_in_all() {
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
	public void change_rugmaterial_silk() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		zoomin();
		rugmaterial1.click();
		Thread.sleep(1000);
		puresilk.click();
		String expectedmaterial=rugmaterial1.getText();
		Assert.assertEquals("Pure Silk", expectedmaterial);
		zoomin();
		rugmaterial2.click();
		Thread.sleep(2000);
		//		pagedown();
		puresilk.click();
		Thread.sleep(1000);
		expectedmaterial=rugmaterial2.getText();
		Assert.assertEquals("Pure Silk", expectedmaterial);
		Thread.sleep(1000);
		rugmaterial3.click();
		Thread.sleep(1000);
		puresilk.click();
		Thread.sleep(1000);
		expectedmaterial=rugmaterial3.getText();
		Assert.assertEquals("Pure Silk", expectedmaterial);
		Thread.sleep(1000);
		rugmaterial4.click();
		Thread.sleep(1000);
		puresilk.click();
		Thread.sleep(1000);
		expectedmaterial=rugmaterial4.getText();
		Assert.assertEquals("Pure Silk", expectedmaterial);
		Thread.sleep(1000);
		//		pageup();
		rugmaterial1.click();
		Thread.sleep(2000);
		bamboosilk.click();
		expectedmaterial=rugmaterial1.getText();
		Assert.assertEquals("Bamboo Silk", expectedmaterial);
		//		pagedown();
		expectedmaterial=rugmaterial2.getText();
		Assert.assertEquals("Bamboo Silk", expectedmaterial);
		expectedmaterial=rugmaterial3.getText();
		Assert.assertEquals("Bamboo Silk", expectedmaterial);
		expectedmaterial=rugmaterial4.getText();
		Assert.assertEquals("Bamboo Silk", expectedmaterial);
	}

	//	TC_190_Check_rugmaterial_silk_changed_should_change_in_all ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_190_Check_rugmaterial_silk_changed_should_change_in_all();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_rugmaterial_silk_changed() throws InterruptedException, AWTException {
		TC_190_Check_rugmaterial_silk_changed_should_change_in_all ob= new TC_190_Check_rugmaterial_silk_changed_should_change_in_all();
		ob.clickoncollection();
		ob.change_rugmaterial_silk();

	}
}
