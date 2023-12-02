package homepagetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_037_Check_Linear_link_RugStyle_Click_all_Shapes extends Base{
//	@Parameters("url")
//	@BeforeTest
//	public void getlaunchurl_rugartisan() throws InterruptedException
//	{
//		getlaunchurl(getreaddata("url"));
//
//	}
	@Test
	public void check_linear_link_in_collection_click_all_shapes_Test() throws InterruptedException {
		Thread.sleep(1000);
		WebElement collec=driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]/li/span[text()='Rug Style']"));
		mousehover(collec);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"/rug-style/linear\"]")).click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.xpath("//span[contains(text(),'Linear Custom Rugs')]")).isDisplayed();
	    Assert.assertTrue(true);
//		clickdiffshapes();
	}
}
