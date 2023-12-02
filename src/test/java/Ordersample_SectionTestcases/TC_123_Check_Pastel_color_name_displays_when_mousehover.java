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

public class TC_123_Check_Pastel_color_name_displays_when_mousehover extends Base {
//	@Parameters ("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException  {
//		
//		getlaunchurl(getreaddata("url"));
//	}
//	
	@Test

	public void check_pastel_color_name_displays_mousehover_Test() throws InterruptedException, AWTException {
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
		WebElement pastelcolors=driver.findElement(By.xpath("//a[@id=\"Pastel-tab-sample-color\"]"));
		pastelcolors.click();
		Thread.sleep(2000);
		WebElement color1=driver.findElement(By.xpath("//span[@id=\"14-RA-14-N\"]"));
		String tooltip=color1.getAttribute("title");
		Assert.assertEquals("RA-14-N", tooltip);
		System.out.println(tooltip);
		Thread.sleep(3000);
		WebElement color2=driver.findElement(By.xpath("//span[@id=\"12-RA-12-N\"]"));
		tooltip=color2.getAttribute("title");
		Assert.assertEquals("RA-12-N", tooltip);
		System.out.println(tooltip);
		Thread.sleep(3000);
		WebElement color3=driver.findElement(By.xpath("//span[@id=\"28-RA-28-N\"]"));
		tooltip=color3.getAttribute("title");
		Assert.assertEquals("RA-28-N", tooltip);
		System.out.println(tooltip);
		Thread.sleep(3000);
		WebElement color4=driver.findElement(By.xpath("//span[@id=\"41-RA-41-N\"]"));
		tooltip=color4.getAttribute("title");
		Assert.assertEquals("RA-41-N", tooltip);
		System.out.println(tooltip);
		
}}
