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

public class TC_232_Check_PDP_Order_sample_bottom_link extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//span[@class=\"open_sample_modal modal-text\"]")
	private WebElement ordersamplelink;
	@FindBy(xpath = "//h3[contains(text(),'ORDER COLOR SAMPLES')]")
	private WebElement ordersamplebox;
	
	public  TC_232_Check_PDP_Order_sample_bottom_link () {
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
	
	public void click_order_sample_link() throws InterruptedException {
		
		Thread.sleep(1000);
		pagedown();
		ordersamplelink.click();
		Thread.sleep(1000);
		String expected=ordersamplebox.getText();
		Assert.assertEquals("ORDER COLOR SAMPLES", expected);
		
		
	}
	TC_232_Check_PDP_Order_sample_bottom_link ob;
	//@Parameters ("url")
	@BeforeTest



	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_232_Check_PDP_Order_sample_bottom_link();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_order_sample_bottom_link() throws InterruptedException, AWTException {

		ob.clickoncollection();
		ob.click_order_sample_link();
		Log.info("Checking order sample link on bottom in PDP page");
	}
}
