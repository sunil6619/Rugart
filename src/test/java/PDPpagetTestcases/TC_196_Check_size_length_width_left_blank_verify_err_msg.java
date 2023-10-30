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

public class TC_196_Check_size_length_width_left_blank_verify_err_msg extends Base{

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
	@FindBy(xpath = "//span[contains(text(),'Add To Cart')]")
	private WebElement addtocart;
	@FindBy(xpath = "//div[contains(text(),'Width and Length can not be blank')]")
	private WebElement validationmsg;


	public  TC_196_Check_size_length_width_left_blank_verify_err_msg () {
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

	public void clickaddtocart_left_blank_rugsize() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		addtocart.click();
		Thread.sleep(1000);
		String expectederrormsg=validationmsg.getText();
		Assert.assertEquals("Width and Length can not be blank", expectederrormsg);
		Thread.sleep(1000);
		radiocm.click();
		pagedown();
		addtocart.click();
		Thread.sleep(2000);
		expectederrormsg=validationmsg.getText();
		Assert.assertEquals("Width and Length can not be blank", expectederrormsg);	

	}


	TC_196_Check_size_length_width_left_blank_verify_err_msg ob;
	@Parameters ("url")
	@BeforeTest

	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_196_Check_size_length_width_left_blank_verify_err_msg();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_size_rugsize_left_blank_verify_error_msg() throws InterruptedException, AWTException {
		ob.clickoncollection();
		ob.clickaddtocart_left_blank_rugsize();
		Log.info("Clicking on collection FOF and checking error msg when rugsize left blank ,clicked add to cart");
	}


}
