package Ordersample_SectionTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class TC_162_Check_order_samples_12inches_feet_increases  extends Base{
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//span[contains(text(),'Order Yarn Color Samples')]")
	private WebElement ordersamples;
	@FindBy(xpath = "//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"width[inch]\"]")
    private WebElement widthinch;	
	@FindBy(xpath = "//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"length[inch]\"]")
    private WebElement lgthinch;
	@FindBy(xpath = "//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"width[feet]\"]")
    private WebElement widthft;
	@FindBy(xpath = "//div[@class=\"rug-size cs_feet\"]/descendant::input[@name=\"length[feet]\"]")
    private WebElement lgthft;
	
	
	
	public TC_162_Check_order_samples_12inches_feet_increases() {
		PageFactory.initElements(driver, this);
	}
	
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
	public void ordersampples_if_inches_equals_12_feet_increases() throws InterruptedException {
		ordersamples.click();
		Thread.sleep(2000);
		widthinch.sendKeys("12");
		
		
		
	}
}
