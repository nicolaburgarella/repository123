package reservation;

import java.lang.String;
import java.util.ArrayList;

public class ReservationListTest extends junit.framework.TestCase
{
	public void testGetReservReg()
	{
		ReservationList obj=new reservation.ReservationList(null);
		String problemMsg="Problem with: getReservReg";
		assertEquals(problemMsg, null, obj.getReservReg());
	}
	public void testSetReservReg()
	{
		ReservationList obj=new reservation.ReservationList(null);
		String problemMsg="Problem with: setReservReg";
		ArrayList reservReg=null;
		obj.setReservReg(reservReg);
		//Examine the object and assert something appropriate here
	}
	public void testIsReservationListEmpty()
	{
		ReservationList obj=new reservation.ReservationList(null);
		String problemMsg="Problem with: isReservationListEmpty";
		assertTrue(problemMsg, obj.isReservationListEmpty());
//		assertFalse(problemMsg, obj.isReservationListEmpty());
	}
	public void testAddReservation()
	{
		ReservationList obj=new reservation.ReservationList(null);
		String problemMsg="Problem with: addReservation";
		Reservation res=null;
		obj.addReservation(res);
		//Examine the object and assert something appropriate here
	}
	public void testGetReservByPos()
	{
		ReservationList obj=new reservation.ReservationList(null);
		String problemMsg="Problem with: getReservByPos";
		int posizione=0;
		assertEquals(problemMsg, null, obj.getReservByPos(posizione));
	}
	public void testToString()
	{
		ReservationList obj=new reservation.ReservationList(null);
		String problemMsg="Problem with: toString";
		assertEquals(problemMsg, null, obj.toString());
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(ReservationListTest.class));
	}
}
