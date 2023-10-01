package filterSectionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_102_Check_Size_enter_different_values_cms extends Base {
	@Parameters ("url")
	@BeforeTest

	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
	}
	@Test
	public void check_size_enter_different_values_cms_Test() throws InterruptedException {
		
		 Thread.sleep(1000);
		 WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		 mousehover(collection);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//h4[contains(text(),'Size')]")).click();
		 Thread.sleep(1000);
		 WebElement centimts=driver.findElement(By.xpath("//input[@value=\"cm\"]"));
		 centimts.click();
		 WebElement widthcms=driver.findElement(By.xpath("//input[@name=\"width[cm]\"]"));
		 widthcms.sendKeys("200");
		 Thread.sleep(1000);
		 widthcms.clear();
		 widthcms.sendKeys("400");
		 WebElement lengthcms=driver.findElement(By.xpath("//input[@name=\"length[cm]\"]"));
		 lengthcms.sendKeys("600");
		 Thread.sleep(1000);
		 lengthcms.clear();
		 lengthcms.sendKeys("900");
		 WebElement submitbuttn=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		 submitbuttn.isDisplayed();
		 Assert.assertTrue(true);
		 submitbuttn.isEnabled();
		 submitbuttn.click();
		 WebElement selectedfilterontop=driver.findElement( By.xpath("//span[@class=\"filter size_filter\"]"));
		 selectedfilterontop.isDisplayed();
		 Assert.assertTrue(true);
		 
		 
}}
