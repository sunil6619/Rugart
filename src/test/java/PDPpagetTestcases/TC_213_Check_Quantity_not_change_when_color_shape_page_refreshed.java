package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_213_Check_Quantity_not_change_when_color_shape_page_refreshed extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//input[@id=\"qty-number\"]")
	private WebElement quantity;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;

	@FindBy(xpath = "//span[@id=\"increase\"]")
	private WebElement increaseqty;
	@FindBy(xpath = "//div[@id=\"designShape_msdd\"]")
	private WebElement rugshapedropdown;
	@FindBy(xpath = "//li[@title=\"round\"]")
	private WebElement roundshape;
	@FindBy(xpath = "//span[contains(text(),'MORE ')]")
	private WebElement morecolors;
	@FindBy(xpath = "//a[@class=\"close\"]")
	private WebElement closebutton;

	public  TC_213_Check_Quantity_not_change_when_color_shape_page_refreshed () {
		PageFactory.initElements(driver, this);
	}
	public void clickoncollection() throws InterruptedException, AWTException {

		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(2);
		first.click();
		zoomin();
	}
	public void change_shape_color_page_refersh() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		Thread.sleep(1000);
		String expectedqty=quantity.getAttribute("value");
		pageup();
		morecolors.click();
		Thread.sleep(1000);
		List<WebElement>list=driver.findElements(By.xpath("//img[@class=\"suggestion-img\"]"));
		WebElement three=list.get(3);
		three.click();
		closebutton.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);	
		rugshapedropdown.click();
		Thread.sleep(1000);
		roundshape.click();
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		String afterchangesqty=quantity.getAttribute("value");
		if(expectedqty.equals(afterchangesqty))
		{
			System.out.println("Quantity not changed");
		}
		else {
			System.out.println("Quantity changed");
		}

	}

	//	TC_213_Check_Quantity_not_change_when_color_shape_page_refreshed  ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_213_Check_Quantity_not_change_when_color_shape_page_refreshed ();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_quantity_not_changed_color_shape_page_refreshed() throws InterruptedException, AWTException {
		TC_213_Check_Quantity_not_change_when_color_shape_page_refreshed  ob = new TC_213_Check_Quantity_not_change_when_color_shape_page_refreshed ();
		ob.clickoncollection();
		ob.change_shape_color_page_refersh();
		Log.info("Clicking on collection FOF and checking quantity not changed");
	}

}
