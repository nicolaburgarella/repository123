package login;

import java.awt.event.ActionEvent;

public class NextPage3Test extends junit.framework.TestCase
{
	public void testActionPerformed()
	{
		NextPage3 obj=new login.NextPage3(null);
		String problemMsg="Problem with: actionPerformed";
		ActionEvent e=null;
		obj.actionPerformed(e);
		//Examine the object and assert something appropriate here
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(NextPage3Test.class));
	}
}
