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

public class TC_179_Check_own_colors_able_to_click_core_pastel extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-EI12']")
	private WebElement colordropdown;
	@FindBy(id = "Core-tab")
	private WebElement corecolors;
	@FindBy(id = "Pastel-tab")
	private WebElement pastelcolors;

	public  TC_179_Check_own_colors_able_to_click_core_pastel() {
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

	public void click_core_pastel_colors() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		//		zoomin();
		colordropdown.click();
		Thread.sleep(1000);
		pastelcolors.click();
		boolean selectstate=pastelcolors.isEnabled();
		Assert.assertTrue(selectstate);
		Thread.sleep(1000);
		corecolors.click();
		selectstate=corecolors.isEnabled();
		Assert.assertTrue(selectstate);





	}

	TC_179_Check_own_colors_able_to_click_core_pastel ob;
	@Parameters ("url")
	@BeforeTest

	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_179_Check_own_colors_able_to_click_core_pastel();
	}

	@Test

	public void check_dropdown_own_colors() throws InterruptedException, AWTException {
		ob.clickoncollection();
		ob.click_core_pastel_colors();


	}
}
