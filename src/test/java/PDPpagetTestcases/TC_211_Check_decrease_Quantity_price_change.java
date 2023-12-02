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

public class TC_211_Check_decrease_Quantity_price_change extends Base{
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
	@FindBy(xpath = "//input[@id=\"widthCmRug\"]")
	private WebElement widthcm;
	@FindBy(xpath = "//input[@id=\"lengthCmRug\"]")
	private WebElement lgthcm;
	@FindBy(xpath = "//span[@id=\"rug_price\"]")
	private WebElement rugprice;
	@FindBy(xpath = "//span[@id=\"decrease\"]")
	private WebElement decreaseqty;
	@FindBy(xpath = "//span[@id=\"increase\"]")
	private WebElement increaseqty;


	public  TC_211_Check_decrease_Quantity_price_change() {
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

	public void decrease_quantity_price_changes() throws InterruptedException {
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
		String expectedprice=rugprice.getText();
		decreaseqty.click();
		Thread.sleep(1000);
		decreaseqty.click();
		Thread.sleep(2000);

		String afterqtyincreaseprice=rugprice.getText();
		Assert.assertEquals("$2592", afterqtyincreaseprice);
		Thread.sleep(1000);
		if(expectedprice.equals(afterqtyincreaseprice))
		{
			System.out.println("Price not changed after decrease in quantity");
		}
		else {
			System.out.println("Price changed after decrease in quantity");
		}


	}

	//	TC_211_Check_decrease_Quantity_price_change ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_211_Check_decrease_Quantity_price_change();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_price_change_quantity_decreased() throws InterruptedException, AWTException {
		TC_211_Check_decrease_Quantity_price_change ob=  new TC_211_Check_decrease_Quantity_price_change();
		ob.clickoncollection();
		ob.decrease_quantity_price_changes();
		Log.info("Clicking on collection FOF and checking price change when quantity decreased");
	}

}
