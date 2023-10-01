package filterSectionTestcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_107_Check_Customize_Option_Link extends Base {
	@Parameters ("url")
	@BeforeTest

	public void launchurl_rugartisan() throws InterruptedException, AWTException {
		
		getlaunchurl(getreaddata("url"));
	}
	@Test
	public void check_customize_option_link_Test() throws InterruptedException, AWTException {
		
		 Thread.sleep(1000);
		 WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		 mousehover(collection);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		 Thread.sleep(1000);
		 Robot robot = new Robot();
			for (int i = 0; i < 3; i++) {			
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
			}
	     
		 List<WebElement> edit=driver.findElements(By.xpath("//img[@alt=\"edit\"]"));
		 WebElement thirdedit=edit.get(2);
		 Thread.sleep(3000);
		 mousehover(thirdedit);
		 List<WebElement> customize=driver.findElements(By.xpath("//span[contains(text(),'Customize')]"));
//		 customize.isDisplayed();
		 WebElement third=customize.get(2);
		 Assert.assertTrue(true);
		 third.click();
		 WebElement pdppage=driver.findElement(By.xpath("//span[contains (text(),'Order Yarn Color Samples')]"));
		 String text= pdppage.getText();
		 Assert.assertEquals("Order Yarn Color Samples", text);
		 
}}
