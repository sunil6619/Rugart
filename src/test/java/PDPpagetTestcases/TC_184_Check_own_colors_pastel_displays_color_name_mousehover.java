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

public class TC_184_Check_own_colors_pastel_displays_color_name_mousehover extends Base{
	
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-EI12']")
	private WebElement colordropdown;
	@FindBy(id = "Core-tab")
	private WebElement corecolors;
	@FindBy(id = "Pastel-tab")
	private WebElement pastelcolors;
	@FindBy(xpath = "//span[@title=\"RA-14-N\"]")
	private WebElement color1;
	@FindBy(xpath = "//span[@title=\"RA-08-N\"]")
	private WebElement color2;
	@FindBy(xpath = "//span[@title=\"RA-58-N\"]")
	private WebElement color3;
	@FindBy(xpath = "//span[@title=\"RA-73-N\"]")
	private WebElement color4;
	
	
	
	public  TC_184_Check_own_colors_pastel_displays_color_name_mousehover() {
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
	
	public void colorname_displays_when_mousehover() throws InterruptedException, AWTException {
		Thread.sleep(1000);
//		zoomin();
		colordropdown.click();
		Thread.sleep(1000);	
		pastelcolors.click();
		String tooltip=color1.getAttribute("title");
		Assert.assertEquals("RA-14-N",tooltip);
		tooltip=color2.getAttribute("title");
		Assert.assertEquals("RA-08-N",tooltip);
		tooltip=color3.getAttribute("title");
		Assert.assertEquals("RA-58-N",tooltip);
		tooltip=color4.getAttribute("title");
		Assert.assertEquals("RA-73-N",tooltip);	
		
	}
	
	
	TC_184_Check_own_colors_pastel_displays_color_name_mousehover ob;
	@Parameters ("url")
	@BeforeTest

	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_184_Check_own_colors_pastel_displays_color_name_mousehover();

	}

	@Test

	public void check_core_colors_displays_tooltip_color_name() throws InterruptedException, AWTException {
		ob.clickoncollection();
		ob.colorname_displays_when_mousehover();


	}

}
