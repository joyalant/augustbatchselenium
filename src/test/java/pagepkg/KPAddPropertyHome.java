//package pagepkg;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class KPAddPropertyHome {
//	
//	WebDriver driver;
//	
//	 @FindBy(xpath="//a[contains(text(),'Add Property')]")
//	 WebElement kpaddprop;
//	 
//	 @FindBy(xpath="//*[@id=\"proplabel\"]")
//	 WebElement kplabel;
//	 
//	 @FindBy(xpath="//*[@id=\"propcategory\"]")
//	 WebElement kpcategory;
//	 
//	 @FindBy(xpath="//*[@id=\"propcost\"]")
//	 WebElement kpprice;
//	 
//	 @FindBy(xpath="//*[@id=\"propbeds\"]")
//	 WebElement kpbeds;
//	 
//	 @FindBy(xpath="//*[@id=\"propbaths\"]")
//	 WebElement kpbath;
//	 
//	 @FindBy(xpath="//*[@id=\"district\"]")
//	 WebElement kpdist;
//	 
//	 @FindBy(xpath="//*[@id=\"proplocation\"]")
//	 WebElement kploc;
//	 
//	 @FindBy(xpath="//*[@id=\"propaddress\"]")
//	 WebElement kpaddress;
//	 
//	 @FindBy(xpath="//*[@id=\"introlabel\"]")
//	 WebElement kpadver;
//	 
//	 @FindBy(xpath="/html/body")
//	 WebElement kpsummary;
//	 
//	 @FindBy(xpath="//*[@id=\"userfile\"]")
//	 WebElement kpupload;
//	 
//	 @FindBy(xpath="//*[@id=\"sub_frmproperty\"]")
//	 WebElement kpsubmit;
//	 
//	 public KPAddPropertyHome(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		 this.driver = driver;
//		 PageFactory.initElements(driver, this);
//	}
//	 public void setvalues(String label,String expprice,String beds , String bath , String address , String advers , String sumary) {
//		 kplabel.sendKeys(label);
//		 kpprice.sendKeys(expprice);
//		 kpbeds.sendKeys(beds);
//		 kpbath.sendKeys(bath);
//		 kpaddress.sendKeys(address);
//		 kpadver.sendKeys(advers);
//		 kpsummary.sendKeys(sumary);
//		 
//		 
//	 }
//	 public void starts() {
//		 new WebDriverWait(driver, Duration.ofSeconds(10))
//         .until(ExpectedConditions.elementToBeClickable(kpaddprop))
//         .click();
//	 }
//	 public void submit() {
//		 kpsubmit.click();
//	 }
//
//}
