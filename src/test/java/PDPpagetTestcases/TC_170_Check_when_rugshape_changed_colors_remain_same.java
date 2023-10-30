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

public class TC_170_Check_when_rugshape_changed_colors_remain_same extends Base{
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

	public TC_170_Check_when_rugshape_changed_colors_remain_same() {
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
	//taking colors name and changing rug shape,comparing before and after colors name
	public void changerugshape_verify_colors_remain_same() throws InterruptedException {
		Thread.sleep(1000);
		String color1st=color1.getText();
		String color2nd=color22.getText();
		String color3rd=color3.getText();
		String color4th=color4.getText();
		rugshapedropdown.click();
		Thread.sleep(1000);
		roundshape.click();
		Thread.sleep(1000);
		String aftershapechangedcolor1st=color1.getText();
		String aftershapechangedcolor2nd=color22.getText();
		String aftershapechangedcolor3rd=color3.getText();
		String aftershapechangedcolor4th=color4.getText();

		// comparing before and after rugshape change colors name
		if(color1st.equals(aftershapechangedcolor1st) && color2nd.equals(aftershapechangedcolor2nd) && color3rd.equals(aftershapechangedcolor3rd) && color4th.equals(aftershapechangedcolor4th) ) 
		{
			System.out.println("Colors are not changed after rug shape is changed");
		}
		else {
			System.out.println("Colors are changed ");
		}

	}
	TC_170_Check_when_rugshape_changed_colors_remain_same ob;
	@Parameters("url")
	@BeforeTest

	public void launchrugartisan() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_170_Check_when_rugshape_changed_colors_remain_same();
	}
	@Test
	public void check_rugshape_changed_colors_remain_same() throws InterruptedException, AWTException {

		ob.clickoncollectionfof();
		ob.changerugshape_verify_colors_remain_same();
	}
}
