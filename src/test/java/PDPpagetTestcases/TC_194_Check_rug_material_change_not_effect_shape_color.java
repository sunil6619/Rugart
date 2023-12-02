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

public class TC_194_Check_rug_material_change_not_effect_shape_color extends Base {

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@data-colors=\"#859F9C\"]/descendant::div[@class=\"select selected-material\"]")
	private WebElement rugmaterial2;
	@FindBy(xpath = "//div[@data-colors=\"#C8A894\"]/descendant::div[@class=\"select selected-material\"]")
	private WebElement rugmaterial1;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"New Zealand Wool\"]")
	private WebElement newzealandwool;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Silk\"]")
	private WebElement puresilk;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Bamboo Silk\"]")
	private WebElement bamboosilk;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Wool\"]")
	private WebElement purewool;
	@FindBy(xpath = "//div[@id=\"designShape_msdd\"]")
	private WebElement rugshapedropdown;
	@FindBy(xpath = "//span[text()='rectangle']/parent::span")
	private WebElement rugshape;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-EI12')]")
	private WebElement color1;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-CG10')]")
	private WebElement color22;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-CS11')]")
	private WebElement color3;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-BT03')]")
	private WebElement color4;

	public  TC_194_Check_rug_material_change_not_effect_shape_color () {
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

	public void change_rugmaterial() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		rugmaterial1.click();
		Thread.sleep(1000);
		String expectedshape=rugshape.getText();
		Assert.assertEquals("Rectangle",expectedshape);
		zoomin();
		String beforerugmaterialchange1=color1.getText();
		Assert.assertEquals("RA-EI12",beforerugmaterialchange1);
		newzealandwool.click();
		Thread.sleep(2000);
		String afterrugmaterialshape=rugshape.getText();
		Assert.assertEquals("Rectangle",afterrugmaterialshape);
		String afterrugmaterialchange1=color1.getText();
		Assert.assertEquals("RA-EI12",afterrugmaterialchange1);

	}
	//	TC_194_Check_rug_material_change_not_effect_shape_color ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_194_Check_rug_material_change_not_effect_shape_color();
	//				Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_rug_material_changes_not_effect_shape_colors() throws InterruptedException, AWTException {
		TC_194_Check_rug_material_change_not_effect_shape_color ob=  new TC_194_Check_rug_material_change_not_effect_shape_color();
		ob.clickoncollection();
		ob.change_rugmaterial();
		Log.info("Clicking on collection FOF and changing rug materials,checking not effecting shape and selected colors");
	}



}
