package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTableSyntaxAll {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdrier.chrome.driver", "chormedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Dravid");
		driver.findElement(By.id("lastName")).sendKeys("Demo");
		String empid = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.linkText("Employee List")).click();

		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();

		WebElement element = driver.findElement(By.id("resultTable"));

		List<WebElement> list1 = element.findElements(By.tagName("tr"));

		for (int i = 1; i < list1.size(); i++) {

			List<WebElement> list2 = list1.get(i).findElements(By.tagName("td"));

			if (list2.get(1).getText().equals(empid)) {

				System.out.println("emp id sucssfull");
			}

		}

	}

}
