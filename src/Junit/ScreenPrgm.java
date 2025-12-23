package Junit;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.io.FileHandler;

public class ScreenPrgm {
	
	ChromeDriver driver;
	String url = "file:///C:/Users/joyal/OneDrive/Desktop/notepad/alert_example.html";
	
@Before
	
	public void begin() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
@Test
public void test() throws Exception {
	
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(src, new File("./Error.png"));
	
	WebElement button = driver.findElement(By.xpath("/html/body/input[1]"));
	File cp = button.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(cp, new File("./Screenshot/buttonscrht.png"));
	
	WebElement btn = driver.findElement(By.xpath("/html/body/input[4]"));
	File p = btn.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(p, new File("./Screenshot/scrht.png"));
	
}

}
