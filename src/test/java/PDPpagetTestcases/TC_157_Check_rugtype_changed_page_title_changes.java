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

public class TC_157_Check_rugtype_changed_page_title_changes extends Base {
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

	public TC_157_Check_rugtype_changed_page_title_changes() {
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

	public void pagetitlechanges() throws InterruptedException {
		rugtypedropdown.click();
		String text=handtufted.getText();
		Assert.assertEquals("Hand Tufted", text);
		String title=driver.getTitle();
		Assert.assertEquals("Zinia Field of Flowers Rectangle Hand Tufted Handmade Custom Rug | Rug Artisan", title);
		System.out.println(title);
		handknotteddropdown.click();
		Thread.sleep(2000);
		title=driver.getTitle();
		Assert.assertEquals("Zinia Field of Flowers Rectangle Hand Knotted Handmade Custom Rug | Rug Artisan", title);
		System.out.println(title);       
	}

	//	TC_157_Check_rugtype_changed_page_title_changes ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//	
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_157_Check_rugtype_changed_page_title_changes();	
	//	}
	@Test

	public void rugtypechangeverifypagetitle() throws InterruptedException, AWTException {
		TC_157_Check_rugtype_changed_page_title_changes ob= new TC_157_Check_rugtype_changed_page_title_changes();
		ob.clickoncollectionfof();
		ob.pagetitlechanges();
	}





}
