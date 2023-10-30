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

public class TC_243_Check_stain_protection_price_changes_when_shape_changed extends Base{
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
	@FindBy(xpath = "//div[@id=\"designShape_msdd\"]")
	private WebElement rugshapedropdown;;
	@FindBy(xpath = "//li[@title=\"round\"]")
	private WebElement roundshape;

	public   TC_243_Check_stain_protection_price_changes_when_shape_changed () {
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

	public void change_rugshape() throws InterruptedException {

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
		pageup();
		Thread.sleep(2000);
		pageup();
		Thread.sleep(2000);
		rugshapedropdown.click();
		Thread.sleep(2000);
		roundshape.click();
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		expected=stainprotectionprice.getText();
		Assert.assertEquals("(+$111)", expected);



	}
	TC_243_Check_stain_protection_price_changes_when_shape_changed ob;

	@BeforeTest



	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_243_Check_stain_protection_price_changes_when_shape_changed();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_stain_protection_price_when_shape_changes() throws InterruptedException, AWTException {

		ob.clickoncollection();
		ob.change_rugshape();
		Log.info("Checking stain protection price when rugshape is changed");
	}
}
