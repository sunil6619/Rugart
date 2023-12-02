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

public class TC_130_Check_in_ordersample_range_cm extends Base{
//	@Parameters ("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException {
//		
//		getlaunchurl(getreaddata("url"));
//	}
	
	@Test

	public void check_ordersample_range_cm_Test() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		 WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		 mousehover(collection);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		 Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
		WebElement ordersamples=driver.findElement(By.xpath("//span[contains(text(),'Order Yarn Color Samples')]"));
		ordersamples.click();
		Thread.sleep(2000);
		WebElement cm=driver.findElement(By.xpath("//div[@class=\"rug-size-box cs-rug-size-box\"]/descendant::label[@for=\"cs_cm\"]"));
		cm.click();
		WebElement widthcm=driver.findElement(By.xpath("//div[@class=\"rug-size cs_cm\"]/descendant::input[@name=\"width[cm]\"]"));
		widthcm.sendKeys("30");
		Thread.sleep(1000);
		WebElement lengthcm=driver.findElement(By.xpath("//div[@class=\"rug-size cs_cm\"]/descendant::input[@name=\"length[cm]\"]"));
		lengthcm.sendKeys("40");
		Thread.sleep(2000);
		WebElement errormsg=driver.findElement(By.xpath("//div[@class=\"cs-size-shape-error unit-error mt-1\"]"));
		String text=errormsg.getText();
		Assert.assertEquals("Please insure that width and length is at least 50 cm",text);
		
		  
}
}