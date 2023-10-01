package filterSectionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_093_Check_Materials_Functionality extends Base{
	
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
	}
	@Test
public void check_materials_functionality_Test() throws InterruptedException {
	WebElement materials;
	WebElement selectedfilterontop;
	Thread.sleep(1000);
	WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
	 mousehover(collection);
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[@data-attr_value=\"collection/field-of-flowers\"]/child::span[@class=\"closeicon\"]")).click();
	 Thread.sleep(2000);
	 materials=driver.findElement(By.xpath("//h4[contains(text(),'Materials')]"));
	 materials.click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@value=\"Pure Wool\"]")).click();
	 Thread.sleep(2000);
	 selectedfilterontop=driver.findElement(By.xpath("//span[text()='Pure Wool']"));
	 selectedfilterontop.isDisplayed();
	 Assert.assertTrue(true);
	 driver.findElement(By.xpath("//input[@value=\"Tibetan Wool\"]")).click();
	 Thread.sleep(2000);
	 selectedfilterontop=driver.findElement(By.xpath("//span[text()='Tibetan Wool']"));
	 selectedfilterontop.isDisplayed();
	 Assert.assertTrue(true);
	 driver.findElement(By.xpath("//input[@value=\"New Zealand Wool\"]")).click();
	 Thread.sleep(2000);
	 selectedfilterontop=driver.findElement(By.xpath("//span[text()='New Zealand Wool']"));
	 selectedfilterontop.isDisplayed();
	 Assert.assertTrue(true);
	 driver.findElement(By.xpath("//input[@value=\"Bamboo Silk\"]")).click();
	 Thread.sleep(2000);
	 selectedfilterontop=driver.findElement(By.xpath("//span[text()='Bamboo Silk']"));
	 selectedfilterontop.isDisplayed();
	 Assert.assertTrue(true);
	 driver.findElement(By.xpath("//input[@value=\"Recycled Yarn\"]")).click();
	 Thread.sleep(2000);
	 selectedfilterontop=driver.findElement(By.xpath("//span[text()='Recycled Yarn']"));
	 selectedfilterontop.isDisplayed();
	 Assert.assertTrue(true);
     


}
}
