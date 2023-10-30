package homepagetestcases;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_081_Check_all_Trending_Shapes extends Base {
	@Parameters("url") 
	@BeforeTest
	public void getlaunchurl_rugartisan() throws InterruptedException
	{
		getlaunchurl(getreaddata("url"));

	}
	@Test
	public void check_all_trending_shapes_Test() throws InterruptedException {
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,600)");
		WebElement trendingshapes=driver.findElement(By.xpath("//h2[contains (text(),'Trending Shapes')]"));
		scroll(trendingshapes);
		driver.findElement(By.xpath("//a[contains(text(),'Oval')]")).click();
		Thread.sleep(1000);
//		WebElement oval=driver.findElement(By.xpath("//div[@class=\"product-image\"]/child::a[@href=\"https://www.rugartisan.com/custom-rug/custom-ra-55-n-handtufted-oval-purewool-rug.html\"]"));
//		String text=oval.getAttribute("href");
//		System.out.println("Oval shape shows correct shape : "+text);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-ra-55-n-handtufted-oval-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Rectangle')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-breeze-handtufted-rectangle-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Runner')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-merge-handtufted-runner-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
//		driver.findElement(By.xpath("//a[contains(text(),'Runner')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[contains (text(),'Merge')]/ancestor-or-self::*/div[text()='Ombre']")).isDisplayed();
//		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Capsule')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-fulfill-handtufted-capsule-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Round')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-simple-border-handtufted-round-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Hexagon')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-ra-ch06-handtufted-hexagon-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Ogee')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-dimday-handtufted-ogee-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);	
		driver.findElement(By.xpath("//a[contains(text(),'Square')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-grid-handtufted-square-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Arch')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-sekkei-handtufted-arch-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Oblong')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-qamar-handtufted-oblong-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Eight')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-qamar-handtufted-eight-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Halfmoon')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-merge-handtufted-halfmoon-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Diamond')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-cubism-handtufted-diamond-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Drop')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-turbulent-handtufted-drop-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Splash')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://www.rugartisan.com/custom-rug/custom-dawn-dew-handtufted-splash-purewool-rug.html\"]/parent::div[@class=\"product-name\"]")).isDisplayed();
		Assert.assertTrue(true);
	
	}
}
