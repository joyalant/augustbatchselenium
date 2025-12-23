package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddifogo {
	ChromeDriver driver;
	String url = "https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void begin() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Test
	public void test()  {

		
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		Boolean text = logo.isDisplayed();
		if(text) {
			System.out.println("logo displayed");
		}else {
			System.out.println("not displayed");
		}
		
	}
}
