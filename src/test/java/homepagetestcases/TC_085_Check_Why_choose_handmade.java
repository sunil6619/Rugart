package homepagetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_085_Check_Why_choose_handmade extends Base {


	@Parameters("url") 
	@BeforeTest
	public void getlaunchurl_rugartisan() throws InterruptedException
	{
		getlaunchurl(getreaddata("url"));

	}
	@Test
	public void check_why_choose_handmade() throws InterruptedException {
		Thread.sleep(1000);
		WebElement handmaderugs=driver.findElement(By.xpath("//a[contains(text(),'Handmade Rugs')]"));
		scroll(handmaderugs);
		handmaderugs.click();
		driver.findElement(By.xpath("//h1[contains(text(),'Why handmade rugs are better than machine-made rugs')]")).isDisplayed();
		Assert.assertTrue(true);
	}
}
