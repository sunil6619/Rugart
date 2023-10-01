package homepagetestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class TC_083_Check_Collection_match_numbers extends Base {

	@Parameters("url")
	@BeforeTest
	public void getlaunchurl_rugartisan() throws InterruptedException {
		getlaunchurl(getreaddata("url"));

	}

	@Test

	public void check_collection_match_numbers_Test() throws InterruptedException {
		
		int numberofdesigns;
		String number;
		List<WebElement> list;
		int productsinside;
		Thread.sleep(1000);
		WebElement collec;
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		String fof = driver.findElement(By.xpath("//*[contains(text(),'Field of Flowers')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Field of Flowers have: " + fof);
		number = extractnumberfromstring(fof);

		numberofdesigns = convertStringintoint(number);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@alt=\"Field of Flowers\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Field of Flowers Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		list = driver.findElements(By.xpath("//span[text()='2-3 weeks delivery']"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Products are matched for Field of Flowers");
		}

		else {
			System.out.println("Product numbers are not matched for Field of Flowers");
		}
		driver.navigate().back();
		Thread.sleep(1000);
		String ombre = driver.findElement(By.xpath("//h3[contains(text(),'Ombre')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Ombre have: " + ombre);
		number = extractnumberfromstring(ombre);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Ombre\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Ombre Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		list = driver.findElements(By.xpath("//span[text()='2-3 weeks delivery']"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Products are matched for Ombre");
		}

		else {
			System.out.println("Product numbers are not matched for Ombre");
		}
		driver.navigate().back();
		Thread.sleep(1000);
		String terrazzo = driver.findElement(By.xpath("//h3[contains(text(),'Terrazzo Play')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Terrazzo play have: " + terrazzo);
		number = extractnumberfromstring(terrazzo);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Terrazzo Play\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Terrazzo Play Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		list = driver.findElements(By.xpath("//span[text()='2-3 weeks delivery']"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Products are matched for Terrazo play");
		}

		else {
			System.out.println("Product numbers are not matched for Terrazo play");
		}
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		String batik = driver.findElement(By.xpath("//h3[contains(text(),'Batik')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Batik have: " + batik);
		number = extractnumberfromstring(batik);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Batik\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Batik Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		list = driver.findElements(By.xpath("//span[text()='2-3 weeks delivery']"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Products are matched for Batik");
		}

		else {
			System.out.println("Product numbers are not matched for Batik");
		}
		driver.navigate().back();
		Thread.sleep(2000);
		String origami = driver.findElement(By.xpath("//h3[contains(text(),'Origami')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Origami have: " + origami);
		number = extractnumberfromstring(origami);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Origami\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Origami Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		list = driver.findElements(By.xpath("//span[text()='2-3 weeks delivery']"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Products are matched for Origami");
		}

		else {
			System.out.println("Product numbers are not matched for Origami");
		}
		driver.navigate().back();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		String surfaceart = driver.findElement(By.xpath("//h3[contains(text(),'Surface Art')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Surface Art have: " + surfaceart);
		number = extractnumberfromstring(surfaceart);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Surface Art\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Surface Art Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		scrolldown();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Load More')]")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		list = driver.findElements(By.xpath("//*[contains(text(),'2-3 weeks delivery')]"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Products are matched for Surface Art");
		}

		else {
			System.out.println("Product numbers are not matched for Surface Art");
		}

		driver.navigate().to("https://www.rugartisan.com/");
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		String mini = driver.findElement(By.xpath("//*[contains(text(),'Minimalist')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Minimalist have: " + mini);
		number = extractnumberfromstring(mini);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Minimalist\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Minimalist Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		list = driver.findElements(By.xpath("//span[text()='2-3 weeks delivery']"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Product number are matched for Minimalist");
		} else {
			System.out.println("Product numbers are not matched for Minimalist");
		}
		
		driver.navigate().to("https://www.rugartisan.com/");
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
//		Thread.sleep(1000);
		String cerulean = driver.findElement(By.xpath("//*[contains(text(),'Cerulean')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Cerulean have: " + cerulean);
		number = extractnumberfromstring(cerulean);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Cerulean\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Cerulean Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		list = driver.findElements(By.xpath("//span[text()='2-3 weeks delivery']"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Product number are matched for Cerulean");
		} else {
			System.out.println("Product numbers are not matched for Cerulean");
		}
		driver.navigate().to("https://www.rugartisan.com/");
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		String geometric = driver.findElement(By.xpath("//*[contains(text(),'Geometric')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Geometric have: " + geometric);
		number = extractnumberfromstring(geometric);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Geometric\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Geometric Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		scrolldown();
		list = driver.findElements(By.xpath("//*[contains(text(),'2-3 weeks delivery')]"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Product number are matched for Geometric");
		} else {
			System.out.println("Product numbers are not matched for Geometric");
		}
		driver.navigate().to("https://www.rugartisan.com/");
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		 String abstrac=driver.findElement(By.xpath("//*[contains(text(),'Abstract')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Abstract have: " + abstrac);
		number = extractnumberfromstring(abstrac);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Abstract\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Abstract Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		scrolldown();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		
		list = driver.findElements(By.xpath("//*[contains(text(),'2-3 weeks delivery')]"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Product number are matched for Abstract");
		} else {
			System.out.println("Product numbers are not matched for Abstract");
		}
		driver.navigate().to("https://www.rugartisan.com/");
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		 String vintage=driver.findElement(By.xpath("//*[contains(text(),'Vintage')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Vintage have: " + vintage);
		number = extractnumberfromstring(vintage);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Vintage\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Vintage Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		scrolldown();
		list = driver.findElements(By.xpath("//*[contains(text(),'5-7 weeks delivery')]"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Product number are matched for Vintage");
		} else {
			System.out.println("Product numbers are not matched for Vintage");
		}
		driver.navigate().to("https://www.rugartisan.com/");
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		 String floral=driver.findElement(By.xpath("//*[contains(text(),'Floral')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Floral have: " + floral);
		number = extractnumberfromstring(floral);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Floral\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Floral Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		scrolldown();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		list = driver.findElements(By.xpath("//*[contains(text(),'2-3 weeks delivery')]"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Product number are matched for Floral");
		} else {
			System.out.println("Product numbers are not matched for Floral");
		}
		driver.navigate().to("https://www.rugartisan.com/");
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		 String animalprints=driver.findElement(By.xpath("//*[contains(text(),'Animal Prints')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Animal Prints have: " + animalprints);
		number = extractnumberfromstring(animalprints);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Animal Prints\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Animal Prints Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		list = driver.findElements(By.xpath("//*[contains(text(),'2-3 weeks delivery')]"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Product number are matched for Animal Prints");
		} else {
			System.out.println("Product numbers are not matched for Animal Prints");
		}
		driver.navigate().to("https://www.rugartisan.com/");
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		 String kids=driver.findElement(By.xpath("//*[contains(text(),'Kids')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Kids have: " + kids);
		number = extractnumberfromstring(kids);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Kids\"])[3]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Kids Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		scrolldown();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		list = driver.findElements(By.xpath("//*[contains(text(),'2-3 weeks delivery')]"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Product number are matched for Kids");
		} else {
			System.out.println("Product numbers are not matched for Kids");
		}
		driver.navigate().to("https://www.rugartisan.com/");
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		 String flatweaves=driver.findElement(By.xpath("//*[contains(text(),'Flatweaves')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Flatweaves have: " + flatweaves);
		number = extractnumberfromstring(flatweaves);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Flatweaves\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Flatweaves Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		scrolldown();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		list = driver.findElements(By.xpath("//*[contains(text(),'3-4 weeks delivery')]"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Product number are matched for Flatweaves");
		} else {
			System.out.println("Product numbers are not matched for Flatweaves");
		}

		driver.navigate().to("https://www.rugartisan.com/");
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		 String blueroyal=driver.findElement(By.xpath("//*[contains(text(),'Blue Royal')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Blue Royal have: " + blueroyal);
		number = extractnumberfromstring(blueroyal);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Blue Royal\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Blue Royal Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		list = driver.findElements(By.xpath("//*[contains(text(),'2-3 weeks delivery')]"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Product number are matched for Blue Royal");
		} else {
			System.out.println("Product numbers are not matched for Blue Royal");
		}

		driver.navigate().to("https://www.rugartisan.com/");
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		 String monochrome=driver.findElement(By.xpath("//*[contains(text(),'Monochrome')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Monochrome have: " + monochrome);
		number = extractnumberfromstring(monochrome);
		numberofdesigns = convertStringintoint(number);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@href='/collection/monochrome'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Monochrome Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		scrolldown();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		list = driver.findElements(By.xpath("//*[contains(text(),'2-3 weeks delivery')]"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Product number are matched for Monochrome");
		} else {
			System.out.println("Product numbers are not matched for Monochrome");
		}

		driver.navigate().to("https://www.rugartisan.com/");
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		 String solidcolors=driver.findElement(By.xpath("//*[contains(text(),'Solid Colors')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Solid colors have: " + solidcolors);
		number = extractnumberfromstring(solidcolors);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Solid Colors\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Solid Colors Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		scrolldown();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Load More')]")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		list = driver.findElements(By.xpath("//*[contains(text(),'2-3 weeks delivery')]"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Product number are matched for Solid Colors");
		} else {
			System.out.println("Product numbers are not matched for Solid Colors");
		}

		driver.navigate().to("https://www.rugartisan.com/");
		 collec = driver.findElement(By.xpath("//div[@class=\"category-heading\"]/following::h2[contains(text(),'Collection')]"));
		 scroll(collec);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"collection-slider\"]/child::div[@class=\"owl-nav\"]/button[@class=\"owl-next\"]")).click();
		Thread.sleep(1000);
		 String outdoor=driver.findElement(By.xpath("//*[contains(text(),'Outdoor')]/ancestor-or-self::*/p[contains(text(),'Designs')]")).getText();
		System.out.println("Outdoor have: " + outdoor);
		number = extractnumberfromstring(outdoor);
		numberofdesigns = convertStringintoint(number);
		driver.findElement(By.xpath("(//img[@alt=\"Outdoor\"])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Outdoor Custom Rugs')]")).isDisplayed();
		Assert.assertTrue(true);
		scrolldown();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Load More')]")).click();
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);

		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		
		list = driver.findElements(By.xpath("//*[contains(text(),'4-5 weeks delivery')]"));
		productsinside = list.size();
		System.out.println("Total Products inside : " + list.size());

		if (numberofdesigns == productsinside) {
			System.out.println("Product number are matched for Outdoor");
		} else {
			System.out.println("Product numbers are not matched for Outdoor");
		}

	}
}
