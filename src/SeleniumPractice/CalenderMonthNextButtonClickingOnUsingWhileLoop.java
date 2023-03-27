package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderMonthNextButtonClickingOnUsingWhileLoop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.id("search-date")).click();

		String dob = "26/june/2024";
		String[] data = dob.split("/");
		String day = data[0];
		String month = data[1];
		String year = data[2];

		String yearnm = driver.findElement(By.className("ui-datepicker-year")).getText();

		while (!yearnm.equals(year)) {
			driver.findElement(By.linkText("Next")).click();
			yearnm = driver.findElement(By.className("ui-datepicker-year")).getText();
		}

		String monthl = driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!monthl.equalsIgnoreCase(month)) {
			driver.findElement(By.linkText("Next")).click();
			monthl = driver.findElement(By.className("ui-datepicker-month")).getText();
		}

		WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> trl, tbl;
		trl = cal.findElements(By.tagName("tr"));
		for (int i = 1; i < trl.size(); i++) {
			tbl = trl.get(i).findElements(By.tagName("td"));
			for (WebElement trtd : tbl)
				if (trtd.getText().equals(day)) {
					trtd.click();
				}
		}
		Thread.sleep(2000);
		driver.findElement(By.name("price_class")).click();

		driver.findElement(By.id("tickets")).sendKeys("6");

		//
//		String dob ="22/may/2026";
//		String [] data =dob.split("/");
//		String day =data[0];
//		String month=data[1];
//		String year=data[2];
//		
//	String selct=driver.findElement(By.className("ui-datepicker-year")).getText();
// 
//	while(!selct.equals(year))
//	{
//		driver.findElement(By.linkText("Next")).click();
//		selct=	driver.findElement(By.className("ui-datepicker-year")).getText();
//   }
//	
//	String monthl = driver.findElement(By.className("ui-datepicker-month")).getText();
//	
//	while(!monthl.equalsIgnoreCase(month))
//	{
//		driver.findElement(By.linkText("Next")).click();
//		
//		monthl = driver.findElement(By.className("ui-datepicker-month")).getText();
//}
//
//	WebElement cal=driver.findElement(By.className("ui-datepicker-calendar"));
//	
//	List<WebElement> tbr,tdc;
//	tbr=cal.findElements(By.tagName("tr"));
//	for(int i=1;i<tbr.size();i++)
//	{
//		tdc=tbr.get(i).findElements(By.tagName("td"));
//		for(WebElement ele2:tdc)
//		{
//			if(ele2.getText().equals(day))
//			{
//				ele2.click();
//			}
//		}
//	}

	}

}
