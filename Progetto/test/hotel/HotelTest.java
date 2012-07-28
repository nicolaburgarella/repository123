package hotel;

import group.GroupList;
import group.RequestList;

import java.lang.String;

import reservation.ReservationList;
import room.ExtraList;
import room.RoomList;

public class HotelTest extends junit.framework.TestCase
{
	public void testToString()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: toString";
		assertEquals(problemMsg, null, obj.toString());
	}
	public void testGetReservationList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: getReservationList";
		assertEquals(problemMsg, null, obj.getReservationList());
	}
	public void testSetReservationList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: setReservationList";
		ReservationList reservationList=null;
		obj.setReservationList(reservationList);
		//Examine the object and assert something appropriate here
	}
	public void testGetRequestList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: getRequestList";
		assertEquals(problemMsg, null, obj.getRequestList());
	}
	public void testSetRequestList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: setRequestList";
		RequestList requestList=null;
		obj.setRequestList(requestList);
		//Examine the object and assert something appropriate here
	}
	public void testGetGroupList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: getGroupList";
		assertEquals(problemMsg, null, obj.getGroupList());
	}
	public void testSetGroupList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: setGroupList";
		GroupList groupList=null;
		obj.setGroupList(groupList);
		//Examine the object and assert something appropriate here
	}
	public void testGetRoomList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: getRoomList";
		assertEquals(problemMsg, null, obj.getRoomList());
	}
	public void testSetRoomList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: setRoomList";
		RoomList roomList=null;
		obj.setRoomList(roomList);
		//Examine the object and assert something appropriate here
	}
	public void testGetExtraList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: getExtraList";
		assertEquals(problemMsg, null, obj.getExtraList());
	}
	public void testSetExtraList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: setExtraList";
		ExtraList extraList=null;
		obj.setExtraList(extraList);
		//Examine the object and assert something appropriate here
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(HotelTest.class));
	}
}
