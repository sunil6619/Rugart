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

public class TC_195_Check_size_able_to_select_ft_cm extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	//	@FindBy(xpath = "(//*[contains(text(), 'Specify your size')]/ancestor-or-self::*/DIV/DIV/LABEL[contains(@class, 'radio-label')])[1]")
	//	private WebElement radiocm;
	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"cm\"]")
	private WebElement radiocm;

	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"feet\"]")
	private WebElement feet;

	public  TC_195_Check_size_able_to_select_ft_cm () {
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
	public void click_ft_cm() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		radiocm.click();
		Thread.sleep(3000);
		feet.click();

	}

	//	TC_195_Check_size_able_to_select_ft_cm ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_195_Check_size_able_to_select_ft_cm();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_size_ft_cm() throws InterruptedException, AWTException {
		TC_195_Check_size_able_to_select_ft_cm ob= new TC_195_Check_size_able_to_select_ft_cm() ;
		ob.clickoncollection();
		ob.click_ft_cm();
		Log.info("Clicking on collection FOF and checking size by selectin feet and cm");
	}

}
