package group;

import hotel.Hotel;


public class GroupViewTest extends junit.framework.TestCase
{
	public void testCancelRequest()
	{
		GroupView obj=new group.GroupView();
		String problemMsg="Problem with: cancelRequest";
		Hotel h=null;
		Request r=null;
		obj.cancelRequest(h, r);
		//Examine the object and assert something appropriate here
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(GroupViewTest.class));
	}
}
