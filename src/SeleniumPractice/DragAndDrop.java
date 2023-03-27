package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement srcmt, trgt;

		srcmt = driver.findElement(By.id("draggable"));
		trgt = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);

		act.dragAndDrop(srcmt, trgt);

		act.build().perform();

	}

}
