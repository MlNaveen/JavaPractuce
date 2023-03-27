package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndMinimizeBrowserWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.manage().window().maximize();

		driver.get("http://facebook.com");

		Thread.sleep(2000);

		driver.manage().window().maximize();

	}

}
