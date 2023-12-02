package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_152_Check_diamond_shape_length_double_as_width_colorsample extends Base {
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
	@FindBy(xpath = "//span[contains(text(),'Order Yarn Color Samples')]")
	private WebElement ordersample;
	@FindBy(xpath = "//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"length[feet]\"]")
	private WebElement lgthftsample ;
	@FindBy(xpath = "//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"width[feet]\"]")
	private WebElement widthftsample;

	public TC_152_Check_diamond_shape_length_double_as_width_colorsample() {
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

	public void diamondshapecolorsample() throws InterruptedException {
		rugshapedropdown.click();
		diamondshape.click();
		widthft.click();
		widthft.sendKeys("6");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		ordersample.click();
		Thread.sleep(2000);
		widthftsample.clear();
		Thread.sleep(1000);
		widthftsample.sendKeys("4");
		String text=lgthftsample.getAttribute("value");
		Assert.assertEquals("8",text);

	}

	//	;
	//	@Parameters ("url")
	//	@BeforeTestTC_152_Check_diamond_shape_length_double_as_width_colorsample ob
	//	
	//	public  void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob=new TC_152_Check_diamond_shape_length_double_as_width_colorsample();
	//	}

	@Test

	public void checkdiamond_shape_length_doubles_colorsample() throws InterruptedException, AWTException {
		TC_152_Check_diamond_shape_length_double_as_width_colorsample ob= new TC_152_Check_diamond_shape_length_double_as_width_colorsample();
		ob.collectionfof();
		ob.diamondshapecolorsample();
	}}
