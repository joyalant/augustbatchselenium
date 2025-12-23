package testng;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowserTest {
	
	WebDriver driver;
	
	@Parameters("Browser")
	@BeforeTest
	public void test(String browser) {
		if(browser.equalsIgnoreCase("chrometest")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edgetest")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public void test() {
		driver.get("https://www.facebook.com");
	}

}
