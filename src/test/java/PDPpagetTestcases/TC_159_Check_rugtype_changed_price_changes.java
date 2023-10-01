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

public class TC_159_Check_rugtype_changed_price_changes extends Base {
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"select weavingtype\"]")
    private WebElement rugtypedropdown;
	@FindBy(xpath = "//span[contains(text(),'Hand Tufted')]/parent::div")
    private WebElement handtufted;
	@FindBy (xpath = "//li[@id=\"HandKnotted\"]")
	private WebElement handknotteddropdown;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//div[@class=\"pdp-summary priceValue\"]/child::div")
	private WebElement rugprice;
	
	public TC_159_Check_rugtype_changed_price_changes() {
		PageFactory.initElements(driver, this);
	}
	
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
	
	public void rugtypechanged_price_changes() throws InterruptedException {	
		widthft.sendKeys("6");
		lgthft.sendKeys("8");
		Thread.sleep(1000);
		String text=rugprice.getText();
		Assert.assertEquals("$1728",text);
		pageup();
		rugtypedropdown.click();
		Thread.sleep(1000);
		handknotteddropdown.click();
		Thread.sleep(2000);
		String text1=rugprice.getText();
		Assert.assertEquals("$4368",text1);
		if(text!=text1) {
			System.out.println("Price is changed");
		}
		else {
			System.out.println("Price is not changed");
		}	
	}
	
	TC_159_Check_rugtype_changed_price_changes ob;
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_159_Check_rugtype_changed_price_changes();
	}
	
	@Test
	
	public void rugtypechangedpricechanges() throws InterruptedException, AWTException {
		ob.clickoncollectionfof();
		ob.rugtypechanged_price_changes();
		
		
	}
}
