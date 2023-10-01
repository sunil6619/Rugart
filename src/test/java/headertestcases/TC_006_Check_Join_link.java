package headertestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_006_Check_Join_link extends Base {
	@Parameters("url")
	@BeforeTest
	public void getlaunchurl_rugartisan() throws InterruptedException
	{
		getlaunchurl(getreaddata("url"));

	}
	@Test
	public void Check_join_link_Test() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//ul[@class=\"links\"]/li/span[text()='Join']")).click();
		Thread.sleep(1000);
		String text=driver.findElement(By.xpath("//ul[@class=\"form-list\"]/h3[text()='JOIN US']")).getText();
		Assert.assertEquals("JOIN US", text);
	}
}
