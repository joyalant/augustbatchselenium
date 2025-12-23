package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(name="email")
	WebElement fbemail;
	
	@FindBy(name="pass")
	WebElement fbpaswd;
	
	@FindBy(name="login")
	WebElement fblogin;
	
	@FindBy(xpath="//*[@id='globalContainer']/div[1]/div/div/div/div[1]/div/img")
	WebElement fblogo;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setValues(String email, String pswd) {
		fbemail.sendKeys(email);
		fbpaswd.sendKeys(pswd);
		
		
	}
	public void login() {
		fblogin.click();
	}
	public String titleVerification() {
		
		return driver.getTitle();
	}
	public boolean logodisplay() {
		return fblogo.isDisplayed();
	}
}
