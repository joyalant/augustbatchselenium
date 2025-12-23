package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	
	
	@Test
	public void login()
	{
		driver.findElement(By.name("q")).sendKeys("eastbourne east sussex",Keys.ENTER);
		
		driver.findElement(By.name("btnk")).click();
	}
	
//	@After
//	public void breakup() {
//		driver.quit();
//	}
	
	
}

