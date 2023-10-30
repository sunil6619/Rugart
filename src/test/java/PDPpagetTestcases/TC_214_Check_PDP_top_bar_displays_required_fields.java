package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import resources.Base;

public class TC_214_Check_PDP_top_bar_displays_required_fields extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"pdp-top-bar-item\"]/descendant::img")
	private WebElement logo;
	@FindBy(xpath = "//div[text()='Rug Type']")
	private WebElement rugtypetopbar;
	@FindBy(xpath = "//div[text()='Material']")
	private WebElement materialtopbar;
	@FindBy(xpath = "//div[text()='Size']")
	private WebElement sizetopbar;
	@FindBy(xpath = "//div[contains(text(),' Pile Height')]")
	private WebElement pileheighttopbar;
	@FindBy(xpath = "//div[text()='Shipment']")
	private WebElement shipmenttopbar;
	@FindBy(xpath = "//div[text()='Starting From']")
	private WebElement startpricetopbar;
	@FindBy(xpath = "//div[text()='Your Rug Price']")
    private WebElement rugpricetopbar;	
	

	public  TC_214_Check_PDP_top_bar_displays_required_fields () {
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

	public void scrolldown() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Boolean topbarlogo = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", logo);
		if (topbarlogo) {
			System.out.println("Logo present on topBar");
		}
		else {
			System.out.println("Logo not present");
		}
		Boolean presentstate=rugtypetopbar.isDisplayed();
		Assert.assertTrue(presentstate);
		presentstate=materialtopbar.isDisplayed();
		Assert.assertTrue(presentstate);
		presentstate=sizetopbar.isDisplayed();
		Assert.assertTrue(presentstate);
		presentstate=pileheighttopbar.isDisplayed();
		Assert.assertTrue(presentstate);
		presentstate=shipmenttopbar.isDisplayed();
		Assert.assertTrue(presentstate);
		presentstate=startpricetopbar.isDisplayed();
		Assert.assertTrue(presentstate);
		presentstate=rugpricetopbar.isDisplayed();
		Assert.assertTrue(presentstate);
       


	}
	TC_214_Check_PDP_top_bar_displays_required_fields  ob;
//	@Parameters ("url")
//	@BeforeTest

	
	
//	public void launchurl() throws InterruptedException {
//		getlaunchurl(getreaddata("url"));
//		ob= new TC_214_Check_PDP_top_bar_displays_required_fields ();
//		Log.info("Chrome browser and url launch");
//	}

	@Test

	public void check_top_bar_displays_required_details() throws InterruptedException, AWTException {
		ob= new TC_214_Check_PDP_top_bar_displays_required_fields ();
		ob.clickoncollection();
		ob.scrolldown();
		test=reports.createTest("Check PDP top bar details");
		Log.info("Clicking on collection FOF and checking PDP top bar details");
	}
	
	@AfterMethod
	public void  getTestResult(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAIL ", ExtentColor.RED));
			//if test failed then to get detials
			test.fail(result.getThrowable());
			
		}
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASS ", ExtentColor.GREEN));
		}
		
	}


}
