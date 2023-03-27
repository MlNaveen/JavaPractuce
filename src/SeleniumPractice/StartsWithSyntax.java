package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWithSyntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://orangehrm.qedgetech.com");

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Qedge123!@#");

		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		driver.findElement(By.xpath("//input[@value='Marketplace']")).click();

		driver.navigate().back();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.linkText("Employee List")).click();

		List<WebElement> cklist = driver.findElements(By.xpath("//input[starts-with(@id,'ohrmList_chkSelectRecord')]"));

		for (WebElement element : cklist) {
			element.click();
		}

	}

}
