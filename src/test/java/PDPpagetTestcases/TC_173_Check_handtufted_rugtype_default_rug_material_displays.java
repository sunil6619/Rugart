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

public class TC_173_Check_handtufted_rugtype_default_rug_material_displays extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"select weavingtype\"]")
	private WebElement rugtypedropdown;
	@FindBy(xpath = "//span[contains(text(),'Hand Tufted')]/parent::div")
	private WebElement handtufted;
	@FindBy(xpath = "//div[@data-colors=\"#859F9C\"]/descendant::div[@class=\"select selected-material\"]")
	private WebElement rugmaterial;	
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Wool\"]")
	private WebElement purewooldropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"New Zealand Wool\"]")
	private WebElement newzealandwooldropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Silk\"]")
	private WebElement puresilkdropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Bamboo Silk\"]")
	private WebElement bamboosilkdropdown;

	public TC_173_Check_handtufted_rugtype_default_rug_material_displays() {
		PageFactory.initElements(driver, this);
	}

	public void clickoncollectionfof() throws InterruptedException, AWTException {
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
	}
	public void handtufted_rugtype_displaysdefault_rug_material() throws InterruptedException {
		//		rugtypedropdown.click();
		Thread.sleep(1000);
		rugmaterial.click();
		Thread.sleep(3000);
		String text=purewooldropdown.getText();
		Assert.assertEquals("Pure Wool",text);
		text=newzealandwooldropdown.getText();
		Assert.assertEquals("New Zealand Wool",text);
		text=puresilkdropdown.getText();
		Assert.assertEquals("Pure Silk",text);
		text=bamboosilkdropdown.getText();
		Assert.assertEquals("Bamboo Silk",text);	
	}

	//	TC_173_Check_handtufted_rugtype_default_rug_material_displays ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_173_Check_handtufted_rugtype_default_rug_material_displays();
	//	}

	@Test

	public void check_handtufted_default_materials() throws InterruptedException, AWTException {
		TC_173_Check_handtufted_rugtype_default_rug_material_displays ob=new TC_173_Check_handtufted_rugtype_default_rug_material_displays(); ;
		ob.clickoncollectionfof();
		ob.handtufted_rugtype_displaysdefault_rug_material();


	}

}
