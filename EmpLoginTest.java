package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmpLoginTest extends AppUtils 
{

	@Parameters({"empuid","emppwd"})
	@Test
	public void chkEmpLogin(String uid,String pwd)
	{
		LoginPage lp = new LoginPage();
		lp.login(uid, pwd);
		boolean res = lp.isEmpModuleDisplayed();
		Assert.assertTrue(res);
		lp.logout();
	}
	
	
}
