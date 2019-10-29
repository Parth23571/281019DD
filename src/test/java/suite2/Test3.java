package suite2;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import libs.TestBase;

public class Test3 extends TestBase{
  @Test
  public void f() {
	  try
	  {
		  System.out.println("Test Case 3");
	  invokeBrowser();
	  Thread.sleep(2000);
	  getElementByID("UserName").sendKeys("Hello 2");
	  Thread.sleep(2000);
getElementByID("UserName").clear();
getElementByXpath("chkTester").click();
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
