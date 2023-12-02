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

public class TC_158_Check_handknot_rugtype_startingprice_changes extends Base {
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
	@FindBy(xpath = "//span[contains(text(),'$36')]/ancestor::div[@class=\"price-box start_price float-right\"]")
	private WebElement startingfromtufted;
	@FindBy(xpath = "//span[contains(text(),'$91')]/ancestor::div[@class=\"price-box start_price float-right\"]")
	private WebElement startingfromknotted;

	public TC_158_Check_handknot_rugtype_startingprice_changes() {
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

	public void startingpricechange() throws InterruptedException {
		String text=startingfromtufted.getText();
		Assert.assertEquals("$36 ft2", text);	
		rugtypedropdown.click();
		Thread.sleep(1000);
		handknotteddropdown.click();
		Thread.sleep(2000);
		text=startingfromknotted.getText();
		Assert.assertEquals("$91 ft2", text);	
	}

	//	TC_158_Check_handknot_rugtype_startingprice_changes ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//	
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_158_Check_handknot_rugtype_startingprice_changes ();	
	//}
	@Test
	public void checkstartingpricechange_rugtype_changed() throws InterruptedException, AWTException {
		TC_158_Check_handknot_rugtype_startingprice_changes ob= new TC_158_Check_handknot_rugtype_startingprice_changes ();
		ob.clickoncollectionfof();
		ob.startingpricechange();
	}


}
