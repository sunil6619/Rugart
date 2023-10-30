package resources;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Base {
	//	public String baseURL="https://www.rugartisan.eu";
	ExtentSparkReporter htmlReporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	public static WebDriver driver;
	public static Logger Log;


	String configpath="S:\\Eclipse 2\\Rugartisan_New\\config.properties";
	
//	@Parameters("url")
//	@BeforeTest
//
//	public void getlaunchurl_rugartisan() throws InterruptedException
//	{
//		getlaunchurl(getreaddata("url"));
//		Log.info("Chrome browser and url launch");
        
//        extentreport();
        
        //extent report configuration
//        htmlReporter= new ExtentSparkReporter("ExtentReport.html");
//        reports=new ExtentReports();
//        reports.attachReporter(htmlReporter);
        //add environment details
//        reports.setSystemInfo("Machine", "testpc");
//        reports.setSystemInfo("OS", "windows11");
       
//configuration to change look and feel	
//        htmlReporter.config().setDocumentTitle("Extent Report");
//        htmlReporter.config().setReportName("Test Report");
//        htmlReporter.config().setTheme(Theme.STANDARD);
//        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
//     
//        
//	
//	}
	@BeforeSuite
	public void initialiseExtentReports() {
		ExtentSparkReporter htmlReporter= new ExtentSparkReporter("ExtentReport.html");
		reports=new ExtentReports();
        reports.attachReporter(htmlReporter);
        reports.setSystemInfo("Machine", "testpc");
        reports.setSystemInfo("OS", "windows11");
        htmlReporter.config().setDocumentTitle("Extent Report");
      htmlReporter.config().setReportName("Test Report");
      htmlReporter.config().setTheme(Theme.STANDARD);
      htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		
	}
	
	@AfterSuite
	public void generateExtentreports() {
		reports.flush();
	}
	
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
//	}
//	
//	@AfterTest
//		public void teardown() throws InterruptedException {
//		
//			reports.flush();
//			driver.close();
//		}	




	public void getlaunchurl(String url) throws InterruptedException {


		//		System.setProperty("webdriver.chrome.driver", "S:\\Eclipse 2\\Rugartisan_New\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Log= LogManager.getLogger("Base");

		//		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/butoon")).click();
		driver.findElement(By.xpath("//butoon[contains(text(),'Ignore')]")).click();



		//		 driver.findElement(By.xpath("//button[@class=\"m-button m-accept\"]")).click();
		//		 driver.findElement(By.xpath("//ul[@class='links']//span[contains(text(),'Sign in')]")).click();
	}
	public void extentreport()
	{
		
		//extent report configuration
        htmlReporter= new ExtentSparkReporter("ExtentReport.html");
        reports=new ExtentReports();
        reports.attachReporter(htmlReporter);
        //add environment details
        reports.setSystemInfo("Machine", "testpc");
        reports.setSystemInfo("OS", "windows11");
       
//configuration to change look and feel	
        htmlReporter.config().setDocumentTitle("Extent Report");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}

	public String getreaddata(String key) {
		String value="";
		try {

			FileInputStream fis= new FileInputStream(configpath);
			Properties prop=new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
		} catch (Exception e) {
			System.err.println("Issue in Get Read data property file "+e);
		}

		return value;
	}

	public void mousehover(WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}

	public void scrolldown() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);

	}
	public void clickdiffshapes() throws InterruptedException {
		String text="";
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Rectangle']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Rectangle Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Square']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Square Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Round']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Round Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Oval']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Oval Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Runner']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Runner Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Halfmoon']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Halfmoon Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Hexagon']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Hexagon Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Diamond']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Diamond Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Capsule']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Capsule Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Drop']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Drop Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
		driver.findElement(By.xpath("//button[@class=\"owl-next\"]")).click();
		Thread.sleep(3000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Splash']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Splash Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);

		scrolldown();
		driver.findElement(By.xpath("//button[@class=\"owl-next\"]")).click();
		Thread.sleep(3000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Eight']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Eight Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
		driver.findElement(By.xpath("//button[@class=\"owl-next\"]")).click();
		Thread.sleep(3000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Oblong']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Oblong Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
		driver.findElement(By.xpath("//button[@class=\"owl-next\"]")).click();
		Thread.sleep(3000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Ogee']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Ogee Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
		driver.findElement(By.xpath("//button[@class=\"owl-next\"]")).click();
		Thread.sleep(3000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Arch']"))).click();
		Thread.sleep(3000);
		text=driver.findElement(By.xpath("//div[@id=\"page-title-wrap\"]/div/h1/span[contains(text(),'Arch Custom Rugs')]")).getText();
		Assert.assertTrue(true);
		System.out.println(text);
		scrolldown();
	}

	public void clickjs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

	public void scroll(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);		
	}
	public void scrollright() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(2000,0)");
	}
	public void pagedown() throws InterruptedException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		//	       act.sendKeys(Keys.PAGE_DOWN).build().perform();
		//	       Thread.sleep(1000);
	}
	public void pageup() throws InterruptedException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
	}
	public void pageleft() throws InterruptedException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_LEFT).build().perform();
		Thread.sleep(1000);
	}
	
	public void pageright() throws InterruptedException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_RIGHT).build().perform();
//		act.sendKeys(Keys.CONTROL);
//		act.sendKeys(Keys.SUBTRACT);
		Thread.sleep(1000);
	}

	public String extractnumberfromstring(String input) {
		return input.replaceAll("[^0-9]", "");
	}

	public int convertStringintoint(String input) {
		return Integer.valueOf(input);
	}

	public void zoomin() throws AWTException {

		Robot robot = new Robot();
		for (int i = 0; i < 2; i++) {			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
		}}
	
	
		
	public void screenshot() throws IOException {
		//Convert webdriver object to TakeScreenshot
			String filewithpath="S:\\Eclipse 2\\Rugartisan_New\\Screenshots\\test1.png";
			TakesScreenshot scrshot=((TakesScreenshot)driver);
			
	//Call getScreenshotAs method to create image file
			File Srcfile=scrshot.getScreenshotAs(OutputType.FILE);
			
	//Move image file to new destination
			File DestFile=new File(filewithpath);
			
	// Copy file to destination	
			FileUtils.copyFile(Srcfile, DestFile);	
			
		}
	
	
//	@AfterTest
//		public void teardown() throws InterruptedException {
//		
//			reports.flush();
//			driver.close();
//		}	

	
	//	@AfterTest
	//	public void teardown() throws InterruptedException {
	//	
	//		
	//		driver.close();
	//	}
}
