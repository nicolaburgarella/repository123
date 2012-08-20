package login;

import java.lang.String;

import login.LoginDemo;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginDemoTest.
 */
public class LoginDemoTest extends junit.framework.TestCase
{
	
	/**
	 * Test main.
	 */
	public void testMain()
	{
		String problemMsg="Problem with: main";
		String[] arg=null;
		LoginDemo.main(arg);
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(LoginDemoTest.class));
	}
}
