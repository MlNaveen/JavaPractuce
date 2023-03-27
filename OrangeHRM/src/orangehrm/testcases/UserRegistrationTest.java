package orangehrm.testcases;

import orangehrm.library.LoginPage;
import orangehrm.library.User;
import utils.AppUtils;

public class UserRegistrationTest {

	public static void main(String[] args) throws InterruptedException 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
		User us = new User();
		boolean res = us.addUser("ESS", "Chandrika Demo", "Chandrika1", "Qedge123!@#");
		if(res)
		{
			System.out.println("New User Registered Successfully, test pass");
		}else
		{
			System.out.println("User Registration Test Fail");
		}
		lp.logout();
		AppUtils.closeApp();
	}

}
