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

public class TC_126_Check_able_to_add_20_colors_verify_msg extends Base{
//	@Parameters ("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException {
//		
//		getlaunchurl(getreaddata("url"));
//	}
	
	@Test

	public void check_able_to_add_20colors_Test() throws InterruptedException, AWTException {
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
		WebElement color1=driver.findElement(By.xpath("//span[@id=\"26-RA-AC02\"]"));
		color1.click();
		WebElement color2=driver.findElement(By.xpath("//span[@id=\"62-RA-AF02\"]"));
		color2.click();
		WebElement color3=driver.findElement(By.xpath("//span[@id=\"280-RA-BD04\"]"));
		color3.click();
		WebElement color4=driver.findElement(By.xpath("//span[@id=\"194-RA-AQ02\"]"));
		color4.click();
		WebElement color5=driver.findElement(By.xpath("//span[@id=\"209-RA-AR05\"]"));
		color5.click();
		WebElement color6=driver.findElement(By.xpath("//span[@id=\"5-RA-AA05\"]"));
		color6.click();
		WebElement color7=driver.findElement(By.xpath("//span[@id=\"521-RA-CD05\"]"));
		color7.click();
		WebElement color8=driver.findElement(By.xpath("//span[@id=\"498-RA-CB06\"]"));
		color8.click();
		WebElement colorcountmsg=driver.findElement(By.xpath("//span[@class=\"remaincolor\"]/ancestor::div[@class=\"sample-info\"]"));
		String text=colorcountmsg.getText();
		Assert.assertEquals("You can choose 7 more colors:", text);
		System.out.println(text);
		WebElement color9=driver.findElement(By.xpath("//span[@id=\"238-RA-AT10\"]"));
		color9.click();
		WebElement color10=driver.findElement(By.xpath("//span[@id=\"168-RA-AN12\"]"));
		color10.click();
		WebElement color11=driver.findElement(By.xpath("//span[@id=\"456-RA-BR12\"]"));
		color11.click();
		WebElement color12=driver.findElement(By.xpath("//span[@id=\"12-RA-AA12\"]"));
		color12.click();
		WebElement color13=driver.findElement(By.xpath("//span[@id=\"193-RA-AQ01\"]"));
		color13.click();
		colorcountmsg=driver.findElement(By.xpath("//span[@class=\"remaincolor\"]/ancestor::div[@class=\"sample-info\"]"));
		text=colorcountmsg.getText();
		Assert.assertEquals("You can choose 2 more colors:", text);
		System.out.println(text);
		WebElement color14=driver.findElement(By.xpath("//span[@id=\"416-RA-BO08\"]"));
		color14.click();
		WebElement color15=driver.findElement(By.xpath("//span[@id=\"84-RA-AG12\"]"));
		color15.click();
		WebElement color16=driver.findElement(By.xpath("//span[@id=\"300-RA-BE12\"]"));
		color16.click();
		colorcountmsg=driver.findElement(By.xpath("//span[@class=\"remaincolor\"]/ancestor::div[@class=\"sample-info\"]"));
		text=colorcountmsg.getText();
		Assert.assertEquals("You can choose 0 more colors:", text);
		System.out.println(text);
}}
