//package pagepkg;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class KPLoginPage {
//
//	
//WebDriver driver;
//	
//	@FindBy(xpath="//*[@id=\"ulogin\"]")
//	WebElement kbuser;
//	
//	@FindBy(xpath="//*[@id=\"upass\"]")
//	WebElement kbpswd;
//	
//	@FindBy(xpath="//*[@id=\"sub_logbtn\"]")
//	WebElement kblogin;
//	
//     
//	public KPLoginPage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//		
//	}
//	public void setvalues(String un,String pswd) {
//		kbuser.sendKeys(un);
//		kbpswd.sendKeys(pswd);
//	}
//	public void login() {
//		kblogin.click();
//	}
//}
