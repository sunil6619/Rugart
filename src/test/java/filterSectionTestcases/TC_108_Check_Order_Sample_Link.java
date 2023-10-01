package filterSectionTestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_108_Check_Order_Sample_Link extends Base{
	@Parameters ("url")
	@BeforeTest

	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));
	}
	@Test
	public void check_order_sample_link_Test() throws InterruptedException {
		
		 Thread.sleep(1000);
		 WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		 mousehover(collection);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		 Thread.sleep(1000);
		 List<WebElement> edit=driver.findElements(By.xpath("//img[@alt=\"edit\"]"));
		 WebElement first=edit.get(0);
		 Thread.sleep(2000);
		 mousehover(first);
		 List<WebElement> ordersample=driver.findElements(By.xpath("//span[contains(text(),'Order Sample')]"));
		 first=ordersample.get(0);
		 first.click();
		 Thread.sleep(2000);
		 WebElement ordersamplebox=driver.findElement(By.xpath("//h3[contains(text(),'ORDER COLOR SAMPLES')]"));
		 String text=ordersamplebox.getText();
		 Assert.assertEquals("ORDER COLOR SAMPLES", text);
		 
}}
