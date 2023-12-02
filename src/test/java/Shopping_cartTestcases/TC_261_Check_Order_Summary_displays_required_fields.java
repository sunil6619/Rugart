package Shopping_cartTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_261_Check_Order_Summary_displays_required_fields extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
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
	@FindBy(xpath = "//button[@title=\"Buy Now\"]")
	private WebElement addtocart;
	@FindBy(xpath ="//h2[contains(text(),'Order summary')]")
	private WebElement ordersummary;
	@FindBy(xpath = "//td[@class=\"a-right\" and contains(text(),'Sub')]")
	private WebElement subtotalordersumma;
	@FindBy(xpath = "//strong[contains(text(),'ORDER TOTAL')]")
	private WebElement ordertotalordersumm;

	public  TC_261_Check_Order_Summary_displays_required_fields() {
		PageFactory.initElements(driver, this);
	}
	public void clickoncollection() throws InterruptedException, AWTException {

		signin.click();
		Thread.sleep(1000);
		emailinput.sendKeys(getreaddata("email"));
		passinput.sendKeys(getreaddata("password"));
		login.click();
		Thread.sleep(1000);
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(2);
		first.click();
	}

	public void order_summary() throws InterruptedException {

		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		Thread.sleep(1000);
		addtocart.click();
		Thread.sleep(3000);
		viewcart.click();
		Thread.sleep(1000);
		pagedown();
		String expected=ordersummary.getText();
		Assert.assertEquals("ORDER SUMMARY", expected);
		Boolean expect=subtotalordersumma.isDisplayed();
		Assert.assertTrue(expect);
		expect=ordertotalordersumm.isDisplayed();
		Assert.assertTrue(expect);
		
		
		


	}

	@Test

	public void check_order_summary_displays_required_fields() throws InterruptedException, AWTException {
		TC_261_Check_Order_Summary_displays_required_fields ob = new TC_261_Check_Order_Summary_displays_required_fields();
		ob.clickoncollection();
		ob.order_summary();
		Log.info("Checking Order summary required details");
	}


}
