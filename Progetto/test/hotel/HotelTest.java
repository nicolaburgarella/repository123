package hotel;

import group.Group;
import group.GroupList;
import group.RequestList;

import java.lang.String;
import java.util.ArrayList;

import reservation.Reservation;
import reservation.ReservationList;
import room.ExtraList;
import room.RoomList;

public class HotelTest extends junit.framework.TestCase
{
	public void testGetReservationList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: getReservationList";
		ArrayList<Reservation> reservreg=new ArrayList<Reservation>();
		ReservationList rl=null;
		obj.setReservationList(rl);
		assertEquals(problemMsg, null, obj.getReservationList());
	}
	public void testSetReservationList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: setReservationList";
		ReservationList reservationList=null ;
		obj.setReservationList(reservationList);
		assertTrue(reservationList==obj.getReservationList());
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
		assertTrue(requestList==obj.getRequestList());
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
		assertTrue(groupList==obj.getGroupList());
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
		assertTrue(roomList==obj.getRoomList());
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
		assertTrue(extraList==obj.getExtraList());
	}
}
