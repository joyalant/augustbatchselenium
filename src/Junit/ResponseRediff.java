package Junit;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseRediff {
	
	ChromeDriver driver;
	String url = "https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void begin() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Test
	public void test()  {
//		URI ob = new URI(url);
//		HttpURLConnection con = (HttpURLConnection)ob.toURL().openConnection();
//		
		
		WebElement button = driver.findElement(By.xpath("//input[contains(@name , 'btnchkavail')]"));
		String buttontext = button.getAttribute("value");
		if(buttontext.equals("Check availability")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
	}
}
