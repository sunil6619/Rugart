package Ordersample_SectionTestcases;

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

public class TC_162_Check_order_samples_12inches_feet_increases  extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//span[contains(text(),'Order Yarn Color Samples')]")
	private WebElement ordersamples;
	@FindBy(xpath = "//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"width[inch]\"]")
    private WebElement widthinch;	
	@FindBy(xpath = "//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"length[inch]\"]")
    private WebElement lgthinch;
	@FindBy(xpath = "//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"width[feet]\"]")
    private WebElement widthft;
	@FindBy(xpath = "//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"length[feet]\"]")
    private WebElement lgthft;
	
	
	
	public TC_162_Check_order_samples_12inches_feet_increases() {
		PageFactory.initElements(driver, this);
	}
	//clicking on collections field of flowers
	public void clickoncollectionfof() throws InterruptedException, AWTException {
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		 Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
	}
	//checking 12 inches are entered then feet value increases to 1
	public void ordersampples_if_inches_equals_12_feet_increases() throws InterruptedException {
		ordersamples.click();
		Thread.sleep(2000);
		widthinch.sendKeys("12");
		String text=widthft.getAttribute("value");
		Assert.assertEquals("1",text);
		widthinch.clear();
		widthinch.sendKeys("12");
		text=widthft.getAttribute("value");
		Assert.assertEquals("2",text);
		
		
		
	}
	
//	@Parameters("url")
//	@BeforeTest
//	
//	public void launchurl() throws InterruptedException {
//		getlaunchurl(getreaddata("url"));
//		ob=new TC_162_Check_order_samples_12inches_feet_increases();	
//	}
	@Test
	public void ifinches_equals_12_feet_increases() throws InterruptedException, AWTException {
		TC_162_Check_order_samples_12inches_feet_increases ob= new TC_162_Check_order_samples_12inches_feet_increases();
		ob.clickoncollectionfof();
		ob.ordersampples_if_inches_equals_12_feet_increases();
	}
	
}
