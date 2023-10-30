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

public class TC_222_Check_PDP_top_bar_addtocart extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"tb2Opn\"]")
	private WebElement pdptopbardropdown;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	 WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	 WebElement lgthft ;
	@FindBy(xpath = "//div[@class=\"vline3\"]")
	private WebElement addtocarttopbar;
	@FindBy(xpath = "//input[@id=\"cart_email\"]")
	private WebElement emailcart;
	@FindBy(xpath = "//button[@id=\"email-form-submit\"]")
	private WebElement saveaddtocartbutton;
	@FindBy(xpath = "//ul[@class=\"links\"]/li/span[text()='Sign in']")
	private WebElement signin;
	@FindBy(xpath = "//input[@id=\"email\"]")
	private WebElement emailinput;
	@FindBy(xpath = "//input[@id=\"password\"]")
	private WebElement passinput;
	@FindBy(xpath = "//button[@id=\"btn-submit\"]")
	private WebElement login;
	@FindBy(xpath = "//img[@alt=\"shopping bag\"]")
	private WebElement shopcart;
	@FindBy(xpath = "//a[contains(text(),'View and Edit Cart')]")
	private WebElement viewcart;
	@FindBy(xpath = "//a[contains(text(),'Anemone')]")
	private WebElement productname;



	public  TC_222_Check_PDP_top_bar_addtocart  () {
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

	public void click_addtocart_verify_it() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		Thread.sleep(1000);
		pdptopbardropdown.click();
		Thread.sleep(1000);
		addtocarttopbar.click();
		Thread.sleep(1000);
		emailcart.sendKeys(getreaddata("email"));
		saveaddtocartbutton.click();
		Thread.sleep(2000);
		signin.click();
		Thread.sleep(1000);
		emailinput.sendKeys(getreaddata("email"));
		passinput.sendKeys(getreaddata("password"));
		login.click();
		Thread.sleep(2000);
		shopcart.click();
		Thread.sleep(1000);
		viewcart.click();
		Thread.sleep(1000);
		String expectedproduct=productname.getText();
		Assert.assertEquals("ANEMONE", expectedproduct);
		

	}
	TC_222_Check_PDP_top_bar_addtocart ob;
	//@Parameters ("url")
	@BeforeTest



	public void launchurl() throws InterruptedException {
		getlaunchurl(getreaddata("url"));
		ob= new TC_222_Check_PDP_top_bar_addtocart();
		Log.info("Chrome browser and url launch");
	}

	@Test

	public void check_topbar_add_to_cart_verify_shopping_cart() throws InterruptedException, AWTException {

		ob.clickoncollection();
		ob.click_addtocart_verify_it();
		Log.info("Clicking on collection FOF and checking add to cart,verify in shopping cart");
	}
}
