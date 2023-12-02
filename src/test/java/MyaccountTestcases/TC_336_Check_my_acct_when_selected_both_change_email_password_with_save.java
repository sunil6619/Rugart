package MyaccountTestcases;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_336_Check_my_acct_when_selected_both_change_email_password_with_save extends Base{
	
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
	@FindBy(xpath = "//label[@for=\"changeEmail\"]")
	private WebElement changemail;
	@FindBy(xpath = "//h4[contains(text(),'Change Email and password')]")
	private WebElement changeemailpasswordbox;
	
	@FindBy(xpath = "//button[@id=\"personal-info-submit\"]")
	private WebElement savebutton;
	
	public  TC_336_Check_my_acct_when_selected_both_change_email_password_with_save() {
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
	public void changeemailpasswordbox() throws InterruptedException {
		Boolean expected=changepassword.isDisplayed();
		Assert.assertTrue(expected);
		changepassword.click();
		changemail.click();
		Thread.sleep(2000);
		String expectedbox=changeemailpasswordbox.getText();
		Assert.assertEquals("CHANGE EMAIL AND PASSWORD",expectedbox);
		expected=savebutton.isDisplayed();
		Assert.assertTrue(expected);
		
	}

	@Test
	public void check_my_acct_change_email_password_save_displays() throws InterruptedException, AWTException {
		TC_336_Check_my_acct_when_selected_both_change_email_password_with_save ob = new TC_336_Check_my_acct_when_selected_both_change_email_password_with_save ();
		ob.signin();
		ob.changeemailpasswordbox();
		Log.info("Checking change email,password box and save button in my account");
	}

}
