package login;

import java.lang.String;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginTestTest.
 */
public class LoginTestTest extends junit.framework.TestCase
{
	
	/**
	 * Test test action performed.
	 */
	public void testTestActionPerformed()
	{
		LoginTest obj=new login.LoginTest();
		String problemMsg="Problem with: testActionPerformed";
		obj.testActionPerformed();
		//Examine the object and assert something appropriate here
	}
	
	/**
	 * Test main.
	 */
	public void testMain()
	{
		String problemMsg="Problem with: main";
		String[] args=null;
		LoginTest.main(args);
		//Examine the object and assert something appropriate here
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(LoginTestTest.class));
	}
}
