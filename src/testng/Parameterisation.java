package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {
	@Parameters({"a"})
	
  @Test
  public void f(String v) {
		System.out.println("value="+v);
  }
}
