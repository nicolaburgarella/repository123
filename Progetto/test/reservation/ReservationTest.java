package reservation;

import java.lang.String;

public class ReservationTest extends junit.framework.TestCase
{
	public void testGetNumber()
	{
		Reservation obj=new reservation.Reservation();
		String problemMsg="Problem with: getNumber";
		assertEquals(problemMsg, 0, obj.getNumber());
	}
	public void testSetNumber()
	{
		Reservation obj=new reservation.Reservation();
		String problemMsg="Problem with: setNumber";
		int number=0;
		obj.setNumber(number);
		assertTrue(number==obj.getNumber());
	}
	public void testGetGroupName()
	{
		Reservation obj=new reservation.Reservation();
		String problemMsg="Problem with: getGroupName";
		assertEquals(problemMsg, null, obj.getGroupName());
	}
	public void testSetGroupname()
	{
		Reservation obj=new reservation.Reservation();
		String problemMsg="Problem with: setGroupname";
		String groupname="gruppo1";
		obj.setGroupname(groupname);
		assertTrue(obj.getGroupName().equals(groupname));
	}
	public void testGetCheckin()
	{
		Reservation obj=new reservation.Reservation();
		String problemMsg="Problem with: getCheckin";
		assertEquals(problemMsg, null, obj.getCheckin());
	}
	public void testSetCheckin()
	{
		Reservation obj=new reservation.Reservation();
		String problemMsg="Problem with: setCheckin";
		String checkin="15/06/2012";
		obj.setCheckin(checkin);
		assertTrue(obj.getCheckin().equals(checkin));
	}
	public void testGetCheckout()
	{
		Reservation obj=new reservation.Reservation();
		String problemMsg="Problem with: getCheckout";
		assertEquals(problemMsg, null, obj.getCheckout());
	}
	public void testSetCheckout()
	{
		Reservation obj=new reservation.Reservation();
		String problemMsg="Problem with: setCheckout";
		String checkout="16/06/2012";
		obj.setCheckout(checkout);
		assertTrue(obj.getCheckout().equals(checkout));
	}
	public void testGetDeposit()
	{
		Reservation obj=new reservation.Reservation();
		String problemMsg="Problem with: getDeposit";
		assertEquals(problemMsg, 0F, obj.getDeposit(), 0.1F);
//NOTE: Final parameter is the tolerance for the comparison
	}
	public void testSetDeposit()
	{
		Reservation obj=new reservation.Reservation();
		String problemMsg="Problem with: setDeposit";
		float deposit=0F;
		obj.setDeposit(deposit);
		assertTrue(deposit==obj.getDeposit());
	}
	public void testGetTotcost()
	{
		Reservation obj=new reservation.Reservation();
		String problemMsg="Problem with: getTotcost";
		assertEquals(problemMsg, 0F, obj.getTotcost(), 0.1F);
//NOTE: Final parameter is the tolerance for the comparison
	}
	public void testSetTotcost()
	{
		Reservation obj=new reservation.Reservation();
		String problemMsg="Problem with: setTotcost";
		float totcost=0F;
		obj.setTotcost(totcost);
		assertTrue(totcost==obj.getTotcost());
	}
}
