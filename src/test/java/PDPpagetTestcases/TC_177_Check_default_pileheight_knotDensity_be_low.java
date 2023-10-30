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

public class TC_177_Check_default_pileheight_knotDensity_be_low extends Base {

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"select weavingtype\"]")
	private WebElement rugtypedropdown;
	@FindBy (xpath = "//li[@id=\"HandKnotted\"]")
	private WebElement handknotteddropdown;
	@FindBy(xpath = "//p[contains(text(),'Pile Height ')]")
	private WebElement pileheight;
	@FindBy(xpath = "//input[@pile_text=\"0.5-0.6 inch\"]")
	private WebElement lowestinchft;
	@FindBy(xpath = "(//*[contains(text(), 'Specify your size')]/ancestor-or-self::*/DIV/DIV/LABEL[contains(@class, 'radio-label')])[1]")
	private WebElement radiocm;
	@FindBy(xpath = "//input[@valueatt=\"12-14mm\"]")
	private WebElement lowestmm;
	@FindBy(xpath = "//p[contains(text(),'Knot Density ')]")
	private WebElement knotdensity;
	@FindBy(xpath = "//input[@valueatt=\"100_knots\"]")
	private WebElement lowestknots;
	@FindBy(xpath = "//p[contains(text(),'Specify your size ')]")
	private WebElement specifysize;


	public  TC_177_Check_default_pileheight_knotDensity_be_low() {
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

	public void default_knotdensity_pileheight_select() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		scroll(pileheight);
		String text=pileheight.getText();
		Assert.assertEquals("PILE HEIGHT",text);
		boolean selectstate=lowestinchft.isSelected();
		Assert.assertTrue(selectstate);
		pageup();
		Thread.sleep(1000);
		//		scroll(specifysize);
		radiocm.click();
		Thread.sleep(1000);
		pagedown();
		boolean selectedcm=lowestmm.isSelected();
		Assert.assertTrue(selectedcm);
		pageup();
		Thread.sleep(1000);
		zoomin();
		//		pageup();
		rugtypedropdown.click();
		Thread.sleep(1000);
		handknotteddropdown.click();
		Thread.sleep(1000);
		//		zoomin();
		pagedown();
		//		scroll(pileheight);
		text=knotdensity.getText();
		Assert.assertEquals("KNOT DENSITY",text);
		selectstate=lowestknots.isSelected();
		Assert.assertTrue(selectstate);

	}
	TC_177_Check_default_pileheight_knotDensity_be_low ob;
	@Parameters ("url")
	@BeforeTest

	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_177_Check_default_pileheight_knotDensity_be_low();
	}

	@Test

	public void check_default_pileheight_knotdensity() throws InterruptedException, AWTException {
		ob.clickoncollection();
		ob.default_knotdensity_pileheight_select();


	}


}
