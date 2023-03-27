package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ApplicationUtils {
	
	public static WebDriver driver;
	
	public static String Url="http://orangehrm.qedgetech.com";
	
	
	
	public static void LaunchApp(String Url)
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(Url);
		
	}   
          public static void CloseApp()
          {
        	  driver.close();
          }
	

	
	
   

	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	


