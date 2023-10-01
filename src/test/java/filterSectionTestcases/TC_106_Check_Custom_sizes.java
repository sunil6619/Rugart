package filterSectionTestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_106_Check_Custom_sizes extends Base{
	@Parameters ("url")
	@BeforeTest

	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
	}
	@Test
	public void check_custom_sizes_Test() throws InterruptedException {
		
		 Thread.sleep(1000);
		 WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		 mousehover(collection);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		 Thread.sleep(1000);
		WebElement customsizes=driver.findElement(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		String text=customsizes.getText();
		Assert.assertEquals("Custom Sizes", text);
		 List<WebElement>list=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		// pulling WebElement from List
		 WebElement first=list.get(0);
		 first.click();
		 WebElement pdppage=driver.findElement(By.xpath("//span[contains (text(),'Order Yarn Color Samples')]"));
		 text= pdppage.getText();
		 Assert.assertEquals("Order Yarn Color Samples", text);
		 
}}
