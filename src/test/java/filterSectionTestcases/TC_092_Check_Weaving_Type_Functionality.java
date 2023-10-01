package filterSectionTestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_092_Check_Weaving_Type_Functionality extends Base{
	
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));		
	}
	
	@Test
 public void check_weaving_type_functionality_Test() throws InterruptedException {
	 WebElement selectedfilterontop;
	 
	 WebElement pdppagerugtype;
	 String rugtype;
	 Thread.sleep(1000);
	 WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
	 mousehover(collection);
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
	 Thread.sleep(1000);
	 WebElement weavingtype=driver.findElement(By.xpath("//h4[contains(text(),'Weaving Type')]"));
	 weavingtype.click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/descendant::input[@value=\"handtufted\"]")).click();
	 Thread.sleep(1000);
	 selectedfilterontop=driver.findElement( By.xpath("//span[text()='handtufted']"));
	 selectedfilterontop.isDisplayed(); 
	 Assert.assertTrue(true);
	 driver.findElement(By.xpath("//img[@alt=\"Zinia Rectangle Hand Tufted Pure Woolhandmade custom rug\"]")).click();
	 Thread.sleep(2000);
     pdppagerugtype=driver.findElement(By.xpath("//span[contains(text(),'Hand Tufted')]/parent::div[@class=\"select weavingtype\"]"));
	 rugtype=pdppagerugtype.getText();
	 Assert.assertEquals("Hand Tufted", rugtype);
	 System.out.println(rugtype);
	 driver.navigate().back();
	 driver.findElement(By.xpath("//span[@data-attr_value=\"collection/field-of-flowers\"]/child::span[@class=\"closeicon\"]")).click();
	 driver.findElement(By.xpath("//span[@data-attr_value=\"handtufted\"]/child::span[@class=\"closeicon\"]")).click();
	 Thread.sleep(3000);
	 weavingtype=driver.findElement(By.xpath("//h4[contains(text(),'Weaving Type')]"));
	 weavingtype.click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/descendant::input[@value=\"flatweave\"]")).click();
	 Thread.sleep(1000);
	 selectedfilterontop=driver.findElement( By.xpath("//span[text()='flatweave']"));
	 selectedfilterontop.isDisplayed(); 
	 Assert.assertTrue(true);
	 driver.findElement(By.xpath("//img[@alt=\"Frisson Rectangle Flatweave New Zealand Woolhandmade custom rug\"]")).click();
	 pdppagerugtype=driver.findElement(By.xpath("//span[contains(text(),'Flatweave')]/parent::div[@class=\"select weavingtype\"]"));
	 rugtype=pdppagerugtype.getText();
	 Assert.assertEquals("Flatweave", rugtype);
	 System.out.println(rugtype);
	 driver.navigate().back();
	 driver.findElement(By.xpath("//span[@data-attr_value=\"flatweave\"]/child::span[@class=\"closeicon\"]")).click();
	 Thread.sleep(1000);
	 weavingtype=driver.findElement(By.xpath("//h4[contains(text(),'Weaving Type')]"));
	 weavingtype.click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/descendant::input[@value=\"outdoor\"]")).click();
	 Thread.sleep(1000);
	 selectedfilterontop=driver.findElement( By.xpath("//span[text()='outdoor']"));
	 selectedfilterontop.isDisplayed(); 
	 Assert.assertTrue(true);
	 driver.findElement(By.xpath("//img[@alt=\"Frisson Rectangle Outdoor Recycled Yarnhandmade custom rug\"]")).click();
	 pdppagerugtype=driver.findElement(By.xpath("//span[contains(text(),'Outdoor')]/parent::div[@class=\"select weavingtype\"]"));
	 rugtype=pdppagerugtype.getText();
	 Assert.assertEquals("Outdoor", rugtype);
	 System.out.println(rugtype);
	 driver.navigate().back();
	 driver.findElement(By.xpath("//span[@data-attr_value=\"outdoor\"]/child::span[@class=\"closeicon\"]")).click();
	 Thread.sleep(1000);
	 weavingtype=driver.findElement(By.xpath("//h4[contains(text(),'Weaving Type')]"));
	 weavingtype.click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/descendant::input[@value=\"handknotted\"]")).click();
	 Thread.sleep(1000);
	 selectedfilterontop=driver.findElement( By.xpath("//span[text()='handknotted']"));
	 selectedfilterontop.isDisplayed(); 
	 Assert.assertTrue(true);
	 List<WebElement>list=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
	 WebElement first=list.get(0);
	 first.click();
	 pdppagerugtype=driver.findElement(By.xpath("//span[contains(text(),'Hand Knotted')]/parent::div[@class=\"select weavingtype\"]"));
	 rugtype=pdppagerugtype.getText();
	 Assert.assertEquals("Hand Knotted", rugtype);
	 System.out.println(rugtype);
	 driver.navigate().back();
	 
	 
	 
	 
 }
}
