package PDPpagetTestcases;

import java.awt.AWTException;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_144_Check_rug_shapes_verify_pagetitle extends Base{
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		

		getlaunchurl(getreaddata("url"));
		
	}
	@Test

	public void check_rugshapes_verify_title_Test() throws InterruptedException, AWTException {
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
		Thread.sleep(2000);
		WebElement rugshape=driver.findElement(By.xpath("//p[text()='Select your rug shape ']"));
		String text=rugshape.getText();
		Assert.assertEquals("SELECT YOUR RUG SHAPE",text);
		WebElement rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
		rugshapedropdown.click();
		Thread.sleep(1000);
//		zoomin();
//		Robot robot = new Robot();			
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
        text=driver.getTitle();
		Assert.assertEquals("Zinia Field of Flowers Rectangle Hand Tufted Handmade Custom Rug | Rug Artisan",text);
		System.out.println(text);
        WebElement roundshape=driver.findElement(By.xpath("//li[@title=\"round\"]"));
        roundshape.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Round Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);
        Thread.sleep(1000);
        rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
        rugshapedropdown.click();
        Thread.sleep(1000);
        WebElement runnershape=driver.findElement(By.xpath("//li[@title=\"runner\"]"));
        runnershape.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Runner Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);
        rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
        rugshapedropdown.click();
        Thread.sleep(1000);
        WebElement squareshape=driver.findElement(By.xpath("//li[@title=\"square\"]"));
        squareshape.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Square Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);
        rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
        rugshapedropdown.click();
        Thread.sleep(1000);
        WebElement oval=driver.findElement(By.xpath("//li[@title=\"oval\"]"));
        oval.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Oval Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);
        rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
        rugshapedropdown.click();
        Thread.sleep(1000);
        WebElement capsule=driver.findElement(By.xpath("//li[@title=\"capsule\"]"));
        capsule.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Capsule Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);
        Thread.sleep(1000);
        rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
        rugshapedropdown.click();
        Thread.sleep(1000);
        WebElement diamond=driver.findElement(By.xpath("//li[@title=\"diamond\"]"));
        diamond.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Diamond Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);
        Thread.sleep(1000);
        rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
        rugshapedropdown.click();
        Thread.sleep(1000);
        WebElement arch=driver.findElement(By.xpath("//li[@title=\"arch\"]"));
        arch.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Arch Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);
        Thread.sleep(1000);
        rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
        rugshapedropdown.click();
        Thread.sleep(1000);
        WebElement halfmoon=driver.findElement(By.xpath("//li[@title=\"halfmoon\"]"));
        halfmoon.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Halfmoon Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);
        Thread.sleep(1000);
        rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
        rugshapedropdown.click();
        Thread.sleep(1000);
        WebElement hexagon=driver.findElement(By.xpath("//li[@title=\"hexagon\"]"));
        hexagon.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Hexagon Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);
        Thread.sleep(1000);
        rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
        rugshapedropdown.click();
        Thread.sleep(1000);
        WebElement oblong=driver.findElement(By.xpath("//li[@title=\"oblong\"]"));
        oblong.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Oblong Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);
        Thread.sleep(1000);
        rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
        rugshapedropdown.click();
        Thread.sleep(1000);
        WebElement ogee=driver.findElement(By.xpath("//li[@title=\"ogee\"]"));
        ogee.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Ogee Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);
        Thread.sleep(1000);
        rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
        rugshapedropdown.click();
        Thread.sleep(1000);
        WebElement splash=driver.findElement(By.xpath("//li[@title=\"splash\"]"));
        splash.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Splash Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);
        Thread.sleep(1000);
        rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
        rugshapedropdown.click();
        Thread.sleep(1000);
        WebElement drop=driver.findElement(By.xpath("//li[@title=\"drop\"]"));
        drop.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Drop Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);
        Thread.sleep(1000);
        rugshapedropdown=driver.findElement(By.xpath("//div[@id=\"designShape_msdd\"]"));
        rugshapedropdown.click();
        Thread.sleep(1000);
        WebElement eight=driver.findElement(By.xpath("//li[@title=\"eight\"]"));
        eight.click();
        text=driver.getTitle();
        Assert.assertEquals("Zinia Field of Flowers Eight Hand Tufted Handmade Custom Rug | Rug Artisan",text);
        System.out.println(text);

	}}
