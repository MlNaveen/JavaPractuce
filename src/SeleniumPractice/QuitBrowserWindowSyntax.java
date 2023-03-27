package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitBrowserWindowSyntax {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://facrbook.com");

		driver.findElement(By.linkText("Games")).click();

		driver.quit();

		// idhi total window page ni close chesthundhi

	}

}
