package SeleniumPractice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframeAndDrogAndDropHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com");

		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement srcelement, trgetelement;

		srcelement = driver.findElement(By.id("draggable"));
		trgetelement = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);

		act.dragAndDrop(srcelement, trgetelement);

		act.build().perform();

	}

}
