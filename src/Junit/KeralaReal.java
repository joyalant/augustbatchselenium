package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeralaReal {
	
	ChromeDriver driver = new ChromeDriver();
	@Before
	public void begin() {
		
		String base = "https://keralarealestate.com/client/login";
		driver.get(base);
	}
	
	@Test
	public void login() {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("keralaes@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/button")).click();
	}
}
