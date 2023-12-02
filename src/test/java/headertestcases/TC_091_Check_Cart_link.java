package headertestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_091_Check_Cart_link extends Base {
	
//	@Parameters("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException {
//		getlaunchurl(getreaddata("url"));
//		
//		
//	}
@Test

public void check_cart_link_Test() throws InterruptedException {
	
	Thread.sleep(1000);
	WebElement cart=driver.findElement(By.xpath("//img[@alt=\"shopping bag\"]"));
	cart.isDisplayed();
	Assert.assertTrue(true);
	cart.click();
	String emptycartmsg=driver.findElement(By.xpath("//div[@class=\"block-content\"]/child::div[normalize-space()='Your shopping cart is empty']")).getText();
	Assert.assertEquals("Your shopping cart is empty", emptycartmsg);
}


}
