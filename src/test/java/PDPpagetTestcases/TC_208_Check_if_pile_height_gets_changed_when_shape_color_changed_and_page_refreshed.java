package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_208_Check_if_pile_height_gets_changed_when_shape_color_changed_and_page_refreshed extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"cm\"]")
	private WebElement radiocm;
	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"feet\"]")
	private WebElement feet;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//div[@id=\"designShape_msdd\"]")
	private WebElement rugshapedropdown;
	@FindBy(xpath = "//li[@title=\"round\"]")
	private WebElement roundshape;
	@FindBy(xpath = "//span[contains(text(),'MORE ')]")
	private WebElement morecolors;
	@FindBy(xpath = "//a[@class=\"close\"]")
	private WebElement closebutton;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-ED12']")
	private WebElement colorname1;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-DL10']")
	private WebElement colorname2;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-AO11']")
	private WebElement colorname3;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-BS03']")
	private WebElement colorname4;
	@FindBy(xpath = "//span[@id=\"designShape_title\"]/child::span[contains(text(),'round')]")
	private WebElement rugshape;
	@FindBy(xpath = "//input[@pile_text=\"0.5-0.6 inch\"]")
	private WebElement lowestinchft;



	public  TC_208_Check_if_pile_height_gets_changed_when_shape_color_changed_and_page_refreshed() {
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

	public void change_color_shape_refresh_if_pile_height_changed() throws InterruptedException{
		Thread.sleep(1000);
		morecolors.click();
		Thread.sleep(1000);
		List<WebElement>list=driver.findElements(By.xpath("//img[@class=\"suggestion-img\"]"));
		WebElement three=list.get(3);
		three.click();
		closebutton.click();
		Thread.sleep(1000);
		String color1=colorname1.getText();
		String color2=colorname2.getText();
		String color3=colorname3.getText();
		String color4=colorname4.getText();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);	
		rugshapedropdown.click();
		Thread.sleep(1000);
		roundshape.click();
		Thread.sleep(1000);
		String shape=rugshape.getText();
		Thread.sleep(1000);
		boolean selectstate=lowestinchft.isSelected();
		Assert.assertTrue(selectstate);
		driver. navigate(). refresh();
		Thread.sleep(1000);
		String afterrefreshcolor1=colorname1.getText();
		String afterrefreshcolor2=colorname2.getText();
		String afterrefreshcolor3=colorname3.getText();
		String afterrefreshcolor4=colorname4.getText();
		String afterrefreshshape=rugshape.getText();
		System.out.println(afterrefreshshape);
		if(color1.equals(afterrefreshcolor1) && color2.equals(afterrefreshcolor2) && color3.equals(afterrefreshcolor3) && color4.equals(afterrefreshcolor4) ) 
		{
			System.out.println("Colors are not changed after page refresh");
		}
		else {
			System.out.println("Colors are changed ");
		}
		if (shape.equals(afterrefreshshape)) {
			System.out.println("Shape is not changed after page refresh");
		}
		else {
			System.out.println("Shape is changed ");

		}

		boolean afterallchanges=lowestinchft.isSelected();
		Assert.assertTrue(afterallchanges);

	}
	TC_208_Check_if_pile_height_gets_changed_when_shape_color_changed_and_page_refreshed ob;
	@Parameters ("url")
	@BeforeTest

	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_208_Check_if_pile_height_gets_changed_when_shape_color_changed_and_page_refreshed();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_if_pile_height_gets_changed() throws InterruptedException, AWTException {
		ob.clickoncollection();
		ob.change_color_shape_refresh_if_pile_height_changed();
		Log.info("Clicking on collection FOF and checking pile height is changed or not when color,");
	}

}
