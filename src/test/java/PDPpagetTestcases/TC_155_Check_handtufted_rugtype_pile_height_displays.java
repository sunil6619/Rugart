package PDPpagetTestcases;

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

public class TC_155_Check_handtufted_rugtype_pile_height_displays extends Base {
	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//div[@class=\"select weavingtype\"]")
    private WebElement rugtypedropdown;
	@FindBy(xpath = "//span[contains(text(),'Hand Tufted')]/parent::div")
    private WebElement handtufted;
	@FindBy(xpath = "//input[@id=\"widthFeetRug\"]")
	private WebElement widthft ;
	@FindBy(xpath = "//input[@id=\"lengthFeetRug\"]")
	private WebElement lgthft ;
	@FindBy(xpath = "//p[contains(text(),'Pile Height ')]")
	private WebElement pileheight;
	@FindBy(xpath = "//label[contains(text(),'0.5-0.6 inch')]")
	private WebElement pileheight1;
	@FindBy(xpath = "//label[contains(text(),'0.6-0.7 inch')]")
	private WebElement pileheight2;
	@FindBy(xpath = "//label[contains(text(),'0.7-0.9 inch')]")
	private WebElement pileheight3;
	
	
	public TC_155_Check_handtufted_rugtype_pile_height_displays() {
		PageFactory.initElements(driver,this);
	}
	
	public void collectionfof() throws InterruptedException, AWTException {
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		 Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(0);
		first.click();
		zoomin();
}
    public void handtufted_pile_heightcheck() {
	
	    String text=handtufted.getText();
	    Assert.assertEquals("Hand Tufted",text);
	    widthft.click();
	    text= pileheight.getText();
	    Assert.assertEquals("PILE HEIGHT", text);
	    text=pileheight1.getText();
	    Assert.assertEquals("0.5-0.6 inch",text);
	    text=pileheight2.getText();
	    Assert.assertEquals("0.6-0.7 inch",text);
	    text=pileheight3.getText();
	    Assert.assertEquals("0.7-0.9 inch",text);
	    
}
    
    TC_155_Check_handtufted_rugtype_pile_height_displays ob;
    @Parameters("url")
    @BeforeTest
    
    public void launchurl() throws InterruptedException {
    	getlaunchurl(getreaddata("url"));
    	ob= new TC_155_Check_handtufted_rugtype_pile_height_displays();
    	
    }
    @Test
    public void check_handtufted_rugtype_pile_height_displays() throws InterruptedException, AWTException {
    	ob.collectionfof();
    	ob.handtufted_pile_heightcheck();
    }
}
