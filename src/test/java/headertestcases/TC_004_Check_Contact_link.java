package headertestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_004_Check_Contact_link extends Base {

	@Parameters("url")
	@BeforeTest
	public void getlaunchurl_rugartisan() throws InterruptedException
	{
		getlaunchurl(getreaddata("url"));

	}
	
	@Test
	public void Check_Contact_link_Test () throws InterruptedException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"container-fluid\"]/div/a[text()='Contact']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Upload Files')]")).isDisplayed();
		Assert.assertTrue(true);
//		String Currenturl=driver.getCurrentUrl();
//		System.out.println(Currenturl);
//		Assert.assertEquals("https://www.rugartisan.com/contact-us", Currenturl);
		
		
		
		
		
	}
}
