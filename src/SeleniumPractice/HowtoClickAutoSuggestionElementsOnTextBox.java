package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HowtoClickAutoSuggestionElementsOnTextBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// enter the data on google text box
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);

		// After enter the data on google textbox data count and print the data
		List<WebElement> doo = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));

		Thread.sleep(2000);
		for (WebElement data : doo) {

			doo.get(6).click();
			String str = data.getText();
			System.out.println(data.getText());

			// getText syntax paina laga ivochu ila kuda ivochu>>
			// System.out.println(data.getText());

			// kindha unna syntax text box lo unna element ni click chestundhi
			if (str.toLowerCase().contains("selenium download")) {
				data.click();
			}

		}

	}

}
