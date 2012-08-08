package group;

import java.lang.String;
import java.util.ArrayList;

import date.DataCheckoutTest;

import room.Room;

// TODO: Auto-generated Javadoc
/**
 * The Class GroupTest.
 */
public class GroupTest extends junit.framework.TestCase
{
	
	/**
	 * Test get room assigned.
	 */
	public void testGetRoomAssigned()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getRoomAssigned";
		ArrayList roomAssigned=null;
		obj.setRoomAssigned(roomAssigned);
		assertEquals(problemMsg, null, obj.getRoomAssigned());
	}
	
	/**
	 * Test set room assigned.
	 */
	public void testSetRoomAssigned()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setRoomAssigned";
		ArrayList roomAssigned=new ArrayList<Group>();
		obj.setRoomAssigned(roomAssigned);
		assertTrue(roomAssigned==obj.getRoomAssigned());
	}
	
	/**
	 * Test is rooms assigned list empty.
	 */
	public void testIsRoomsAssignedListEmpty()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: isRoomsAssignedListEmpty";
		assertTrue(problemMsg, obj.isRoomsAssignedListEmpty());
//		assertFalse(problemMsg, obj.isRoomsAssignedListEmpty());
	}
	
	/**
	 * Test add room assigned.
	 */
	public void testAddRoomAssigned()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: addRoomAssigned";
		Room room=null;
		//assertTrue(problemMsg, obj.addRoomAssigned(room));
		assertFalse(problemMsg, obj.addRoomAssigned(room));
	}
	
	/**
	 * Test get number.
	 */
	public void testGetNumber()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getNumber";
		obj.setNumber(2);
		assertEquals(problemMsg, 2, obj.getNumber());
	}
	
	/**
	 * Test set number.
	 */
	public void testSetNumber()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setNumber";
		int n=2;
		obj.setNumber(n);
		assertTrue(n==obj.getNumber());
	}
	
	/**
	 * Test get name.
	 */
	public void testGetName()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getName";
		assertEquals(problemMsg, null, obj.getName());
	}
	
	/**
	 * Test set name.
	 */
	public void testSetName()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setName";
		String name="Nicola";
		obj.setName(name);
		assertTrue(obj.getName().equals(name));
	}
	
	/**
	 * Test get checkin.
	 */
	public void testGetCheckin()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getCheckin";
		assertEquals(problemMsg, null, obj.getCheckin());
	}
	
	/**
	 * Test set checkin.
	 */
	public void testSetCheckin()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setCheckin";
		String checkin="12/02/2012";
		obj.setCheckin(checkin);
		assertTrue(checkin==obj.getCheckin());
	}
	
	/**
	 * Test get checkout.
	 */
	public void testGetCheckout()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getCheckout";
		assertEquals(problemMsg, null, obj.getCheckout());
	}
	
	/**
	 * Test set checkout.
	 */
	public void testSetCheckout()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setCheckout";
		String checkout="15/02/2012";
		obj.setCheckout(checkout);
		assertTrue(checkout==obj.getCheckout());
	}
	
	/**
	 * Test get deposit.
	 */
	public void testGetDeposit()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getDeposit";
		assertEquals(problemMsg, 0F, obj.getDeposit(), 0.1F);
//NOTA:Il parametro finale è la tolleranza al confronto
		
	}
	
	/**
	 * Test set deposit.
	 */
	public void testSetDeposit()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setDeposit";
		float deposit=0F;
		obj.setDeposit(deposit);
		assertTrue(deposit==obj.getDeposit());
	}

}
