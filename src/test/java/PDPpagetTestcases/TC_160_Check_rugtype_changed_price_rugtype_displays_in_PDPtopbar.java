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

public class TC_160_Check_rugtype_changed_price_rugtype_displays_in_PDPtopbar extends Base {
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
	@FindBy(xpath = "//div[@class=\"pdp-top-bar-item\"]/child::div[contains(text(),'Hand Tufted')]")
	private WebElement rugtypetopbar;
	@FindBy(xpath = "//div[@class=\"pdp-top-bar-item price priceValue txtBx\"]/descendant::div[@class=\"price-box d-flex\"]")
	private WebElement rugpricetopbar;
	@FindBy(xpath = "//div[@class=\"pdp-top-bar-item\"]/child::div[contains(text(),'Hand Knotted')]")
	private WebElement rugtypehandknottedtopbar;


	public TC_160_Check_rugtype_changed_price_rugtype_displays_in_PDPtopbar() {
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
		String text=rugtypetopbar.getText();
		Assert.assertEquals("Hand Tufted", text);
		text=rugpricetopbar.getText();
		Assert.assertEquals("$1728", text); 
		pageup();
		rugtypedropdown.click();
		Thread.sleep(1000);
		handknotteddropdown.click();
		Thread.sleep(2000);
		pagedown();
		text=rugtypehandknottedtopbar.getText();
		Assert.assertEquals("Hand Knotted",text);
		text=rugpricetopbar.getText();
		Assert.assertEquals("$4368", text);	
	}
	//	TC_160_Check_rugtype_changed_price_rugtype_displays_in_PDPtopbar ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//	
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_160_Check_rugtype_changed_price_rugtype_displays_in_PDPtopbar();
	//	}
	//	
	@Test

	public void rugtypechangedtopbardisplays_price_rugtype() throws InterruptedException, AWTException {
		TC_160_Check_rugtype_changed_price_rugtype_displays_in_PDPtopbar ob= new TC_160_Check_rugtype_changed_price_rugtype_displays_in_PDPtopbar() ;
		ob.clickoncollectionfof();
		ob.rugtypechanged_price_changes();

	}
}