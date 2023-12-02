package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import resources.Base;

public class TC_215_Check_PDP_top_bar_dropdown extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"tb2Opn\"]")
	private WebElement pdptopbardropdown;
	@FindBy(xpath = "//span[contains(text(),'Product')]")
	private WebElement productid;

	public  TC_215_Check_PDP_top_bar_dropdown () {
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
	public void pdptopbar_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		pdptopbardropdown.click();
		Boolean presentstate=productid.isDisplayed();
		Assert.assertTrue(presentstate);
	}
	//	TC_215_Check_PDP_top_bar_dropdown  ob;
	//	@Parameters ("url")
	//	@BeforeTest



	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		
	////		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_topbar_dropdown() throws InterruptedException, AWTException {
		TC_215_Check_PDP_top_bar_dropdown  ob= new TC_215_Check_PDP_top_bar_dropdown ();
		ob.clickoncollection();
		ob.pdptopbar_dropdown();
		Log.info("Clicking on collection FOF and checking PDP top bar dropdown");
		//		test=reports.createTest("Check PDP top bar dropdown");
	}
	//	@AfterMethod
	//	public void  getTestResult(ITestResult result) {
	//		if(result.getStatus()==ITestResult.FAILURE)
	//		{
	//			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAIL ", ExtentColor.RED));
	//			//if test failed then to get detials
	//			test.fail(result.getThrowable());
	//			
	//		}
	//		else if (result.getStatus()==ITestResult.SUCCESS)
	//		{
	//			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASS ", ExtentColor.GREEN));
	//		}
	//		
	//	}

}
