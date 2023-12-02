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

public class TC_131_Check_enter_different_values_ft_cms extends Base{
//	@Parameters ("url")
//	@BeforeTest
//	
//	public void launchurl_rugartisan() throws InterruptedException {
//		
//		getlaunchurl(getreaddata("url"));
//	}
	
	@Test

	public void check_enter_different_value_ft_cms_Test() throws InterruptedException, AWTException {
		Thread.sleep(1000);
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
		widthft.clear();
		widthft.sendKeys("6");
		String text=widthft.getAttribute("value");	
		Assert.assertEquals("6",text);
		Thread.sleep(1000);
		WebElement widthinch=driver.findElement(By.xpath("//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"width[inch]\"]"));
		widthinch.clear();
		widthinch.sendKeys("5");
		text=widthinch.getAttribute("value");
		Assert.assertEquals("5",text);
		Thread.sleep(1000);
		WebElement lengthft=driver.findElement(By.xpath("//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"length[feet]\"]"));
		lengthft.clear();
		lengthft.sendKeys("8");
		text=lengthft.getAttribute("value");
		Assert.assertEquals("8",text);
		Thread.sleep(1000);
		WebElement lengthinch=driver.findElement(By.xpath("//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"length[inch]\"]"));
		lengthinch.clear();
		lengthinch.sendKeys("2");
		text=lengthinch.getAttribute("value");
		Assert.assertEquals("2",text);
		Thread.sleep(1000);
		widthft.clear();
		widthft.sendKeys("8");
		lengthft.clear();
		lengthft.sendKeys("12");
		Thread.sleep(1000);
		WebElement cm=driver.findElement(By.xpath("//div[@class=\"rug-size-box cs-rug-size-box\"]/descendant::label[@for=\"cs_cm\"]"));
		cm.click();
		WebElement widthcm=driver.findElement(By.xpath("//div[@class=\"rug-size cs_cm\"]/descendant::input[@name=\"width[cm]\"]"));
		widthcm.sendKeys("100");
		text=widthcm.getAttribute("value");
		Assert.assertEquals("100",text);
		Thread.sleep(1000);
		WebElement lengthcm=driver.findElement(By.xpath("//div[@class=\"rug-size cs_cm\"]/descendant::input[@name=\"length[cm]\"]"));
		lengthcm.sendKeys("600");
		text=lengthcm.getAttribute("value");
		Assert.assertEquals("600",text);
		Thread.sleep(2000);
		widthcm.clear();
		widthcm.sendKeys("200");
		Thread.sleep(1000);
		lengthcm.clear();
		lengthcm.sendKeys("800");
	}
}
