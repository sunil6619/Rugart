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

public class TC_217_Check_PDP_top_bar_order_sample_link extends Base {

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"tb2Opn\"]")
	private WebElement pdptopbardropdown;
	@FindBy(xpath = "//b[contains(text(),'ORDER SAMPLES')]")
    private WebElement ordersample;
	@FindBy(xpath = "//h3[contains(text(),'ORDER COLOR SAMPLES')]")
	private WebElement ordersamplebox;
	
	public  TC_217_Check_PDP_top_bar_order_sample_link  () {
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
	
	public void clickordersample() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		pdptopbardropdown.click();
		Thread.sleep(1000);
		ordersample.click();
		Thread.sleep(1000);
		String expected=ordersamplebox.getText();
		Assert.assertEquals("ORDER COLOR SAMPLES",expected);
		
		
		
		
	}
	TC_217_Check_PDP_top_bar_order_sample_link   ob;
//	@Parameters ("url")
	@BeforeTest

	
	
	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_217_Check_PDP_top_bar_order_sample_link  ();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_topbar_order_sample_link() throws InterruptedException, AWTException {
		
		ob.clickoncollection();
		ob.clickordersample();
		Log.info("Clicking on collection FOF and checking PDP top bar order sample link");
	}
	
	
}
