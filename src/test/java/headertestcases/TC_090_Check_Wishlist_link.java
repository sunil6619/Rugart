package headertestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_090_Check_Wishlist_link extends Base {
	
	@Parameters ("url")
	@BeforeTest
	
	public void getlaunchurl_rugartisan() throws InterruptedException
	{
		getlaunchurl(getreaddata("url"));

	}
	@Test
	
	public void check_wishlist_link_Test() throws InterruptedException {
		Thread.sleep(1000);
		WebElement wishlist=driver.findElement(By.xpath("//ul[@class=\"links\"]/child::li/span[text()='My Wishlist']"));
		wishlist.isDisplayed();
		Assert.assertTrue(true);
		wishlist.click();
		WebElement crossclose=driver.findElement(By.xpath("//form[@id=\"form-sign-in\"]/child::span[@title=\"Close Modal\"]"));
		crossclose.isDisplayed();
		Assert.assertTrue(true);
		String signin=driver.findElement(By.xpath("//h3[text()='Sign In']")).getText();
		Assert.assertEquals("SIGN IN", signin);
		
	}

}
