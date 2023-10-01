package filterSectionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_099_Check_Size_cms_accepts_special_character_or_not extends Base {
@Parameters ("url")
@BeforeTest

public void launchurl_rugartisan() throws InterruptedException {
	
	getlaunchurl(getreaddata("url"));
}
@Test
public void check_Size_cms_accepts_special_character_Test() throws InterruptedException {
	
	 Thread.sleep(1000);
	 WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
	 mousehover(collection);
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//h4[contains(text(),'Size')]")).click();
	 Thread.sleep(1000);
	 WebElement centimts=driver.findElement(By.xpath("//input[@value=\"cm\"]"));
	 centimts.isDisplayed();
	 Assert.assertTrue(true);
	 centimts.click();
	 WebElement widthcms=driver.findElement(By.xpath("//input[@name=\"width[cm]\"]"));
	 widthcms.sendKeys("@#$%^&");
	 WebElement validationmsg=driver.findElement(By.xpath("//div[@class=\"cm-width-error unit-error\"]"));
	 String msg=validationmsg.getText();
	 Assert.assertEquals("Required", msg);
	 System.out.println(msg);
	 WebElement lengthcms=driver.findElement(By.xpath("//input[@name=\"length[cm]\"]"));
	 lengthcms.sendKeys("@#$%^&");
	 Thread.sleep(1000);
	 msg=validationmsg.getText();
	 Assert.assertEquals("Required", msg);
	 
	 
}



}
