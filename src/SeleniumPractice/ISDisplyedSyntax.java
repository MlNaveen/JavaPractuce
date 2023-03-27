package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISDisplyedSyntax {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("http://orangehrm.qedgetech.com");

		driver.findElement(By.id("txtUsername")).sendKeys("Amith");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();

		String adminm = "Time";

		if (driver.findElement(By.linkText(adminm)).isDisplayed()) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}

	}

}
