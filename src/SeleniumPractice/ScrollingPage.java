package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Executable;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

import com.google.common.io.Files;
import net.bytebuddy.asm.Advice.Argument;

public class ScrollingPage {

	

	public static void main(String[] args) throws IOException, InterruptedException

	{

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		driver.get("https://discovery.com");
//
//		JavascriptExecutor srl = (JavascriptExecutor) driver;
//
//		// srl.executeScript("window.scrollBy(0,1000)");
//		srl.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.linkText("Bobcat on the Hunt")));

	
	
	driver.get("http://gmail.com");
	driver.findElement(By.linkText("Help")).click();
	Set<String> ids=driver.getWindowHandles();	
	
	
	Object []allids=ids.toArray();
	String wid1=allids[0].toString();
	String wid2=allids[1].toString();
	
	driver.switchTo().window(wid2);
	
	
	JavascriptExecutor scrl=(JavascriptExecutor)driver;
	
	
	scrl.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.className("language-selector")));
	
	driver.switchTo().window(wid1);
	Thread.sleep(2000);
	scrl.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.linkText("Help")));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}