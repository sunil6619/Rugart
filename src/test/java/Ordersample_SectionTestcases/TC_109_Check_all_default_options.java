package Ordersample_SectionTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_109_Check_all_default_options extends Base {
//	@Parameters ("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException {
//		
//		getlaunchurl(getreaddata("url"));
//	}
	
	@Test

	public void check_all_default_options_Test() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Collection')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='SHOP THE COLLECTION']")).click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
		WebElement ordersamples=driver.findElement(By.xpath("//span[contains(text(),'Order Yarn Color Samples')]"));
		String text=ordersamples.getText();
		Assert.assertEquals("Order Yarn Color Samples", text);
		Thread.sleep(1000);
		WebElement colorsugg=driver.findElement(By.xpath("//p[contains(text(),'COLOR SUGGESTIONS FOR THIS RUG')]"));
		colorsugg.isDisplayed();
		Assert.assertTrue(true);
		WebElement morecolors=driver.findElement(By.xpath("//a[@class=\"suggestions-menu\"]"));
		morecolors.isDisplayed();
		Assert.assertTrue(true);
		WebElement selectrugshape=driver.findElement(By.xpath("//p[text()='Select your rug shape ']"));
		text=selectrugshape.getText();
		Assert.assertEquals("SELECT YOUR RUG SHAPE", text);
		WebElement rectangleshape=driver.findElement(By.xpath("//span[contains(text(),'rectangle')]/parent::span[@class=\"ddTitleText \"]"));
		text=rectangleshape.getText();
		Assert.assertEquals("Rectangle", text);
		WebElement selectrugtype=driver.findElement(By.xpath("//p[text()='Select your rug type ']"));
		text=selectrugtype.getText();
		Assert.assertEquals("SELECT YOUR RUG TYPE", text);
		WebElement handtufted=driver.findElement(By.xpath("//span[text()='Hand Tufted']/parent::div[@class=\"select weavingtype\"]"));
		text=handtufted.getText();
		Assert.assertEquals("Hand Tufted", text);
		WebElement owncolormaterials=driver.findElement(By.xpath("//p[text()='Select your own colors and materials ']"));
	    text=owncolormaterials.getText();
	    Assert.assertEquals("SELECT YOUR OWN COLORS AND MATERIALS", text);
	    List<WebElement> materials=driver.findElements(By.xpath("//span[text()='Pure Wool']"));
	    first=materials.get(0);
	    text=first.getText();
	    Assert.assertEquals("Pure Wool", text);
	    WebElement size=driver.findElement(By.xpath("//p[text()='Specify your size ']"));
	    text=size.getText();
	    Assert.assertEquals("SPECIFY YOUR SIZE", text);
	    WebElement feet=driver.findElement(By.xpath("//label[@for=\"feet\"]"));
	    text=feet.getText();
	    Assert.assertEquals("Feet and inches", text);
	    WebElement cm=driver.findElement(By.xpath("//label[@for=\"cm\"]"));
	    text=cm.getText();
	    Assert.assertEquals("CM", text);
	    WebElement pileheight=driver.findElement(By.xpath("//p[text()='Pile Height ']"));
	    text=pileheight.getText();
	    Assert.assertEquals("PILE HEIGHT", text);
	    WebElement p1=driver.findElement(By.xpath("//label[text()='0.5-0.6 inch']"));
	    text=p1.getText();
	    Assert.assertEquals("0.5-0.6 inch", text);
	    WebElement p2=driver.findElement(By.xpath("//label[text()='0.6-0.7 inch']"));
	    text=p2.getText();
	    Assert.assertEquals("0.6-0.7 inch", text);
	    WebElement p3=driver.findElement(By.xpath("//label[text()='0.7-0.9 inch']"));
	    text=p3.getText();
	    Assert.assertEquals("0.7-0.9 inch", text);
	    WebElement qty=driver.findElement(By.xpath("//span[text()='Qty']"));
	    text=qty.getText();
	    Assert.assertEquals("QTY", text);
	    WebElement rugprice=driver.findElement(By.xpath("//p[text()='YOUR RUG PRICE']"));
	    rugprice.isDisplayed();
	    Assert.assertTrue(true);
	    WebElement addtocart=driver.findElement(By.xpath("//span[text()='Add To Cart']"));
	    addtocart.isDisplayed();
	    Assert.assertTrue(true);
	    WebElement ordersample=driver.findElement(By.xpath("//span[@class=\"button open_sample_modal\"]"));
	    ordersample.isDisplayed();
	    Assert.assertTrue(true);
	    
	    
	    
	}
}
