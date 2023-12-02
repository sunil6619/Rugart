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

public class TC_250_Check_topbar_changes extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"tb2Opn\"]")
	private WebElement pdptopbardropdown;
	@FindBy(xpath = "//aside[@class=\"tBox3 tboxh\"]/child::div[@class=\"text1\"]")
	private WebElement shapetopbar;
	@FindBy(xpath = "//div[@class=\"tbr2Cls\"]")
	private WebElement close;
	@FindBy(xpath = "//div[@id=\"designShape_msdd\"]")
	private WebElement rugshapedropdown;
	@FindBy(xpath = "//li[@title=\"round\"]")
	private WebElement roundshape;

	public  TC_250_Check_topbar_changes () {
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
	public void topbar_changes() throws InterruptedException {

		Thread.sleep(1000);
		pagedown();
		pdptopbardropdown.click();
		Thread.sleep(1000);
		String expected=shapetopbar.getText();
		Assert.assertEquals("Rectangle", expected);
		close.click();
		rugshapedropdown.click();
		Thread.sleep(1000);
		roundshape.click();
		Thread.sleep(1000);
		pagedown();
		pdptopbardropdown.click();
		Thread.sleep(1000);
		expected=shapetopbar.getText();
		Assert.assertEquals("Round", expected);



	}
	//	TC_250_Check_topbar_changes ob;
	//
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_250_Check_topbar_changes ();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_topbar_changes() throws InterruptedException, AWTException {
		TC_250_Check_topbar_changes ob= new TC_250_Check_topbar_changes ();
		ob.clickoncollection();
		ob.topbar_changes();
		Log.info("Clicking on collection FOF and checking PDP top bar changes");
	}

}
