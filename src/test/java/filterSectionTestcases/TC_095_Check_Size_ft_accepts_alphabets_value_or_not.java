package filterSectionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_095_Check_Size_ft_accepts_alphabets_value_or_not extends Base{

	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
	}
	
//	@FindBy (xpath="//div[@class=\"feet-width-error unit-error\"]")
//	public WebElement validationmsg;
	 
	@Test
	public void check_size_ft_accepts_alphabet_value_Test() throws InterruptedException {
		Thread.sleep(1000);
		WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
		 mousehover(collection);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//h4[contains(text(),'Size')]")).click();
		 Thread.sleep(1000);
		 WebElement width= driver.findElement(By.xpath("//div[@class=\"rug-size feet\"]/descendant::label[text()='Width']"));
		 width.isDisplayed();
		 Assert.assertTrue(true);
		 WebElement length=driver.findElement(By.xpath("//div[@class=\"rug-size feet\"]/descendant::label[text()='Length']"));
		 length.isDisplayed();
		 Assert.assertTrue(true);
		 WebElement inputwidthft=driver.findElement(By.xpath("//input[@name=\"width[feet]\"]"));
		 inputwidthft.sendKeys("abc");
		 WebElement validationmsg=driver.findElement(By.xpath("//div[@class=\"feet-width-error unit-error\"]"));
		 String msg=validationmsg.getText();
		 Assert.assertEquals("Required", msg);
		 System.out.println(msg);
		 WebElement inputlengthft=driver.findElement(By.xpath("//input[@name=\"length[feet]\"]"));
		 inputlengthft.sendKeys("agh");
		 Thread.sleep(1000);
		 msg=validationmsg.getText();
		 Assert.assertEquals("Required", msg);
		
	}
}
