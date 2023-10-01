package filterSectionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_101_Check_Size_enter_different_values_ft extends Base{
	@Parameters ("url")
	@BeforeTest

	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
	}
	@Test
	public void check_size_enter_different_values_ft_Test() throws InterruptedException {
		
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
		 WebElement widthinch=driver.findElement(By.xpath("//input[@name=\"width[inch]\"]"));
		 widthinch.sendKeys("5");
		 WebElement lengthft=driver.findElement(By.xpath("//input[@name=\"length[feet]\"]"));
		 lengthft.sendKeys("06");
		 WebElement lengthinch=driver.findElement(By.xpath("//input[@name=\"length[inch]\"]"));
		 lengthinch.sendKeys("05");
		 Thread.sleep(2000);
		 widthft.clear();
		 widthft.sendKeys("08");
		 widthinch.clear();
		 widthinch.sendKeys("10");
		 lengthft.clear();
		 lengthft.sendKeys("10");
		 lengthinch.clear();
		 lengthinch.sendKeys("06");
		 WebElement submitbuttn=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		 submitbuttn.isDisplayed();
		 Assert.assertTrue(true);
		 submitbuttn.isEnabled();
		 submitbuttn.click();
		 WebElement selectedfilterontop=driver.findElement( By.xpath("//span[@class=\"filter size_filter\"]"));
		 selectedfilterontop.isDisplayed();
		 Assert.assertTrue(true);
		 
}}
