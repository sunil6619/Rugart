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

public class TC_137_Check_order_samples_remove_all_colors_verify_error_msg extends Base {
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
	}
//	@Parameters({"email","password"})
	@Test

	public void check_remove_all_colors_error_msg_Test() throws InterruptedException, AWTException {
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
		WebElement closecolor1=driver.findElement(By.xpath("//span[@class=\"selected-colors RA-CG10\"]/child::span[@class=\"color-close\"]"));
		closecolor1.click();
		WebElement closecolor2=driver.findElement(By.xpath("//span[@class=\"selected-colors RA-DR10\"]/child::span[@class=\"color-close\"]"));
		closecolor2.click();
		WebElement closecolor3=driver.findElement(By.xpath("//span[@class=\"selected-colors RA-DL12\"]/child::span[@class=\"color-close\"]"));
		closecolor3.click();
		WebElement closecolor4=driver.findElement(By.xpath("//span[@class=\"selected-colors RA-CS11\"]/child::span[@class=\"color-close\"]"));
		closecolor4.click();
		WebElement closecolor5=driver.findElement(By.xpath("//span[@class=\"selected-colors RA-BT03\"]/child::span[@class=\"color-close\"]"));
		closecolor5.click();
		WebElement widthft=driver.findElement(By.xpath("//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"width[feet]\"]"));
		widthft.sendKeys("6");
		Thread.sleep(1000);
		WebElement lengthft=driver.findElement(By.xpath("//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"length[feet]\"]"));
		lengthft.sendKeys("8");
		WebElement errormsg=driver.findElement(By.xpath("//div[contains(text(),'color sample order')]"));
		String text=errormsg.getText();
	    Assert.assertEquals("Please select at least 1 color to place color sample order",text);
	
	
	
	}}
