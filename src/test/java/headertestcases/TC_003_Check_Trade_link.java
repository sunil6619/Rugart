package headertestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_003_Check_Trade_link extends Base {
	
	@Parameters("url")
	@BeforeTest
	public void getlaunchurl_rugartisan() throws InterruptedException
	{
		getlaunchurl(getreaddata("url"));

	}
	
	@Test
	
	public void Check_Trade_link_Test() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class=\"links\"]/li/a[text()='Trade']")).click();
		String joinastrade=driver.findElement(By.xpath("//span[normalize-space(text())='Join as Trade Account']")).getText();
		System.out.println(joinastrade);
		Assert.assertEquals("JOIN AS TRADE ACCOUNT", joinastrade);
	}
	

}
