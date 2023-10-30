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

public class TC_230_Check_addto_cart_without_login_pop_up_close extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//button[@title=\"Buy Now\"]")
	private WebElement addtocart;
	@FindBy(xpath = "(//div[@class=\"modal-dialog\"]/descendant::button[@aria-label=\"Close\"])[2]")
	private WebElement close;
	
	public  TC_230_Check_addto_cart_without_login_pop_up_close() {
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
	}
	
	public void email_popup_close() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		addtocart.click();
		Thread.sleep(1000);
		close.click();
		
	}

	TC_230_Check_addto_cart_without_login_pop_up_close ob;
	//@Parameters ("url")
	@BeforeTest



	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_230_Check_addto_cart_without_login_pop_up_close();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_addtocart_without_login_popup_close() throws InterruptedException, AWTException {

		ob.clickoncollection();
		ob.email_popup_close();
		Log.info("Clicking on collection FOF and email pop up close");
	}

	
}
