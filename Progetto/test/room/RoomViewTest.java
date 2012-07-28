package room;

import hotel.Hotel;


public class RoomViewTest extends junit.framework.TestCase
{
	public void testCancelExtras()
	{
		RoomView obj=new room.RoomView();
		String problemMsg="Problem with: cancelExtras";
		Hotel h=null;
		ExtraList el=null;
		obj.cancelExtras(h, el);
		//Examine the object and assert something appropriate here
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(RoomViewTest.class));
	}
}
