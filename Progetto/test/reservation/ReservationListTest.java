package reservation;

import group.Group;
import group.GroupList;

import java.lang.String;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class ReservationListTest.
 */
public class ReservationListTest extends junit.framework.TestCase
{
	
	/**
	 * Test get reserv reg.
	 */
	public void testGetReservReg()
	{
		ReservationList obj=new reservation.ReservationList(null);
		String problemMsg="Problem with: getReservReg";
		assertEquals(problemMsg, null, obj.getReservReg());
		ArrayList reservReg=null;;
		obj.setReservReg(reservReg);
		assertTrue(reservReg==obj.getReservReg());
	}
	
	/**
	 * Test set reserv reg.
	 */
	public void testSetReservReg()
	{
		ReservationList obj=new reservation.ReservationList(null);
		String problemMsg="Problem with: setReservReg";
		ArrayList reservReg=null;
		obj.setReservReg(reservReg);
		assertTrue(reservReg==obj.getReservReg());

	}
	
	/**
	 * Test is reservation list empty.
	 */
	public void testIsReservationListEmpty()
	{
		ReservationList obj=new reservation.ReservationList();
		String problemMsg="Problem with: isReservationListEmpty";
		assertTrue(problemMsg, obj.isReservationListEmpty());
	//	assertFalse(problemMsg, obj.isReservationListEmpty());
	}
	
	/**
	 * Test add reservation.
	 */
	public void testAddReservation()
	{
		ReservationList obj=new reservation.ReservationList();
		int n1=obj.getReservReg().size();
		Reservation res=new Reservation();
		obj.addReservation(res);
		int n2=obj.getReservReg().size();
		assert n1>n2;
	}
}
