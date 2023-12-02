package MyaccountTestcases;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_340_Check_my_acct_change_password_accept_new_password extends Base {
	
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
	@FindBy(xpath = "//input[@id=\"oldpassword\"]")
	private WebElement oldpassword;
	@FindBy(xpath = "//div[@id=\"passwordValidation\"]/descendant::input[@name=\"password\"]")
	private WebElement newpassword;
	@FindBy(xpath = "//input[@id=\"password_confirmation\"]")
	private WebElement confirmpassword;
	@FindBy(xpath = "//div[@class=\"alert alert-success\"]")
	private WebElement successmsg;
	
	public  TC_340_Check_my_acct_change_password_accept_new_password() {
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
		oldpassword.sendKeys("147852");
		newpassword.sendKeys("258963");
		confirmpassword.sendKeys("258963");
		savebutton.click();
		Thread.sleep(1000);
		String expectedmsg=successmsg.getText();
		System.out.println(expectedmsg);
		Assert.assertEquals("Profile updated successfully", expectedmsg);
	
		
		
		
	}

	@Test
	public void Check_my_acct_change_password_left_blank() throws InterruptedException, AWTException {
		TC_340_Check_my_acct_change_password_accept_new_password ob = new TC_340_Check_my_acct_change_password_accept_new_password ();
		ob.signin();
		ob.changepasswordbox();
		Log.info("Checking change password accept new password");
	}



}
