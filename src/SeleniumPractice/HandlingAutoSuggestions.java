package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://google.com");

		// enter the data on google text box
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);

		// After enter the data on google textbox data count and print the data
		List<WebElement> x = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
		Thread.sleep(2000);

		System.out.println(x.size());

		Thread.sleep(2000);

		for (WebElement data : x) {

			String aaa = data.getText();

			System.out.println(aaa);
		}

	}

}
