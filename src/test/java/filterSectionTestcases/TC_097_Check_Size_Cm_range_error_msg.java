package filterSectionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_097_Check_Size_Cm_range_error_msg extends Base{
	//@Parameters ("url")
	//@BeforeTest
	//
	//public void launchurl() throws InterruptedException {
	//	getlaunchurl(getreaddata("url"));
	//}
	@Test
	public void check_size_cms_Test() throws InterruptedException {
		Thread.sleep(1000);
		WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		mousehover(collection);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h4[contains(text(),'Size')]")).click();
		Thread.sleep(1000);
		WebElement centimts=driver.findElement(By.xpath("//input[@value=\"cm\"]"));
		centimts.click();
		WebElement inputwidthcms=driver.findElement(By.xpath("//input[@name=\"width[cm]\"]"));
		inputwidthcms.sendKeys("40");
		Thread.sleep(1000);
		WebElement errormsg=driver.findElement(By.xpath("//div[contains(text(),'50 cm - 80000 cm')]"));
		String msg=errormsg.getText();
		Assert.assertEquals("50 cm - 80000 cm", msg);
		inputwidthcms.clear();
		inputwidthcms.sendKeys("81000");
		Assert.assertEquals("50 cm - 80000 cm", msg);
		WebElement inputlengthcms=driver.findElement(By.xpath("//input[@name=\"length[cm]\"]"));
		inputlengthcms.sendKeys("30");
		Thread.sleep(1000);
		errormsg=driver.findElement(By.xpath("//div[contains(text(),'50 cm - 80000 cm')]"));
		msg=errormsg.getText();
		Assert.assertEquals("50 cm - 80000 cm", msg);
		inputlengthcms.clear();
		inputlengthcms.sendKeys("81000");
		Assert.assertEquals("50 cm - 80000 cm", msg);



	}
}
