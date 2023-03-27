package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialxpathSyntaxinSnapdeal {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://snapdeal.com");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[2]/div/div[3]/div[1]/div/i")).click();

		// rendu parttial xpath ley

		Thread.sleep(3000);

		driver.findElement(By.xpath("//section/div/div[1]/span/i")).click();

		driver.quit();

	}

}
