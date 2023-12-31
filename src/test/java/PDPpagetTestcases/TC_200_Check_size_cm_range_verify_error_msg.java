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

public class TC_200_Check_size_cm_range_verify_error_msg extends Base {

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
	@FindBy(xpath = "//span[contains(text(),'Add To Cart')]")
	private WebElement addtocart;
	@FindBy(xpath = "//div[@class=\"cm-width-error unit-error mt-1\"]")
	private WebElement errormsg;
	@FindBy(xpath = "//div[@class=\"size-shape-error unit-error mt-1\"]")
	private WebElement samesizeerrormsg;


	public  TC_200_Check_size_cm_range_verify_error_msg() {
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

	public void cm_range_verify_error() throws InterruptedException {
		Thread.sleep(1000);
		radiocm.click();
		Thread.sleep(1000);
		widthcm.sendKeys("30");
		Thread.sleep(1000);
		String expectederrormsg=errormsg.getText();
		Assert.assertEquals("Please enter a valid size between 50-80000 cm",expectederrormsg);
		widthcm.clear();
		Thread.sleep(1000);
		widthcm.sendKeys("82000");
		expectederrormsg=errormsg.getText();
		Assert.assertEquals("Please enter a valid size between 50-80000 cm",expectederrormsg);
		lgthcm.sendKeys("45");
		Thread.sleep(1000);
		expectederrormsg=errormsg.getText();
		Assert.assertEquals("Please enter a valid size between 50-80000 cm",expectederrormsg);
		lgthcm.clear();
		Thread.sleep(1000);
		lgthcm.sendKeys("82000");
		expectederrormsg=errormsg.getText();
		Assert.assertEquals("Please enter a valid size between 50-80000 cm",expectederrormsg);
		expectederrormsg=samesizeerrormsg.getText();
		Assert.assertEquals("Length needs to be larger than the Width",expectederrormsg);

	}

//	TC_200_Check_size_cm_range_verify_error_msg ob;
//	@Parameters ("url")
//	@BeforeTest
//
//	public void launchurl() throws InterruptedException {
//		getlaunchurl(getreaddata("url"));
//		ob= new TC_200_Check_size_cm_range_verify_error_msg();
//		Log.info("Chrome browser and url launch");
//	}

	@Test

	public void check_size_cm_range() throws InterruptedException, AWTException {
		TC_200_Check_size_cm_range_verify_error_msg ob= new TC_200_Check_size_cm_range_verify_error_msg();
		ob.clickoncollection();
		ob.cm_range_verify_error();
		Log.info("Clicking on collection FOF and checking CM range");
	}


}
