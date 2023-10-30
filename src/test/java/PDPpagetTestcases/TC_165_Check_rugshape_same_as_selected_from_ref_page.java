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

public class TC_165_Check_rugshape_same_as_selected_from_ref_page extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//span[contains(text(),'Round')]")
	private WebElement roundshape; 
	@FindBy(xpath = "//span[@class=\"ddTitleText \"]/child::span[contains(text(),'round')]")
	private WebElement rugshape;
	
	public TC_165_Check_rugshape_same_as_selected_from_ref_page() {
		PageFactory.initElements(driver,this);
	}
	//clicking on collections field of flowers
	public void clickoncollectionfof() throws InterruptedException, AWTException {
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		roundshape.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
	}
	//verifying round rugshape from rugshape dropdown and page title
	public void check_rugshape_same_as_selected_from_ref_page() throws InterruptedException {
		Thread.sleep(1000);
		String rugshapefield=rugshape.getText();
		Assert.assertEquals("Round",rugshapefield);
		String actualtitle=driver.getTitle();
		String expectedtitle="Zinia Field of Flowers Round Hand Tufted Handmade Custom Rug | Rug Artisan";
		Assert.assertEquals(expectedtitle,actualtitle);
	}
	TC_165_Check_rugshape_same_as_selected_from_ref_page ob;
	
	@Parameters("url")

	@BeforeTest
	
	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_165_Check_rugshape_same_as_selected_from_ref_page();	
	}
	@Test
	public void check_rugshape_same_as_selected() throws InterruptedException, AWTException {
		ob.clickoncollectionfof();
		ob.check_rugshape_same_as_selected_from_ref_page();
	}
	
	
}
