package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_147_Check_round_shape_displays_diameter extends Base {
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"designShape_msdd\"]")
	private WebElement rugshapedropdown;
	@FindBy(xpath = "//p[text()='Select your rug shape ']")
	private WebElement rugshape;
	@FindBy(xpath = "//li[@title=\"round\"]")
	private WebElement roundshape;
	@FindBy(xpath = "//label[text()='Diameter']")
	private WebElement diameter;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement diameterft;
	@FindBy(xpath = "//input[@id=\"widthInchRug\"]")
	private WebElement diameterinch;
	
	@FindBy(xpath = "//label[@for=\"cm\"]")
	private WebElement cmradiobutton;
	
	@FindBy(xpath = "//input[@id=\"widthCmRug\"]")
	private WebElement diametercm;
	
	public TC_147_Check_round_shape_displays_diameter() {
		PageFactory.initElements(driver, this);
	}
	
	public void mousehovercollection() {
		mousehover(collection);
	}
	
	TC_147_Check_round_shape_displays_diameter ob;
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		

		getlaunchurl(getreaddata("url"));
		ob=new TC_147_Check_round_shape_displays_diameter();
		
	}
	

	@Test

	public void check_rugshapes_verify_title_Test() throws InterruptedException, AWTException {
		TC_147_Check_round_shape_displays_diameter ob=new TC_147_Check_round_shape_displays_diameter();
		Thread.sleep(1000);
		 ob.mousehovercollection();
		 Thread.sleep(1000);
		 ob.fof.click();
		 Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
		Thread.sleep(2000);
		ob.rugshapedropdown.click();
		ob.roundshape.click();
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
//        act.sendKeys(Keys.PAGE_DOWN).build().perform();
//        Thread.sleep(2000);
//       
		String text=ob.diameter.getText();
		Assert.assertEquals("DIAMETER",text);
		Thread.sleep(1000);
		ob.diameterft.click();
		ob.diameterft.sendKeys("4");
		ob.diameterinch.click();
		ob.diameterinch.sendKeys("6");
		Thread.sleep(2000);
		ob.cmradiobutton.click();
		ob.diametercm.click();
		ob.diametercm.sendKeys("500");
		
		
		
		
}}
