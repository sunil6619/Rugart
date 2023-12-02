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

public class TC_205_Check_knot_density_changed_price_changes extends Base{

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
	@FindBy(xpath = "//div[@class=\"select weavingtype\"]")
	private WebElement rugtypedropdown;
	@FindBy (xpath = "//li[@id=\"HandKnotted\"]")
	private WebElement handknotteddropdown;
	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"pile_depth_1\"]")
	private WebElement knotdensity1;
	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"pile_depth_2\"]")
	private WebElement knotdensity2;
	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"pile_depth_3\"]")
	private WebElement knotdensity3;

	public  TC_205_Check_knot_density_changed_price_changes() {
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
	public void click_different_knot_density() throws InterruptedException {
		Thread.sleep(1000);
		rugtypedropdown.click();
		Thread.sleep(1000);
		handknotteddropdown.click();
		pagedown();
		widthft.sendKeys("6");
		lgthft.sendKeys("8");
		Thread.sleep(2000);
		String expectedprice=rugprice.getText();
		Assert.assertEquals("$4368",expectedprice);
		Thread.sleep(1000);
		knotdensity2.click();
		Thread.sleep(2000);
		expectedprice=rugprice.getText();
		Assert.assertEquals("$5328",expectedprice);
		Thread.sleep(1000);
		knotdensity3.click();
		Thread.sleep(2000);
		expectedprice=rugprice.getText();
		Assert.assertEquals("$6288",expectedprice);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		radiocm.click();
		Thread.sleep(1000);
		widthcm.sendKeys("300");
		lgthcm.sendKeys("700");
		Thread.sleep(2000);
		expectedprice=rugprice.getText();
		Assert.assertEquals("$29610",expectedprice);
		Thread.sleep(1000);
		knotdensity2.click();
		Thread.sleep(2000);
		expectedprice=rugprice.getText();
		Assert.assertEquals("$25095",expectedprice);
		Thread.sleep(1000);
		knotdensity1.click();
		Thread.sleep(2000);
		expectedprice=rugprice.getText();
		Assert.assertEquals("$20580",expectedprice);
		Thread.sleep(1000); 
		knotdensity3.click();
		Thread.sleep(2000);
		expectedprice=rugprice.getText();
		Assert.assertEquals("$29610",expectedprice);
	}


	//	TC_205_Check_knot_density_changed_price_changes ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_205_Check_knot_density_changed_price_changes();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_knot_density_chnaged_price_changes() throws InterruptedException, AWTException {
		TC_205_Check_knot_density_changed_price_changes ob= new TC_205_Check_knot_density_changed_price_changes();
		ob.clickoncollection();
		ob.click_different_knot_density();
		Log.info("Clicking on collection FOF and checking price change when knot density is changed");
	}


}
