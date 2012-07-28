package room;

import java.lang.String;
import java.util.ArrayList;

public class RoomListTest extends junit.framework.TestCase
{
	public void testToString()
	{
		RoomList obj=new room.RoomList();
		String problemMsg="Problem with: toString";
		assertEquals(problemMsg, null, obj.toString());
	}
	public void testGetRoomReg()
	{
		RoomList obj=new room.RoomList();
		String problemMsg="Problem with: getRoomReg";
		assertEquals(problemMsg, null, obj.getRoomReg());
	}
	public void testSetRoomReg()
	{
		RoomList obj=new room.RoomList();
		String problemMsg="Problem with: setRoomReg";
		ArrayList roomReg=null;
		obj.setRoomReg(roomReg);
		//Examine the object and assert something appropriate here
	}
	public void testIsRoomListEmpty()
	{
		RoomList obj=new room.RoomList();
		String problemMsg="Problem with: isRoomListEmpty";
		assertTrue(problemMsg, obj.isRoomListEmpty());
//		assertFalse(problemMsg, obj.isRoomListEmpty());
	}
	public void testAddRoom()
	{
		RoomList obj=new room.RoomList();
		String problemMsg="Problem with: addRoom";
		Room room=null;
		obj.addRoom(room);
		//Examine the object and assert something appropriate here
	}
	public void testGetRoomByPos()
	{
		RoomList obj=new room.RoomList();
		String problemMsg="Problem with: getRoomByPos";
		int posizione=0;
		assertEquals(problemMsg, null, obj.getRoomByPos(posizione));
	}
	public void testGetFreeRoomsCountByComp()
	{
		RoomList obj=new room.RoomList();
		String problemMsg="Problem with: getFreeRoomsCountByComp";
		String flagcomp=null;
		assertEquals(problemMsg, 0, obj.getFreeRoomsCountByComp(flagcomp));
	}
	public void testGetFreeSingleRooms()
	{
		RoomList obj=new room.RoomList();
		String problemMsg="Problem with: getFreeSingleRooms";
		assertEquals(problemMsg, null, obj.getFreeSingleRooms());
	}
	public void testGetFreeDoubleRooms()
	{
		RoomList obj=new room.RoomList();
		String problemMsg="Problem with: getFreeDoubleRooms";
		assertEquals(problemMsg, null, obj.getFreeDoubleRooms());
	}
	public void testGetFreeWeddingRooms()
	{
		RoomList obj=new room.RoomList();
		String problemMsg="Problem with: getFreeWeddingRooms";
		assertEquals(problemMsg, null, obj.getFreeWeddingRooms());
	}
	public void testSearchRoomById()
	{
		RoomList obj=new room.RoomList();
		String problemMsg="Problem with: searchRoomById";
		int number=0;
		assertEquals(problemMsg, 0, obj.searchRoomById(number));
	}
	public void testRemoveZerosFromIntArray()
	{
		RoomList obj=new room.RoomList();
		String problemMsg="Problem with: removeZerosFromIntArray";
		int[] arr=null;
		assertEquals(problemMsg, null, obj.removeZerosFromIntArray(arr));
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(RoomListTest.class));
	}
}
