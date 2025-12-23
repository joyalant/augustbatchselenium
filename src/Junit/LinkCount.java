package Junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.List;

public class LinkCount {
	
	ChromeDriver driver;
	String baseUrl = "http://www.google.com";
	
	@Before
	public void begin() {
		driver = new ChromeDriver(); //open browser
		driver.get(baseUrl);
	}
	
	@Test
	public void linkCount() {
		List<WebElement> li = driver.findElements(By.tagName("div"));
		System.out.println("Total no of links="+li.size());
		
	}

}
