package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo {

	//@before
	//@test
	//@after
	
	ChromeDriver driver;
	@Before
	
	public void setUp()
	{
		 driver = new ChromeDriver(); //open browser
		 driver.get("https://www.facebook.com");
	}
	
	@Test
	public void TitleVerification()
	{
		String actualtitle =driver.getTitle();
		String exp = "facebook";
		if(actualtitle.equals(exp)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
	}
	
	@Test
	public void contentVerification() {
		String page = driver.getPageSource();
		String expected = "create";
		if(page.contains(expected)) {
			System.out.println("content is present");
		}
		else {
			System.out.println("not present");
		}
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
