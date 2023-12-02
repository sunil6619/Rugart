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

public class TC_185_Check_own_colors_pastel_displays_color_name_left_side_when_mousehover extends Base {
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
	@FindBy(className = "slClrnm")
	private WebElement colornameleft;

	public  TC_185_Check_own_colors_pastel_displays_color_name_left_side_when_mousehover() {
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
		colordropdown.click();
		Thread.sleep(2000);	
		pastelcolors.click();
		Thread.sleep(1000);
		mousehover(color1);
		String text=colornameleft.getText();
		Assert.assertEquals("RA-14-N",text);
		Thread.sleep(1000);
		mousehover(color2);
		text=colornameleft.getText();
		Assert.assertEquals("RA-08-N",text);
		Thread.sleep(1000);
		mousehover(color3);
		text=colornameleft.getText();
		Assert.assertEquals("RA-58-N",text);
		Thread.sleep(1000);
		mousehover(color4);
		text=colornameleft.getText();
		Assert.assertEquals("RA-73-N",text);

	}

	//	
	//	TC_185_Check_own_colors_pastel_displays_color_name_left_side_when_mousehover ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_185_Check_own_colors_pastel_displays_color_name_left_side_when_mousehover();
	//
	//	}

	@Test

	public void check_core_colors_displays_on_leftside_when_mousehover() throws InterruptedException, AWTException {
		TC_185_Check_own_colors_pastel_displays_color_name_left_side_when_mousehover ob= new TC_185_Check_own_colors_pastel_displays_color_name_left_side_when_mousehover();
		ob.clickoncollection();
		ob.colorname_displays_leftside_when_mousehover();


	}


}
