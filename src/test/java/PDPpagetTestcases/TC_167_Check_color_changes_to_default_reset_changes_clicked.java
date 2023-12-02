package PDPpagetTestcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_167_Check_color_changes_to_default_reset_changes_clicked extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//span[contains(text(),'MORE ')]")
	private WebElement morecolors;
	@FindBy(xpath = "//img[@class=\"suggestion-img\"]")
	private List<WebElement> colorsuggestions;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-EI12')]")
	private WebElement color1;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-CG10')]")
	private WebElement color22;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-CS11')]")
	private WebElement color3;
	@FindBy(xpath = "//div[@id=\"colors-row-wrap\"]/descendant::span[contains(text(),'RA-BT03')]")
	private WebElement color4;
	@FindBy(xpath = "//a[@class=\"close\"]")
	private WebElement colorsuggclose;
	@FindBy(xpath = "//span[contains(text(),' Reset Changes')]")
	private WebElement resetchanges;



	public TC_167_Check_color_changes_to_default_reset_changes_clicked() {
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
	//color changes to default

	public void clickonresetchangesafter_changing_colors() throws InterruptedException {
		Thread.sleep(1000);
		String color1st=color1.getText();
		String color2nd=color22.getText();
		String color3rd=color3.getText();
		String color4th=color4.getText();
		morecolors.click();
		Thread.sleep(2000);
		List<WebElement>list=colorsuggestions;
		WebElement color2=list.get(1);
		color2.click();
		Thread.sleep(1000);
		colorsuggclose.click();
		pagedown();
		Thread.sleep(2000);
		resetchanges.click();
		Thread.sleep(2000);
		pagedown();
		String afterresetcolor1st=color1.getText();
		String afterresetcolor2nd=color22.getText();
		String afterresetcolor3rd=color3.getText();
		String afterresetcolor4th=color4.getText();

		// comparing default colors with colors after clicking reset changes
		if(color1st.equals(afterresetcolor1st) && color2nd.equals(afterresetcolor2nd) && color3rd.equals(afterresetcolor3rd) && color4th.equals(afterresetcolor4th) ) 
		{
			System.out.println("Colors are reset to default colors");
		}
		else {
			System.out.println("Colors are not resetted ");
		}


	}


	//	TC_167_Check_color_changes_to_default_reset_changes_clicked ob;
	//	@Parameters("url")
	//	@BeforeTest
	//
	//	public void launchrugartisan() throws InterruptedException {
	//		getlaunchurl(getreaddata("url"));
	//		ob= new TC_167_Check_color_changes_to_default_reset_changes_clicked();
	//	}
	@Test
	public void check_color_changes_to_default_reset_changes_clicked() throws InterruptedException, AWTException {
		TC_167_Check_color_changes_to_default_reset_changes_clicked ob= new TC_167_Check_color_changes_to_default_reset_changes_clicked();
		ob.clickoncollectionfof();
		ob.clickonresetchangesafter_changing_colors();

	}

}
