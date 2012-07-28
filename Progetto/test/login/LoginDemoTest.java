package login;

import java.lang.String;

public class LoginDemoTest extends junit.framework.TestCase
{
	public void testMain()
	{
		String problemMsg="Problem with: main";
		String[] arg=null;
		LoginDemo.main(arg);
		//Examine the object and assert something appropriate here
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(LoginDemoTest.class));
	}
}
