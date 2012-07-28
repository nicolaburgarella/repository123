package login;

import java.awt.event.ActionEvent;

public class LoginTest extends junit.framework.TestCase
{
	public void testActionPerformed()
	{
		Login obj=new login.Login();
		String problemMsg="Problem with: actionPerformed";
		ActionEvent ae=null;
		obj.actionPerformed(ae);
		//Examine the object and assert something appropriate here
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(LoginTest.class));
	}
}
