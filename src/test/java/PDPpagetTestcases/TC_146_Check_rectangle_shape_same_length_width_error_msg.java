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

public class TC_146_Check_rectangle_shape_same_length_width_error_msg  extends Base{
	
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"designShape_msdd\"]")
	private WebElement rugshapedropdown;
	@FindBy(xpath = "//p[text()='Select your rug shape ']")
	private WebElement rugshape;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//div[contains(text(),'Length needs')]")
	private WebElement errormsg ;
//	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
//	private WebElement ftinput ;
	
	public TC_146_Check_rectangle_shape_same_length_width_error_msg(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		

		getlaunchurl(getreaddata("url"));
		
	}
	@Test

	public void check_rugshapes_verify_title_Test() throws InterruptedException, AWTException {
		TC_146_Check_rectangle_shape_same_length_width_error_msg ob=new TC_146_Check_rectangle_shape_same_length_width_error_msg();
		Thread.sleep(1000);
		 mousehover(ob.collection);
		 Thread.sleep(1000);
		 ob.fof.click();
		 Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
		Thread.sleep(2000);
//		WebElement rugshape=driver.findElement(By.xpath("//p[text()='Select your rug shape ']"));
		String text=ob.rugshape.getText();
		Assert.assertEquals("SELECT YOUR RUG SHAPE",text);
//		WebElement rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
//		ob.rugshapedropdown.click();
		ob.widthft.click();
		ob.widthft.sendKeys("6");
		ob.lgthft.click();
		ob.lgthft.sendKeys("6");
		Thread.sleep(1000);
		text=ob.errormsg.getText();
		Assert.assertEquals("Length needs to be larger than the Width", text);
		

}}
