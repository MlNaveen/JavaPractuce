package OrangeHrmTestExecute;

import OrangeHrmLibrary.Employee;
import OrangeHrmLibrary.LoginPage;
import Utils.ApplicationUtils;

public class EmployeeReg {

	public static void main(String[] args) {
		

		ApplicationUtils.LaunchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp=new LoginPage();
		
		lp.Login("Admin", "Qedge123!@#");
		
		Employee EmpReg=new Employee();
		
	    boolean empId=	EmpReg.addEmployee("Vaibhav", "Demo");
		
	
	if(empId)
		
	{
		System.out.println("Add Employee is SucesussFull Test Pass");
		
	}
	else
		
	{
		System.out.println("Add Employee is Not Sucsussfull Test Fail");
		
	}
		
		
		lp.LogOut();
		
		ApplicationUtils.CloseApp();
		
		
	}
	

}






















































































