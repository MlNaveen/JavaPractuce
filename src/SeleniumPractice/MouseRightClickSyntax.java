package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickSyntax {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://snapdeal.com");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Women's Fashion")));

		Thread.sleep(2000);

		act.contextClick(driver.findElement(By.linkText("Women's Fashion")));
		act.build().perform();

//		driver.get("http://snapdeal.com");
//		Actions act = new Actions(driver);
//		act.contextClick(driver.findElement(By.linkText("Men's Fashion")));
//		act.build().perform();

	}

}
