package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSytaxSelectparticularRowsAndColumns {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://orangehrm.qedgetech.com");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");

		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Admin")).click();

		driver.findElement(By.id("resultTable"));

		List<WebElement> list1 = driver.findElements(By.tagName("tr"));
		Thread.sleep(2000);
		for (int i = 1; i < list1.size(); i++) {
			List<WebElement> list2 = list1.get(i).findElements(By.tagName("td"));
			String empnm = list2.get(1).getText();

			String emprole = list2.get(2).getText();

			System.out.println(empnm + ":::" + emprole);

		}

	}

}
