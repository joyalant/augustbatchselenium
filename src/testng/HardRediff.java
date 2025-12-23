package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HardRediff {
	

	ChromeDriver driver;
	String baseurl = "https://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeTest
	public void beforet() {
		driver = new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	
	//1. check logo dispalyed 
	@Test   
	public void test1() {
		
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		Assert.assertTrue(logo.isDisplayed(), "Logo  visible");
		System.out.println("Logo is displayed");

		
		
	}

}
