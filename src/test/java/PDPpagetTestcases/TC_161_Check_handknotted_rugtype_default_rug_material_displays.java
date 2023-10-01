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

public class TC_161_Check_handknotted_rugtype_default_rug_material_displays extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"select weavingtype\"]")
    private WebElement rugtypedropdown;
	@FindBy (xpath = "//li[@id=\"HandKnotted\"]")
	private WebElement handknotteddropdown;
	@FindBy(xpath = "//div[@data-colors=\"#859F9C\"]/descendant::div[@class=\"select selected-material\"]")
    private WebElement rugmaterial;	
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Tibetan Wool\"]")
	private WebElement tibetanwooldropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"New Zealand Wool\"]")
	private WebElement newzealandwooldropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Silk\"]")
	private WebElement puresilkdropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Bamboo Silk\"]")
	private WebElement bamboosilkdropdown;
	
	
	public TC_161_Check_handknotted_rugtype_default_rug_material_displays() {
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
	public void handknotted_rugtype_displaysdefault_rug_material() throws InterruptedException {
		rugtypedropdown.click();
		Thread.sleep(1000);
		handknotteddropdown.click();
		Thread.sleep(2000);
		rugmaterial.click();
		Thread.sleep(3000);
		String text=tibetanwooldropdown.getText();
		Assert.assertEquals("Tibetan Wool",text);
		text=newzealandwooldropdown.getText();
		Assert.assertEquals("New Zealand Wool",text);
		text=puresilkdropdown.getText();
		Assert.assertEquals("Pure Silk",text);
		text=bamboosilkdropdown.getText();
		Assert.assertEquals("Bamboo Silk",text);	
	}
	TC_161_Check_handknotted_rugtype_default_rug_material_displays ob;
	@Parameters ("url")
	@BeforeTest
	
	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_161_Check_handknotted_rugtype_default_rug_material_displays();
	}
	
	@Test
	
	public void checkhandknottedrugtype_default_materials() throws InterruptedException, AWTException {
		ob.clickoncollectionfof();
		ob.handknotted_rugtype_displaysdefault_rug_material();
		
		
	}
}
