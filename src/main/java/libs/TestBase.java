package libs;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.checkerframework.checker.formatter.FormatUtil.ExcessiveOrMissingFormatArgumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver=null;

	public Properties Objects=null;
	public Properties Param=null;
public FileInputStream fis=null;
public File F=null;
public File fApp=null;
public FileInputStream fisApp=null;

public WebElement getElementByXpath(String xpath)
{
	WebElement strByxpath=null;
	try
	{
		if(driver.findElement(By.xpath(Objects.getProperty(xpath))).isEnabled())
		{
			if(driver.findElement(By.xpath(Objects.getProperty(xpath))).isDisplayed())
			{
					strByxpath=driver.findElement(By.xpath(Objects.getProperty(xpath)));
			}
			else
			{
	System.out.println("NOT displayed");			
			}
		}
		else
		{
			System.out.println("NOT Enabled");		
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	return strByxpath;
}



public WebElement getElementByID(String id)
{
	WebElement strByID=null;
	try
	{
		if(driver.findElement(By.id(Objects.getProperty(id))).isEnabled())
		{
			if(driver.findElement(By.id(Objects.getProperty(id))).isDisplayed())
			{
					strByID=driver.findElement(By.id(Objects.getProperty(id)));
			}
			else
			{
	System.out.println("NOT displayed");			
			}
		}
		else
		{
			System.out.println("NOT Enabled");		
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	return strByID;
}

public void invokeBrowser()
	{
		try
		{
		System.out.println("Invoke Browser--");
		System.setProperty("webdriver.chrome.driver","E:\\Satish\\Automation\\Selenium\\281019\\frmwk\\src\\main\\java\\browser\\chromedriver.exe");	
		driver=new ChromeDriver();
		readProperties();
		driver.get(Param.getProperty("appPath"));
		driver.manage().window().maximize();
		Properties p=new Properties();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void closeBrowser()
	{
		try
		{
			System.out.println("Close Browser--");
			driver.quit();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void readProperties()
	{
		try
		{
			F=new File("E:\\Satish\\Automation\\Selenium\\281019\\frmwk\\src\\main\\java\\configfiles\\Objects.properties");
	fis=new FileInputStream(F);
		Objects=new Properties();
		Objects.load(fis);
	
		 fApp=new File("E:\\Satish\\Automation\\Selenium\\281019\\frmwk\\src\\main\\java\\configfiles\\Param.properties");
		fisApp=new FileInputStream(fApp);
			Param=new Properties();
			Param.load(fisApp);
			
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
