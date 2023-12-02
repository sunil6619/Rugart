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

public class TC_166_Check_PDP_should_open_whichever_design_selected extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//h2[contains(text(),'Anemone')]")
	private WebElement productname;

	public TC_166_Check_PDP_should_open_whichever_design_selected() {
		PageFactory.initElements(driver,this);
	}

	//clicking on collections field of flowers
	public void clickoncollectionfof() throws InterruptedException, AWTException {
		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(2);
		first.click();
		zoomin();
	}
	// verifying same design opened or not
	public void verifysamedesignopened() {
		String prodname=productname.getText();
		Assert.assertEquals("Anemone",prodname);		
	}
	//	TC_166_Check_PDP_should_open_whichever_design_selected ob;
	//	@Parameters("url")
	//	@BeforeTest
	//
	//	public void launchrugartisan() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_166_Check_PDP_should_open_whichever_design_selected();
	//	}
	@Test
	public void checkpdpshouldopen_whichever_design_selected() throws InterruptedException, AWTException {
		TC_166_Check_PDP_should_open_whichever_design_selected ob= new TC_166_Check_PDP_should_open_whichever_design_selected();
		ob.clickoncollectionfof();
		ob.verifysamedesignopened();
	}


}
