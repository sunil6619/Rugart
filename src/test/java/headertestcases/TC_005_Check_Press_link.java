package headertestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_005_Check_Press_link extends Base {
//	@Parameters("url")
//	@BeforeTest
//	public void getlaunchurl_rugartisan() throws InterruptedException
//	{
//		getlaunchurl(getreaddata("url"));
//
//	}
	@Test
	public void Check_Press_link_Test() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"container-fluid\"]/div/a[text()='Press']")).click();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h2[text()='Press Coverage']")).getText();
		Assert.assertEquals("Press Coverage",text);
	}
}
