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

public class TC_176_Check_delivery_time_when_rug_type_changed extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/descendant::img[@alt=\"Flatweaves\"]")
	private WebElement flatweaves;
	@FindBy(xpath = "//div[@class=\"select weavingtype\"]")
	private WebElement rugtypedropdown;
	@FindBy(xpath = "//span[contains(text(),'Hand Tufted')]/parent::div")
	private WebElement handtufted;
	@FindBy (xpath = "//li[@id=\"HandKnotted\"]")
	private WebElement handknotteddropdown;
	@FindBy (xpath = "//li[@id=\"Flatweave\"]")
	private WebElement flatweavedropdown;
	@FindBy (xpath = "//li[@id=\"Outdoor\"]")
	private WebElement outdoordropdown;
	@FindBy (xpath = "//li[@id=\"HandTufted\"]")
	private WebElement handtufteddropdown;
	@FindBy(xpath = "//div[@class=\"pdp-top-bar-item\"]/descendant::span")
	private WebElement pdptopbardeliverytime;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//div[@class=\"select weavingtype\"]/child::span[contains(text(),'Hand Knotted')]")
	private WebElement selectedhandknotted;
	@FindBy(xpath = "//div[@class=\"select weavingtype\"]/child::span[contains(text(),'Hand Tufted')]")
	private WebElement selectedhandtufted;
	@FindBy(xpath = "//div[@class=\"select weavingtype\"]/child::span[contains(text(),'Outdoor')]")
	private WebElement selectedoutdoor;
	
	public TC_176_Check_delivery_time_when_rug_type_changed() {
		PageFactory.initElements(driver, this);
	}

	public void clickoncollection() throws InterruptedException, AWTException {
		mousehover(collection);
		Thread.sleep(1000);
		flatweaves.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(4);
		first.click();
		zoomin();
	}
	
	public void deliverytime_rugtype_is_changed() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		pageup();
		rugtypedropdown.click();
		Thread.sleep(2000);
		flatweavedropdown.click();
		String selectedrugtype=flatweavedropdown.getText();
		Assert.assertEquals("Flatweave",selectedrugtype);
		pagedown();
		String actualdeliverytypetopbar=pdptopbardeliverytime.getText();
		Assert.assertEquals("3 Weeks",actualdeliverytypetopbar);
		pageup();
		rugtypedropdown.click();
		Thread.sleep(2000);
		handknotteddropdown.click();
		Thread.sleep(1000);
		selectedrugtype=selectedhandknotted.getText();
		Assert.assertEquals("Hand Knotted",selectedrugtype);
		pagedown();
		actualdeliverytypetopbar=pdptopbardeliverytime.getText();
		Assert.assertEquals("6 Weeks",actualdeliverytypetopbar);
//		pageup();
		Thread.sleep(1000);
		rugtypedropdown.click();
		Thread.sleep(2000);
//		pagedown();
		handtufteddropdown.click();
		Thread.sleep(1000);
		selectedrugtype=selectedhandtufted.getText();
		Assert.assertEquals("Hand Tufted",selectedrugtype);
		pagedown();
		Thread.sleep(2000);
		actualdeliverytypetopbar=pdptopbardeliverytime.getText();
		Assert.assertEquals("3 Weeks",actualdeliverytypetopbar);
//		pageup();
		Thread.sleep(1000);
		rugtypedropdown.click();
		Thread.sleep(2000);
//		pagedown();
		outdoordropdown.click();
		Thread.sleep(1000);
		selectedrugtype=selectedoutdoor.getText();
		Assert.assertEquals("Outdoor",selectedrugtype);
		pagedown();
		Thread.sleep(2000);
		actualdeliverytypetopbar=pdptopbardeliverytime.getText();
		Assert.assertEquals("3 Weeks",actualdeliverytypetopbar);
		
		

	}
	
//	TC_176_Check_delivery_time_when_rug_type_changed ob;
//	@Parameters ("url")
//	@BeforeTest
//
//	public void launchurl() throws InterruptedException {
//		getlaunchurl(getreaddata("url"));
//		ob= new TC_176_Check_delivery_time_when_rug_type_changed();
//	}

	@Test

	public void check_delivery_time_when_rugtype_changed() throws InterruptedException, AWTException {
		TC_176_Check_delivery_time_when_rug_type_changed ob= new TC_176_Check_delivery_time_when_rug_type_changed();
		ob.clickoncollection();
		ob.deliverytime_rugtype_is_changed();


	}

}
