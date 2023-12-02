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

public class TC_171_Check_when_color_and_shape_changed_updated_colors_displays_on_changed_shape extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"designShape_msdd\"]")
	private WebElement rugshapedropdown;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-EI12')]")
	private WebElement color1;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-CG10')]")
	private WebElement color22;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-CS11')]")
	private WebElement color3;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-BT03')]")
	private WebElement color4;
	@FindBy(xpath = "//li[@title=\"round\"]")
	private WebElement roundshape;
	@FindBy(xpath = "//span[contains(text(),'MORE ')]")
	private WebElement morecolors;
	@FindBy(xpath = "//img[@class=\"suggestion-img\"]")
	private List<WebElement> colorsuggestions;
	@FindBy(xpath = "//a[@class=\"close\"]")
	private WebElement colorsuggclose;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-BH12')]")
	private WebElement newcolor1;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-DH10')]")
	private WebElement newcolor2;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-EF11')]")
	private WebElement newcolor3;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-DT01')]")
	private WebElement newcolor4;

	public TC_171_Check_when_color_and_shape_changed_updated_colors_displays_on_changed_shape() {
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
	// changing colors,shape ,comparing before and after colors name
	public void changecolor_and_shape_verify_color_change() throws InterruptedException {
		Thread.sleep(1000);
		String color1st=color1.getText();
		String color2nd=color22.getText();
		String color3rd=color3.getText();
		String color4th=color4.getText();
		morecolors.click();
		Thread.sleep(2000);
		List<WebElement>list=colorsuggestions;
		WebElement color2=list.get(2);
		color2.click();
		Thread.sleep(1000);
		colorsuggclose.click();
		pagedown();
		Thread.sleep(2000);
		rugshapedropdown.click();
		Thread.sleep(1000);
		roundshape.click();
		Thread.sleep(1000);
		String aftercolorshapechangecolor1=newcolor1.getText();
		String aftercolorshapechangecolor2=newcolor2.getText();
		String aftercolorshapechangecolor3=newcolor3.getText();
		String aftercolorshapechangecolor4=newcolor4.getText();

		// comparing before and after rugshape change colors name
		if(color1st!=(aftercolorshapechangecolor1) && color2nd!=(aftercolorshapechangecolor2)&& color3rd!=(aftercolorshapechangecolor3) && color4th!=(aftercolorshapechangecolor4) ) 
		{
			System.out.println("Colors are changed after color,shape is changed");
		}
		else {
			System.out.println("Colors are not changed ");
		}

	}
	//	TC_171_Check_when_color_and_shape_changed_updated_colors_displays_on_changed_shape ob;
	//	@Parameters("url")
	//	@BeforeTest
	//
	//	public void launchrugartisan() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_171_Check_when_color_and_shape_changed_updated_colors_displays_on_changed_shape();
	//	}
	@Test
	public void check_color_shape_changed_updated_colors_displays() throws InterruptedException, AWTException {
		TC_171_Check_when_color_and_shape_changed_updated_colors_displays_on_changed_shape ob= new TC_171_Check_when_color_and_shape_changed_updated_colors_displays_on_changed_shape();
		ob.clickoncollectionfof();
		ob.changecolor_and_shape_verify_color_change();
	}
}

