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

public class TC_188_Check_scroll_core_pastel_colors  extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-EI12']")
	private WebElement colordropdown;
	@FindBy(id = "Pastel-tab")
	private WebElement pastelcolors;
	@FindBy(xpath = "//div[contains(text(),'Scroll to see more colors')] ")
	private WebElement scrollmsg;
	@FindBy(id = "Core-tab")
	private WebElement corecolors;

	public  TC_188_Check_scroll_core_pastel_colors() {
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
	public void scroll_core_pastel_colors() throws InterruptedException {
		Thread.sleep(1000);
		colordropdown.click();
		Thread.sleep(2000);
		pastelcolors.click();
		Thread.sleep(1000);
		String expectedmsg=scrollmsg.getText();
		Assert.assertEquals("Scroll to see more colors",expectedmsg);
		corecolors.click();
		//		pageleft();
		Thread.sleep(2000);
		pageright();

	}
	//	TC_188_Check_scroll_core_pastel_colors ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_188_Check_scroll_core_pastel_colors();
	//
	//	}

	@Test

	public void check_scroll_core_pastel_colors() throws InterruptedException, AWTException {
		TC_188_Check_scroll_core_pastel_colors ob= new TC_188_Check_scroll_core_pastel_colors();
		ob.clickoncollection();
		ob.scroll_core_pastel_colors();




	}



}
