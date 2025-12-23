package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Pagepkg.LoginPage;

public class BaseClass {

	public static WebDriver driver;
	public static LoginPage ob;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@BeforeMethod
	public void bfrmtd() {
		ob = new LoginPage(driver);
	}
}
