package homepagetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_079_Check_all_handmade_Custom_rugs extends Base{

//	@Parameters("url") 
//	@BeforeTest
//	public void getlaunchurl_rugartisan() throws InterruptedException
//	{
//		getlaunchurl(getreaddata("url"));
//
//	}
	@Test
	public void check_all_handmade_custom_rugs_Test() throws InterruptedException {
		String text="";
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,600)");
		WebElement explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']")).isDisplayed();
		Assert.assertTrue(true);
		Thread.sleep(1000);
//		WebElement arrow=driver.findElement(By.xpath("(//span[@aria-label=\"Previous\"]/parent::button[@class=\"owl-prev\"])[2]"));
//		clickjs(arrow);
		WebElement classics=driver.findElement(By.xpath("//span[text()='Classics']"));
		clickjs(classics);
		text=driver.findElement(By.xpath("//span[text()='Classics Custom Rugs']")).getText();
		Assert.assertEquals("Classics Custom Rugs",text);
		System.out.println(text);
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//a//span[text()='Summer']"))).click();
//		driver.findElement(By.xpath("//span[text()='Borders']")).click();
		driver.navigate().to("https://www.rugartisan.com/");
		Thread.sleep(1000);
		explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		WebElement distressed=driver.findElement(By.xpath("//span[text()='Distressed']"));
		clickjs(distressed);
		text=driver.findElement(By.xpath("//span[text()='Distressed Custom Rugs']")).getText();
		Assert.assertEquals("Distressed Custom Rugs",text);
		System.out.println(text);
		driver.navigate().to("https://www.rugartisan.com/");
		Thread.sleep(1000);
		explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		WebElement florals=driver.findElement(By.xpath("//span[text()='Florals']"));
		clickjs(florals);
		text=driver.findElement(By.xpath("//span[text()='Florals Custom Rugs']")).getText();
		Assert.assertEquals("Florals Custom Rugs",text);
		System.out.println(text);
		
		driver.navigate().to("https://www.rugartisan.com/");;
		Thread.sleep(1000);
		explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		WebElement geometry=driver.findElement(By.xpath("//span[text()='Geometry']"));
		clickjs(geometry);
		text=driver.findElement(By.xpath("//span[text()='Geometry Custom Rugs']")).getText();
		Assert.assertEquals("Geometry Custom Rugs",text);
		System.out.println(text);
		driver.navigate().to("https://www.rugartisan.com/");
		Thread.sleep(1000);
		explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		WebElement borders=driver.findElement(By.xpath("//span[text()='Borders']"));
		clickjs(borders);
		text=driver.findElement(By.xpath("//span[text()='Borders Custom Rugs']")).getText();
		Assert.assertEquals("Borders Custom Rugs",text);
		System.out.println(text);
		driver.navigate().to("https://www.rugartisan.com/");
		Thread.sleep(1000);
		explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		WebElement kids=driver.findElement(By.xpath("//span[text()='Kids']"));
		clickjs(kids);
		text=driver.findElement(By.xpath("//span[text()='Kids Custom Rugs']")).getText();
		Assert.assertEquals("Kids Custom Rugs",text);
		System.out.println(text);
		driver.navigate().to("https://www.rugartisan.com/");
		Thread.sleep(1000);
		explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		WebElement nature=driver.findElement(By.xpath("//span[text()='Nature']"));
		clickjs(nature);
		text=driver.findElement(By.xpath("//span[text()='Nature Custom Rugs']")).getText();
		Assert.assertEquals("Nature Custom Rugs",text);
		System.out.println(text);
		driver.navigate().to("https://www.rugartisan.com/");
		Thread.sleep(1000);
		explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		WebElement shapes=driver.findElement(By.xpath("//a/span[text()='Shapes']"));
		clickjs(shapes);
		Thread.sleep(1000);
		text=driver.findElement(By.xpath("//span[text()='Shapes Custom Rugs']")).getText();
		Assert.assertEquals("Shapes Custom Rugs",text);
		System.out.println(text);
		Thread.sleep(3000);
		driver.navigate().to("https://www.rugartisan.com/");
		Thread.sleep(1000);
		explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		WebElement stripes=driver.findElement(By.xpath("//span[text()='Stripes']"));
		clickjs(stripes);
		text=driver.findElement(By.xpath("//span[text()='Stripes Custom Rugs']")).getText();
		Assert.assertEquals("Stripes Custom Rugs",text);
		System.out.println(text);
		driver.navigate().to("https://www.rugartisan.com/");
		Thread.sleep(1000);
		explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		WebElement summer=driver.findElement(By.xpath("//span[text()='Summer']"));
		clickjs(summer);
		text=driver.findElement(By.xpath("//span[text()='Summer Custom Rugs']")).getText();
		Assert.assertEquals("Summer Custom Rugs",text);
		System.out.println(text);
		driver.navigate().to("https://www.rugartisan.com/");
		Thread.sleep(1000);
		explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		WebElement brights=driver.findElement(By.xpath("//span[text()='Brights']"));
		clickjs(brights);
		text=driver.findElement(By.xpath("//span[text()='Brights Custom Rugs']")).getText();
		Assert.assertEquals("Brights Custom Rugs",text);
		System.out.println(text);
		driver.navigate().to("https://www.rugartisan.com/");
		Thread.sleep(1000);
		explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		WebElement motifs=driver.findElement(By.xpath("//span[text()='Motifs']"));
		clickjs(motifs);
		text=driver.findElement(By.xpath("//span[text()='Motifs Custom Rugs']")).getText();
		Assert.assertEquals("Motifs Custom Rugs",text);
		System.out.println(text);
		driver.navigate().to("https://www.rugartisan.com/");
		Thread.sleep(1000);
		explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		WebElement monochrome=driver.findElement(By.xpath("//span[text()='Monochrome']"));
		clickjs(monochrome);
		text=driver.findElement(By.xpath("//span[text()='Monochrome Custom Rugs']")).getText();
		Assert.assertEquals("Monochrome Custom Rugs",text);
		System.out.println(text);
		driver.navigate().to("https://www.rugartisan.com/");
		Thread.sleep(1000);
		explorehandmade=driver.findElement(By.xpath("//h2[normalize-space()='Explore Our Handmade']"));
		scroll(explorehandmade);
		WebElement art=driver.findElement(By.xpath("//span[text()='Art']"));
		clickjs(art);
		text=driver.findElement(By.xpath("//span[text()='Art Custom Rugs']")).getText();
		Assert.assertEquals("Art Custom Rugs",text);
		System.out.println(text);
//		driver.navigate().back();
	
		
	}
}
