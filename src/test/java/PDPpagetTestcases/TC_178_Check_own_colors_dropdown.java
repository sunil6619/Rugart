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

public class TC_178_Check_own_colors_dropdown extends Base {

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-EI12']")
	private WebElement colordropdown;
	@FindBy(id = "Core-tab")
	private WebElement corecolors;




	public  TC_178_Check_own_colors_dropdown() {
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

	public void check_owncolor_dropdown() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		//		zoomin();
		colordropdown.click();
		Thread.sleep(1000);
		String text=corecolors.getText();
		Assert.assertEquals("CORE COLORS", text);

	}

	//	TC_178_Check_own_colors_dropdown ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_178_Check_own_colors_dropdown();
	//	}

	@Test

	public void check_dropdown_own_colors() throws InterruptedException, AWTException {
		TC_178_Check_own_colors_dropdown ob= new TC_178_Check_own_colors_dropdown() ;
		ob.clickoncollection();
		ob.check_owncolor_dropdown();


	}
}
