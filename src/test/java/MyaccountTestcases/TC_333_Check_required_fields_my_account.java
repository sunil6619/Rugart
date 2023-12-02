package MyaccountTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import CheckoutpageTestcases.TC_332_Check_checkout_page_product_size_same_as_added;
import resources.Base;

public class TC_333_Check_required_fields_my_account extends Base{

	@FindBy(xpath = "//ul[@class=\"links\"]/li/span[text()='Sign in']")
	private WebElement signin;
	@FindBy(xpath = "//input[@id=\"email\"]")
	private WebElement emailinput;
	@FindBy(xpath = "//input[@id=\"password\"]")
	private WebElement passinput;
	@FindBy(xpath = "//button[@id=\"btn-submit\"]")
	private WebElement login;
	@FindBy(xpath = "//ul[@class=\"links\"]/child::a")
	private WebElement myaccount;
	@FindBy(xpath = "//legend[contains(text(),'Account Information')]")
	private WebElement myacctpage;
	@FindBy(xpath = "//a[@id=\"nav-AccountInfo-tab\"]")
	private WebElement acctinfo;
	@FindBy(xpath = "//a[@id=\"nav-MyOrders-tab\"]")
	private WebElement myorders;
	@FindBy(xpath = "//a[@id=\"nav-WishList-tab\"]")
	private WebElement wishlist;
	@FindBy(xpath = "//span[contains(text(),'Newsletter Subscription')]")
	private WebElement newslettersubs;

	public  TC_333_Check_required_fields_my_account() {
		PageFactory.initElements(driver, this);
	}
	public void signin() throws InterruptedException, AWTException {

		signin.click();
		Thread.sleep(1000);
		emailinput.sendKeys(getreaddata("email"));
		passinput.sendKeys(getreaddata("password"));
		login.click();
		Thread.sleep(1000);
		myaccount.click();
		Thread.sleep(1000);
		String expected=myacctpage.getText();
		Assert.assertEquals("Account Information",expected);
	}
	public void requiredfields() {
		Boolean expected=acctinfo.isDisplayed();
		Assert.assertTrue(expected);
		expected=myorders.isDisplayed();
		Assert.assertTrue(expected);
		expected=wishlist.isDisplayed();
		Assert.assertTrue(expected);
		expected=newslettersubs.isDisplayed();
		Assert.assertTrue(expected);

	}

	@Test
	public void check_req_fields_my_account() throws InterruptedException, AWTException {
		TC_333_Check_required_fields_my_account ob = new TC_333_Check_required_fields_my_account ();
		ob.signin();
		ob.requiredfields();
		Log.info("Checking req fields in my account section");
	}

}
