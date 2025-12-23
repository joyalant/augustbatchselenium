package Junit;

import java.net.HttpURLConnection;
import java.net.URI;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;



public class Response {

	ChromeDriver driver;
	String url = "/index.html HTTP/1.1";
	
	@Test
	public void test() throws Exception 
	{
		
		URI ob = new URI(url);
		HttpURLConnection con = (HttpURLConnection)ob.toURL().openConnection();
		con.connect();
		int code = con.getResponseCode();
		System.out.println(code);
		
	}
	
	
	
	
}
