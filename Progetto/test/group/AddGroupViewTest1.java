package group;

import hotel.Hotel;


// TODO: Auto-generated Javadoc
/**
 * The Class AddGroupViewTest1.
 */
public class AddGroupViewTest1 extends junit.framework.TestCase
{
	
	/**
	 * Test add group view.
	 */
	public void testAddGroupView()
	{
		AddGroupView obj=new group.AddGroupView();
		String problemMsg="Problem with: AddGroupView";
		Hotel hotel=null;
		assertEquals(problemMsg, null, obj.AddGroupView(hotel));
	}
}
