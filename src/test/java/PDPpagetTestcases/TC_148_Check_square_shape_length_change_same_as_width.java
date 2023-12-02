package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_148_Check_square_shape_length_change_same_as_width extends Base{
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
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;

	public TC_148_Check_square_shape_length_change_same_as_width() {
		PageFactory.initElements(driver, this);
	}

	public void mousehovercollection() {
		mousehover(collection);
	}

	public void clickonfof() throws InterruptedException, AWTException {
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
		String text=lgthft.getAttribute("value");
		Assert.assertEquals("6",text);
	}

	//	@Parameters("url")
	//	@BeforeTest
	//	
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob=new TC_148_Check_square_shape_length_change_same_as_width ();
	//	}
	@Test
	public void check_square_shape_length_change_same_as_width() throws InterruptedException, AWTException {
		TC_148_Check_square_shape_length_change_same_as_width ob= new TC_148_Check_square_shape_length_change_same_as_width () ;
		ob.mousehovercollection();
		ob.clickonfof();
		ob.shapedropdown_selectshape();


	}}
