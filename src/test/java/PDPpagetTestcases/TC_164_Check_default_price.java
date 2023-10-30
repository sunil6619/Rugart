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

public class TC_164_Check_default_price extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"pdp-summary priceValue\"]/descendant::span[@class=\"price\"]")
	private WebElement rugprice;
	
	
	public TC_164_Check_default_price() {
		PageFactory.initElements(driver,this);
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
	//checking default rug price
	public void checkdefaultrugprice() throws InterruptedException {
//		pagedown();
		String price=rugprice.getText();
		Assert.assertEquals("$0",price);
	}
	TC_164_Check_default_price ob;
	@Parameters("url")
	@BeforeTest
	
	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_164_Check_default_price();	
	}
	
	@Test
	
	public void check_defaultrugprice() throws InterruptedException, AWTException {
		ob.clickoncollectionfof();
		ob.checkdefaultrugprice();
	}
}
