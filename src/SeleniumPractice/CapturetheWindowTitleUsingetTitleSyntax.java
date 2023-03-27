package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturetheWindowTitleUsingetTitleSyntax {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("Images")).click();

		// driver.getTitle();

		String xyx = driver.getTitle();

		System.out.println(xyx);
	}
}
