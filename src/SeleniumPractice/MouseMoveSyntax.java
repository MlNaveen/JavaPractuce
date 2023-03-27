package SeleniumPractice;

import java.awt.Desktop.Action;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveSyntax {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://snapdeal.com");
		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.linkText("Women's Fashion")));
		act.build().perform();

	}

}
