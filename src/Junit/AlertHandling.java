package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	ChromeDriver driver;
	String url = "file:///C:/Users/joyal/OneDrive/Desktop/notepad/alert_example.html";
	@Before
	
	public void begin() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Test
	
	public void test() {
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		//a.dismiss();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("gsyb");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
	}

}
