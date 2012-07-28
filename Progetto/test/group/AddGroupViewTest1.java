package group;

import hotel.Hotel;


public class AddGroupViewTest1 extends junit.framework.TestCase
{
	public void testAddGroupView()
	{
		AddGroupView obj=new group.AddGroupView();
		String problemMsg="Problem with: AddGroupView";
		Hotel hotel=null;
		assertEquals(problemMsg, null, obj.AddGroupView(hotel));
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(AddGroupViewTest1.class));
	}
}
