package Ordersample_SectionTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_135_Check_order_samples_after_signin extends Base{
//	@Parameters ("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException {
//		
//		getlaunchurl(getreaddata("url"));
//	}
	@Parameters({"email","password"})
	@Test

	public void check_order_samples_after_login_Test() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		WebElement sigin=driver.findElement(By.xpath("//ul[@class=\"links\"]/descendant::span[contains(text(),'Sign in')]"));
		sigin.click();
		Thread.sleep(1000);
		WebElement siginbox=driver.findElement(By.xpath("//h3[text()='Sign In']"));
		String text=siginbox.getText();
		Assert.assertEquals("SIGN IN",text);
		WebElement emailinput=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		emailinput.sendKeys(getreaddata("email"));
		WebElement passwordinput=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		passwordinput.sendKeys(getreaddata("password"));
		WebElement loginbutton=driver.findElement(By.xpath("//button[@id=\"btn-submit\"]"));
		loginbutton.click();
		Thread.sleep(2000);
		WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		 mousehover(collection);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		 Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
		WebElement ordersamples=driver.findElement(By.xpath("//span[contains(text(),'Order Yarn Color Samples')]"));
		ordersamples.click();
		Thread.sleep(2000);
		WebElement widthft=driver.findElement(By.xpath("//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"width[feet]\"]"));
		widthft.sendKeys("6");
		Thread.sleep(1000);
		WebElement lengthft=driver.findElement(By.xpath("//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"length[feet]\"]"));
		lengthft.sendKeys("8");
		WebElement ordersamplesbutton=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		ordersamplesbutton.isDisplayed();
		Assert.assertTrue(true);
		ordersamplesbutton.click();
		Thread.sleep(2000);
		WebElement minicartpopup=driver.findElement(By.xpath("//div[@class=\"dropdown-menu cart-list top-minicart show\"]"));
		minicartpopup.isDisplayed();
		Assert.assertTrue(true);
		WebElement colorsample=driver.findElement(By.xpath("//p[contains(text(),'Color Sample ')]"));
		colorsample.isDisplayed();
		Assert.assertTrue(true);
		WebElement viewcart=driver.findElement(By.xpath("//a[contains(text(),'View and Edit Cart')]"));
		viewcart.click();
		Thread.sleep(1000);
		WebElement colorsampleincart=driver.findElement(By.xpath("//span[text()='Color Sample']"));
		text=colorsampleincart.getText();
		Assert.assertEquals("Color Sample",text);
}}
