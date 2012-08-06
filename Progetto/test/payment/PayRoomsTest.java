package payment;

import group.Group;
import hotel.Hotel;


// TODO: Auto-generated Javadoc
/**
 * The Class PayRoomsTest.
 */
public class PayRoomsTest extends junit.framework.TestCase
{
	
	/**
	 * Test pay rooms.
	 */
	public void testPayRooms()
	{
		PayRooms obj=new payment.PayRooms();
		String problemMsg="Problem with: PayRooms";
		Group gruppo=null;
		Hotel hotel=null;
		assertEquals(problemMsg, 999999990, obj.PayRooms(gruppo), 0.1F);
//NOTE: Final parameter is the tolerance for the comparison
	}
}
