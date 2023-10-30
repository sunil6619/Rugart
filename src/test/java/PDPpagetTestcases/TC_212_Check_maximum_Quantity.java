package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_212_Check_maximum_Quantity extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//input[@id=\"qty-number\"]")
	private WebElement quantity;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	
	@FindBy(xpath = "//span[@id=\"increase\"]")
	private WebElement increaseqty;
	
	public  TC_212_Check_maximum_Quantity() {
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

	public void click_maximum_quantity() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		Thread.sleep(1000);
		increaseqty.click();
		Thread.sleep(1000);
		increaseqty.click();
		Thread.sleep(1000);
		increaseqty.click();
		Thread.sleep(1000);
		increaseqty.click();
		Thread.sleep(1000);
		increaseqty.click();
		Thread.sleep(1000);
		increaseqty.click();
		Thread.sleep(1000);
		increaseqty.click();
		Thread.sleep(1000);
		increaseqty.click();
		Thread.sleep(1000);
		increaseqty.click();
		Thread.sleep(1000);
		increaseqty.click();
		Thread.sleep(1000);
		increaseqty.click();
		Thread.sleep(1000);
		String expectedqty=quantity.getAttribute("value");
		System.out.println(expectedqty);
		Assert.assertEquals("10", expectedqty);
	
	}

	TC_212_Check_maximum_Quantity ob;
	@Parameters ("url")
	@BeforeTest

	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_212_Check_maximum_Quantity();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_price_change_quantity_increased() throws InterruptedException, AWTException {
		ob.clickoncollection();
		ob.click_maximum_quantity();
		Log.info("Clicking on collection FOF and checking maximum quantity");
	}

}
