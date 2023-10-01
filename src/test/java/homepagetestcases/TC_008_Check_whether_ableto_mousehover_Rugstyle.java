package homepagetestcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_008_Check_whether_ableto_mousehover_Rugstyle extends Base{

	@Parameters("url")
	@BeforeTest
	public void getlaunchurl_rugartisan() throws InterruptedException
	{
		getlaunchurl(getreaddata("url"));

	}
	@Test
	public void Check_whether_ableto_mousehover_Rugstyle_Test () throws InterruptedException, AWTException {
		Thread.sleep(1000);
		zoomin();
		WebElement rugstyle=driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]/li/span[text()='Rug Style']"));
		mousehover(rugstyle);
//		Actions act=new Actions(driver);
//		act.moveToElement(rugstyle).perform();
	}
}
