package headertestcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import resources.Base;

public class TC_001_Check_Signin_link extends Base {
//	public WebDriver ldriver;
//	ExtentSparkReporter htmlReporter;
//		ExtentReports reports;
//		ExtentTest test;
	
//	Home_page ob;
//	@Parameters("url")
//	@BeforeTest
//	
//	public void getlaunchurl_rugartisan() throws InterruptedException
//	{
//		getlaunchurl(getreaddata("url"));
//        Log.info("url launched");
////        extentreport();
//        
//        //extent report configuration
//        htmlReporter= new ExtentSparkReporter("ExtentReport.html");
//        reports=new ExtentReports();
//        reports.attachReporter(htmlReporter);
//        //add environment details
//        reports.setSystemInfo("Machine", "testpc");
//        reports.setSystemInfo("OS", "windows11");
//       
////configuration to change look and feel	
//        htmlReporter.config().setDocumentTitle("Extent Report");
//        htmlReporter.config().setReportName("Test Report");
//        htmlReporter.config().setTheme(Theme.STANDARD);
//        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
//     
//        
//	
//	}

	
	@Test
public void Check_Signin_link_Test() throws InterruptedException, IOException {
		
	Thread.sleep(3000);
//
//	
//	System.setProperty("webdriver.chrome.driver", "S:\\Eclipse 2\\Rugartisan_New\\drivers\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//    	driver.get("https://www.rugartisan.eu");
//	Thread.sleep(5000);
//	
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/butoon")).click();
//
//
//       driver.findElement(By.xpath("//button[@class=\"m-button m-accept\"]")).click();
//	    test=reports.createTest("click on sign in");
		driver.findElement(By.xpath(" //ul[@class=\"links\"]/li/span[text()='Sign in']")).click();;
		Thread.sleep(1000);
		String signinbox=driver.findElement(By.xpath("//form[@id=\"form-sign-in\"]//h3[text()='Sign In']")).getText();
    	System.out.println(signinbox);
    	Assert.assertEquals("SIGN IN", signinbox);
    	screenshot(driver,"Check_Signin_link_Test");
//		Thread.sleep(5000);
		
//		driver.close();
	
	}}
//	@AfterMethod
//	public void  getTestResult(ITestResult result) {
//		if(result.getStatus()==ITestResult.FAILURE)
//		{
//			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAIL ", ExtentColor.RED));
//			//if test failed then to get detials
//			test.fail(result.getThrowable());
//			
//		}
//		else if (result.getStatus()==ITestResult.SUCCESS)
//		{
//			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASS ", ExtentColor.GREEN));
//		}
//		
//	}
//	}
////	
//	@AfterTest
//		public void teardown() throws InterruptedException {
//		
//			reports.flush();
//			driver.close();
//		}	}
//


	


