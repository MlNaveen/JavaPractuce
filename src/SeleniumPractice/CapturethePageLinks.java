package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturethePageLinks {

	public static void main(String[] args) {

		System.setProperty("webdrier.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com");

		List<WebElement> element = driver.findElements(By.tagName("a"));

		System.out.println(element.size());

		for (WebElement list : element) {
			// String names = list.getText();
			System.out.println(list.getText());

		}

	}

}
