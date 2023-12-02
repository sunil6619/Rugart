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

public class TC_156_Check_handknotted_rugtype_knot_density_displays extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"select weavingtype\"]")
	private WebElement rugtypedropdown;
	@FindBy (xpath = "//li[@id=\"HandKnotted\"]")
	private WebElement handknotteddropdown;
	@FindBy(xpath = "//label[contains(text(),'100 KNOTS')]")
	private WebElement knotdensity1;
	@FindBy(xpath = "//label[contains(text(),'150 KNOTS')]")
	private WebElement knotdensity2;
	@FindBy(xpath = "//label[contains(text(),'200 KNOTS')]")
	private WebElement knotdensity3;


	public TC_156_Check_handknotted_rugtype_knot_density_displays() {
		PageFactory.initElements(driver, this);
	}
	public void collectionfof() throws InterruptedException, AWTException {
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
	}

	public void handknots_knot_density_check() throws InterruptedException {
		rugtypedropdown.click();
		Thread.sleep(1000);
		handknotteddropdown.click();
		Thread.sleep(1000);
		String text=knotdensity1.getText();
		Assert.assertEquals("100 KNOTS", text);
		text=knotdensity2.getText();
		Assert.assertEquals("150 KNOTS", text);
		text=knotdensity3.getText();
		Assert.assertEquals("200 KNOTS", text);
	}
	//	TC_156_Check_handknotted_rugtype_knot_density_displays ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//	
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_156_Check_handknotted_rugtype_knot_density_displays();
	//	}
	@Test
	public void check_handknottedrugtype_knot_density() throws InterruptedException, AWTException {
		TC_156_Check_handknotted_rugtype_knot_density_displays ob= new TC_156_Check_handknotted_rugtype_knot_density_displays(); ;
		ob.collectionfof();
		ob.handknots_knot_density_check();

	}

}
