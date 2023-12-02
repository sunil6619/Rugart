package Ordersample_SectionTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_111_Check_Order_Color_box_rugsize_ft_if_left_blank extends Base{
//	@Parameters ("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException {
//		
//		getlaunchurl(getreaddata("url"));
//	}
	
	@Test

	public void check_order_color_box_rugsizeft_blank_Test() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Collection')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='SHOP THE COLLECTION']")).click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
		WebElement ordersamples=driver.findElement(By.xpath("//span[contains(text(),'Order Yarn Color Samples')]"));
		ordersamples.click();
		Thread.sleep(1000);
		WebElement ordersamplesbutton=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		ordersamplesbutton.isEnabled();
		ordersamplesbutton.isDisplayed();
		Assert.assertTrue(true);
		ordersamplesbutton.click();
		WebElement errormsg=driver.findElement(By.xpath("//div[text()='Width and Length can not be blank']"));
		String text=errormsg.getText();
		Assert.assertEquals("Width and Length can not be blank", text);
		
	}
}
