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

public class TC_119_Check_core_color_name_displayed_on_leftside extends Base {

	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
	}
	
	@Test

	public void check_core_color_name_displayed_leftside_Test()throws InterruptedException, AWTException {
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
		WebElement color1=driver.findElement(By.xpath("//span[@id=\"14-RA-AB02\"]"));
		mousehover(color1);
		WebElement colorfilter=driver.findElement(By.xpath("//div[@class=\"color-filters d-flex\"]/child::span[text()='RA-AB02']"));
		String text=colorfilter.getText();
		Assert.assertEquals("RA-AB02", text);
		System.out.println(text);
		WebElement color2=driver.findElement(By.xpath("//span[@id=\"340-RA-BI04\"]"));
		mousehover(color2);
		colorfilter=driver.findElement(By.xpath("//div[@class=\"color-filters d-flex\"]/child::span[text()='RA-BI04']"));
		text=colorfilter.getText();
		Assert.assertEquals("RA-BI04", text);
		WebElement color3=driver.findElement(By.xpath("//span[@id=\"167-RA-AN11\"]"));
		mousehover(color3);
		colorfilter=driver.findElement(By.xpath("//div[@class=\"color-filters d-flex\"]/child::span[text()='RA-AN11']"));
		text=colorfilter.getText();
		Assert.assertEquals("RA-AN11", text);
		WebElement color4=driver.findElement(By.xpath("//span[@id=\"89-RA-AH05\"]"));
		mousehover(color4);
		colorfilter=driver.findElement(By.xpath("//div[@class=\"color-filters d-flex\"]/child::span[text()='RA-AH05']"));
		text=colorfilter.getText();
		Assert.assertEquals("RA-AH05", text);
}}
