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

public class TC_150_Check_square_shape_length_change_same_as_width_color_sample  extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"designShape_msdd\"]")
	private WebElement rugshapedropdown;
	@FindBy(xpath = "//li[@title=\"square\"]")
	private WebElement squareshape;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"length[feet]\"]")
	private WebElement lgthftsample ;
	@FindBy(xpath = "//span[contains(text(),'Order Yarn Color Samples')]")
	private WebElement ordersample;
	@FindBy(xpath = "//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"width[feet]\"]")
	private WebElement widthftsample;
	
	
	public TC_150_Check_square_shape_length_change_same_as_width_color_sample() {
		PageFactory.initElements(driver, this);
	}
	public void mousehovercollection() {
		mousehover(collection);
	}
	
	public void clickonfof() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		fof.click();
		 Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
			}
	public void shapedropdown_selectshape() {
		rugshapedropdown.click();
		squareshape.click();
		widthft.click();
		widthft.sendKeys("6");
		}
   public void ordersamplerugsize() throws InterruptedException {
	   Thread.sleep(1000);
	   Actions act = new Actions(driver);
       act.sendKeys(Keys.PAGE_UP).build().perform();
       Thread.sleep(1000);
       act.sendKeys(Keys.PAGE_UP).build().perform();
       Thread.sleep(1000);
      ordersample.click();
	Thread.sleep(2000);
	widthftsample.click();
	widthftsample.clear();
	widthftsample.sendKeys("8");
	Thread.sleep(1000);
	String text=lgthftsample.getAttribute("value");
	Assert.assertEquals("8", text);
	
}

   TC_150_Check_square_shape_length_change_same_as_width_color_sample ob;
@Parameters("url")
@BeforeTest

   public void launchurl() throws InterruptedException {
	getlaunchurl(getreaddata("url"));
	ob=new TC_150_Check_square_shape_length_change_same_as_width_color_sample();	
}
  @Test

   public void check_square_shape_length_change_same_as_width_color_sample() throws InterruptedException, AWTException {
	  ob.mousehovercollection();
	  ob.clickonfof();
	  ob.shapedropdown_selectshape();
	  Thread.sleep(2000);
	  ob.ordersamplerugsize();
	  
  }
}
