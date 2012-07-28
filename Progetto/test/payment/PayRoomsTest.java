package payment;

import group.Group;


public class PayRoomsTest extends junit.framework.TestCase
{
	public void testPayRooms()
	{
		PayRooms obj=new payment.PayRooms();
		String problemMsg="Problem with: PayRooms";
		Group gruppo=null;
		assertEquals(problemMsg, 0F, obj.PayRooms(gruppo), 0.1F);
//NOTE: Final parameter is the tolerance for the comparison
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(PayRoomsTest.class));
	}
}
