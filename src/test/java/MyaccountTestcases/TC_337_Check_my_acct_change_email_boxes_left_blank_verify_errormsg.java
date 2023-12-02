package MyaccountTestcases;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_337_Check_my_acct_change_email_boxes_left_blank_verify_errormsg extends Base{
	
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
	@FindBy(xpath = "//label[@for=\"changeEmail\"]")
	private WebElement changemail;
	@FindBy(xpath = "//h4[contains(text(),'Change Email')]")
	private WebElement changeemailbox;
	@FindBy(xpath = "//button[@id=\"personal-info-submit\"]")
	private WebElement savebutton;
	@FindBy(xpath = "//div[@class=\"form-group col-md-6\"]/child::input[@name=\"email\"]")
	private WebElement email;
	@FindBy(xpath = "//span[contains(text(),'The email field is required.')]")
	private WebElement emailvalidationmsg;
	@FindBy(xpath = "//span[contains(text(),'The oldpassword field is required.')]")
	private WebElement passwordvalidationmsg;
	
	public  TC_337_Check_my_acct_change_email_boxes_left_blank_verify_errormsg() {
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
	public void changeemail() throws InterruptedException {
		changemail.click();
		Thread.sleep(1000);
		String expected=changeemailbox.getText();
		Assert.assertEquals("CHANGE EMAIL",expected);
		email.clear();
		savebutton.click();
		Thread.sleep(1000);
		expected=emailvalidationmsg.getText();
		Assert.assertEquals("The email field is required.",expected);
		expected=passwordvalidationmsg.getText();
		Assert.assertEquals("The oldpassword field is required.",expected);
		
		
		
		
	}

	@Test
	public void checkout_my_acct_change_email_password_save_displays() throws InterruptedException, AWTException {
		TC_337_Check_my_acct_change_email_boxes_left_blank_verify_errormsg ob = new TC_337_Check_my_acct_change_email_boxes_left_blank_verify_errormsg ();
		ob.signin();
		ob.changeemail();
		Log.info("Checking change email boxes left blank,verify error msg");
	}

	

}
