package filterSectionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_103_Check_Size_if_left_blank_verify_error_msg extends Base{
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl_rugartisan() throws InterruptedException {
	//		
	//		getlaunchurl(getreaddata("url"));
	//	}
	@Test
	public void check_size_left_blank_Test() throws InterruptedException {

		Thread.sleep(1000);
		WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		mousehover(collection);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h4[contains(text(),'Size')]")).click();
		Thread.sleep(1000);
		WebElement submitbuttn=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		submitbuttn.isDisplayed();
		Assert.assertTrue(true);
		submitbuttn.click();
		WebElement validationmsgft=driver.findElement(By.xpath("//div[@class=\"feet-width-error unit-error\"]"));
		String msg=validationmsgft.getText();
		Assert.assertEquals("Required", msg);
		WebElement centimts=driver.findElement(By.xpath("//input[@value=\"cm\"]"));
		centimts.click();
		submitbuttn.click();
		WebElement validationmsgcms=driver.findElement(By.xpath("//div[@class=\"cm-width-error unit-error\"]"));
		msg=validationmsgcms.getText();
		Assert.assertEquals("Required",msg);
	}}
