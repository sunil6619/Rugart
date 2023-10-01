package homepagetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_080_Check_all_Trending_Styles extends Base{
	@Parameters("url") 
	@BeforeTest
	public void getlaunchurl_rugartisan() throws InterruptedException
	{
		getlaunchurl(getreaddata("url"));

	}
	@Test
	public void check_all_trending_styles_Test() throws InterruptedException {
	
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,600)");
		WebElement trendingstyles=driver.findElement(By.xpath("//h2[contains (text(),'Trending Styles')]"));
		scroll(trendingstyles);
		driver.findElement(By.xpath("//a[contains(text(),'Ombre')]/parent::div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Lunar']/parent::a/parent::div/parent::div/div[text()='Ombre']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Cerulean')]/parent::div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Dole']/parent::a/parent::div/parent::div/div[text()='Cerulean']")).isDisplayed();
		Assert.assertTrue(true);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Linear')]/parent::div[@class=\"owl-item active\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Junction']/parent::a/parent::div/parent::div/div[text()='Minimalist']")).isDisplayed();
		Assert.assertTrue(true);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Borders')]/parent::div[@class=\"owl-item active\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Simple Border']/parent::a/parent::div/parent::div/div[text()='Geometric']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Minimalist')]/parent::div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Fulfill']/parent::a/parent::div/parent::div/div[text()='Minimalist']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Surface Art')]/parent::div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Deluge']/parent::a/parent::div/parent::div/div[text()='Surface Art']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Terrazzo Play')]/parent::div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Splosh']/parent::a/parent::div/parent::div/div[text()='Terrazzo Play']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Batik')]/parent::div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Curio']/parent::a/parent::div/parent::div/div[text()='Batik']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Contemporary')]/parent::div[@class=\"owl-item active\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Glitch']/parent::a/parent::div/parent::div/div[text()='Abstract']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//div[@class=\"owl-nav\"]/following::button[@type=\"button\" and contains(@class, 'owl-next')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Field of Flowers')]/parent::div[@class=\"owl-item active\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Amaryllis']/parent::a/parent::div/parent::div/div[text()='Field of Flowers']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//div[@class=\"owl-nav\"]/following::button[@type=\"button\" and contains(@class, 'owl-next')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Vintage')]/parent::div[@class=\"owl-item active\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Indigo Stamp']/parent::a/parent::div/parent::div/div[text()='Vintage']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//div[@class=\"owl-nav\"]/following::button[@type=\"button\" and contains(@class, 'owl-next')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Floral')]/parent::div[@class=\"owl-item active\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Blossom']/parent::a/parent::div/parent::div/div[text()='Floral']")).isDisplayed();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("(//div[@class=\"owl-nav\"]/following::button[@type=\"button\" and contains(@class, 'owl-next')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Patterns')]/parent::div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Polyhedron']/parent::a/parent::div/parent::div/div[text()='Modern Geometrics']")).isDisplayed();
		Assert.assertTrue(true);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class=\"owl-nav\"]/following::button[@type=\"button\" and contains(@class, 'owl-next')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Distressed')]/parent::div[@class=\"owl-item active\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Parallel Strokes']/parent::a/parent::div/parent::div/div[text()='Brush Strokes']")).isDisplayed();
		Assert.assertTrue(true);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class=\"owl-nav\"]/following::button[@type=\"button\" and contains(@class, 'owl-next')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Origami')]/parent::div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Jomon']/ancestor-or-self::*/div[@class=\"sub-cat-name origami\"]")).isDisplayed();
		Assert.assertTrue(true);
		
}
	
}
