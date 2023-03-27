package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSyntaxPrintAllRowsAndColumns {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://railyatri.in/time-table");

		WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div/table"));

		List<WebElement> list = element.findElements(By.tagName("tr"));

		for (int i = 1; i < list.size(); i++) {
			List<WebElement> list2 = list.get(i).findElements(By.tagName("td"));

			// kidha ichina lagakuda total rows ni total coloumns ni print cheycochu
			// String traino = list2.get(0).getText();
			// System.out.println(traino);
			// String trianm = list2.get(1).getText();
			// System.out.println(trianm);
			// String traintype = list2.get(2).getText();
			// System.out.println(traintype);
			// String rundays = list2.get(3).getText();
			// System.out.println(rundays);

			for (WebElement data : list2) {
				String listlength = data.getText();

				System.out.println(listlength);
			}

		}
	}

	private static WebElement get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
