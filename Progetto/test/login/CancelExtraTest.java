package login;

import hotel.Hotel;

import java.awt.event.ActionEvent;

import room.ExtraList;

// TODO: Auto-generated Javadoc
/**
 * The Class CancelExtraTest.
 */
public class CancelExtraTest extends junit.framework.TestCase
{
	
	/**
	 * Test action performed.
	 */
	public void testActionPerformed()
	{
		CancelExtra obj=new login.CancelExtra(null);
		String problemMsg="Problem with: actionPerformed";
		ActionEvent e = null;
		//obj.actionPerformed(e);
		//Examine the object and assert something appropriate here
	}
	
	/**
	 * Test cancel extras.
	 */
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
