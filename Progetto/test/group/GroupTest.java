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
		assertEquals(problemMsg, null, obj.getRoomAssigned());
	}
	public void testSetRoomAssigned()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setRoomAssigned";
		ArrayList roomAssigned=null;
		obj.setRoomAssigned(roomAssigned);
		//Examine the object and assert something appropriate here
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
		assertTrue(problemMsg, obj.addRoomAssigned(room));
//		assertFalse(problemMsg, obj.addRoomAssigned(room));
	}
	public void testGetRoomAssignedByPos()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getRoomAssignedByPos";
		int posizione=0;
		assertEquals(problemMsg, null, obj.getRoomAssignedByPos(posizione));
	}
	public void testGetNumber()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getNumber";
		assertEquals(problemMsg, 0, obj.getNumber());
	}
	public void testSetNumber()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setNumber";
		int number=0;
		obj.setNumber(number);
		//Examine the object and assert something appropriate here
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
		String name=null;
		obj.setName(name);
		//Examine the object and assert something appropriate here
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
		String checkin=null;
		obj.setCheckin(checkin);
		//Examine the object and assert something appropriate here
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
		String checkout=null;
		obj.setCheckout(checkout);
		//Examine the object and assert something appropriate here
	}
	public void testGetDeposit()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: getDeposit";
		assertEquals(problemMsg, 0F, obj.getDeposit(), 0.1F);
//NOTE: Final parameter is the tolerance for the comparison
	}
	public void testSetDeposit()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: setDeposit";
		float deposit=0F;
		obj.setDeposit(deposit);
		//Examine the object and assert something appropriate here
	}
	public void testToString()
	{
		Group obj=new group.Group();
		String problemMsg="Problem with: toString";
		assertEquals(problemMsg, null, obj.toString());
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(GroupTest.class));
	}
}
