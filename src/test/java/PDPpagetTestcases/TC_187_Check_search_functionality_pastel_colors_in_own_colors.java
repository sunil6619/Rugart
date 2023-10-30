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

public class TC_187_Check_search_functionality_pastel_colors_in_own_colors extends Base {
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
	@FindBy (xpath = "//input[@placeholder=\"Search\"]")
	private WebElement search;
	@FindBy(xpath = "//span[@title=\"RA-14-N\"]")
	private WebElement tooltipcolor1;
	@FindBy(xpath = "//span[@title=\"RA-08-N\"]")
	private WebElement tooltipcolor2;
	@FindBy(xpath = "//span[@title=\"RA-58-N\"]")
	private WebElement tooltipcolor3;

	public  TC_187_Check_search_functionality_pastel_colors_in_own_colors() {
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

	public void search_functionality_pastel() throws InterruptedException {
		Thread.sleep(1000);
		colordropdown.click();
		Thread.sleep(1000);
		pastelcolors.click();
		Thread.sleep(1000);
		search.click();
		search.sendKeys("RA-14-N");
		Thread.sleep(1000);
		String text=tooltipcolor1.getAttribute("title");
		Assert.assertEquals("RA-14-N", text);
		search.clear();
		search.sendKeys("RA-08-N");
		text=tooltipcolor2.getAttribute("title");
		Assert.assertEquals("RA-08-N", text);
		search.clear();
		search.sendKeys("RA-58-N");
		text=tooltipcolor3.getAttribute("title");
		Assert.assertEquals("RA-58-N", text);


	}
	TC_187_Check_search_functionality_pastel_colors_in_own_colors ob;
	@Parameters ("url")
	@BeforeTest

	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_187_Check_search_functionality_pastel_colors_in_own_colors();

	}

	@Test

	public void check_search_functionality_pastel_colors() throws InterruptedException, AWTException {
		ob.clickoncollection();
		ob.search_functionality_pastel();




	}


}
