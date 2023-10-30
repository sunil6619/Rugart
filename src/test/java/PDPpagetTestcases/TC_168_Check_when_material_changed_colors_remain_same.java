package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_168_Check_when_material_changed_colors_remain_same extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@data-colors=\"#859F9C\"]/descendant::div[@class=\"select selected-material\"]")
	private WebElement rugmaterialdropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"New Zealand Wool\"]")
	private WebElement newzealandwooldropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Silk\"]")
	private WebElement puresilkdropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Bamboo Silk\"]")
	private WebElement bamboosilkdropdown;
	@FindBy(xpath = "//div[@class=\"dropdown dropdown-material active\"]/descendant::li[@id=\"Pure Wool\"]")
	private WebElement purewooldropdown;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-EI12')]")
	private WebElement color1;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-CG10')]")
	private WebElement color22;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-CS11')]")
	private WebElement color3;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-BT03')]")
	private WebElement color4;

	public TC_168_Check_when_material_changed_colors_remain_same() {
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
	//taking colors name and changing material,comparing before and after colors name
	public void changematerial_check_colors() throws InterruptedException {
		Thread.sleep(1000);
		String color1st=color1.getText();
		String color2nd=color22.getText();
		String color3rd=color3.getText();
		String color4th=color4.getText();
		rugmaterialdropdown.click();
		Thread.sleep(1000);
		newzealandwooldropdown.click();
		Thread.sleep(1000);
		String aftermaterialchangecolor1st=color1.getText();
		String aftermaterialchangecolor2nd=color22.getText();
		String aftermaterialchangecolor3rd=color3.getText();
		String aftermaterialchangecolor4th=color4.getText();

		// comparing before and after material change colors name
		if(color1st.equals(aftermaterialchangecolor1st) && color2nd.equals(aftermaterialchangecolor2nd) && color3rd.equals(aftermaterialchangecolor3rd) && color4th.equals(aftermaterialchangecolor4th) ) 
		{
			System.out.println("Colors are not changed after material change");
		}
		else {
			System.out.println("Colors are changed ");
		}


	}



	TC_168_Check_when_material_changed_colors_remain_same ob;
	@Parameters("url")
	@BeforeTest

	public void launchrugartisan() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_168_Check_when_material_changed_colors_remain_same();
	}
	@Test
	public void check_material_changed_colors_remain_same() throws InterruptedException, AWTException {

		ob.clickoncollectionfof();
		ob.changematerial_check_colors();
	}
}
