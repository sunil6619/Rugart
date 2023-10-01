package resources;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Propertyutility.Propertyutility;



public class Base implements Propertyutility {
//	public String baseURL="https://www.rugartisan.eu";

	public static WebDriver driver;
	
	String configpath="S:\\Eclipse 2\\Rugartisan_New\\config.properties";
	
//	JavascriptExecutor js= (JavascriptExecutor)driver;
	public void getlaunchurl(String url) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "S:\\Eclipse 2\\Rugartisan_New\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);

//		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/butoon")).click();
		 driver.findElement(By.xpath("//butoon[contains(text(),'Ignore')]")).click();

			

//		 driver.findElement(By.xpath("//button[@class=\"m-button m-accept\"]")).click();
//		 driver.findElement(By.xpath("//ul[@class='links']//span[contains(text(),'Sign in')]")).click();
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
		
		public String extractnumberfromstring(String input) {
			 return input.replaceAll("[^0-9]", "");
		}
		
		public int convertStringintoint(String input) {
			return Integer.valueOf(input);
		}
		
		public void zoomin() throws AWTException {
			
			Robot robot = new Robot();
			for (int i = 0; i < 3; i++) {			
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
			}
		}
//	@AfterTest
//	public void teardown() throws InterruptedException {
//	
//		
//		driver.close();
//	}
}
