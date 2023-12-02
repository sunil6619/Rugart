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

public class TC_120_Check_search_functionality_Core_colors extends Base{
//
//	@Parameters ("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException {
//		
//		getlaunchurl(getreaddata("url"));
//	}
	
	@Test

	public void check_search_functionality_core_colors_Test() throws InterruptedException, AWTException {
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
		WebElement searchbox=driver.findElement(By.xpath("//input[@class=\"form-control filter-input\"]"));
		searchbox.sendKeys("RA-BQ05");
		String tooltip=driver.findElement(By.xpath("//span[@id=\"437-RA-BQ05\"]")).getAttribute("title");
		Assert.assertEquals("RA-BQ05", tooltip);
		Thread.sleep(1000);
		searchbox.clear();
		searchbox.sendKeys("RA-BC11");
		tooltip=driver.findElement(By.xpath("//span[@id=\"275-RA-BC11\"]")).getAttribute("title");
		Assert.assertEquals("RA-BC11", tooltip);
}}
