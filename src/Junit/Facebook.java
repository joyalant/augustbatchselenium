package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
	}
	
	
	@Test
	public void login()
	{
		WebElement webE = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		webE.sendKeys("jj54@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Shinia");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.navigate().back();	
		
	}

}

