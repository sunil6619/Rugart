package homepagetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_075_Check_Halfmoon_in_Shapes extends Base {

	@Parameters("url") 
	@BeforeTest
	public void getlaunchurl_rugartisan() throws InterruptedException
	{
		getlaunchurl(getreaddata("url"));

	}
	@Test
	public void check_halfmoon_in_shapes_Test() throws InterruptedException {
		Thread.sleep(1000);
		WebElement shapes=driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]/li/span[text()='Shapes']"));
		mousehover(shapes);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt=\"Halfmoon\"]")).click();
		Thread.sleep(1000);
		String text=driver.findElement(By.xpath("//span[text()=' halfmoon Custom Rugs']")).getText();
		Assert.assertEquals("Halfmoon Custom Rugs",text);
		System.out.println(text);
//		scrolldown();
	}
}
