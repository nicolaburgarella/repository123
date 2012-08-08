package group;

import org.junit.Test;

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
	@Test
	public void testAddGroupView()
	{
		final AddGroupView obj=new group.AddGroupView();
		final String problemMsg="Problem with: AddGroupView";
		final Hotel hotel=null;
		assertEquals(problemMsg, null, obj.AddGroupView(hotel));
	}

}
