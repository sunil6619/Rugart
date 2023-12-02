package MyaccountTestcases;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_338_Check_my_acct_change_email_invalid_input_entered_verifymsg extends Base{

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

	public  TC_338_Check_my_acct_change_email_invalid_input_entered_verifymsg() {
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
		Thread.sleep(1000);
		email.sendKeys("sunil.kumar1101testing");
		savebutton.click();
		Thread.sleep(1000);
		String expectedmsg=email.getAttribute("validationMessage");
		System.out.println(expectedmsg);
		Assert.assertEquals("Please include an '@' in the email address. 'sunil.kumar1101testing' is missing an '@'.", expectedmsg);
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("1242");
		savebutton.click();
		Thread.sleep(1000);
	     expectedmsg=email.getAttribute("validationMessage");
	     System.out.println(expectedmsg);
	     Assert.assertEquals("Please include an '@' in the email address. '1242' is missing an '@'.",expectedmsg);
	}

	@Test
	public void Check_my_acct_change_email_password_save_displays() throws InterruptedException, AWTException {
		TC_338_Check_my_acct_change_email_invalid_input_entered_verifymsg ob = new TC_338_Check_my_acct_change_email_invalid_input_entered_verifymsg ();
		ob.signin();
		ob.changeemail();
		Log.info("Checking change email boxes left blank,verify error msg");
	}




}
