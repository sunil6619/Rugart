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

public class TC_117_Check_able_to_add_Core_colors extends Base {

	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
	}
	
	@Test

	public void check_able_to_add_core_colors_Test() throws InterruptedException, AWTException {
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
		WebElement addcolor1= driver.findElement(By.xpath("//span[@id=\"173-RA-AO05\"]"));
		addcolor1.click();
		WebElement coloradded1=driver.findElement(By.xpath("//span[contains(text(),'RA-AO05')]"));
		String text=coloradded1.getText();
		Assert.assertEquals("RA-AO05", text);
		WebElement colorcount=driver.findElement(By.xpath("//div[@class=\"price-box\"]/descendant::span[@class=\"color-count\"]"));
		text=colorcount.getText();
		Assert.assertEquals("6", text);
		WebElement addcolor2= driver.findElement(By.xpath("//span[@id=\"435-RA-BQ03\"]"));
		addcolor2.click();
		WebElement coloradded2=driver.findElement(By.xpath("//span[contains(text(),'RA-BQ03')]"));
		text=coloradded2.getText();
		Assert.assertEquals("RA-BQ03", text);
		WebElement colorcount2=driver.findElement(By.xpath("//div[@class=\"price-box\"]/descendant::span[@class=\"color-count\"]"));
		text=colorcount2.getText();
		Assert.assertEquals("7", text);
//		 addcolor1= driver.findElement(By.xpath("//span[@id=\"173-RA-AO05\"]"));
//		 String tooltiptext=addcolor1.getAttribute("title");
//		 System.out.println(tooltiptext);
	
	
	}}
