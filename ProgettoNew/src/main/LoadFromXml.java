package main;

import reservation.ReservationList;
import room.ExtraList;
import room.RoomList;
import group.GroupList;
import group.RequestList;
import hotel.Hotel;

public class LoadFromXml {

	/**
	 * @param args
	 */
	public LoadFromXml(){
		
	}
	
	public Hotel LoadFromXml() {
		// TODO Auto-generated method stub
		Hotel h = new Hotel();
		LoadExtrasAndRoomsFromXML l1=new LoadExtrasAndRoomsFromXML();
		h=l1.LoadExtrasAndRoomsFromXML();
		ExtraList el=h.getExtraList();
		RoomList rol=h.getRoomList();
		
		LoadGroupsAndRequestsFromXML l2=new LoadGroupsAndRequestsFromXML();
		h=l2.LoadGroupsAndRequestsFromXML();
		GroupList gl=h.getGroupList();
		RequestList rel=h.getRequestList();
		
		LoadReservationsFromXML l3=new LoadReservationsFromXML();
		ReservationList rl=l3.LoadReservationsFromXML();
		Hotel h2= new Hotel(rel, gl, rol, el, rl);
		
		return h2;
		

	}

}
