package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class TC_248_Check_edit_history_functionality extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//span[contains(text(),'MORE ')]")
	private WebElement morecolors;
	@FindBy(xpath = "//a[@class=\"close\"]")
	private WebElement closebutton;
	@FindBy(xpath = "//div[@class=\"floatingButton\"]")
	private WebElement edithistory;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-CG10']")
	private WebElement color1;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-CK05']")
	private WebElement color2;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-BJ11']")
	private WebElement color3;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[text()='RA-AE12']")
	private WebElement color4;
	@FindBy(xpath = "//img[@class=\"suggestion-img\"]")
	private List<WebElement> colorsuggestion;
	@FindBy(xpath = "//div[@class=\"loadsuggestion \"]")
	private WebElement suggestion;


	public TC_248_Check_edit_history_functionality () {
		PageFactory.initElements(driver, this);
	}
	public void clickoncollection() throws InterruptedException, AWTException {

		Thread.sleep(1000);
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(1);
		first.click();

	}

	public void edit_history() throws InterruptedException {
		Thread.sleep(1000);
		morecolors.click();
		Thread.sleep(1000);
		//		List<WebElement>list=driver.findElements(By.xpath("//img[@class=\"suggestion-img\"]"));
		WebElement three=colorsuggestion.get(3);
		three.click();
		closebutton.click();
		Thread.sleep(1000);
		morecolors.click();
		Thread.sleep(1000);
		WebElement two=colorsuggestion.get(2);
		two.click();
		closebutton.click();
		Thread.sleep(1000);	

		edithistory.click();
		//		List<WebElement> suggestion=driver.findElements(By.xpath("//div[@class=\"loadsuggestion \"]"));
		//		WebElement first=suggestion.get(1);
		Thread.sleep(2000);
		suggestion.click();
		Thread.sleep(1000);
		//		first.click();
		pagedown();
		String text=color1.getText();
		Assert.assertEquals("RA-CG10",text);
		text=color2.getText();
		Assert.assertEquals("RA-CK05",text);
		text=color3.getText();
		Assert.assertEquals("RA-BJ11",text);
		text=color4.getText();
		Assert.assertEquals("RA-AE12",text);


	}
	//	TC_248_Check_edit_history_functionality ob;
	//	@BeforeTest
	//
	//	public void launchurl() throws InterruptedException {
	//		
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_248_Check_edit_history_functionality();
	//		Log.info("Chrome browser and url launch");
	//	}

	@Test

	public void check_edit_history_loading() throws InterruptedException, AWTException {
		TC_248_Check_edit_history_functionality ob= new TC_248_Check_edit_history_functionality();
		ob.clickoncollection();
		ob.edit_history();
		Log.info("Checking edit history loading");
	}
}
