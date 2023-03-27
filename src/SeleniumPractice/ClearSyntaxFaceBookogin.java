package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearSyntaxFaceBookogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com");

		driver.findElement(By.name("email")).sendKeys("mknaveen@gmail.com");

		Thread.sleep(4000);

		driver.findElement(By.name("email")).clear();

	}

}
