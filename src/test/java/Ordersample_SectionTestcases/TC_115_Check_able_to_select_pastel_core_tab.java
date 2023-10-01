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

public class TC_115_Check_able_to_select_pastel_core_tab extends Base{

	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
	}
	
	@Test

	public void check_able_to_select_pastel_core_tab_Test() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Collection')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='SHOP THE COLLECTION']")).click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
		WebElement ordersamples=driver.findElement(By.xpath("//span[contains(text(),'Order Yarn Color Samples')]"));
		ordersamples.click();
		Thread.sleep(1000);
//		zoomin();
		WebElement pastelcolors=driver.findElement(By.xpath("//a[@id=\"Pastel-tab-sample-color\"]"));
		pastelcolors.isDisplayed();
		Assert.assertTrue(true);
		pastelcolors.click();
		Thread.sleep(2000);
		WebElement corecolors=driver.findElement(By.xpath("//a[@id=\"Core-tab-sample-color\"]"));
		corecolors.isDisplayed();
		Assert.assertTrue(true);
		corecolors.click();
		
		
		
		
}}
