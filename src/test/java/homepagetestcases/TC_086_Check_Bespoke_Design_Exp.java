package homepagetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_086_Check_Bespoke_Design_Exp extends Base{

	@Parameters("url")
	@BeforeTest
	
	public void getlaunchurl_rugartisan() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
	}
	
	@Test
	
	public void check_bespoke_design_exp_Test() throws InterruptedException {
		Thread.sleep(1000);
		WebElement bespoke=driver.findElement(By.xpath("//a[contains(text(),'Bespoke Design Experience')]"));
		scroll(bespoke);
		bespoke.click();
		driver.findElement(By.xpath("//div[contains(text(),'Design your own Bespoke Rug')]")).isDisplayed();
		Assert.assertTrue(true);
		
		
	}
}
