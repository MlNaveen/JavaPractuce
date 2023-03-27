package OrangeHrmLibrary;

import org.openqa.selenium.By;

import Utils.ApplicationUtils;

public class LoginPage extends ApplicationUtils  {

            public void Login(String Uid,String Pwd)
            {
            	driver.findElement(By.name("txtUsername")).sendKeys(Uid);
            	driver.findElement(By.name("txtPassword")).sendKeys(Pwd);
            	driver.findElement(By.name("Submit")).click();
           }
            
            public boolean IsAdminModuleDisplayed()
            {
            	if(driver.findElement(By.linkText("Admin")).isDisplayed())
            	{
            		return true;
            	}
            	else
            	{
            		return false;
            	}
           }

            
            public void LogOut() 
            {
            	driver.findElement(By.partialLinkText("Welcome")).click();
            	driver.findElement(By.linkText("Logout")).click();
          }
                 
            public boolean IsErrorMsgDisplay() 
            {
            	String ErrorMsg=driver.findElement(By.id("spanMessage")).getText();
            	
            	if(ErrorMsg.toLowerCase().contains("invalid"))
            	{
            		return true;
            	}
            	else
            	{
            		return false;
            	}
            }

            public boolean LoginWithEmployeeModule()
            {
            	
            	
          try
            	{
            	 
        	         driver.findElement(By.linkText("Admin")).isDisplayed();
        	         
        	         return false;
        	  }
            	
          catch (Exception e)
            	{
				
        	          return true;
                              	  
        	  
				}
            		
            	
            	
            	
            }
















}
