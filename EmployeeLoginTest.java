package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeLoginTest 
{

	public static void main(String[] args) 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("Dinesh123", "Qedge123!@#");
		boolean res = lp.isEmpModuleDisplayed();
		if(res)
		{
			System.out.println("Employee Login Test Pass");
		}else
		{
			System.out.println("Employee Login Test Fail");
		}
		lp.logout();
		lp.closeApp();
		

	}

}
