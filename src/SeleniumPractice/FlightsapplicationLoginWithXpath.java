package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightsapplicationLoginWithXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://flights.Qedgetech.com");

		driver.findElement(By.name("email")).sendKeys("mknaveen100@gmail.com");

		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("@naveen$$");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
