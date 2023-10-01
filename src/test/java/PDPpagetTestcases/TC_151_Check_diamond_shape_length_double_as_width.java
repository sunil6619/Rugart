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

public class TC_151_Check_diamond_shape_length_double_as_width extends Base{

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
	@FindBy(xpath = "//label[@for=\"cm\"]")
	private WebElement cmradiobutton;
	@FindBy(xpath = "//input[@id=\"widthCmRug\"]")
	private WebElement widthcm;
	@FindBy(xpath = "//input[@id=\"lengthCmRug\"]")
	private WebElement lgthcm;
	@FindBy(xpath = "//label[@for=\"feet\"]")
	private WebElement ftradiobutton;
	@FindBy(xpath = "//button[@title=\"Buy Now\"]")
	private WebElement addtocart;
	
	public TC_151_Check_diamond_shape_length_double_as_width() {
		PageFactory.initElements(driver,this);
	}
	public void mousehovercollection() {
		mousehover(collection);
	}
	
	public void clickonfof() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		fof.click();
		 Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
			}
	public void selectshape_diamond() throws InterruptedException {
		rugshapedropdown.click();
		diamondshape.click();
		widthft.click();
		widthft.sendKeys("6");
		String text=lgthft.getAttribute("value");
		Assert.assertEquals("12",text);
		Thread.sleep(1000);
		cmradiobutton.click();
		widthcm.click();
		widthcm.sendKeys("300");
		Thread.sleep(1000);
		text=lgthcm.getAttribute("value");
		Assert.assertEquals("600",text);
		ftradiobutton.click();
		widthft.click();
		widthft.sendKeys("4");
		Thread.sleep(2000);
		pagedown();
		addtocart.click();
		text=lgthft.getAttribute("value");
		Assert.assertEquals("8",text);
		Thread.sleep(1000);
		
			}
	
	TC_151_Check_diamond_shape_length_double_as_width ob;
	
	@Parameters("url")
	@BeforeTest
	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob=new TC_151_Check_diamond_shape_length_double_as_width();
	}
	
	@Test
	public void check_diamondshape_length_gets_double() throws InterruptedException, AWTException {
	ob.mousehovercollection();
	ob.clickonfof();
	ob.selectshape_diamond();
	
}}
