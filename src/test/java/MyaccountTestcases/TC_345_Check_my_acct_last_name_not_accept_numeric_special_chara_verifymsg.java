package MyaccountTestcases;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_345_Check_my_acct_last_name_not_accept_numeric_special_chara_verifymsg extends Base{

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
	@FindBy(xpath = "//input[@id=\"last_name\"]")
	private WebElement lastname;
	@FindBy(xpath = "//button[@id=\"personal-info-submit\"]")
	private WebElement savebutton;
	@FindBy(xpath = "//span[contains(text(),'Please enter only alphabet characters')]")
	private WebElement errormsg;
	
	public  TC_345_Check_my_acct_last_name_not_accept_numeric_special_chara_verifymsg() {
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
	public void lastname() throws InterruptedException {
		lastname.clear();
		lastname.sendKeys("12452");
		savebutton.click();
		Thread.sleep(1000);
		String expectedmsg=errormsg.getText();
		Assert.assertEquals("Please enter only alphabet characters", expectedmsg);
		lastname.clear();
		lastname.sendKeys("#$%*");
		savebutton.click();
		Thread.sleep(1000);
		expectedmsg=errormsg.getText();
		Assert.assertEquals("Please enter only alphabet characters", expectedmsg);
		
			
	}

	@Test
	public void Check_my_acct_last_name_not_accept_numeric_special_chara_verify_error_msg() throws InterruptedException, AWTException {
		TC_345_Check_my_acct_last_name_not_accept_numeric_special_chara_verifymsg ob = new TC_345_Check_my_acct_last_name_not_accept_numeric_special_chara_verifymsg ();
		ob.signin();
		ob.lastname();
		Log.info("Checking my acct last name not accept numeric,special chara and verify errormsg");
	}

	
}
