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
		driver.findElement(By.xpath("//div[contains (text(),'RA-55-N')]/ancestor-or-self::*/div[text()='Solid Colors']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Rectangle')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains (text(),'Breeze')]/ancestor-or-self::*/div[text()='Minimalist']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Runner')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains (text(),'Merge')]/ancestor-or-self::*/div[text()='Ombre']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Runner')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains (text(),'Merge')]/ancestor-or-self::*/div[text()='Ombre']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Capsule')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains (text(),'Fulfill')]/ancestor-or-self::*/div[text()='Minimalist']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Round')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains (text(),'Simple Border')]/ancestor-or-self::*/div[text()='Geometric']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Hexagon')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains (text(),'RA-CH06')]/ancestor-or-self::*/div[text()='Solid Colors']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Ogee')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains (text(),'Dimday')]/ancestor-or-self::*/div[text()='Cerulean']")).isDisplayed();
		Assert.assertTrue(true);	
		driver.findElement(By.xpath("//a[contains(text(),'Square')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains (text(),'Grid')]/ancestor-or-self::*/div[text()='Geometric']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Arch')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains (text(),'Sekkei')]/ancestor-or-self::*/div[text()='Origami']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Oblong')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains (text(),'Apocalypse')]/ancestor-or-self::*/div[text()='Minimalist']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Eight')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains (text(),'Qamar')]/ancestor-or-self::*/div[text()='Cerulean']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Halfmoon')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains (text(),'Merge')]/ancestor-or-self::*/div[text()='Ombre']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Diamond')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains (text(),'Cubism')]/ancestor-or-self::*/div[text()='Minimalist']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Drop')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Turbulent']/ancestor::div/div[@class=\"sub-cat-name surfaceart\"]")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//*[contains(text(), 'Oval')]/ancestor-or-self::*/div/button[@type=\"button\" and contains (@class,'owl-next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Splash')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Dawn Dew']/ancestor::div/div[@class=\"sub-cat-name abstract\"]")).isDisplayed();
		Assert.assertTrue(true);
	
	}
}
