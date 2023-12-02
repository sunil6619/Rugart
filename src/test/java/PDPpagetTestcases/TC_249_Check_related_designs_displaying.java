package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class TC_249_Check_related_designs_displaying extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//h3[contains(text(),' Related Designs ')]")
	private WebElement relateddesigns;

	public TC_249_Check_related_designs_displaying() {
		PageFactory.initElements(driver, this);
	}
	public void clickoncollection() throws InterruptedException, AWTException {

		Thread.sleep(1000);
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(2);
		first.click();

	}
	//	TC_249_Check_related_designs_displaying ob;
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_249_Check_related_designs_displaying();
	//		Log.info("Chrome browser and url launch");
	//	}
	public void related_designs() throws InterruptedException {

		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		pagedown();
		String expected=relateddesigns.getText();
		Assert.assertEquals("Related Designs", expected);

	}

	@Test

	public void check_related_designs() throws InterruptedException, AWTException {
		TC_249_Check_related_designs_displaying ob= new TC_249_Check_related_designs_displaying();
		ob.clickoncollection();
		ob.related_designs();
		Log.info("Checking related designs ");
	}

}
