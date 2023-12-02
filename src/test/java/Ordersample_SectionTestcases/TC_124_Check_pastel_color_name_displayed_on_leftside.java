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

public class TC_124_Check_pastel_color_name_displayed_on_leftside extends Base{

//	@Parameters ("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException {
//		
//		getlaunchurl(getreaddata("url"));
//	}
	
	@Test

	public void check_pastel_color_name_displayed_on_leftside_Test() throws InterruptedException, AWTException {
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
		WebElement color1=driver.findElement(By.xpath("//span[@id=\"4-RA-04-N\"]"));
		mousehover(color1);
		WebElement colorfilter=driver.findElement(By.xpath("//div[@class=\"color-filters d-flex\"]/child::span[text()='RA-04-N']"));
		String text=colorfilter.getText();
		Assert.assertEquals("RA-04-N", text);
		System.out.println(text);
		WebElement color2=driver.findElement(By.xpath("//span[@id=\"56-RA-56-N\"]"));
		mousehover(color2);
		colorfilter=driver.findElement(By.xpath("//div[@class=\"color-filters d-flex\"]/child::span[text()='RA-56-N']"));
		text=colorfilter.getText();
		Assert.assertEquals("RA-56-N", text);
		WebElement color3=driver.findElement(By.xpath("//span[@id=\"22-RA-22-N\"]"));
		mousehover(color3);
		colorfilter=driver.findElement(By.xpath("//div[@class=\"color-filters d-flex\"]/child::span[text()='RA-22-N']"));
		text=colorfilter.getText();
		Assert.assertEquals("RA-22-N", text);
		WebElement color4=driver.findElement(By.xpath("//span[@id=\"70-RA-70-N\"]"));
		mousehover(color4);
		colorfilter=driver.findElement(By.xpath("//div[@class=\"color-filters d-flex\"]/child::span[text()='RA-70-N']"));
		text=colorfilter.getText();
		Assert.assertEquals("RA-70-N", text);

}}
