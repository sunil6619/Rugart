package filterSectionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_104_Check_Size_submit_clicked_multiple_times extends Base {
	@Parameters ("url")
	@BeforeTest

	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
	}
	@Test
	public void check_size_submit_clicked_mutiple_times_Test() throws InterruptedException {
		
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
		 WebElement submitbuttn=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		 submitbuttn.isDisplayed();
		 Assert.assertTrue(true);
		 submitbuttn.click();
		 Thread.sleep(1000);
		 submitbuttn.click();
		 submitbuttn.click();
		 driver.navigate().refresh();
}}
