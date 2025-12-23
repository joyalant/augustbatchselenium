package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testingdemo {

	@BeforeTest
	public void setup() {
		System.out.println("browser open");
	}
	@BeforeMethod
	public void method() {
		System.out.println("url");
	}
	@Test(priority = 2 , groups = {"smoke","regression"})
	public void test1() {
		System.out.println("test 1");
	}
	@Test(priority = 3 , groups = {"smoking","regr"})
	public void test2() {
		System.out.println("test 2");
	}
	@Test(priority = 1)
	public void test3() {
		System.out.println("test 3");
	}
	@Test(enabled = false)
	public void test4() {
		System.out.println("test 4");
	}
	@Test(priority = 5 , groups = {"luminar"})
	public void test5(){
		System.out.println("test 5");
	}
	@AfterMethod
	public void afterme() {
		System.out.println("method");
	}
	@AfterTest
	public void endft() {
		System.out.println("browser close");
	}
	
}
