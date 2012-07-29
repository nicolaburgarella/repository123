package room;

import group.Group;
import group.GroupList;

import java.lang.String;
import java.util.ArrayList;

public class RoomListTest extends junit.framework.TestCase
{
	public void testGetRoomReg()
	{
		RoomList obj=new room.RoomList();
		ArrayList roomReg=new ArrayList<Room>();
		obj.setRoomReg(roomReg);
		assertTrue(roomReg==obj.getRoomReg());
	}
	public void testSetRoomReg()
	{
		RoomList obj=new room.RoomList();
		ArrayList roomReg=null;
		obj.setRoomReg(roomReg);
		assertTrue(roomReg==obj.getRoomReg());
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
		RoomList obj=new RoomList();
		int n1=obj.getRoomReg().size();
		Room room=new Room(0, 0, null, null, null);
		obj.addRoom(room);
		int n2=obj.getRoomReg().size();
		assert n1>n2;
	}
	
	public void testGetFreeRoomsCountByComp()
	{
		RoomList obj=new room.RoomList();
		String problemMsg="Problem with: getFreeRoomsCountByComp";
		String flagcomp=null;
		assertEquals(problemMsg, 0, obj.getFreeRoomsCountByComp(flagcomp));
	}
}
