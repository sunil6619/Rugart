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

public class TC_216_Check_PDP_top_bar_dropdown_required_details extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"tb2Opn\"]")
	private WebElement pdptopbardropdown;
	@FindBy(xpath = "//span[contains(text(),'Product')]")
	private WebElement productid;
	@FindBy(xpath = "//span[contains(text(),'Colors')]")
	private WebElement colors;
	@FindBy(xpath = "//div[@class=\"brdrClm bclm3\"]/descendant::span[contains(text(),'Rug Type')]")
	private WebElement rugtype;
	@FindBy(xpath = "//div[@class=\"brdrClm bclm3\"]/descendant::span[contains(text(),'Size')]")
	private WebElement size;
	@FindBy(xpath = "//div[@class=\"brdrClm bclm3\"]/descendant::span[contains(text(),'Shape')]")
	private WebElement shape;
	@FindBy(xpath = "//div[@class=\"brdrClm bclm4\"]/descendant::span[contains(text(),' Pile Height')]")
	private WebElement pileheight;
	@FindBy(xpath = "//div[@class=\"brdrClm bclm4\"]/descendant::span[contains(text(),'Qty.')]")
	private WebElement qnty;
	@FindBy(xpath = "//div[@class=\"vline1\"]")
	private WebElement rugprice;


	public  TC_216_Check_PDP_top_bar_dropdown_required_details () {
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

	public void topbar_details() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		pdptopbardropdown.click();
		Thread.sleep(1000);
		Boolean presentstate=productid.isDisplayed();
		Assert.assertTrue(presentstate);
		presentstate=colors.isDisplayed();
		Assert.assertTrue(presentstate);
		presentstate=rugtype.isDisplayed();
		Assert.assertTrue(presentstate);
		presentstate=size.isDisplayed();
		Assert.assertTrue(presentstate);
		presentstate=shape.isDisplayed();
		Assert.assertTrue(presentstate);
		presentstate=pileheight.isDisplayed();
		Assert.assertTrue(presentstate);
		presentstate=qnty.isDisplayed();
		Assert.assertTrue(presentstate);
		presentstate=rugprice.isDisplayed();
		Assert.assertTrue(presentstate);

	}
	//	TC_216_Check_PDP_top_bar_dropdown_required_details  ob;
	////	@Parameters ("url")
	//	@BeforeTest
	//
	//	
	//	
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_216_Check_PDP_top_bar_dropdown_required_details ();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_topbar_dropdown_details() throws InterruptedException, AWTException {
		TC_216_Check_PDP_top_bar_dropdown_required_details  ob= new TC_216_Check_PDP_top_bar_dropdown_required_details ();
		ob.clickoncollection();
		ob.topbar_details();
		Log.info("Clicking on collection FOF and checking PDP top bar dropdown Details");
	}


}
