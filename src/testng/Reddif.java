package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reddif {
	
	ChromeDriver driver;
	String baseurl = "https://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeTest
	public void beforet() {
		driver = new ChromeDriver();
		driver.get(baseurl);
		
	}
	
  @Test
  public void f() {
	  
	  WebElement name = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input"));
	  name.sendKeys("abc");
	  WebElement redif = driver.findElement(By.xpath("//*[contains(@name,\"login\")]"));
	  Actions act = new Actions(driver);
	  act.keyDown(name,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	  act.keyDown(name,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	  act.keyDown(redif,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	  act.perform();
  }
}
