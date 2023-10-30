package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class TC_221_Check_PDP_top_bar_close_button extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"tb2Opn\"]")
	private WebElement pdptopbardropdown;
	@FindBy(xpath = "//div[@class=\"tbr2Cls\"]")
    private WebElement close;
	
	public  TC_221_Check_PDP_top_bar_close_button  () {
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
	public void click_close() throws InterruptedException {
		
		Thread.sleep(1000);
		pagedown();
		pdptopbardropdown.click();
		Thread.sleep(1000);
		close.click();
		
		
	}
	
	TC_221_Check_PDP_top_bar_close_button ob;
	//@Parameters ("url")
	@BeforeTest



	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_221_Check_PDP_top_bar_close_button();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_topbar_share_link() throws InterruptedException, AWTException {

		ob.clickoncollection();
		ob.click_close();
		Log.info("Clicking on collection FOF and checking close of PDP topbar");
	}
}
