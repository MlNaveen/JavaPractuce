package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class doubt {

	public static <webElement> void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://facebook.com");

		driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.xpath("//input[@data-type='text'and @name='firstname']")).sendKeys("massoo");

		driver.findElement(By.xpath("//input[@data-type='text'and@name='lastname']")).sendKeys("naveen");

		driver.findElement(By.name("reg_email__")).sendKeys("mknaveen100@gmail.com");

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mknaveen100@gmail.com");

		driver.findElement(By.id("password_step_input")).sendKeys("123naveen@");

		Thread.sleep(5000);

		WebElement dayDropDown = driver.findElement(By.id("day"));// id of drop down

		Select days = new Select(dayDropDown);

//		List<WebElement> calenderDays=  days.getOptions();
//
//		for(WebElement options : dropDownOptions) {
//			System.out.println(options.getText());
//		}

		days.selectByIndex(19);

		Thread.sleep(4000);
		WebElement monthsdown = driver.findElement(By.id("month"));

		Select months = new Select(monthsdown);
		months.selectByIndex(0);
		Thread.sleep(4000);

		WebElement rrr = driver.findElement(By.name("birthday_year"));

		Select years = new Select(rrr);

		years.selectByValue("2000");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='sex'and@value='2']"));

		// // driver.findElement(By.id("day")).sendKeys("3");
		// Select dropdown= new driver.Select(driver.findElement(By.id("")));
		// dropdown.selectByVisibleText("3");
		//
		// List<WebElement> ttt = driver.findElements(By.linkText("Help"));

		System.out.println("End of program");

	}

}
