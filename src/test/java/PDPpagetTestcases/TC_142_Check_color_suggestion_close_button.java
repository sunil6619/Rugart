package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_142_Check_color_suggestion_close_button extends Base {
//	@Parameters ("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException {
//		
//		getlaunchurl(getreaddata("url"));
//	}
	
	@Test

	public void check_close_button_functionality_Test() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		 WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		 mousehover(collection);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		 Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
		Thread.sleep(2000);
		WebElement colorsuggest=driver.findElement(By.xpath("//p[contains(text(),'COLOR SUGGESTIONS FOR THIS RUG')]"));
		String text=colorsuggest.getText();
		Assert.assertEquals("COLOR SUGGESTIONS FOR THIS RUG", text);
		WebElement morecolors=driver.findElement(By.xpath("//span[contains(text(),'MORE ')]"));
		morecolors.click();
		Thread.sleep(2000);
		WebElement close=driver.findElement(By.xpath("//a[@class=\"close\"]"));
		close.click();
		
}}
