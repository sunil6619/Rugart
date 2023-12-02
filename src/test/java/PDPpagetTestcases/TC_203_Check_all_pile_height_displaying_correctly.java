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

public class TC_203_Check_all_pile_height_displaying_correctly extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"cm\"]")
	private WebElement radiocm;
	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"feet\"]")
	private WebElement feet;
	@FindBy(xpath = "//label[contains(text(),'0.5-0.6 inch')]")
	private WebElement pileheight1;
	@FindBy(xpath = "//label[contains(text(),'0.6-0.7 inch')]")
	private WebElement pileheight2;
	@FindBy(xpath = "//label[contains(text(),'0.7-0.9 inch')]")
	private WebElement pileheight3;
	@FindBy(xpath = "//label[contains(text(),'12-14mm')]")
	private WebElement pileheightmm1;
	@FindBy(xpath = "//label[contains(text(),'14-18mm')]")
	private WebElement pileheightmm2;
	@FindBy(xpath = "//label[contains(text(),'18-22mm')]")
	private WebElement pileheightmm3;

	public  TC_203_Check_all_pile_height_displaying_correctly() {
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
	public void verify_pile_height() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		String expectedpileheight=pileheight1.getText();
		Assert.assertEquals("0.5-0.6 inch",expectedpileheight);
		expectedpileheight=pileheight2.getText();
		Assert.assertEquals("0.6-0.7 inch",expectedpileheight);
		expectedpileheight=pileheight3.getText();
		Assert.assertEquals("0.7-0.9 inch",expectedpileheight);
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		radiocm.click();
		Thread.sleep(1000);
		expectedpileheight=pileheightmm1.getText();
		Assert.assertEquals("12-14mm",expectedpileheight);
		expectedpileheight=pileheightmm2.getText();
		Assert.assertEquals("14-18mm",expectedpileheight);
		expectedpileheight=pileheightmm3.getText();
		Assert.assertEquals("18-22mm",expectedpileheight);


	}

	//	TC_203_Check_all_pile_height_displaying_correctly ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_203_Check_all_pile_height_displaying_correctly();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_all_pile_height_displaying() throws InterruptedException, AWTException {
		TC_203_Check_all_pile_height_displaying_correctly ob= new TC_203_Check_all_pile_height_displaying_correctly();
		ob.clickoncollection();
		ob.verify_pile_height();
		Log.info("Clicking on collection FOF and checking pile height displays");
	}

}
