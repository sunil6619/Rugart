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

public class TC_118_Check_Core_color_name_displays_when_mousehover extends Base{

	@Parameters ("url")
	@BeforeTest

	public void launchurl_rugartisan() throws InterruptedException {

		getlaunchurl(getreaddata("url"));
	}

	@Test

	public void check_core_color_name_displays_Test() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		mousehover(collection);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
		WebElement ordersamples=driver.findElement(By.xpath("//span[contains(text(),'Order Yarn Color Samples')]"));
		ordersamples.click();
		//		zoomin();
		Thread.sleep(2000);
		WebElement color1=driver.findElement(By.xpath("//span[@id=\"14-RA-AB02\"]"));
		String tooltip=color1.getAttribute("title");
		Assert.assertEquals("RA-AB02", tooltip);
		System.out.println(tooltip);
		Thread.sleep(3000);
		WebElement color2=driver.findElement(By.xpath("//span[@id=\"340-RA-BI04\"]"));
		tooltip=color2.getAttribute("title");
		Assert.assertEquals("RA-BI04", tooltip);
		System.out.println(tooltip);
		Thread.sleep(3000);
		WebElement color3=driver.findElement(By.xpath("//span[@id=\"167-RA-AN11\"]"));
		tooltip=color3.getAttribute("title");
		Assert.assertEquals("RA-AN11", tooltip);
		System.out.println(tooltip);
		Thread.sleep(3000);
		WebElement color4=driver.findElement(By.xpath("//span[@id=\"89-RA-AH05\"]"));
		tooltip=color4.getAttribute("title");
		Assert.assertEquals("RA-AH05", tooltip);
		System.out.println(tooltip);



	}}
