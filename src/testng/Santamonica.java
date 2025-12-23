package testng;
import java.net.HttpURLConnection; 
import java.net.URI; 
import java.net.http.HttpRequest; 
import java.util.List; 
import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 
public class Santamonica {
	ChromeDriver driver; 
	@BeforeTest 
	public void begin() { 
		driver = new ChromeDriver(); 
		driver.get("https://santamonicaedu.in/"); 
		}
	@Test 
	public void linkcount() { 
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"logo-img\"]")); 
		Boolean text = logo.isDisplayed(); 
		if(text) { 
			System.out.println("logo displayed"); 
		}
		else { 
			System.out.println("logo not displayed"); 
			} 
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		List<WebElement> li = driver.findElements(By.tagName("a")); 
		System.out.println("Total no of links="+li.size()); 
		for(WebElement element : li) { 
			String link = element.getAttribute("href"); 
			if (link == null || link.isEmpty()) { 
				System.out.println("Skipping empty href"); 
				continue; 
				}
			verify(link); 
			} 
		} 
	private void verify(String link) { 
			try { 
				URI ob = new URI(link); 
				HttpURLConnection conn = (HttpURLConnection) ob.toURL().openConnection(); 
				conn.setRequestMethod("GET"); 
				conn.connect(); 
				int code = conn.getResponseCode(); 
				if(code == 200) { 
					System.out.println("Connection Successfull(200) "+link); 
					}else if(code == 404) { 
						System.out.println("Broken Link(404) "+link); 
						}else { 
							System.out.println("not successfull ("+ code+"):"+link); 
							} 
				}catch(Exception e) { System.out.println("Error "+link+e.getMessage()); } } 
	}