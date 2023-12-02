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

public class TC_172_Check_rugtype_remains_same_change_color_and_shape extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"designShape_msdd\"]")
	private WebElement rugshapedropdown;
	@FindBy(xpath = "//div[@class=\"select weavingtype\"]")
	private WebElement rugtypedropdown;
	@FindBy (xpath = "//li[@id=\"HandKnotted\"]")
	private WebElement handknotteddropdown;
	@FindBy(xpath = "//span[contains(text(),'MORE ')]")
	private WebElement morecolors;
	@FindBy(xpath = "//img[@class=\"suggestion-img\"]")
	private List<WebElement> colorsuggestions;
	@FindBy(xpath = "//a[@class=\"close\"]")
	private WebElement colorsuggclose;
	@FindBy(xpath = "//li[@title=\"square\"]")
	private WebElement squareshape;
	@FindBy(xpath = "//span[text()='Hand Knotted']/parent::div")
	private WebElement handknotted;
	@FindBy(xpath = "//span[text()='square']")
	private WebElement squarerugshape;

	public TC_172_Check_rugtype_remains_same_change_color_and_shape() {
		PageFactory.initElements(driver,this);
	}

	//clicking on collections field of flowers
	public void clickoncollectionfof() throws InterruptedException, AWTException {
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(2);
		first.click();
		zoomin();
	}

	public void change_color_shape_checkrugtype() throws InterruptedException {
		Thread.sleep(1000);
		rugtypedropdown.click();
		Thread.sleep(1000);
		handknotteddropdown.click();
		Thread.sleep(1000);
		morecolors.click();
		Thread.sleep(2000);
		List<WebElement>list=colorsuggestions;
		WebElement color2=list.get(2);
		color2.click();
		Thread.sleep(1000);
		colorsuggclose.click();
		Thread.sleep(2000);
		rugshapedropdown.click();
		Thread.sleep(1000);
		squareshape.click();
		String text=squarerugshape.getText();
		Assert.assertEquals("Square",text);
		text=handknotted.getText();
		Assert.assertEquals("Hand Knotted",text);

	}



	//	TC_172_Check_rugtype_remains_same_change_color_and_shape ob;
	//	@Parameters("url")
	//	@BeforeTest
	//
	//	public void launchrugartisan() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_172_Check_rugtype_remains_same_change_color_and_shape();
	//	}
	@Test
	public void check_rugtyperemains_same__when_color_shape_changed() throws InterruptedException, AWTException {
		TC_172_Check_rugtype_remains_same_change_color_and_shape ob=  new TC_172_Check_rugtype_remains_same_change_color_and_shape();
		ob.clickoncollectionfof();
		ob.change_color_shape_checkrugtype();
	}
}
