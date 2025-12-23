//package testpkg;
//
//import org.testng.annotations.Test;
//
//import basepkg.KPBaseClass;
//import pagepkg.KPAddPropertyHome;
//import pagepkg.KPLoginPage;
//
//public class KPAddPropertyTest extends KPBaseClass{
//	
//	KPAddPropertyHome ob;
//	KPLoginPage ob1;
//	
//	
//	@Test(priority=1)
//	public void logintest() {
//		ob1 = new KPLoginPage(driver);
//		ob1.setvalues("animalfootprint123@gmail.com", "Abc@12345");
//		ob1.login();
//		
//		
//	}
//	@Test(priority=2)
//	public void setup() {
//		
//		ob = new KPAddPropertyHome(driver);
//		ob.starts();
//		ob.setvalues("House Mansion", "8000000", "5", "5", "Chunkaparambil house kottayam dist pincode 686636", "Mansion for sale", "A huge mansion with 3000sq feet is for sale. we are going to sell it with top family in kottayam dist interested contact 9898989823");
//		
//		ob.submit();
//		
//	}
//
//}
