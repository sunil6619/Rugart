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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_202_Check_enter_different_values_feet_cm_verify_price_change extends Base {

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"cm\"]")
	private WebElement radiocm;
	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"feet\"]")
	private WebElement feet;
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


	public  TC_202_Check_enter_different_values_feet_cm_verify_price_change() {
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
	public void enter_different_values_price_change() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		widthft.sendKeys("6");
		lgthft.sendKeys("8");
		Thread.sleep(2000);
		String expectedprice=rugprice.getText();
		Assert.assertEquals("$1728",expectedprice);
		widthft.clear();
		Thread.sleep(1000);
		widthft.sendKeys("8");
		lgthft.clear();
		Thread.sleep(1000);
		lgthft.sendKeys("12");
		Thread.sleep(2000);
		expectedprice=rugprice.getText();
		Assert.assertEquals("$3456",expectedprice);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		radiocm.click();
		Thread.sleep(1000);
		widthcm.sendKeys("200");
		lgthcm.sendKeys("600");
		Thread.sleep(2000);
		expectedprice=rugprice.getText();
		Assert.assertEquals("$4656",expectedprice);
		widthcm.clear();
		Thread.sleep(1000);
		widthcm.sendKeys("400");
		lgthcm.clear();
		Thread.sleep(1000);
		lgthcm.sendKeys("900");
		Thread.sleep(2000);
		expectedprice=rugprice.getText();
		Assert.assertEquals("$13968",expectedprice);		

	}

	//	TC_202_Check_enter_different_values_feet_cm_verify_price_change ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_202_Check_enter_different_values_feet_cm_verify_price_change();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_enter_different_values_ft_cm_verify_price() throws InterruptedException, AWTException {
		TC_202_Check_enter_different_values_feet_cm_verify_price_change ob=  new TC_202_Check_enter_different_values_feet_cm_verify_price_change();
		ob.clickoncollection();
		ob.enter_different_values_price_change();
		Log.info("Clicking on collection FOF and checking price change when different values entered in feet");
	}



}
