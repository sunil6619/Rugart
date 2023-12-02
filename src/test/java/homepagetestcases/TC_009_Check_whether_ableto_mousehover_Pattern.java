package homepagetestcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_009_Check_whether_ableto_mousehover_Pattern extends Base {

//	@Parameters("url")
//	@BeforeTest
//	public void getlaunchurl_rugartisan() throws InterruptedException
//	{
//		getlaunchurl(getreaddata("url"));
//
//	}
	@Test
	public void Check_whether_able_to_mouseover_Pattern() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		zoomin();
		WebElement pattern=driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]/li/span[text()='Pattern']"));
		mousehover(pattern);
		
	}
}
