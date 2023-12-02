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

public class TC_153_Check_price_changes_when_rug_shape_changed extends Base {

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"designShape_msdd\"]")
	private WebElement rugshapedropdown;
	@FindBy(xpath = "//li[@title=\"diamond\"]")
	private WebElement diamondshape;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//li[@title=\"round\"]")
	private WebElement roundshape;
	@FindBy(xpath = "//span[@id=\"rug_price\"]")
	private WebElement rugprice;

	public TC_153_Check_price_changes_when_rug_shape_changed() {
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
	public void changeshapepricechanges() throws InterruptedException, AWTException {
		//		zoomin();
		Thread.sleep(2000);
		widthft.click();
		widthft.sendKeys("6");
		Thread.sleep(1000);
		lgthft.sendKeys("8");
		Thread.sleep(3000);
		String text=rugprice.getText();
		System.out.println(text);
		Assert.assertEquals("$1728",text);
		pageup();
		rugshapedropdown.click();
		diamondshape.click();
		Thread.sleep(2000);
		String text1=rugprice.getText();
		System.out.println(text1);
		Assert.assertEquals("$2592",text1);
		if(text!=text1){

			System.out.println("Price changed when rug shape changed from rec to diamond");
		}
		else {
			System.out.println("Price is not changing");
		}
		//		pageup();
		rugshapedropdown.click();
		roundshape.click();
		Thread.sleep(2000);
		String text2=rugprice.getText();
		System.out.println(text2);
		Assert.assertEquals("$1296",text2);
		if(text1!=text2) {

			System.out.println("Price changed when rug shape changed from diamond to round");
		}
		else {
			System.out.println("Price is not changing");
		}}
	//TC_153_Check_price_changes_when_rug_shape_changed ob;
	//@Parameters("url")
	//@BeforeTest
	//
	//public void launchurl() throws InterruptedException {
	//	getlaunchurl(getreaddata("url"));
	//	ob=new TC_153_Check_price_changes_when_rug_shape_changed();
	//}
	@Test	
	public void checkpricechangeswhen_rug_shape_changed() throws InterruptedException, AWTException {
		TC_153_Check_price_changes_when_rug_shape_changed ob= new TC_153_Check_price_changes_when_rug_shape_changed() ;
		ob.collectionfof();
		ob.changeshapepricechanges();
	}
}


