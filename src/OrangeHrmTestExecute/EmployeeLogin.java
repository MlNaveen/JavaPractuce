package OrangeHrmTestExecute;

import OrangeHrmLibrary.LoginPage;
import Utils.ApplicationUtils;

public class EmployeeLogin {

	public static void main(String[] args) {
		
		
		
		ApplicationUtils.LaunchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp=new LoginPage();
		
		lp.Login("Chandrika1","Qedge123!@#");
		
		boolean empmodule=lp.LoginWithEmployeeModule();
		
		if(empmodule)
		{
			System.out.println("Admin module Is not Displayed  Test Pass");
		}
		
		else
		{
			System.out.println("Admin module is Displayed Test Fail");
		}
		
		lp.LogOut();
		
		ApplicationUtils.CloseApp();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
