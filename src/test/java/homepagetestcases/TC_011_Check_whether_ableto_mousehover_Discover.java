package homepagetestcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_011_Check_whether_ableto_mousehover_Discover extends Base{


//	@Parameters("url")
//	@BeforeTest
//	public void getlaunchurl_rugartisan() throws InterruptedException
//	{
//		getlaunchurl(getreaddata("url"));
//
//	}
	@Test
	public void check_whetherable_mouseover_Discover_Test () throws InterruptedException, AWTException {
		Thread.sleep(1000);
		zoomin();
		WebElement discover=driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]/li/span[text()='DISCOVER']"));
		mousehover(discover);
		
	}
}
