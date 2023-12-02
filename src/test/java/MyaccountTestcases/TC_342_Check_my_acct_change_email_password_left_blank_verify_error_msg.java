package MyaccountTestcases;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_342_Check_my_acct_change_email_password_left_blank_verify_error_msg extends Base{

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
	@FindBy(xpath = "//label[@for=\"changePassword\"]")
	private WebElement changepassword;
	@FindBy(xpath = "//h4[contains(text(),'Change Email and password')]")
	private WebElement changeemailpassbox;
	@FindBy(xpath = "//span[contains(text(),'The email field is required.')]")
	private WebElement emailvalidationmsg;
	@FindBy(xpath = "//span[contains(text(),'The oldpassword field is required.')]")
	private WebElement errormsgcurrrentpass;
	@FindBy(xpath = "//span[contains(text(),'The password field is required.')]")
	private WebElement errormsgnewpass;
	@FindBy(xpath = "//span[contains(text(),'The password confirmation field is required.')]")
	private WebElement errormsgconfirmnew;
	
	
	public  TC_342_Check_my_acct_change_email_password_left_blank_verify_error_msg() {
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
		changepassword.click();
		Thread.sleep(1000);
		email.clear();
		savebutton.click();
		Thread.sleep(1000);
		String expectedmsg=emailvalidationmsg.getText();
		Assert.assertEquals("The email field is required.",expectedmsg);
		expectedmsg=errormsgcurrrentpass.getText();
		Assert.assertEquals("The oldpassword field is required.", expectedmsg);
		expectedmsg=errormsgnewpass.getText();
		Assert.assertEquals("The password field is required.", expectedmsg);
		expectedmsg=errormsgconfirmnew.getText();
		Assert.assertEquals("The password confirmation field is required.", expectedmsg);
			
	}

	@Test
	public void Check_my_acct_change_email_password_inputs_left_blank_verify_error_msg() throws InterruptedException, AWTException {
		TC_342_Check_my_acct_change_email_password_left_blank_verify_error_msg ob = new TC_342_Check_my_acct_change_email_password_left_blank_verify_error_msg ();
		ob.signin();
		ob.changeemail();
		Log.info("Checking change email,password boxes left blank,verify errormsg");
	}
	
}
