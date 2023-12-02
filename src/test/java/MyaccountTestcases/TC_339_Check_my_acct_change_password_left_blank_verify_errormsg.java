package MyaccountTestcases;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_339_Check_my_acct_change_password_left_blank_verify_errormsg extends Base{
	
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
	@FindBy(xpath = "//label[@for=\"changePassword\"]")
	private WebElement changepassword;
	@FindBy(xpath = "//h4[contains(text(),'Change Password')]")
	private WebElement changepasswordbox;
	@FindBy(xpath = "//button[@id=\"personal-info-submit\"]")
	private WebElement savebutton;
	@FindBy(xpath = "//span[contains(text(),'The oldpassword field is required.')]")
	private WebElement errormsgcurrrentpass;
	@FindBy(xpath = "//span[contains(text(),'The password field is required.')]")
	private WebElement errormsgnewpass;
	@FindBy(xpath = "//span[contains(text(),'The password confirmation field is required.')]")
	private WebElement errormsgconfirmnew;
	
	public  TC_339_Check_my_acct_change_password_left_blank_verify_errormsg() {
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
	public void changepasswordbox() throws InterruptedException {
		Boolean expected=changepassword.isDisplayed();
		Assert.assertTrue(expected);
		changepassword.click();
		Thread.sleep(1000);
		String expectedbox=changepasswordbox.getText();
		Assert.assertEquals("CHANGE PASSWORD",expectedbox);
		savebutton.click();
		Thread.sleep(1000);
		String expectedmsg=errormsgcurrrentpass.getText();
		Assert.assertEquals("The oldpassword field is required.", expectedmsg);
		expectedmsg=errormsgnewpass.getText();
		Assert.assertEquals("The password field is required.", expectedmsg);
		expectedmsg=errormsgconfirmnew.getText();
		Assert.assertEquals("The password confirmation field is required.", expectedmsg);
		
		
		
	}

	@Test
	public void check_my_acct_change_password_left_blank() throws InterruptedException, AWTException {
		TC_339_Check_my_acct_change_password_left_blank_verify_errormsg ob = new TC_339_Check_my_acct_change_password_left_blank_verify_errormsg ();
		ob.signin();
		ob.changepasswordbox();
		Log.info("Checking change password boxes left blank,verify msg");
	}


}
