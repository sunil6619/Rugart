package homepagetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_066_Check_Runner_in_Shapes extends Base{

//	@Parameters("url") 
//	@BeforeTest
//	public void getlaunchurl_rugartisan() throws InterruptedException
//	{
//		getlaunchurl(getreaddata("url"));
//
//	}
	@Test
	public void check_runner_in_shapes_Test() throws InterruptedException {
		Thread.sleep(1000);
		WebElement shapes=driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]/li/span[text()='Shapes']"));
		mousehover(shapes);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt=\"Runner\"]")).click();
		Thread.sleep(1000);
		String text=driver.findElement(By.xpath("//span[text()=' runner Custom Rugs']")).getText();
		Assert.assertEquals("Runner Custom Rugs",text);
		System.out.println(text);
//		scrolldown();
	}
}
