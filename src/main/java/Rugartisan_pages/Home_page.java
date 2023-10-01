package Rugartisan_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Home_page extends Base{
	
	public Home_page() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath= "//ul[@class='links']//span[contains(text(),'Sign in')]")
	private WebElement signin;
	
	public void clicksignin() {
		signin.click();
		
	}

}
