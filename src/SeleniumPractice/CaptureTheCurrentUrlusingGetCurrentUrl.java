package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheCurrentUrlusingGetCurrentUrl {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");

		driver.findElement(By.linkText("Gmail")).click();

		String rr = driver.getCurrentUrl();
		System.out.println(rr);

//		if(xyx.contains("gmail"))
//			
//			//ikkada contains yendduku ichanu antey program ni run chesaka url
//	                                                                                                                                                                  		//>>>>https://www.google.com/intl/en-GB/gmail/about/
//			// ila vasthundhi indhulo manaki kavalsina word gmail kadha aa word mathrmey find out chestudhi	
//				{
//			System.out.println("test pass");
//		}
//		else
//		{
//			System.out.println("test fail");
//		}
//		
	}
//
}
