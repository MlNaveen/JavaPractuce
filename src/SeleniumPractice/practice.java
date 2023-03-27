package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {

		System.setProperty("webdrver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://primusbank.qedgetech.com");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("Site Map")).click();

		List<org.openqa.selenium.WebElement> rrr = driver.findElements(By.linkText("Home"));

		System.out.println(rrr.size());

		rrr.get(0);

	}

}
