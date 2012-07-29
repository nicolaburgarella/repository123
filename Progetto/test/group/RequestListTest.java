package group;

import java.lang.String;
import java.util.ArrayList;

public class RequestListTest extends junit.framework.TestCase
{
	public void testGetRequestReg()
	{
		RequestList obj=new group.RequestList(null);
		String problemMsg="Problem with: getRequestReg";
		assertEquals(problemMsg, null, obj.getRequestReg());
	}
	public void testSetRequestReg()
	{
		RequestList obj=new group.RequestList(null);
		String problemMsg="Problem with: setRequestReg";
		ArrayList requestReg=new ArrayList<Request>();
		obj.setRequestReg(requestReg);
		assertTrue(requestReg==obj.getRequestReg());
	}
	public void testGetExtraList()
	{
		RequestList obj=new group.RequestList(null);
		String problemMsg="Problem with: getExtraList";
		assertEquals(problemMsg, null, obj.getExtraList());
	}
}
