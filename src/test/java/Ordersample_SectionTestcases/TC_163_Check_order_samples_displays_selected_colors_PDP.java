package Ordersample_SectionTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_163_Check_order_samples_displays_selected_colors_PDP extends Base {

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//span[contains(text(),'Order Yarn Color Samples')]")
	private WebElement ordersamples;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-CG10')]")
	private WebElement color1;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-DR10')]")
	private WebElement color2;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-DL12')]")
	private WebElement color3;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-CS11')]")
	private WebElement color4;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-BT03')]")
	private WebElement color5;
	@FindBy(xpath = "//div[@class=\"default-colors-block1\"]/descendant::span[contains(text(),'RA-CG10')]")
	private WebElement samplecolor1;
	@FindBy(xpath = "//div[@class=\"default-colors-block1\"]/descendant::span[contains(text(),'RA-DR10')]")
	private WebElement samplecolor2;
	@FindBy(xpath = "//div[@class=\"default-colors-block1\"]/descendant::span[contains(text(),'RA-DL12')]")
	private WebElement samplecolor3;
	@FindBy(xpath = "//div[@class=\"default-colors-block1\"]/descendant::span[contains(text(),'RA-CS11')]")
	private WebElement samplecolor4;
	@FindBy(xpath = "//div[@class=\"default-colors-block1\"]/descendant::span[contains(text(),'RA-BT03')]")
	private WebElement samplecolor5;
	
	
	
	public TC_163_Check_order_samples_displays_selected_colors_PDP () {
		PageFactory.initElements(driver,this);
	}
	//clicking on collections field of flowers
	public void clickoncollectionfof() throws InterruptedException, AWTException {
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		 Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
	}
	//comparing color names from PDP and order samples are same
	public void ordersample_displays_selected_colorsof_PDP() throws InterruptedException {
		Thread.sleep(2000);
		pagedown();
		String color1n=color1.getText();
		String color2n=color2.getText();
		String color3n=color3.getText();
		String color4n=color4.getText();
		String color5n=color5.getText();
		pageup();
		Thread.sleep(1000);
		ordersamples.click();
		Thread.sleep(2000);
		String samplecolor1n=samplecolor1.getText();
		String samplecolor2n=samplecolor2.getText();
		String samplecolor3n=samplecolor3.getText();
		String samplecolor4n=samplecolor4.getText();
		String samplecolor5n=samplecolor5.getText();
		Assert.assertEquals(color1n,samplecolor1n);
		Assert.assertEquals(color2n,samplecolor2n);
		Assert.assertEquals(color3n,samplecolor3n);
		Assert.assertEquals(color4n,samplecolor4n);
		Assert.assertEquals(color5n,samplecolor5n);	
	}
	
//	TC_163_Check_order_samples_displays_selected_colors_PDP ob;
//	@Parameters("url")
//	@BeforeTest
//	
//	public void launchurl() throws InterruptedException {
//		getlaunchurl(getreaddata("url"));
//		ob= new TC_163_Check_order_samples_displays_selected_colors_PDP();	
//	}
	@Test
	public void orderdisplays_selectedcolors_of_PDP() throws InterruptedException, AWTException {
		TC_163_Check_order_samples_displays_selected_colors_PDP ob= new TC_163_Check_order_samples_displays_selected_colors_PDP();
		ob.clickoncollectionfof();
		ob.ordersample_displays_selected_colorsof_PDP();
	}
	
}
