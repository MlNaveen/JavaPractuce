package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com");

		driver.findElement(By.name("email")).sendKeys("mknaveen916@gmil.com");
		driver.findElement(By.id("pass")).sendKeys("@naveen$$");
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();

	}

}
