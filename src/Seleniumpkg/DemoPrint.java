package Seleniumpkg;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeDriverService;

public class DemoPrint {

	public static void main(String[] args) {
		
		//chromed river
		//firefox driver
		//edge driver
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		
	}

}
