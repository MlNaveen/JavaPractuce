package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskLinksPrintingRevesre {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");

		WebElement tlinks = driver.findElement(By.xpath("//*[@id=\"menu-top\"]"));
		List<WebElement> hlinks = tlinks.findElements(By.tagName("a"));
		System.out.println("<<<Array size>>>");
		System.out.println(hlinks.size());
		System.out.println("<<<<<Regular>>>");
		for (WebElement links : hlinks) {

			System.out.println(links.getText());

		}

		System.out.println("<<<<<<Reverse>>>>>");
		int j = hlinks.size();
		for (int i = j - 1; i >= 0; i--) {
			String temp = hlinks.get(i).getText();

			System.out.println(temp);

		}
		
		
		 WebElement element= driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]"));
		  
		  List<WebElement> AnotherTask=element.findElements(By.tagName("li"));
		  
		  System.out.println("<<<Another>>");
		  
		  int reverse=AnotherTask.size();
		  
		  for(int g=reverse-1;g>=0;g--)
		  {
			  String text= AnotherTask.get(g).getText();
			  
			  System.out.println(text);
		  }
		
		  Actions move=new Actions(driver);
		  
		  move.moveToElement(driver.findElement(By.linkText("Support")));
		  
		  move.build().perform();
		  
		   Thread.sleep(2000);
		
		  
		 Actions Right=new Actions(driver);
		  
		 Right.contextClick(driver.findElement(By.linkText("Events")));
		  
		  Right.build().perform();
		  
		  
		  
		 
		  
		 
		  
		  
		  
		  
		
		

		// int g=hlinks.size();
//		
//		System.out.println(g);
//		
//		for(int j=g-1; j>=0; j--)
//		{
//			
//			WebElement all=hlinks.get(j);
//		//	for(WebElement kkk:hlinks)
//			//{
//			String all1 = all.getText();
//			System.out.println(all1+"-------"+all1.length()+"     "+all1.charAt(3));
//			System.out.println();

//			if (all1.charAt(0)!='A' && all1.charAt(0)!='E' && all1.charAt(0)!='I' && all1.charAt(0)!='O' && all1.charAt(0)!='U') {
//				System.out.println(all1+"-------"+all1.length());
//				System.out.println("=====================================================");

		// System.out.println(all1.charAt(0));
		// }

//			else {
//				System.out.println("=====================================================");
//
//				System.out.println("not an ovwe start letter");
//				
//				System.out.println(all1+"-------"+all1.length());
//				System.out.println(all1.charAt(0));
//			//}
		// }

		//
	}// int

	private static int hlinks() {
		// TODO Auto-generated method stub
		return 0;
	}

}
