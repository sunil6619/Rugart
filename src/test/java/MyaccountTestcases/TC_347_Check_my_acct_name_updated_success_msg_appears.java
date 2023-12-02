package MyaccountTestcases;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_347_Check_my_acct_name_updated_success_msg_appears extends Base {

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
	@FindBy(xpath = "//input[@id=\"first_name\"]")
	private WebElement firstname;
	@FindBy(xpath = "//div[@class=\"alert alert-success\"]")
	private WebElement successmsg;

	public  TC_347_Check_my_acct_name_updated_success_msg_appears() {
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
	public void updatename() throws InterruptedException {
		firstname.clear();
		lastname.clear();
		firstname.sendKeys("Sunil");
		lastname.sendKeys("suri");
		savebutton.click();
		Thread.sleep(1000);
		String expected=successmsg.getText();
		Assert.assertEquals("Profile updated successfully.", expected);
		


	}

	@Test
	public void Check_my_acct_last_name_left_blank_verify_msg() throws InterruptedException, AWTException {
		TC_347_Check_my_acct_name_updated_success_msg_appears ob = new TC_347_Check_my_acct_name_updated_success_msg_appears ();
		ob.signin();
		ob.updatename();
		Log.info("Checking my acct name is updated,verify success msg");
	}



}
