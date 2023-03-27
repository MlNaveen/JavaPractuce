package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdnumberSyntx {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://facebook.com");

		driver.findElement(By.name("email")).sendKeys("mknaveen916@gmail.com");

		driver.findElement(By.name("pass")).sendKeys("@naveen$$");

		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();

	}

}
