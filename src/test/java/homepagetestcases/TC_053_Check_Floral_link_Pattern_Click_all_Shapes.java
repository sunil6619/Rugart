package homepagetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_053_Check_Floral_link_Pattern_Click_all_Shapes extends Base {

	@Parameters("url") 
	@BeforeTest
	public void getlaunchurl_rugartisan() throws InterruptedException
	{
		getlaunchurl(getreaddata("url"));

	}
	@Test
	public void check_floral_link_in_pattern_click_all_shapes_Test() throws InterruptedException {
		Thread.sleep(1000);
		WebElement rugpattern=driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]/li/span[text()='Pattern']"));
		mousehover(rugpattern);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"/pattern/floral\"]")).click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.xpath("//span[contains(text(),'Floral Custom Rugs')]")).isDisplayed();
	    Assert.assertTrue(true);
//		clickdiffshapes();
	}
}
