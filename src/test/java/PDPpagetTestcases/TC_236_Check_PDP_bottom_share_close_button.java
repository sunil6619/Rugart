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

public class TC_236_Check_PDP_bottom_share_close_button extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//span[@class=\"share-icon modal-text\"]")
	private WebElement share;
	@FindBy(xpath = "//div[@id=\"share-Modal\"]/descendant::span")
    private WebElement close;
	
	
	public  TC_236_Check_PDP_bottom_share_close_button () {
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
	public void click_close() throws InterruptedException {
		
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		share.click();
		Thread.sleep(1000);
		Boolean expected=close.isDisplayed();
		Assert.assertTrue(expected);
		close.click();
		
	}
	TC_236_Check_PDP_bottom_share_close_button ob;
	//@Parameters ("url")
	@BeforeTest



	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_236_Check_PDP_bottom_share_close_button();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_close_button_functionality_in_share() throws InterruptedException, AWTException {

		ob.clickoncollection();
		ob.click_close();
		Log.info("Checking close button of share of PDP page");
	}
	
}
