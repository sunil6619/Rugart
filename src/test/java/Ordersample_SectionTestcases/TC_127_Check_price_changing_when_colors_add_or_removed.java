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

public class TC_127_Check_price_changing_when_colors_add_or_removed extends Base {
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
	}
	
	@Test

	public void check_price_changed_colors_added_Test() throws InterruptedException, AWTException {
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
		WebElement pricemsg=driver.findElement(By.xpath("//div[@class=\"addsampletocart\"]/child::div[@class=\"price-box\"]"));
		String text=pricemsg.getText();
		Assert.assertEquals("You have selected 5 color samples | Order Price $ 10", text);
		System.out.println(text);
		WebElement color1=driver.findElement(By.xpath("//span[@id=\"26-RA-AC02\"]"));
		color1.click();
		WebElement color2=driver.findElement(By.xpath("//span[@id=\"62-RA-AF02\"]"));
		color2.click();
		text=pricemsg.getText();
		Assert.assertEquals("You have selected 7 color samples | Order Price $ 14", text);
		System.out.println(text);
		WebElement color3=driver.findElement(By.xpath("//span[@id=\"280-RA-BD04\"]"));
		color3.click();
		WebElement color4=driver.findElement(By.xpath("//span[@id=\"194-RA-AQ02\"]"));
		color4.click();
		text=pricemsg.getText();
		Assert.assertEquals("You have selected 9 color samples | Order Price $ 18", text);
		System.out.println(text);
}}
