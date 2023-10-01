package headertestcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_114_Check_Search_enter_product_name_rugstyle extends Base {
	@Parameters("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		
		
	}
@Test

public void check_search_enter_product_name_Test() throws InterruptedException, AWTException {
	
	   Thread.sleep(1000);
	   WebElement search=driver.findElement(By.xpath("//span[contains(text(),'SEARCH')]"));
	   search.click();
	   Thread.sleep(1000);
	   WebElement searchtextbox=driver.findElement(By.xpath("//input[@id=\"search-input\"]"));
	   searchtextbox.sendKeys("Minimalist");
	   Thread.sleep(2000);
	   Robot robot= new Robot();
	   robot.keyPress(KeyEvent.VK_ENTER);
	   Thread.sleep(1000);
	   robot.keyPress(KeyEvent.VK_ENTER);
	   Thread.sleep(2000);
//	   zoomin();
       WebElement verifypage=driver.findElement(By.xpath("//b[text()='Minimalist']"));
       String text=verifypage.getText();
       Assert.assertEquals("Minimalist", text);
       driver.navigate().back();
       search=driver.findElement(By.xpath("//span[contains(text(),'SEARCH')]"));
       search.click();
	   Thread.sleep(2000);
	   searchtextbox=driver.findElement(By.xpath("//input[@id=\"search-input\"]"));
	   searchtextbox.clear();
       searchtextbox.sendKeys("repeat");
       WebDriverWait wait=new WebDriverWait(driver, 10);
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Repeatsm taupe']/parent::li")));
       WebElement repearmoti=driver.findElement(By.xpath("//div[text()='Repeatsm taupe']/parent::li"));
       repearmoti.click();
       
}}
