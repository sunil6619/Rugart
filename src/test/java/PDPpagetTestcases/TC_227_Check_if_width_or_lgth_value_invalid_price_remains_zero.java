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

public class TC_227_Check_if_width_or_lgth_value_invalid_price_remains_zero extends Base{

	@FindBy(xpath = "//span[@id=\"rug_price\"]")
	private WebElement rugprice;
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	
	
	public  TC_227_Check_if_width_or_lgth_value_invalid_price_remains_zero() {
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
	public void lgth_width_value_invalid() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		widthft.sendKeys("1");
		lgthft.sendKeys("6");
		String expectedprice=rugprice.getText();
		Assert.assertEquals("$0", expectedprice);
		widthft.clear();
		widthft.sendKeys("4");
		lgthft.clear();
		lgthft.sendKeys("91");
		expectedprice=rugprice.getText();
		Assert.assertEquals("$0", expectedprice);
		
		
		
		
		
	}
	
	TC_227_Check_if_width_or_lgth_value_invalid_price_remains_zero ob;
	//@Parameters ("url")
	@BeforeTest



	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_227_Check_if_width_or_lgth_value_invalid_price_remains_zero();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_size_invalid_price_remains_zero() throws InterruptedException, AWTException {

		ob.clickoncollection();
		ob.lgth_width_value_invalid();
		Log.info("Clicking on collection FOF and checking price when size is invalid");
	}

	
}
