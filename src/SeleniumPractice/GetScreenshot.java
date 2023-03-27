package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshot {

	private static final FileHandler FileUtils = null;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://primusbank.qedgetech.com");

		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();

		driver.findElement(By.xpath("//*[contains(@href,'password')]")).click();

		// code to capture Screenshot of the page
		TakesScreenshot ts = (TakesScreenshot) driver;

		File srcfile = ts.getScreenshotAs(OutputType.FILE);

		File destifile = new File("C:\\Users\\dell\\Java Practice\\SeleniumBasics\\pic/mk.jpg");

      FileUtils.copy(srcfile, destifile);

		System.out.println("test pass");

	}

	
	
	}


