package testpkg;

import org.testng.annotations.Test;
import org.testng.Assert;   
import Basepkg.BaseClass;
import Pagepkg.LoginPage;

public class LoginTest extends BaseClass {

    LoginPage ob;   // Declare once globally

    @Test(priority = 1)
    public void logintest() {
    	 ob = new LoginPage(driver);
        ob.setValues("abc@gmail.com", "abv1324");
        ob.login();
    }

    @Test(priority = 2)
    public void titleVerificationTest() {
        String actualTitle = ob.titleVerification();
        String expectedTitle = "FaceBook";
        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch");
    }

    @Test(priority = 3)
    public void logoTest() {
        boolean logo = ob.logodisplay();
        Assert.assertTrue(logo, "Logo not displayed");
    }
}
