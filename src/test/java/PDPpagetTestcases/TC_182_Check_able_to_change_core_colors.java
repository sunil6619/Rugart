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

public class TC_182_Check_able_to_change_core_colors extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-EI12']")
	private WebElement colordropdown1;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-CG10']")
	private WebElement colordropdown2;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-CS11']")
	private WebElement colordropdown3;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-BT03']")
	private WebElement colordropdown4;
	@FindBy(id = "Core-tab")
	private WebElement corecolors;
	@FindBy(xpath = "//span[@title=\"RA-DF04\"]")
	private WebElement color1;
	@FindBy(xpath = "//span[@title=\"RA-DC05\"]")
	private WebElement color2;
	@FindBy(xpath = "//span[@title=\"RA-EE04\"]")
	private WebElement color3;
	@FindBy(xpath = "//span[@title=\"RA-DM06\"]")
	private WebElement color4;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-DF04']")
	private WebElement pdpcolorname1;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-DC05']")
	private WebElement pdpcolorname2;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-EE04']")
	private WebElement pdpcolorname3;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-DM06']")
	private WebElement pdpcolorname4;

	public  TC_182_Check_able_to_change_core_colors() {
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

	public void change_core_colors() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		//				zoomin();
		colordropdown1.click();
		Thread.sleep(1000);	
		color1.click();
		Thread.sleep(1000);
		String text=pdpcolorname1.getText();
		Assert.assertEquals("RA-DF04",text);
		Thread.sleep(2000);
		pagedown();
		colordropdown2.click();
		Thread.sleep(1000);	
		color2.click();
		Thread.sleep(2000);
		text=pdpcolorname2.getText();
		Assert.assertEquals("RA-DC05",text);
		Thread.sleep(2000);
		colordropdown3.click();
		Thread.sleep(1000);	
		color3.click();
		Thread.sleep(1000);
		text=pdpcolorname3.getText();
		Assert.assertEquals("RA-EE04",text);
		Thread.sleep(2000);
		colordropdown4.click();
		Thread.sleep(1000);	
		color4.click();
		Thread.sleep(1000);
		text=pdpcolorname4.getText();
		Assert.assertEquals("RA-DM06",text);






	}

	TC_182_Check_able_to_change_core_colors ob;
	@Parameters ("url")
	@BeforeTest

	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_182_Check_able_to_change_core_colors();

	}

	@Test

	public void check_able_to_change_core_colors() throws InterruptedException, AWTException {
		ob.clickoncollection();
		ob.change_core_colors();


	}
}
