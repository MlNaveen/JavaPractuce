package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://facebook.com");

		driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.xpath("//input[@data-type='text'and @name='firstname']")).sendKeys("massoo");

		driver.findElement(By.xpath("//input[@data-type='text'and@name='lastname']")).sendKeys("naveen");

		driver.findElement(By.name("reg_email__")).sendKeys("mknaveen100@gmail.com");

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mknaveen100@gmail.com");

		driver.findElement(By.id("password_step_input")).sendKeys("123naveen@");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[starts-with(@id,'u_2_5_')]")).click();

	}

}
