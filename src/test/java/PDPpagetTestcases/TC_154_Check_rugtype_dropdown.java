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

public class TC_154_Check_rugtype_dropdown extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//p[text()='Select your rug type ']")
	private WebElement rugtype;
	@FindBy(xpath = "//span[contains(text(),'Hand Tufted')]/parent::div")
    private WebElement handtufted;
	@FindBy(xpath = "//div[@class=\"select weavingtype\"]")
    private WebElement rugtypedropdown;
	@FindBy (xpath = "//li[@id=\"HandKnotted\"]")
	private WebElement handknotteddropdown;
	@FindBy (xpath = "//li[@id=\"HandTufted\"]")
	private WebElement handtufteddropdown;
	
	public TC_154_Check_rugtype_dropdown () {
		PageFactory.initElements(driver, this);
	}
	
	public void collectionfof() throws InterruptedException, AWTException {
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		 Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
	}
	public void rugtypedropdown() throws InterruptedException {
		String text=rugtype.getText();
		Assert.assertEquals("SELECT YOUR RUG TYPE", text);
		rugtypedropdown.click();
		Thread.sleep(1000);
		text=handtufteddropdown.getText();
		Assert.assertEquals("Hand Tufted",text);
		rugtypedropdown.click();
		handknotteddropdown.isDisplayed();
		Assert.assertTrue(true);	
		
	}
	
	TC_154_Check_rugtype_dropdown ob;
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_154_Check_rugtype_dropdown();
	}
		
	@Test
	
	public void clickrugtypedropdown() throws InterruptedException, AWTException {
		ob.collectionfof();
		ob.rugtypedropdown();
	}
	
}
