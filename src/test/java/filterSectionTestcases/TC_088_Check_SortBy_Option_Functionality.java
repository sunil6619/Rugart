package filterSectionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_088_Check_SortBy_Option_Functionality extends Base {

	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
	}
	
	@Test
	public void check_sortby_option_functionality_Test() throws InterruptedException {
		Thread.sleep(2000);
		WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		mousehover(collection);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//h4[contains(text(),'Sort By')]")).click();
	    Thread.sleep(1000);
	    WebElement sortbydropdown=driver.findElement(By.xpath("//div[@class=\"select order\"]"));
	    sortbydropdown.click();
	    Thread.sleep(1000);
	    WebElement ascen=driver.findElement(By.xpath("//li[text()='Name A-Z']"));
	    ascen.isDisplayed();
	    Assert.assertTrue(true);
	    ascen.click();
	    String text=ascen.getText();
	    System.out.println(text);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Amaryllis']")).isDisplayed();
	    Assert.assertTrue(true);
	    driver.findElement(By.xpath("//div[normalize-space()='Anemone']")).isDisplayed();
	    Assert.assertTrue(true);
	    driver.findElement(By.xpath("//div[normalize-space()='Bouvardia']")).isDisplayed();
	    Assert.assertTrue(true);
	    Thread.sleep(1000);
	    sortbydropdown.click();
	    Thread.sleep(1000);
	    WebElement descen=driver.findElement(By.xpath("//li[text()='Name Z-A']"));
	    descen.isDisplayed();
	    Assert.assertTrue(true);
	    descen.click();
	    String text1=descen.getText();
	    System.out.println(text1);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[normalize-space()='Zinia']")).isDisplayed();
	    Assert.assertTrue(true);
	    driver.findElement(By.xpath("//div[normalize-space()='Yarrow']")).isDisplayed();
	    Assert.assertTrue(true);
	    driver.findElement(By.xpath("//div[normalize-space()='Tulip']")).isDisplayed();
	    Assert.assertTrue(true);
	    
	    
	    
	    
	}
	
}
