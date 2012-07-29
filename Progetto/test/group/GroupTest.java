package group;

import java.lang.String;
import java.util.ArrayList;

import room.Room;

public class GroupTest extends junit.framework.TestCase
{
	
	public void testGetRoomAssigned()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getRoomAssigned";
		ArrayList roomAssigned=null;
		obj.setRoomAssigned(roomAssigned);
		assertEquals(problemMsg, null, obj.getRoomAssigned());
	}
	public void testSetRoomAssigned()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setRoomAssigned";
		ArrayList roomAssigned=new ArrayList<Group>();
		obj.setRoomAssigned(roomAssigned);
		assertTrue(roomAssigned==obj.getRoomAssigned());
	}
	public void testIsRoomsAssignedListEmpty()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: isRoomsAssignedListEmpty";
		assertTrue(problemMsg, obj.isRoomsAssignedListEmpty());
//		assertFalse(problemMsg, obj.isRoomsAssignedListEmpty());
	}
	public void testAddRoomAssigned()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: addRoomAssigned";
		Room room=null;
		//assertTrue(problemMsg, obj.addRoomAssigned(room));
		assertFalse(problemMsg, obj.addRoomAssigned(room));
	}
	
	public void testGetNumber()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getNumber";
		obj.setNumber(2);
		assertEquals(problemMsg, 2, obj.getNumber());
	}
	public void testSetNumber()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setNumber";
		int n=2;
		obj.setNumber(n);
		assertTrue(n==obj.getNumber());
	}
	public void testGetName()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getName";
		assertEquals(problemMsg, null, obj.getName());
	}
	public void testSetName()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setName";
		String name="Nicola";
		obj.setName(name);
		assertTrue(obj.getName().equals(name));
	}
	public void testGetCheckin()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getCheckin";
		assertEquals(problemMsg, null, obj.getCheckin());
	}
	public void testSetCheckin()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setCheckin";
		String checkin="12/02/2012";
		obj.setCheckin(checkin);
		assertTrue(checkin==obj.getCheckin());
	}
	public void testGetCheckout()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getCheckout";
		assertEquals(problemMsg, null, obj.getCheckout());
	}
	public void testSetCheckout()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setCheckout";
		String checkout="15/02/2012";
		obj.setCheckout(checkout);
		assertTrue(checkout==obj.getCheckout());
	}
	public void testGetDeposit()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getDeposit";
		assertEquals(problemMsg, 0F, obj.getDeposit(), 0.1F);
//NOTA:Il parametro finale è la tolleranza al confronto
		
	}
	public void testSetDeposit()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setDeposit";
		float deposit=0F;
		obj.setDeposit(deposit);
		assertTrue(deposit==obj.getDeposit());
	}

}
