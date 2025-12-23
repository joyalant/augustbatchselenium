package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru {
	
	ChromeDriver driver;
	String url = "https://demo.guru99.com/test/simple_context_menu.html";
	
	@BeforeTest
	public void beforet() {
		driver = new ChromeDriver();
		driver.get(url);
	}
  @Test
  public void f() {
	  
	 
	  WebElement right = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	  WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
	  WebElement doub = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	  Actions act = new Actions(driver);
	  act.contextClick(right);
	  act.click(edit).perform();
	  
	  Alert al = driver.switchTo().alert();
	  System.out.println(al.getText());
	  al.accept();
	  act.doubleClick(doub);

	  act.perform();
	  
  }
}
