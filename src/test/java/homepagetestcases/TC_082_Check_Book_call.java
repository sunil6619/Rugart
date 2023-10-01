package homepagetestcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_082_Check_Book_call extends Base{
	@Parameters("url") 
	@BeforeTest
	public void getlaunchurl_rugartisan() throws InterruptedException
	{
		getlaunchurl(getreaddata("url"));

	}
	@Test
	public void check_book_call_Test() throws InterruptedException {
		System.out.println("Current window Handle: "+driver.getWindowHandle()+"\n");
		Thread.sleep(1000);
		WebElement bookcall=driver.findElement(By.xpath("//a[contains (text(),'Book A Call Now')]"));
		scroll(bookcall);
		Thread.sleep(1000);
		bookcall.click();
		Set<String> windowhandles=driver.getWindowHandles();
		List<String>windowhandlesList=new ArrayList<>(windowhandles);
		System.out.println("Total window number: "+ windowhandlesList.size()+"\n");
		driver.switchTo().window(windowhandlesList.get(1));
//		Thread.sleep(5000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Accept all')]"))).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Accept all')]")).click();
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.findElement(By.xpath("//h1[contains(text(),'15 Minute Design Consultation')]")).isDisplayed();
		Assert.assertTrue(true);
		
	}
}
