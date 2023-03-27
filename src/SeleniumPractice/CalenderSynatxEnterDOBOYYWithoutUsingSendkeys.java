package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSynatxEnterDOBOYYWithoutUsingSendkeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("dob")).click();

		String dob = "28-Jun-2000";

		String[] data = dob.split("-");
		String day = data[0];
		String month = data[1];
		String year = data[2];

		Select yearl = new Select(driver.findElement(By.className("ui-datepicker-year")));

		yearl.selectByVisibleText(year);

		Select monthl = new Select(driver.findElement(By.className("ui-datepicker-month")));

		monthl.selectByVisibleText(month);

		WebElement element = driver.findElement(By.className("ui-datepicker-calendar"));

		List<WebElement> trl, tdl;
		trl = element.findElements(By.tagName("tr"));

		for (int i = 1; i < trl.size(); i++) {
			tdl = element.findElements(By.tagName("td"));

			for (WebElement trtd : tdl) {
				if (trtd.getText().equals(day)) {

					trtd.click();
				}

			}
		}

	}

}
