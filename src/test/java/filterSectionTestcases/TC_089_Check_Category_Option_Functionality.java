package filterSectionTestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_089_Check_Category_Option_Functionality extends Base{
	
	@Parameters("url")
	@BeforeTest
	
	public void launchurl_rugartisan() throws InterruptedException {
		
		getlaunchurl(getreaddata("url"));	
	}
@Test

public void check_category_option_Test() throws InterruptedException {
	List<WebElement> list;
	List<WebElement> list2;
	String text;
	WebElement selectedfilterontop;
	WebElement categorytitle;
	Thread.sleep(1000);
	WebElement collection=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse\"]/child::ul/child::li/child::a[@href=\"/collections\"]"));
	mousehover(collection);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class=\"collection-item\"]/child::a/img[@alt=\"Field of Flowers\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//h4[contains(text(),'Category')]")).click();
    Thread.sleep(1000);
    list= driver.findElements(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@class=\"filter filter_checkbox category-filter\"]"));
    System.out.println("Total number of Products: "+list.size());
    WebElement abstrac=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/abstract\"]"));
    abstrac.click();
    Thread.sleep(2000);
    list2=driver.findElements(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@class=\"filter filter_checkbox category-filter\"]"));
    System.out.println("Total number of Products: "+list2.size());
    if(list==list2) {
    	System.out.println("List of Products are matched after selecting other category");
    }
    else {
    	System.out.println("List of Products are not matched after selecting other category");
    }
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Abstract']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Abstract')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Abstract Custom Rugs", text);
    WebElement animalprints=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/animal-prints\"]"));
    animalprints.click();
    Thread.sleep(1000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Animal Prints']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Animal Prints')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Animal Prints Rectangle Custom Rugs", text);
    WebElement batik=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/batik\"]"));
    batik.click();
    Thread.sleep(1000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Batik']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Batik')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Batik Rectangle Custom Rugs", text);
    WebElement blueroyal=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/blue-royals\"]"));
    blueroyal.click();
    Thread.sleep(1000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Blue Royal']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Blue Royal')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Blue Royal Rectangle Custom Rugs", text);
    WebElement cerulean=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/cerulean\"]"));
    cerulean.click();
    Thread.sleep(1000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Cerulean']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Cerulean')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Cerulean Rectangle Custom Rugs", text);
    WebElement flatweaves=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/flatweaves\"]"));
    flatweaves.click();
    Thread.sleep(1000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Flatweaves']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Flatweaves')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Flatweaves Rectangle Custom Rugs", text);
    WebElement floral=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/floral\"]"));
    floral.click();
    Thread.sleep(1000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Floral']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Floral')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Floral Rectangle Custom Rugs", text);
    WebElement geometric=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/geometric\"]"));
    geometric.click();
    Thread.sleep(1000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Geometric']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Geometric')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Geometric Rectangle Custom Rugs", text);
    WebElement kids=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/kids\"]"));
    kids.click();
    Thread.sleep(1000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Kids']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Kids')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Kids Rectangle Custom Rugs", text);
    WebElement minimalist=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/minimalist\"]"));
    minimalist.click();
    Thread.sleep(1000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Minimalist']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Minimalist')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Minimalist Rectangle Custom Rugs", text);
    WebElement monochrome=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/monochrome\"]"));
    monochrome.click();
    Thread.sleep(1000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Monochrome']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Monochrome')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Monochrome Rectangle Custom Rugs", text);
    WebElement ombre=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/ombre\"]"));
    ombre.click();
    Thread.sleep(3000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Ombre']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Ombre')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Ombre Rectangle Custom Rugs", text);
    WebElement origami=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/origami\"]"));
    origami.click();
    Thread.sleep(2000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Origami']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Origami')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Origami Rectangle Custom Rugs", text);
    WebElement solidcolors=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/solid-colors\"]"));
    solidcolors.click();
    Thread.sleep(2000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Solid Colors']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Solid Colors ')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Solid Colors Rectangle Custom Rugs", text);
    WebElement surfaceart=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/surface-art\"]"));
    surfaceart.click();
    Thread.sleep(2000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Surface Art']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Surface Art')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Surface Art Rectangle Custom Rugs", text);
    WebElement terrazzoplay=driver.findElement(By.xpath("//ul[@class=\"cd-filter-content cd-filters list\"]/child::li/input[@value=\"collection/terrazzo-play\"]"));
    terrazzoplay.click();
    Thread.sleep(1000);
    selectedfilterontop=driver.findElement(By.xpath("//span[text()='Terrazzo Play']"));
    selectedfilterontop.isDisplayed();
    Assert.assertTrue(true);
    categorytitle=driver.findElement(By.xpath("//h1[@class=\"category-title\"]/child::span[contains(text(),'Terrazzo Play')]"));
    text=categorytitle.getText();
    Assert.assertEquals("Terrazzo Play Rectangle Custom Rugs", text);
    

}
}
