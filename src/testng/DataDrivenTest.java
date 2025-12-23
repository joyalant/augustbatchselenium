package testng;


import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDrivenTest {
	
	WebDriver driver;
	
	
	
	
	@Parameters("browser")
	@BeforeTest
public void setup(String browser)  {
		
		if(browser.equalsIgnoreCase("chrometest")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefoxtest")) {
			driver = new FirefoxDriver();
		}
		else {
			driver = new EdgeDriver();
		}
		
		
		
	}
	
	@Test
	public void test() throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\joyal\\Downloads\\Book4.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int row = sh.getLastRowNum();
		for(int i=1;i<=row;i++) {
			String un = sh.getRow(i).getCell(0).getStringCellValue();
			String pswd = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username="+un);
			System.out.println("password="+pswd);

			driver.get("https://www.facebook.com");
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(un);
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(pswd);
			driver.findElement(By.name("login")).click();
			
			
		}
	}
	

}
