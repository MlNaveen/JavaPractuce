package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class FindElementsSyntaxxx {

	public static <WebElement> void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://primusbank.qedgetech.com");

		driver.findElement(By.linkText("Site Map")).click();

	}
}