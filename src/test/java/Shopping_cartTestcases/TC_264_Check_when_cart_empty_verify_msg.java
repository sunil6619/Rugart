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

public class TC_264_Check_when_cart_empty_verify_msg extends Base{
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
	@FindBy(xpath = "//div[@class=\"alert alert-success\"]")
	private WebElement itemremovedmsg;
	@FindBy(xpath = "//div[contains(text(),'Your cart is empty.')]")
	private WebElement emptycartmsg;
	
	public  TC_264_Check_when_cart_empty_verify_msg() {
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
	
	public void remove_all_items() throws InterruptedException {
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
//		removeitem.click();
		
		Thread.sleep(1000);
		String expectedmsg=itemremovedmsg.getText();
		Assert.assertEquals("Item was removed successfully from the cart.", expectedmsg);
		expectedmsg=emptycartmsg.getText();
		Assert.assertEquals("Your cart is empty.",expectedmsg);
		
			
	}
	
	
	@Test

	public void check_remove_all_items_verify_msg() throws InterruptedException, AWTException {
		TC_264_Check_when_cart_empty_verify_msg ob = new TC_264_Check_when_cart_empty_verify_msg();
		ob.clickoncollection();
		ob.remove_all_items();
		Log.info("Checking all products removed verify message");
	}

}
