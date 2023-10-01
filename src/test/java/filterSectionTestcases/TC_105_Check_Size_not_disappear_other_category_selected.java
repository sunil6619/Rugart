package filterSectionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_105_Check_Size_not_disappear_other_category_selected extends Base {
	@Parameters ("url")
	@BeforeTest

	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
	}
	@Test
	public void check_size_not_disappear_Test() throws InterruptedException {
		
		 Thread.sleep(1000);
		 WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		 mousehover(collection);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//h4[contains(text(),'Size')]")).click();
		 Thread.sleep(1000);
		 WebElement widthft=driver.findElement(By.xpath("//input[@name=\"width[feet]\"]"));
		 widthft.sendKeys("04");
		 WebElement lengthft=driver.findElement(By.xpath("//input[@name=\"length[feet]\"]"));
		 lengthft.sendKeys("06");
		 WebElement submitbuttn=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		 submitbuttn.click();
		 WebElement selectedfilterontop=driver.findElement( By.xpath("//span[@class=\"filter size_filter\"]"));
		 selectedfilterontop.isDisplayed();
		 driver.findElement(By.xpath("//h4[contains(text(),'Category')]")).click();
		 Thread.sleep(1000);
		 WebElement batik=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/batik\"]"));
		 batik.click();
		 selectedfilterontop.isDisplayed();
		 Assert.assertTrue(true);
		 
}}
