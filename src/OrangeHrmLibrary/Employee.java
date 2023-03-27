package OrangeHrmLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.ApplicationUtils;

public class Employee extends ApplicationUtils {

	
	
	public boolean addEmployee(String Fname,String lname)
	{
	
	
	   
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.name("firstName")).sendKeys(Fname);
		
    	driver.findElement(By.name("lastName")).sendKeys(lname);
	
		String empid=driver.findElement(By.id("employeeId")).getAttribute("value");
		
		System.out.println(empid);
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		
		
        driver.findElement(By.id("empsearch_id")).sendKeys(empid);
        
        driver.findElement(By.id("searchBtn")).click();
       
      
        WebElement table= driver.findElement(By.id("resultTable"));
        
        List<WebElement>trelement,tdelement;
        
        trelement=table.findElements(By.tagName("tr"));
        
        boolean check= false;
        
        for(int i = 1;i<trelement.size();i++)
        {
        	tdelement=trelement.get(i).findElements(By.tagName("td"));
        	
        	if(tdelement.get(1).getText().equals(empid))
        	{
        	   check =true;
        	
        	   
        		break;
        	}
        }
		return check;
	}
	
         public boolean addEmployee(String Fname,String Mname,String lname)

            {
            	

         	    driver.findElement(By.linkText("PIM")).click();
        		
         	    driver.findElement(By.linkText("Add Employee")).click();
        		
        		driver.findElement(By.name("firstName")).sendKeys(Fname);
        		
        		driver.findElement(By.id("middleName")).sendKeys(Mname);
        		
        		driver.findElement(By.name("lastName")).sendKeys(lname);
        	
        		String empid=driver.findElement(By.id("employeeId")).getAttribute("value");
        		
        		System.out.println(empid);
        		
        		driver.findElement(By.id("btnSave")).click();
        		
        		driver.findElement(By.linkText("Employee List")).click();
        		
        		
                driver.findElement(By.id("empsearch_id")).sendKeys(empid);
                
                driver.findElement(By.id("searchBtn")).click();
               
              
                WebElement table= driver.findElement(By.id("resultTable"));
                
                List<WebElement>trelement,tdelement;
                
                trelement=table.findElements(By.tagName("tr"));
                
                boolean check= false;
                
                for(int i = 1;i<trelement.size();i++)
                {
                	tdelement=trelement.get(i).findElements(By.tagName("td"));
                	
                	if(tdelement.get(1).getText().equals(empid))
                	{
                	   check =true;
                	
                	   
                		break;
                	}
                }
        		return check;
            	
            
            
            
            
            
            
            
            
            
            
            
            
            }    
            
            
            
            }
            
