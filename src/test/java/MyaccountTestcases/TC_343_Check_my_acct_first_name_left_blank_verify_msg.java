package MyaccountTestcases;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_343_Check_my_acct_first_name_left_blank_verify_msg extends Base{
	
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
	@FindBy(xpath = "//input[@id=\"first_name\"]")
	private WebElement firstname;
	@FindBy(xpath = "//button[@id=\"personal-info-submit\"]")
	private WebElement savebutton;
	@FindBy(xpath = "//span[contains(text(),'The first name field is required.')]")
	private WebElement errormsg;
	
	public  TC_343_Check_my_acct_first_name_left_blank_verify_msg() {
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
	public void firstname() throws InterruptedException {
		firstname.clear();
		savebutton.click();
		Thread.sleep(1000);
		String expectedmsg=errormsg.getText();
		Assert.assertEquals("The first name field is required.", expectedmsg);
		
			
	}

	@Test
	public void Check_my_acct_first_name_left_blank_verify_error_msg() throws InterruptedException, AWTException {
		TC_343_Check_my_acct_first_name_left_blank_verify_msg ob = new TC_343_Check_my_acct_first_name_left_blank_verify_msg ();
		ob.signin();
		ob.firstname();
		Log.info("Checking my acct first name left blank,verify errormsg");
	}
	
	

}
