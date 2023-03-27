package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsPrin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		WebElement link = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul"));

		List<WebElement> lihref = link.findElements(By.tagName("a"));
		System.out.println(lihref.size());

		for (WebElement allhref : lihref) {
			String linktext = allhref.getText();
			System.out.println(linktext);
			String lkkk = allhref.getAttribute("href");
			System.out.println(lkkk);
		}

	}

}
