package SeleniumPractice;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetSwitchToCurrentWindowToOtherWindowPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://gmail.com");

		driver.findElement(By.linkText("Help")).click();

		// total window pages id print

		Set<String> AllwindowsId = driver.getWindowHandles();

		System.out.println(AllwindowsId);

		Object[] CaptureAllId = AllwindowsId.toArray();

		String window1 = CaptureAllId[0].toString();

		String window2 = CaptureAllId[1].toString();

		// switch to second window page

		driver.switchTo().window(window2);
		driver.findElement(By.linkText("Community")).click();
		
       
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
