package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementSyntaxx {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://primusbank.qedgetech.com");

		driver.findElement(By.linkText("Site Map")).click();

		driver.findElement(By.linkText("Home")).click();

	}
}
