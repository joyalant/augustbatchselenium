package testng;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;



public class KeralaProperty {


	ChromeDriver driver = new ChromeDriver();
	@BeforeTest
	public void begin() {
		
		driver = new ChromeDriver();
		String base = "https://keralaproperty.in/member/login/";
		driver.get(base);
	}
	
	@Test
	public void login() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("keralaes@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("abc123456");
		driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
		String expil = "https://keralaproperty.in/member/myhome/";
		wait.until(ExpectedConditions.urlToBe(expil));
		String actualui = driver.getCurrentUrl();
		Assert.assertEquals(actualui,expil);
	
		
	}
}

