package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowserCurrentpageSyntax {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://facrbook.com");

		driver.findElement(By.linkText("Games")).click();

		driver.close();

		// idhi only current window page ni mathramey close chesthundhi

	}

}
