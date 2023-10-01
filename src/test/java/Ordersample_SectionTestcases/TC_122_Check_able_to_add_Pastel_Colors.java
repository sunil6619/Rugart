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

public class TC_122_Check_able_to_add_Pastel_Colors extends Base{
	
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException  {
		
		getlaunchurl(getreaddata("url"));
	}
	
	@Test

	public void check_able_to_add_Pastel_colors_Test() throws InterruptedException, AWTException {
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
		WebElement addcolor1= driver.findElement(By.xpath("//span[@id=\"5-RA-05-N\"]"));
		addcolor1.click();
		WebElement coloradded1=driver.findElement(By.xpath("//span[contains(text(),'RA-05-N')]"));
		String text=coloradded1.getText();
		Assert.assertEquals("RA-05-N", text);
		WebElement colorcount=driver.findElement(By.xpath("//div[@class=\"price-box\"]/descendant::span[@class=\"color-count\"]"));
		text=colorcount.getText();
		Assert.assertEquals("6", text);
		WebElement addcolor2= driver.findElement(By.xpath("//span[@id=\"75-RA-75-N\"]"));
		addcolor2.click();
		WebElement coloradded2=driver.findElement(By.xpath("//span[contains(text(),'RA-75-N')]"));
		text=coloradded2.getText();
		Assert.assertEquals("RA-75-N", text);
		WebElement colorcount2=driver.findElement(By.xpath("//div[@class=\"price-box\"]/descendant::span[@class=\"color-count\"]"));
		text=colorcount2.getText();
		Assert.assertEquals("7", text);

}}
