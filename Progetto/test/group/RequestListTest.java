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
		ArrayList requestReg=null;
		obj.setRequestReg(requestReg);
		//Examine the object and assert something appropriate here
	}
	public void testGetExtraList()
	{
		RequestList obj=new group.RequestList(null);
		String problemMsg="Problem with: getExtraList";
		assertEquals(problemMsg, null, obj.getExtraList());
	}
	public void testAddRequest()
	{
		RequestList obj=new group.RequestList(null);
		String problemMsg="Problem with: addRequest";
		Request request=null;
		obj.addRequest(request);
		//Examine the object and assert something appropriate here
	}
	public void testGetRequestByPos()
	{
		RequestList obj=new group.RequestList(null);
		String problemMsg="Problem with: getRequestByPos";
		int posizione=0;
		assertEquals(problemMsg, null, obj.getRequestByPos(posizione));
	}
	public void testToString()
	{
		RequestList obj=new group.RequestList(null);
		String problemMsg="Problem with: toString";
		assertEquals(problemMsg, null, obj.toString());
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(RequestListTest.class));
	}
}
