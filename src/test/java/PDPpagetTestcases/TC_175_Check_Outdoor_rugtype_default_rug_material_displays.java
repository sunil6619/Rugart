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

public class TC_175_Check_Outdoor_rugtype_default_rug_material_displays extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/descendant::img[@alt=\"Outdoor\"]")
	private WebElement outdoor;
	@FindBy(xpath = "//div[@data-colors=\"#ACB2A3\"]/descendant::div[@class=\"select selected-material\"]")
	private WebElement rugmaterial;	
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Recycled Yarn\"]")
	private WebElement recycledyarndropdown;

	public TC_175_Check_Outdoor_rugtype_default_rug_material_displays() {
		PageFactory.initElements(driver, this);
	}

	public void clickoncollection() throws InterruptedException, AWTException {
		mousehover(collection);
		Thread.sleep(1000);
		outdoor.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
	}
	public void outdoor_rugtype_displaysdefault_rug_material() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		rugmaterial.click();
		Thread.sleep(2000);
		String text=recycledyarndropdown.getText();
		Assert.assertEquals("Recycled Yarn",text);

	}
	TC_175_Check_Outdoor_rugtype_default_rug_material_displays ob;
	@Parameters ("url")
	@BeforeTest

	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_175_Check_Outdoor_rugtype_default_rug_material_displays();
	}

	@Test

	public void check_outdoor_default_materials() throws InterruptedException, AWTException {
		ob.clickoncollection();
		ob.outdoor_rugtype_displaysdefault_rug_material();


	}


}
