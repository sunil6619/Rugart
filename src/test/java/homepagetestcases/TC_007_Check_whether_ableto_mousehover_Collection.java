package homepagetestcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_007_Check_whether_ableto_mousehover_Collection extends Base {

//	@Parameters("url")
//	@BeforeTest
//	public void getlaunchurl_rugartisan() throws InterruptedException
//	{
//		getlaunchurl(getreaddata("url"));
//
//	}
	@Test
	public void Check_able_to_mouseover_Collection () throws InterruptedException, AWTException {
		Thread.sleep(1000);
		zoomin();
		WebElement collec=driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[text()='Collection']"));
		mousehover(collec);
//		Actions act=new Actions(driver);
//		act.moveToElement(collec).perform();
	}
}
