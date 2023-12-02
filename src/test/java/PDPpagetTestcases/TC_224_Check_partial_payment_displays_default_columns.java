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

public class TC_224_Check_partial_payment_displays_default_columns extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//li[@id=\"installment\"]")
	private WebElement partial;
	@FindBy(xpath = "//td[text()='Payments']")
	private WebElement payments;
	@FindBy(xpath = "//td[text()='Due Date']")
	private WebElement duedate;
	@FindBy(xpath = "//td[text()='Amount']")
	private WebElement amount;


	public  TC_224_Check_partial_payment_displays_default_columns  () {
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

	public void check_default_columns() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		pagedown();
		partial.click();
		Boolean expected=payments.isDisplayed();
		Assert.assertTrue(expected);
		expected=duedate.isDisplayed();
		Assert.assertTrue(expected);
		expected=amount.isDisplayed();
		Assert.assertTrue(expected);

	}


	//	//@Parameters ("url")
	//	@BeforeTest
	//
	//
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_224_Check_partial_payment_displays_default_columns ();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_partial_payment_default_option() throws InterruptedException, AWTException {
		TC_224_Check_partial_payment_displays_default_columns ob= new TC_224_Check_partial_payment_displays_default_columns ();
		ob.clickoncollection();
		ob.check_default_columns();
		Log.info("Clicking on collection FOF and checking partial payment options");
	}
}
