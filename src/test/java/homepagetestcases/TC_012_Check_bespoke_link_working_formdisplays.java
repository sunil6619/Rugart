package homepagetestcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_012_Check_bespoke_link_working_formdisplays extends Base{

//	@Parameters("url")
//	@BeforeTest
//	public void getlaunchurl_rugartisan() throws InterruptedException
//	{
//		getlaunchurl(getreaddata("url"));
//
//	}
	@Test
	public void check_bespoke_link_working_formdisplays_Test() throws InterruptedException, AWTException {
		
		Thread.sleep(1000);
		zoomin();
		driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[text()='Bespoke']")).click();
		String text=driver.findElement(By.xpath("//div[text()='Design your own Bespoke Rug']")).getText();
		Assert.assertEquals("DESIGN YOUR OWN BESPOKE RUG",text);
	}
}
