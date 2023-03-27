package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationsHandling {

	public static void main(String[] args) throws InterruptedException {

		// 3-03-23

		System.setProperty("webdriver.chromedriver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com");

		driver.findElement(By.name("txtuId")).sendKeys("demo");
		Thread.sleep(2000);
		driver.findElement(By.name("txtPword")).sendKeys("134824");

		driver.findElement(By.name("login")).click();

		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

}
