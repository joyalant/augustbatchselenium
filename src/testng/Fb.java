package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fb {
	
	ChromeDriver driver;
	String baseurl = "https://www.facebook.com";
	@BeforeTest
	public void test() {
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Parameters({"un","pswd"})
  @Test
  public void f(String un , String pswd) {
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pswd);
		driver.findElement(By.name("login")).click();
		
  }
}
