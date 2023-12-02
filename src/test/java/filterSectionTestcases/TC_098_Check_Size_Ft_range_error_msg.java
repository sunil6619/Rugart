package filterSectionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_098_Check_Size_Ft_range_error_msg extends Base {

	//	@Parameters("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		}
	@Test
	public void check_size_ft_range_Test() throws InterruptedException {
		Thread.sleep(1000);
		WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		mousehover(collection);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h4[contains(text(),'Size')]")).click();
		Thread.sleep(1000);
		WebElement inputwidthft=driver.findElement(By.xpath("//input[@name=\"width[feet]\"]"));
		inputwidthft.sendKeys("1");
		Thread.sleep(1000);
		WebElement errormsg=driver.findElement(By.xpath("//div[@class=\"feet-width-error unit-error\" and contains (text(),'2 ft - 90 ft')]"));
		String msg=errormsg.getText();
		Assert.assertEquals("2 ft - 90 ft", msg);
		inputwidthft.clear();
		inputwidthft.sendKeys("91");
		Assert.assertEquals("2 ft - 90 ft", msg);
		WebElement inputlengthft=driver.findElement(By.xpath("//input[@name=\"length[feet]\"]"));
		inputlengthft.sendKeys("1");
		Thread.sleep(1000);
		msg=errormsg.getText();
		Assert.assertEquals("2 ft - 90 ft", msg);
		inputlengthft.clear();
		inputlengthft.sendKeys("91");
		Assert.assertEquals("2 ft - 90 ft", msg);


	}



}
