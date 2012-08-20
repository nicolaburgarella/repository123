package login;

import java.awt.event.ActionEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginTest.
 */
public class LoginTest extends junit.framework.TestCase
{
	
	/**
	 * Test action performed.
	 */
	public void testActionPerformed()
	{
		Login obj=new login.Login();
		String problemMsg="Problem with: actionPerformed";
		ActionEvent ae=null;
		obj.actionPerformed(ae);
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(LoginTest.class));
	}
}
