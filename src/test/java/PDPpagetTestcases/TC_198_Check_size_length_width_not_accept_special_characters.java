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

public class TC_198_Check_size_length_width_not_accept_special_characters extends Base {

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"cm\"]")
	private WebElement radiocm;

	@FindBy(xpath = "//div[@class=\"radio\"]/child::label[@for=\"feet\"]")
	private WebElement feet;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//input[@id=\"widthCmRug\"]")
	private WebElement widthcm;
	@FindBy(xpath = "//input[@id=\"lengthCmRug\"]")
	private WebElement lgthcm;

	@FindBy(xpath = "//span[contains(text(),'Add To Cart')]")
	private WebElement addtocart;
	@FindBy(xpath = "//div[contains(text(),'Width and Length can not be blank')]")
	private WebElement validationmsg;


	public  TC_198_Check_size_length_width_not_accept_special_characters() {
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

	public void enter_special_characters_rugsize() throws InterruptedException {
		Thread.sleep(1000);

		Thread.sleep(1000);
		widthft.sendKeys("#$%^");
		lgthft.sendKeys("@#$%");
		pagedown();
		addtocart.click();
		Thread.sleep(1000);
		String expectederrormsg=validationmsg.getText();
		Assert.assertEquals("Width and Length can not be blank", expectederrormsg);
		Thread.sleep(1000);
		radiocm.click();
		Thread.sleep(1000);
		widthcm.sendKeys("$%^&*");
		lgthcm.sendKeys("#$%&*%");
		pagedown();
		addtocart.click();
		Thread.sleep(1000);
		expectederrormsg=validationmsg.getText();
		Assert.assertEquals("Width and Length can not be blank", expectederrormsg);

	}

	//	TC_198_Check_size_length_width_not_accept_special_characters ob;
	//	@Parameters ("url")
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_198_Check_size_length_width_not_accept_special_characters();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_size_rugsize_enter_special_character_verify_errormsg() throws InterruptedException, AWTException {
		TC_198_Check_size_length_width_not_accept_special_characters ob= new TC_198_Check_size_length_width_not_accept_special_characters();
		ob.clickoncollection();
		ob.enter_special_characters_rugsize();
		Log.info("Clicking on collection FOF and checking when special characters entered");
	}


}
