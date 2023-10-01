package headertestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_113_Check_Search_functionality extends Base {

	@Parameters("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		
		
	}
@Test

public void check_search_functionality_Test() throws InterruptedException {
	   Thread.sleep(1000);
	   WebElement search=driver.findElement(By.xpath("//span[contains(text(),'SEARCH')]"));
	   search.click();
	   Thread.sleep(1000);
	   String text=driver.findElement(By.xpath("//h4[contains(text(),'custom rug')]")).getText();
	   Assert.assertEquals("HOW TO CREATE YOUR CUSTOM RUG", text);
	
}
}
