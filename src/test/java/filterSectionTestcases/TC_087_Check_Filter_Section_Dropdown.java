package filterSectionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_087_Check_Filter_Section_Dropdown extends Base {
	
//	@Parameters ("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException {
//		
//		getlaunchurl(getreaddata("url"));
//	}
	
	@Test

	public void check_filter_section_dropdown_Test() throws InterruptedException {
		Thread.sleep(2000);
		WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		mousehover(collection);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		Thread.sleep(1000);
		String fofcustom=driver.findElement(By.xpath("//span[contains(text(),'Field of Flowers Custom Rugs')]")).getText();
		Assert.assertEquals("Field Of Flowers Custom Rugs", fofcustom);
		WebElement filterclose=driver.findElement(By.xpath("//span[@class=\"cd-close\"]"));
		filterclose.isDisplayed();
		Assert.assertTrue(true);
		filterclose.click();
		Thread.sleep(2000);
		filterclose.click();
		driver.findElement(By.xpath("//div[contains(text(),'Filters')]")).isDisplayed();
		Assert.assertTrue(true);
		WebElement selectedfiltertop=driver.findElement(By.xpath("//span[text()='Field of Flowers']"));
		selectedfiltertop.isDisplayed();
		Assert.assertTrue(true);
		Thread.sleep(2000);
		WebElement removefilter=driver.findElement(By.xpath("//span[text()=' ×']"));
		removefilter.click();
		Thread.sleep(1000);
		WebElement sortby=driver.findElement(By.xpath("//h4[contains(text(),'Sort By')]"));
		sortby.isDisplayed();
		Assert.assertTrue(true);
		sortby.click();
		Thread.sleep(3000);
		WebElement category=driver.findElement(By.xpath("//h4[contains(text(),'Category')]"));
		category.isDisplayed();
		Assert.assertTrue(true);
		category.click();
		Thread.sleep(3000);
		WebElement weavingtype=driver.findElement(By.xpath("//h4[contains(text(),'Weaving Type')]"));
		weavingtype.isDisplayed();
		Assert.assertTrue(true);
		weavingtype.click();
		Thread.sleep(3000);
		WebElement materials=driver.findElement(By.xpath("//h4[contains(text(),'Materials')]"));
		materials.isDisplayed();
		Assert.assertTrue(true);
		materials.click();
		WebElement size=driver.findElement(By.xpath("//h4[contains(text(),'Size')]"));
		size.isDisplayed();
		Assert.assertTrue(true);
		size.click();
		Thread.sleep(3000);
		
	}
}
