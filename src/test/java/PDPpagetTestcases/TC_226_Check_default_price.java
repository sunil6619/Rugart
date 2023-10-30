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

public class TC_226_Check_default_price extends Base {

	@FindBy(xpath = "//span[@id=\"rug_price\"]")
	private WebElement rugprice;
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	
	public  TC_226_Check_default_price  () {
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
	public void default_rugprice() throws InterruptedException {
		
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		pagedown();
		String expectedprice=rugprice.getText();
		Assert.assertEquals("$0",expectedprice);
		
	}
	TC_226_Check_default_price ob;
	//@Parameters ("url")
	@BeforeTest



	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_226_Check_default_price();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_default_price() throws InterruptedException, AWTException {

		ob.clickoncollection();
		ob.default_rugprice();
		Log.info("Clicking on collection FOF and checking default rugprice");
	}

	
}
