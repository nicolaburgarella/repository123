package login;

import group.Request;
import hotel.Hotel;

import java.awt.event.ActionEvent;

public class CancelGroup1Test extends junit.framework.TestCase
{
	public void testActionPerformed()
	{
		CancelGroup1 obj=new login.CancelGroup1(null, null);
		String problemMsg="Problem with: actionPerformed";
		ActionEvent e=null;
		obj.actionPerformed(e);
		//Examine the object and assert something appropriate here
	}
	public void testCancelRequest()
	{
		CancelGroup1 obj=new login.CancelGroup1(null, null);
		String problemMsg="Problem with: cancelRequest";
		Hotel h=null;
		Request r=null;
		obj.cancelRequest(h, r);
		//Examine the object and assert something appropriate here
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(CancelGroup1Test.class));
	}
}
