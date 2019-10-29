package suite1;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import libs.TestBase;

public class Test2 extends TestBase{
  @Test
  public void f() {
	  try
	  {
		  System.out.println("Test Case 2");
	  invokeBrowser();
	  Thread.sleep(2000);
getElementByID("UserName").sendKeys("Hello");
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
