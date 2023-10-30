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

public class TC_186_Check_able_to_change_pastel_colors extends Base {

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-EI12']")
	private WebElement colordropdown;
	@FindBy(id = "Pastel-tab")
	private WebElement pastelcolors;
	@FindBy(xpath = "//span[@title=\"RA-14-N\"]")
	private WebElement color1;
	@FindBy(xpath = "//span[@title=\"RA-08-N\"]")
	private WebElement color2;
	@FindBy(xpath = "//span[@title=\"RA-58-N\"]")
	private WebElement color3;
	@FindBy(xpath = "//span[@title=\"RA-73-N\"]")
	private WebElement color4;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-EI12']")
	private WebElement colordropdown1;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-CG10']")
	private WebElement colordropdown2;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-CS11']")
	private WebElement colordropdown3;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-BT03']")
	private WebElement colordropdown4;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-14-N']")
	private WebElement pdpcolorname1;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-08-N']")
	private WebElement pdpcolorname2;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-58-N']")
	private WebElement pdpcolorname3;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-73-N']")
	private WebElement pdpcolorname4;
	
	
	public  TC_186_Check_able_to_change_pastel_colors() {
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
	
	public void change_pastel_colors() throws InterruptedException {
		Thread.sleep(1000);
		colordropdown1.click();
		Thread.sleep(1000);
		pastelcolors.click();
		Thread.sleep(1000);
		color1.click();
		Thread.sleep(1000);
		String text=pdpcolorname1.getText();
		Assert.assertEquals("RA-14-N",text);
		Thread.sleep(1000);
		pagedown();
		colordropdown2.click();
		Thread.sleep(1000);
		pastelcolors.click();
		Thread.sleep(1000);	
		color2.click();
		Thread.sleep(2000);
		text=pdpcolorname2.getText();
		Assert.assertEquals("RA-08-N",text);
		Thread.sleep(2000);
		colordropdown3.click();
		Thread.sleep(1000);
		pastelcolors.click();
		Thread.sleep(1000);	
		color3.click();
		Thread.sleep(1000);
		text=pdpcolorname3.getText();
		Assert.assertEquals("RA-58-N",text);
		Thread.sleep(2000);
		colordropdown4.click();
		Thread.sleep(1000);
		pastelcolors.click();
		Thread.sleep(1000);	
		color4.click();
		Thread.sleep(1000);
		text=pdpcolorname4.getText();
		Assert.assertEquals("RA-73-N",text);	
	}
	
	TC_186_Check_able_to_change_pastel_colors ob;
	@Parameters ("url")
	@BeforeTest

	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_186_Check_able_to_change_pastel_colors();

	}

	@Test

	public void check_able_to_change_pastel_colors() throws InterruptedException, AWTException {
		ob.clickoncollection();
		ob.change_pastel_colors();
		



	}


}
