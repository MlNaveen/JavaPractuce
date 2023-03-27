package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeSyntaxCaptureEmployeeidOrangeHrm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://orangehrm.qedgetech.com");

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");

		driver.findElement(By.xpath("//*[@value='LOGIN']")).click();

		driver.findElement(By.linkText("PIM")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Add Employee")).click();

		Thread.sleep(3000);

		String b = driver.findElement(By.id("employeeId")).getAttribute("value");

		System.out.println(b);

	}

}
