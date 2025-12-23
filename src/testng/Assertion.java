package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	ChromeDriver driver;
	String url = "https://www.ebay.com/";
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void title() {
		SoftAssert soft = new SoftAssert();
		String actual = driver.getTitle();
		String explicit = "Ebay";
		soft.assertEquals(actual, explicit,"title mismatch");
		System.out.println("title compare");
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"gh-logo\"]"));
		boolean logod = logo.isDisplayed();
		soft.assertTrue(logod,"logo is not displayed");
		System.out.println("logo displayed");
		soft.assertAll();
		
	}
	
}

