package group;

import java.lang.String;
import java.util.ArrayList;

import date.DataCheckoutTest;

// TODO: Auto-generated Javadoc
/**
 * The Class RequestListTest.
 */
public class RequestListTest extends junit.framework.TestCase
{
	
	/**
	 * Test get request reg.
	 */
	public void testGetRequestReg()
	{
		RequestList obj=new group.RequestList(null);
		String problemMsg="Problem with: getRequestReg";
		assertEquals(problemMsg, null, obj.getRequestReg());
	}
	
	/**
	 * Test set request reg.
	 */
	public void testSetRequestReg()
	{
		RequestList obj=new group.RequestList(null);
		String problemMsg="Problem with: setRequestReg";
		ArrayList requestReg=new ArrayList<Request>();
		obj.setRequestReg(requestReg);
		assertTrue(requestReg==obj.getRequestReg());
	}
	
	/**
	 * Test get extra list.
	 */
	public void testGetExtraList()
	{
		RequestList obj=new group.RequestList(null);
		String problemMsg="Problem with: getExtraList";
		assertEquals(problemMsg, null, obj.getExtraList());
	}
}
