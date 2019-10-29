package suite1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import libs.TestBase;

public class Test1 extends TestBase{
  @Test
  public void f() {
	  try
	  {
		  System.out.println("Test Case1");
	  invokeBrowser();
	  Thread.sleep(2000);
	
	  }
	  catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
	  }
@AfterMethod
public void closeSuiteBrowser()
{
	  closeBrowser();
	  
}
}
