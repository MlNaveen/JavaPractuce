package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WrokingWithDropdownList {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");

		driver.findElement(By.linkText("Create new account")).click();
		System.out.println("Days");
		Thread.sleep(2000);
		Select drop = new Select(driver.findElement(By.id("day")));
		drop.selectByIndex(4);

		List<WebElement> data = drop.getOptions();
		System.out.println(data.size());
		for (WebElement code : data) {
			System.out.println(code.getText());
		}

		Select uk = new Select(driver.findElement(By.id("month")));

		uk.selectByValue("5");

		System.out.println("<<<<<<<<Months>>>>>>>>");
		List<WebElement> dude = uk.getOptions();
		System.out.println(dude.size());

		for (WebElement kaka : dude) {
			System.out.println(kaka.getText());
		}

		System.out.println("<<<<<Years>>>>>");
		// kindha ichana syntax kuda use cheyochu
		WebElement tt = driver.findElement(By.id("year"));
		Select guggu = new Select(tt);
		guggu.selectByVisibleText("2000");

		List<WebElement> fox = guggu.getOptions();
		System.out.println(fox.size());

		for (WebElement jujju : fox) {
			System.out.println(jujju.getText());
		}

		driver.findElement(By.className("_8esa")).click();

	}

}
