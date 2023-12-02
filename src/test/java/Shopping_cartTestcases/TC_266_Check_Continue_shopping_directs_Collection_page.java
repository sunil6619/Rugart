package Shopping_cartTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TC_266_Check_Continue_shopping_directs_Collection_page extends Base {

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//ul[@class=\"links\"]/li/span[text()='Sign in']")
	private WebElement signin;
	@FindBy(xpath = "//input[@id=\"email\"]")
	private WebElement emailinput;
	@FindBy(xpath = "//input[@id=\"password\"]")
	private WebElement passinput;
	@FindBy(xpath = "//button[@id=\"btn-submit\"]")
	private WebElement login;
	@FindBy(xpath = "//img[@alt=\"shopping bag\"]")
	private WebElement shopcart;
	@FindBy(xpath = "//a[contains(text(),'View and Edit Cart')]")
	private WebElement viewcart;
	@FindBy(xpath = "//button[@title=\"Buy Now\"]")
	private WebElement addtocart;
	@FindBy(xpath = "//div[@class=\"remove-wishlist w-100\"]/descendant::span[contains(text(),' Remove item ')]")
	private WebElement removeitem;
	@FindBy(xpath = "//div[@class=\"emptycrtpg\"]/descendant::span[contains(text(),'Continue Shopping')]")
	private WebElement continueshopping;
	@FindBy(xpath = "//span[contains(text(),' Custom Rugs')]")
	private WebElement collectionpage;
	
	public TC_266_Check_Continue_shopping_directs_Collection_page () {
		PageFactory.initElements(driver, this);
	}
	public void clickoncollection() throws InterruptedException, AWTException {

		signin.click();
		Thread.sleep(1000);
		emailinput.sendKeys(getreaddata("email"));
		passinput.sendKeys(getreaddata("password"));
		login.click();
		Thread.sleep(1000);
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(2);
		first.click();
	}
	public void click_continue_shopping() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		widthft.sendKeys("4");
		lgthft.sendKeys("6");
		Thread.sleep(1000);
		addtocart.click();
		Thread.sleep(2000);
		viewcart.click();
		Thread.sleep(1000);
		removeitem.click();
		Thread.sleep(1000);
		Boolean expected=continueshopping.isDisplayed();
		Assert.assertTrue(expected);
		continueshopping.click();
		Thread.sleep(1000);
		String expectedpage=collectionpage.getText();
		Assert.assertEquals("Custom Rugs", expectedpage);
		
		
		
		
}


	
	@Test

	public void check_continue_shopping_directs_Collection() throws InterruptedException, AWTException {
		TC_266_Check_Continue_shopping_directs_Collection_page ob = new TC_266_Check_Continue_shopping_directs_Collection_page();
		ob.clickoncollection();
		ob.click_continue_shopping();
		Log.info("Checking Continue Shopping directs to Collection page");
	}
	

	
}
