package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FullPracticeOnAutoSugestions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://facebook.com");

		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);

		Select list = new Select(driver.findElement(By.id("day")));

		list.selectByIndex(1);
		Thread.sleep(2000);
		// list.selectByValue("3");
		// Thread.sleep(2000);
		// list.selectByVisibleText("4");

		List<WebElement> element = list.getOptions();

		for (WebElement xxx : element)

		{
			System.out.println("<<Day>>" + xxx.getText());
		}

		Select ttt = new Select(driver.findElement(By.id("month")));

		ttt.selectByValue("6");

		List<WebElement> ddd = ttt.getOptions();

		for (WebElement fff : ddd)

		{
			System.out.println("<<Month>>" + fff.getText());
		}

		Select ggg = new Select(driver.findElement(By.id("year")));

		ggg.selectByVisibleText("2000");

		List<WebElement> kkk = ggg.getOptions();

		for (WebElement sss : kkk) {
			System.out.println("<<year>>" + sss.getText());
		}
		String z = driver.findElement(By.id("month")).getAttribute("name");

		System.out.println(z);

	}
}
