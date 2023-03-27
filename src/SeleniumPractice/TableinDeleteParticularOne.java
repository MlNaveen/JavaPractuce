package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableinDeleteParticularOne {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://flights.Qedgetech.com");

		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");

		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("demo");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.linkText("Flight Bookings")).click();

		String orderno = "5893";

		WebElement element1 = driver.findElement(By.className("flights_table"));

		List<WebElement> trelement, tdelement;

		trelement = element1.findElements(By.tagName("tr"));
		for (int i = 1; i < trelement.size(); i++) {
			tdelement = trelement.get(i).findElements(By.tagName("td"));

			if (tdelement.get(0).getText().equals(orderno)) {
				tdelement.get(9).findElement(By.linkText("Delete")).click();

				String alertms = driver.switchTo().alert().getText();
				System.out.println(alertms);

				if (alertms.contains("Delete")) {
					driver.switchTo().alert().accept();
					break;
				} else {
					driver.switchTo().alert().dismiss();
				}
			}
		}

	}

}
