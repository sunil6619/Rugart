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

public class TC_201_Check_pile_height_inch_mm_when_feet_cm_selected extends Base {

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"cm\"]")
	private WebElement radiocm;

	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"feet\"]")
	private WebElement feet;
	@FindBy(xpath = "//label[contains(text(),'0.5-0.6 inch')]")
	private WebElement inchft;
	@FindBy(xpath = "//label[contains(text(),'12-14mm')]")
	private WebElement mm;
	
	public  TC_201_Check_pile_height_inch_mm_when_feet_cm_selected() {
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
	
	public void pile_height_inch_mm() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		String expectedsizetype=feet.getText();
		Assert.assertEquals("Feet and inches",expectedsizetype);
		String pileheighttype=inchft.getText();
		Assert.assertEquals("0.5-0.6 inch",pileheighttype);
		radiocm.click();
		Thread.sleep(1000);
		radiocm.getText();
		expectedsizetype=radiocm.getText();
		Assert.assertEquals("CM",expectedsizetype);
		pileheighttype=mm.getText();
		Assert.assertEquals("12-14mm",pileheighttype);
		
	}
//	TC_201_Check_pile_height_inch_mm_when_feet_cm_selected ob;
//	@Parameters ("url")
//	@BeforeTest
//
//	public void launchurl() throws InterruptedException {
//		getlaunchurl(getreaddata("url"));
//		ob= new TC_201_Check_pile_height_inch_mm_when_feet_cm_selected();
//		Log.info("Chrome browser and url launch");
//	}

	@Test

	public void check_size_cm_range() throws InterruptedException, AWTException {
		TC_201_Check_pile_height_inch_mm_when_feet_cm_selected ob= new TC_201_Check_pile_height_inch_mm_when_feet_cm_selected() ;
		ob.clickoncollection();
		ob.pile_height_inch_mm();
		Log.info("Clicking on collection FOF and checking pile height");
	}

	
}
