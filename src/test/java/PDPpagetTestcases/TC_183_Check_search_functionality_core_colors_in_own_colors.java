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

public class TC_183_Check_search_functionality_core_colors_in_own_colors extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-EI12']")
	private WebElement colordropdown1;
	@FindBy (xpath = "//input[@placeholder=\"Search\"]")
	private WebElement search;
	@FindBy(xpath = "//span[@title=\"RA-DH02\"]")
	private WebElement tooltipcolor1;
	@FindBy(xpath = "//span[@title=\"RA-AB03\"]")
	private WebElement tooltipcolor2;
	@FindBy(xpath = "//span[@title=\"RA-BG07\"]")
	private WebElement tooltipcolor3;



	public  TC_183_Check_search_functionality_core_colors_in_own_colors() {
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

	public void search_functionality() throws InterruptedException {
		Thread.sleep(1000);
		colordropdown1.click();
		Thread.sleep(1000);
		search.click();
		search.sendKeys("RA-DH02");
		Thread.sleep(1000);
		String text=tooltipcolor1.getAttribute("title");
		Assert.assertEquals("RA-DH02", text);
		search.clear();
		search.sendKeys("RA-AB03");
		text=tooltipcolor2.getAttribute("title");
		Assert.assertEquals("RA-AB03", text);
		search.clear();
		search.sendKeys("RA-BG07");
		text=tooltipcolor3.getAttribute("title");
		Assert.assertEquals("RA-BG07", text);

	}
//	TC_183_Check_search_functionality_core_colors_in_own_colors ob;
//	@Parameters ("url")
//	@BeforeTest
//
//	public void launchurl() throws InterruptedException {
//		getlaunchurl(getreaddata("url"));
//		ob= new TC_183_Check_search_functionality_core_colors_in_own_colors();
//
//	}

	@Test

	public void check_search_functionality_core_colors() throws InterruptedException, AWTException {
		TC_183_Check_search_functionality_core_colors_in_own_colors ob= new TC_183_Check_search_functionality_core_colors_in_own_colors();
		ob.clickoncollection();
		ob.search_functionality();


	}

}
