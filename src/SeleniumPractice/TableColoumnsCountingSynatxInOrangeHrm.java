package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableColoumnsCountingSynatxInOrangeHrm {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://orangehrm.qedgetech.com");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.linkText("Admin")).click();

		WebElement element = driver.findElement(By.id("resultTable"));

		List<WebElement> list = element.findElements(By.tagName("tr"));

		System.out.println(list.size());
		List<WebElement> list2 = list.get(0).findElements(By.tagName("th"));

		System.out.println(list2.size());
		list2.get(0).click();

	}

}
