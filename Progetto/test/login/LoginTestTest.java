package login;

import java.lang.String;

public class LoginTestTest extends junit.framework.TestCase
{
	public void testTestActionPerformed()
	{
		LoginTest obj=new login.LoginTest();
		String problemMsg="Problem with: testActionPerformed";
		obj.testActionPerformed();
		//Examine the object and assert something appropriate here
	}
	public void testMain()
	{
		String problemMsg="Problem with: main";
		String[] args=null;
		LoginTest.main(args);
		//Examine the object and assert something appropriate here
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(LoginTestTest.class));
	}
}
