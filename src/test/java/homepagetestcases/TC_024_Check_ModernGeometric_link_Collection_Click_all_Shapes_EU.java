package homepagetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_024_Check_ModernGeometric_link_Collection_Click_all_Shapes_EU extends Base {
//	@Parameters("url")
//	@BeforeTest
//	public void getlaunchurl_rugartisan() throws InterruptedException
//	{
//		getlaunchurl(getreaddata("url"));
//
//	}
	@Test
	public void check_moderngeometric_link_in_collection_click_all_shapes_Test() throws InterruptedException {
		Thread.sleep(1000);
		WebElement collec=driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[text()='Collection']"));
		mousehover(collec);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[1]/ul/li/div/div[12]/a/img")).click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		clickdiffshapes();
	}
}
