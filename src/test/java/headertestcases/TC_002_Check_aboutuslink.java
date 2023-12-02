package headertestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import resources.Base;

public class TC_002_Check_aboutuslink extends Base {
	
//	@Parameters("url")
//	@BeforeTest
//	public void getlaunchurl_rugartisan() throws InterruptedException
//	{
//		getlaunchurl(getreaddata("url"));
//
//	}
	@Test
	public void Check_aboutuslink_Test() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='About ']")).click();
		String Currenturl=driver.getCurrentUrl();
		System.out.println(Currenturl);
		Assert.assertEquals("https://www.rugartisan.com/about", Currenturl);
//		 test=reports.createTest("Check about us link");
		
	}
	

}
