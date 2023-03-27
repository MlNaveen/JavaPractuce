package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CheckBoxSyntaxselectingAllcheckboxes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://orangehrm.qedgetech.com");

		Thread.sleep(2000);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");

		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.linkText("Admin")).click();

		List<WebElement> list = driver.findElements(By.xpath("//*[@type='checkbox']"));

		System.out.println(list.size());
		for (int i = 1; i < list.size(); i++) {

			list.get(i).click();
		}

	}

	private static void getAttribute(String string) {
		// TODO Auto-generated method stub

	}

	private static Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
