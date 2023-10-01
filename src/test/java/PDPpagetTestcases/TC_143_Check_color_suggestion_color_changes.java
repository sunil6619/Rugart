package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_143_Check_color_suggestion_color_changes extends Base {
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
	}
	
	@Test

	public void check_color_suggestion_color_changes_Test() throws InterruptedException, AWTException {
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
		Thread.sleep(2000);
		WebElement morecolors=driver.findElement(By.xpath("//span[contains(text(),'MORE ')]"));
		morecolors.click();
		Thread.sleep(2000);
		List<WebElement>list=driver.findElements(By.xpath("//img[@class=\"suggestion-img\"]"));
		WebElement three=list.get(3);
		three.click();
		WebElement close=driver.findElement(By.xpath("//a[@class=\"close\"]"));
		close.click();
		WebElement color1=driver.findElement(By.xpath("//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-EA10']"));
		String text=color1.getText();
		Assert.assertEquals("RA-EA10",text);
		WebElement color2=driver.findElement(By.xpath("//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-EK10']"));
		text=color2.getText();
		Assert.assertEquals("RA-EK10",text);
		WebElement color3=driver.findElement(By.xpath("//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-BI12']"));
		text=color3.getText();
		Assert.assertEquals("RA-BI12",text);
		WebElement color4=driver.findElement(By.xpath("//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-CP11']"));
		text=color4.getText();
		Assert.assertEquals("RA-CP11",text);
		WebElement color5=driver.findElement(By.xpath("//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-AA03']"));
		text=color5.getText();
		Assert.assertEquals("RA-AA03",text);
}}
