package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSynstxEnterDOBYYWhileUsingSendkeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.id("name")).sendKeys("micheal");
		driver.findElement(By.name("contact")).sendKeys("8142697443");
		driver.findElement(By.id("email")).sendKeys("mnkumar3987@gmail.com");
		driver.findElement(By.name("password")).sendKeys("@naveen$$");

		Select gender = new Select(driver.findElement(By.name("gender")));

		gender.selectByVisibleText("Male");

		driver.findElement(By.name("dob")).sendKeys("20-01-2000");

		WebElement check = driver.findElement(By.id("flexCheckChecked"));
		if (!check.isSelected()) {
			check.click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Register']")).click();

		driver.findElement(By.name("email")).sendKeys("mnkumar3987@gmail.com");
		driver.findElement(By.name("password")).sendKeys("@naveen$$");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
		

	}

}
