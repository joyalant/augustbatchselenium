//package basepkg;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//
//import pagepkg.KPLoginPage;
//
//public class KPBaseClass {
//
//	public static WebDriver driver;
//	public static KPLoginPage ob;
//	@BeforeTest
//	public void login() {
//		driver = new ChromeDriver();
//		driver.get("https://keralaproperty.in/member/login/");
//	}
//	@BeforeMethod
//	public void methd() {
//		ob = new KPLoginPage(driver);
//	}
//}
