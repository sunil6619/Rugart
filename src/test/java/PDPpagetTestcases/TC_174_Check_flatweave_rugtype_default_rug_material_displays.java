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

public class TC_174_Check_flatweave_rugtype_default_rug_material_displays extends Base {
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/descendant::img[@alt=\"Flatweaves\"]")
	private WebElement flatweaves;
	@FindBy(xpath = "//div[@data-selected-color=\"#D9C5A2\"]/descendant::div[@class=\"select selected-material\"]")
	private WebElement rugmaterial;	
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Wool\"]")
	private WebElement purewooldropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"New Zealand Wool\"]")
	private WebElement newzealandwooldropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Silk\"]")
	private WebElement puresilkdropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Bamboo Silk\"]")
	private WebElement bamboosilkdropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Recycled Yarn\"]")
	private WebElement recycledyarndropdown;

	public TC_174_Check_flatweave_rugtype_default_rug_material_displays() {
		PageFactory.initElements(driver, this);
	}

	public void clickoncollection() throws InterruptedException, AWTException {
		mousehover(collection);
		Thread.sleep(1000);
		flatweaves.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
	}

	public void flatweaves_rugtype_displaysdefault_rug_material() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		rugmaterial.click();
		Thread.sleep(2000);
		String text=purewooldropdown.getText();
		Assert.assertEquals("Pure Wool",text);
		text=newzealandwooldropdown.getText();
		Assert.assertEquals("New Zealand Wool",text);
		text=puresilkdropdown.getText();
		Assert.assertEquals("Pure Silk",text);
		text=bamboosilkdropdown.getText();
		Assert.assertEquals("Bamboo Silk",text);
		text=recycledyarndropdown.getText();
		Assert.assertEquals("Recycled Yarn",text);

	}
//	TC_174_Check_flatweave_rugtype_default_rug_material_displays ob;
//	@Parameters ("url")
//	@BeforeTest
//
//	public void launchurl() throws InterruptedException {
//		getlaunchurl(getreaddata("url"));
//		ob= new TC_174_Check_flatweave_rugtype_default_rug_material_displays();
//	}

	@Test

	public void check_flatweave_default_materials() throws InterruptedException, AWTException {
		TC_174_Check_flatweave_rugtype_default_rug_material_displays ob= new TC_174_Check_flatweave_rugtype_default_rug_material_displays();
		ob.clickoncollection();
		ob.flatweaves_rugtype_displaysdefault_rug_material();


	}


}