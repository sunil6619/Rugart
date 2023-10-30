package PDPpagetTestcases;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;


public class TC_237_Check_download_pdf_link_verify_downloaded_or_not extends Base{

	@FindBy(xpath = "//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]")
	private WebElement collection;
	@FindBy(xpath = "//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")
	private WebElement fof;
	@FindBy(xpath = "//span[@class=\"downloadpdf modal-text\"]")
	private WebElement downloadpdf;
	
	String downloadpath= System.getProperty("user.dir")+"\\DownloadFiles";
	String expectedFilename="Anemone-Hand Tufted-Rectangle.pdf";
//	private static String downloadpath="S:\\RugDownloads";
	
	public  TC_237_Check_download_pdf_link_verify_downloaded_or_not() {
		PageFactory.initElements(driver, this);
	}
	public void clickoncollection() throws InterruptedException, AWTException {

		mousehover(collection);
		Thread.sleep(1000);
		fof.click();
		Thread.sleep(1000);
		List<WebElement> customize=driver.findElements(By.xpath("//span[contains (text(),'Custom Sizes')]"));
		WebElement first=customize.get(2);
		first.click();
	}
	public void click_download_pdf() throws InterruptedException {
		Thread.sleep(1000);
		pagedown();
		Thread.sleep(1000);
		downloadpdf.click();
		Assert.assertTrue(verifyDownloadedfile());
		
		
//		Assert.assertTrue(isFileDownloaded("S:\\RugDownloads", "file-sample_100kB.doc"), "Failed to download Expected document");
	}
	public boolean verifyDownloadedfile() {
		File folder=new File(downloadpath);
		File[] filelist=folder.listFiles();
		boolean isFilePresent=false;
		for (File file:filelist) {
			if(file.isFile()) {
				String filename=file.getName();
				System.out.println(filename);
				if(filename.matches(expectedFilename))
				{
					isFilePresent=true;
				}
			}
		}
		return isFilePresent;
	}
	
	

	TC_237_Check_download_pdf_link_verify_downloaded_or_not ob;
	//@Parameters ("url")
	@BeforeTest



	public void launchurl() throws InterruptedException, IOException {
		//initialize chrome options
				ChromeOptions options=new ChromeOptions();
				//set download path
				Map<String,Object>prefs= new HashMap<>();
				prefs.put("download.default_directory",downloadpath);
				options.setExperimentalOption("prefs", prefs);
				//initiaze chrome with chrome `options
				WebDriver driver= new ChromeDriver(options);
				
		getlaunchurl(getreaddata("url"));
		ob= new TC_237_Check_download_pdf_link_verify_downloaded_or_not();
		Log.info("Chrome browser and url launch");
		File folder=new File(downloadpath);
		FileUtils.cleanDirectory(folder);
	}
	

	@Test

	public void check_donwload_pdf_verify() throws InterruptedException, AWTException {

		ob.clickoncollection();
		ob.click_download_pdf();
		
		Log.info("Checking download PDF in PDP ");
	}
	
}
