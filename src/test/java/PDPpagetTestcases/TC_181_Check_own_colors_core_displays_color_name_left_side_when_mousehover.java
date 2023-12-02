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

public class TC_181_Check_own_colors_core_displays_color_name_left_side_when_mousehover extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-EI12']")
	private WebElement colordropdown;
	@FindBy(id = "Core-tab")
	private WebElement corecolors;
	@FindBy(xpath = "//span[@title=\"RA-DF04\"]")
	private WebElement color1;
	@FindBy(xpath = "//span[@title=\"RA-DC05\"]")
	private WebElement color2;
	@FindBy(xpath = "//span[@title=\"RA-EE04\"]")
	private WebElement color3;
	@FindBy(xpath = "//span[@title=\"RA-DM06\"]")
	private WebElement color4;
	@FindBy(className = "slClrnm")
	private WebElement colornameleft;

	public  TC_181_Check_own_colors_core_displays_color_name_left_side_when_mousehover() {
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

	public void colorname_displays_leftside_when_mousehover() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		//		zoomin();
		colordropdown.click();
		Thread.sleep(1000);	
		mousehover(color1);
		String text=colornameleft.getText();
		Assert.assertEquals("RA-DF04",text);
		Thread.sleep(1000);
		mousehover(color2);
		text=colornameleft.getText();
		Assert.assertEquals("RA-DC05",text);
		Thread.sleep(1000);
		mousehover(color3);
		text=colornameleft.getText();
		Assert.assertEquals("RA-EE04",text);
		Thread.sleep(1000);
		mousehover(color4);
		text=colornameleft.getText();
		Assert.assertEquals("RA-DM06",text);



	}

	//	TC_181_Check_own_colors_core_displays_color_name_left_side_when_mousehover ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_181_Check_own_colors_core_displays_color_name_left_side_when_mousehover();
	//	}

	@Test

	public void check_core_colors_displays_on_leftside_when_mousehover() throws InterruptedException, AWTException {
		TC_181_Check_own_colors_core_displays_color_name_left_side_when_mousehover ob=  new TC_181_Check_own_colors_core_displays_color_name_left_side_when_mousehover();
		ob.clickoncollection();
		ob.colorname_displays_leftside_when_mousehover();


	}
}
