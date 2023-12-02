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
import org.testng.annotations.Test;

import resources.Base;

public class TC_244_Check_stain_protection_price_changes_when_quantity_changed extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//span[@class=\"stain-protection-price\"]")
	private WebElement stainprotectionprice;
	@FindBy(xpath = "//span[@id=\"decrease\"]")
	private WebElement decreaseqty;
	@FindBy(xpath = "//span[@id=\"increase\"]")
	private WebElement increaseqty;



	public   TC_244_Check_stain_protection_price_changes_when_quantity_changed () {
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

	public void change_quantity() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		pagedown();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		String expected=stainprotectionprice.getText();
		Assert.assertEquals("(+$166)", expected);
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(1000);
		increaseqty.click();
		Thread.sleep(2000);
		expected=stainprotectionprice.getText();
		Assert.assertEquals("(+$332)", expected);
		Thread.sleep(1000);
		increaseqty.click();
		Thread.sleep(2000);
		expected=stainprotectionprice.getText();
		Assert.assertEquals("(+$498)", expected);
		Thread.sleep(1000);
		decreaseqty.click();
		Thread.sleep(2000);
		expected=stainprotectionprice.getText();
		Assert.assertEquals("(+$332)", expected);

	}
	//	TC_244_Check_stain_protection_price_changes_when_quantity_changed ob;
	//	@BeforeTest
	//
	//
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_244_Check_stain_protection_price_changes_when_quantity_changed();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_stain_protection_price_when_quantity_changes() throws InterruptedException, AWTException {
		TC_244_Check_stain_protection_price_changes_when_quantity_changed ob= new TC_244_Check_stain_protection_price_changes_when_quantity_changed() ;
		ob.clickoncollection();
		ob.change_quantity();
		Log.info("Checking stain protection price when quantity is changed");
	}


}
