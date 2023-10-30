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

public class TC_238_Check_small_rug_price_topbar_and_bottom extends Base{
	
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//div[@class=\"pdp-top-bar-item price priceValue txtBx\"]/descendant::div[@class=\"small-order-charge\"]")
	private WebElement topbarsmallrugmsg;
	@FindBy(xpath = "//div[@class=\"price-box\"]/descendant::div[@class=\"small-order-charge\"]")
	private WebElement bottomsmallrugmsg;
	
	
	
	public   TC_238_Check_small_rug_price_topbar_and_bottom () {
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
	public void small_rug_price() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("2");
		lgthft.sendKeys("3");
		Thread.sleep(2000);
		String expectedmsg=topbarsmallrugmsg.getText();
		Assert.assertEquals("+150 (Small order charge may apply on checkout)", expectedmsg);
		expectedmsg=bottomsmallrugmsg.getText();
		Assert.assertEquals("+150 (Small order charge may apply on checkout)", expectedmsg);
		
		}
	
	
	 TC_238_Check_small_rug_price_topbar_and_bottom  ob;
	//@Parameters ("url")
	@BeforeTest



	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new  TC_238_Check_small_rug_price_topbar_and_bottom ();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_small_rug_price() throws InterruptedException, AWTException {

		ob.clickoncollection();
		ob.small_rug_price();
		Log.info("Checking small rug price in PDP page");
	}
}
