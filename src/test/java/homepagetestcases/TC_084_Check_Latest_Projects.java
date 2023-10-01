package homepagetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_084_Check_Latest_Projects extends Base{

		@Parameters("url") 
		@BeforeTest
		public void getlaunchurl_rugartisan() throws InterruptedException
		{
			getlaunchurl(getreaddata("url"));

		}
		@Test
		
		public void check__latest_projects_Test() throws InterruptedException {
			Thread.sleep(1000);
			WebElement projects=driver.findElement(By.xpath("//a[contains(text(),'Latest Projects')]"));
			scroll(projects);
		    projects.click();
		    driver.findElement(By.xpath("//h4[contains(text(),'Featured Clients')]")).isDisplayed();
		    Assert.assertTrue(true);
		}

}
