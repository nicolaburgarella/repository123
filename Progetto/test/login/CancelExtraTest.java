package login;

import hotel.Hotel;

import java.awt.event.ActionEvent;

import room.ExtraList;

public class CancelExtraTest extends junit.framework.TestCase
{
	
	public void testActionPerformed()
	{
		CancelExtra obj=new login.CancelExtra(null);
		String problemMsg="Problem with: actionPerformed";
		ActionEvent e = null;
		obj.actionPerformed(e);
		//Examine the object and assert something appropriate here
	}
	public void testCancelExtras()
	{
		CancelExtra obj=new login.CancelExtra(null);
		String problemMsg="Problem with: cancelExtras";
		Hotel h=null;
		ExtraList el=null;
		obj.cancelExtras(h, el);
		//Examine the object and assert something appropriate here
	}
}
