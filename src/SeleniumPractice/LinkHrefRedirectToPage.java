package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkHrefRedirectToPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrier.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://google.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement element : links) {
			String linkname = element.getText();
			String linkurl = element.getAttribute("href");

			System.out.println(linkname + "   " + linkurl);
		}

	}

}
