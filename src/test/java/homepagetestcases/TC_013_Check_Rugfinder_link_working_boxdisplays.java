package homepagetestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_013_Check_Rugfinder_link_working_boxdisplays extends Base {

//	@Parameters("url")
//	@BeforeTest
//	public void getlaunchurl_rugartisan() throws InterruptedException
//	{
//		getlaunchurl(getreaddata("url"));
//
//	}
	@Test
	public void check_rugfinder_link_working_boxappears_Test() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]/li/span[text()='Rug Finder']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class=\"row m-0\"]/div/h4[text()='Are you struggling to find the right rug?']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//button[@class=\"next-btn callback-btn tryrugfinder\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[contains(text(),'Specify Your Size ')]")).isDisplayed();
		Assert.assertTrue(true);
		
	}
}
