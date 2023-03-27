package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class Practice1234 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Lovely");
		driver.findElement(By.name("lastname")).sendKeys("Mickey");
		driver.findElement(By.name("reg_email__")).sendKeys("mvishnu4384@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("@naveen$$");
		Select bday = new Select(driver.findElement(By.name("birthday_day")));
		String year = "2000";
		bday.selectByVisibleText("10");

		Select mday = new Select(driver.findElement(By.name("birthday_month")));

		mday.selectByIndex(7);

		Select yday = new Select(driver.findElement(By.name("birthday_year")));

		yday.selectByVisibleText(year);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[starts-with(@id,'u_2_5_')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[starts-with(@id,'u_2_s')]")).click();
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mvishnu4384@gmail.com");

		driver.findElement(By.xpath("//*[starts-with(@id,'u_2_s')]")).click();

		// driver.get("http://mvishnu4384@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className(
				"xmper1u x1lliihq x1jchvi3 x1fcty0u x132q4wb x193iq5w x6ikm8r x10wlt62 x47corl x10l6tqk x16q8cke xlyipyv xoyzfg9 x1al4vs7 x1k90msu x11xpdln x1qfuztq xuxw1ft xi81zsa x1923su1"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.className(
				"xmper1u x1lliihq x1jchvi3 x1fcty0u x132q4wb x193iq5w x6ikm8r x10wlt62 x47corl x10l6tqk x16q8cke xlyipyv xoyzfg9 x1al4vs7 x1k90msu x11xpdln x1qfuztq xuxw1ft xi81zsa x1923su1"))
				.sendKeys("034965");

	}

}
