package MyaccountTestcases;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_341_Check_my_acct_change_email_enter_valid_email extends Base {

	
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
	
	public  TC_341_Check_my_acct_change_email_enter_valid_email() {
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
		email.sendKeys("sunil.kumar1101testing@gmail.com");
		expected=email.getAttribute("value");
	    Assert.assertEquals("sunil.kumar1101testing@gmail.com", expected);
	}

	@Test
	public void Check_my_acct_change_email_enter_valid_email() throws InterruptedException, AWTException {
		TC_341_Check_my_acct_change_email_enter_valid_email ob = new TC_341_Check_my_acct_change_email_enter_valid_email ();
		ob.signin();
		ob.changeemail();
		Log.info("Checking change email boxes enter valid email,verify it");
	}


	
}
