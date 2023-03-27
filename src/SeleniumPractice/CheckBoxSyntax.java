package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSyntax {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chromr.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://flights.qedgetech.com");

		driver.findElement(By.linkText("Register")).click();

		WebElement checkbox = driver.findElement(By.id("flexCheckChecked"));

		if (!checkbox.isSelected()) {
			checkbox.click();

		}

	}

}
