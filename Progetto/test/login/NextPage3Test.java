package login;

import java.awt.event.ActionEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class NextPage3Test.
 */
public class NextPage3Test extends junit.framework.TestCase
{
	
	/**
	 * Test action performed.
	 */
	public void testActionPerformed()
	{
		NextPage3 obj=new login.NextPage3(null);
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
		junit.textui.TestRunner.run(new junit.framework.TestSuite(NextPage3Test.class));
	}
}
