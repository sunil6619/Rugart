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

import lombok.experimental.FieldDefaults;
import resources.Base;

public class TC_223_Check_partial_full_payment_radio_buttons extends Base {

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//li[@id=\"full-payment\"]")
	private WebElement fullpayment;
	@FindBy(xpath = "//li[@id=\"installment\"]")
	private WebElement partial;
	@FindBy(xpath = "//li[@id=\"installment\"]/child::label[@for=\"installment-radio\"]")
	private WebElement radiopartial;
	@FindBy(xpath = "//li[@id=\"full-payment\"]/child::label[@for=\"full-payment-radio\"]")
	private WebElement radiofullpayment;


	public  TC_223_Check_partial_full_payment_radio_buttons  () {
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

	public void click_partial_full_payment() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		pagedown();
		Boolean expected=fullpayment.isDisplayed();
		Assert.assertTrue(expected);
		expected=partial.isDisplayed();
		Assert.assertTrue(expected);
		partial.click();
		Thread.sleep(2000);
		//		expected=partial.isSelected();
		//		Assert.assertTrue(expected);
		fullpayment.click();
		Thread.sleep(1000);
		//		expected=radiofullpayment.isSelected();
		//		Assert.assertTrue(expected);


	}
	//	TC_223_Check_partial_full_payment_radio_buttons  ob;
	//	//@Parameters ("url")
	//	@BeforeTest
	//
	//
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_223_Check_partial_full_payment_radio_buttons ();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_partial_full_payment_option() throws InterruptedException, AWTException {
		TC_223_Check_partial_full_payment_radio_buttons ob=new TC_223_Check_partial_full_payment_radio_buttons ();
		ob.clickoncollection();
		ob.click_partial_full_payment();
		Log.info("Clicking on collection FOF and checking partial,full payment options");
	}


}
