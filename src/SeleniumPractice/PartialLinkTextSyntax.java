package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextSyntax {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://Orangehrm.qedgetech.com");

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");

		driver.findElement(By.xpath("//*[@value='LOGIN']")).click();

		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Logout")).click();

		Thread.sleep(2000);

		driver.close();

	}

}
