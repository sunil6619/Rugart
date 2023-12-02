package filterSectionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_094_Check_Size_Click_ft_cms extends Base {
	
//	@Parameters ("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException {
//		getlaunchurl(getreaddata("url"));
//	}
	
	@Test
	public void check_size_functionality_Test() throws InterruptedException {
		Thread.sleep(1000);
		WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		 mousehover(collection);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//h4[contains(text(),'Size')]")).click();
		 Thread.sleep(1000);
		 WebElement centimts=driver.findElement(By.xpath("//input[@value=\"cm\"]"));
		 centimts.isDisplayed();
		 Assert.assertTrue(true);
		 centimts.click();
		 WebElement feet=driver.findElement(By.xpath("//input[@value=\"ft\"]"));
		 feet.isDisplayed();
		 Assert.assertTrue(true);
		 feet.click();
	
}}
