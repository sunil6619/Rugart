package headertestcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import resources.Base;

public class TC_001_Check_Signin_link extends Base {
//	public WebDriver ldriver;
	
	
//	Home_page ob;
	@Parameters("url")
	@BeforeTest
	
	public void getlaunchurl_rugartisan() throws InterruptedException
	{
		getlaunchurl(getreaddata("url"));
//		
	}
//	@Test (priority=1)
//	
//	public void clickonsignin() {
//		ob.clicksignin();
//	}
//public TC_001_Home_Page() {
//		
//		PageFactory.initElements(driver,this);
//	}
	
//	@FindBy (xpath= "//ul[@class='links']//span[contains(text(),'Sign in')]")
//	private WebElement signin;
//	@FindBy (xpath="//form[@id=\\\"form-sign-in\\\"]//h3[text()='Sign In']")
//	private WebElement siginbox;
	
	
	@Test
public void Check_Signin_link_Test() throws InterruptedException {
		
	Thread.sleep(3000);
//
//	
//	System.setProperty("webdriver.chrome.driver", "S:\\Eclipse 2\\Rugartisan_New\\drivers\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//    	driver.get("https://www.rugartisan.eu");
//	Thread.sleep(5000);
//	
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[2]/butoon")).click();
//
//
//       driver.findElement(By.xpath("//button[@class=\"m-button m-accept\"]")).click();
		driver.findElement(By.xpath(" //ul[@class=\"links\"]/li/span[text()='Sign in']")).click();;
		Thread.sleep(1000);
		String signinbox=driver.findElement(By.xpath("//form[@id=\"form-sign-in\"]//h3[text()='Sign In']")).getText();
    	System.out.println(signinbox);
    	Assert.assertEquals("SIGN IN", signinbox);
//		Thread.sleep(5000);
		
//		driver.close();
	
	}}
	


