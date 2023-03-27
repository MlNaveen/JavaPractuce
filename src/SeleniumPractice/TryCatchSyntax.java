package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryCatchSyntax {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://orangehrm.qedgetech.com");

		driver.findElement(By.id("txtUsername")).sendKeys("Amith");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();

		String adminm = "Admin";

		try {

			if (driver.findElement(By.linkText(adminm)).isDisplayed()) {
				System.out.println("admin link is showing test fail");

			}

		} catch (Exception e) {
			System.out.println("admin link is not showing test pass");
		}
//Thread.sleep(2000);    
//		driver.findElement(By.linkText("Time")).click();

	}

}
