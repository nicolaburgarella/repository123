package login;

import java.awt.event.ActionEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class NextPage1Test.
 */
public class NextPage1Test extends junit.framework.TestCase
{
	
	/**
	 * Test action performed.
	 */
	public void testActionPerformed()
	{
		NextPage1 obj=new login.NextPage1(null);
		String problemMsg="Problem with: actionPerformed";
		ActionEvent e=null;
		obj.actionPerformed(e);
		//Examine the object and assert something appropriate here
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(NextPage1Test.class));
	}
}
