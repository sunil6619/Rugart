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

public class TC_116_Check_able_to_remove_colors extends Base{
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
	}
	
	@Test

	public void check_able_to_remove_colors_Test() throws InterruptedException, AWTException {
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
		WebElement remaincolorsample=driver.findElement(By.xpath("//span[@class=\"remaincolor\"]"));
		String text=remaincolorsample.getText();
		System.out.println("Remaining color sample to choose: "+text);
		WebElement closecolor1=driver.findElement(By.xpath("//span[@class=\"selected-colors RA-BT03\"]//descendant::span/img[@alt=\"close-icon\"]"));
		closecolor1.click();
		WebElement closecolor2=driver.findElement(By.xpath("//span[@class=\"selected-colors RA-CS11\"]//descendant::span/img[@alt=\"close-icon\"]"));
		closecolor2.click();
		remaincolorsample=driver.findElement(By.xpath("//span[@class=\"remaincolor\"]"));
		text=remaincolorsample.getText();
		Assert.assertEquals("17", text);
		System.out.println("Remaining color sample to choose after removing samples: "+text);
		
		
		
}}
