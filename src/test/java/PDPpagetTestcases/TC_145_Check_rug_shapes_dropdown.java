package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_145_Check_rug_shapes_dropdown extends Base{
	
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"designShape_msdd\"]")
	private WebElement rugshapedropdown;

	
	public TC_145_Check_rug_shapes_dropdown(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		

		getlaunchurl(getreaddata("url"));
		
	}
	@Test

	public void check_rugshapes_verify_title_Test() throws InterruptedException, AWTException {
		TC_145_Check_rug_shapes_dropdown ob=new TC_145_Check_rug_shapes_dropdown();
		Thread.sleep(1000);
//		 WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		 mousehover(ob.collection);
		 Thread.sleep(1000);
		 ob.fof.click();
//		 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		 Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
		Thread.sleep(2000);
		WebElement rugshape=driver.findElement(By.xpath("//p[text()='Select your rug shape ']"));
		String text=rugshape.getText();
		Assert.assertEquals("SELECT YOUR RUG SHAPE",text);
//		WebElement rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
		ob.rugshapedropdown.click();
}}
