package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {

	ChromeDriver driver;
	String url = "https://demo.guru99.com/test/drag_drop.html";
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Test
	public void test() {
		WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"credit\"]/a"));
		WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"credit0\"]/a"));
		//WebElement btn4 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement btn5 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement btn6 = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement btn7 = driver.findElement(By.xpath("//*[@id=\"credit3\"]/a"));
		WebElement btn8 = driver.findElement(By.xpath("//*[@id=\"credit4\"]/a"));
		WebElement btn9 = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement btn10 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement btn11 = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement btn12 = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act = new Actions(driver);
		act.dragAndDrop(btn2, btn12).perform();
		act.dragAndDrop(btn5, btn9).perform();
		act.dragAndDrop(btn6, btn11).perform();
		act.dragAndDrop(btn2, btn10).perform();
		act.perform();
	}
	
}
