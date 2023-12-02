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

public class TC_121_Check_Scroll_Color_suggestions extends Base{
//	@Parameters ("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException  {
//		
//		getlaunchurl(getreaddata("url"));
//	}
	
	@Test

	public void check_scroll_color_sugggestions_Test() throws InterruptedException, AWTException {
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
		WebElement scrollseecolorsmsg=driver.findElement(By.xpath("//div[@class=\"mb-5 text-center scroll-more-div\"]"));
		scroll(scrollseecolorsmsg);
		String text=scrollseecolorsmsg.getText();
		Assert.assertEquals("Scroll to see more colors", text);
		System.out.println(text);
//		scrollright();
		WebElement midcolor=driver.findElement(By.xpath("//span[@id=\"630-RA-CM06\"]"));
		scroll(midcolor);
		Thread.sleep(2000);
		WebElement color=driver.findElement(By.xpath("//span[@id=\"941-RA-DS05\"]"));
		scroll(color);
		Thread.sleep(2000);
		WebElement endcolor=driver.findElement(By.xpath("//span[@id=\"1205-S-RA-Black\"]"));
		scroll(endcolor);
		
		
}}
