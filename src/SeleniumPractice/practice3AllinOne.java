package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice3AllinOne {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("wedbriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		Thread.sleep(2000);

		driver.get("http://orangehrm.qedgetech.com");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");

		driver.findElement(By.className("button")).click();
		driver.findElement(By.linkText("PIM")).click();

		driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(2000);

		List<WebElement> six = driver.findElements(By.xpath("//*[starts-with(@id,'ohrmList_chkSelectRecord_')]"));

		for (WebElement yyy : six)

		{
			yyy.click();
		}

	}

}
