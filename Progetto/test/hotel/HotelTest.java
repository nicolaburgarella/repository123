package hotel;

import group.Group;
import group.GroupList;
import group.RequestList;

import java.lang.String;
import java.util.ArrayList;

import date.DataCheckoutTest;

import reservation.Reservation;
import reservation.ReservationList;
import room.ExtraList;
import room.RoomList;

// TODO: Auto-generated Javadoc
/**
 * The Class HotelTest.
 */
public class HotelTest extends junit.framework.TestCase
{
	
	/**
	 * Test get reservation list.
	 */
	public void testGetReservationList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: getReservationList";
		ArrayList<Reservation> reservreg=new ArrayList<Reservation>();
		ReservationList rl=null;
		obj.setReservationList(rl);
		assertEquals(problemMsg, null, obj.getReservationList());
	}
	
	/**
	 * Test set reservation list.
	 */
	public void testSetReservationList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: setReservationList";
		ReservationList reservationList=null ;
		obj.setReservationList(reservationList);
		assertTrue(reservationList==obj.getReservationList());
	}
	
	/**
	 * Test get request list.
	 */
	public void testGetRequestList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: getRequestList";
		assertEquals(problemMsg, null, obj.getRequestList());
	}
	
	/**
	 * Test set request list.
	 */
	public void testSetRequestList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: setRequestList";
		RequestList requestList=null;
		obj.setRequestList(requestList);
		assertTrue(requestList==obj.getRequestList());
	}
	
	/**
	 * Test get group list.
	 */
	public void testGetGroupList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: getGroupList";
		assertEquals(problemMsg, null, obj.getGroupList());
	}
	
	/**
	 * Test set group list.
	 */
	public void testSetGroupList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: setGroupList";
		GroupList groupList=null;
		obj.setGroupList(groupList);
		assertTrue(groupList==obj.getGroupList());
	}
	
	/**
	 * Test get room list.
	 */
	public void testGetRoomList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: getRoomList";
		assertEquals(problemMsg, null, obj.getRoomList());
	}
	
	/**
	 * Test set room list.
	 */
	public void testSetRoomList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: setRoomList";
		RoomList roomList=null;
		obj.setRoomList(roomList);
		assertTrue(roomList==obj.getRoomList());
	}
	
	/**
	 * Test get extra list.
	 */
	public void testGetExtraList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: getExtraList";
		assertEquals(problemMsg, null, obj.getExtraList());
	}
	
	/**
	 * Test set extra list.
	 */
	public void testSetExtraList()
	{
		Hotel obj=new hotel.Hotel(null, null, null, null);
		String problemMsg="Problem with: setExtraList";
		ExtraList extraList=null;
		obj.setExtraList(extraList);
		assertTrue(extraList==obj.getExtraList());
	}
	
	/*public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(group.AddRequestViewTest.class));
	}*/
}
