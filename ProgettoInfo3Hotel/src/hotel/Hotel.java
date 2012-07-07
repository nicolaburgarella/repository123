package hotel;

import java.util.ArrayList;

import group.Group;
import group.GroupList;
import group.RequestList;
import room.Extra;
import room.Room;
import room.RoomList;
import room.ExtraList;
import reservation.Reservation;
import reservation.ReservationList;

public class Hotel {
	
	RequestList requestList =new RequestList();
	GroupList groupList = new GroupList();
	RoomList roomList = new RoomList();
	ExtraList extraList=new ExtraList();
	ReservationList reservationList=new ReservationList();
	
	@Override
	public String toString() {
		return "Hotel\n[requestList=\n" + requestList + ",\ngroupList=\n" + groupList
				+ "\nroomList=\n" + roomList + ",\nextraList=\n" + extraList +"\nreservationList=\n" + reservationList + "]";
	}

	
	
	public ReservationList getReservationList() {
		return reservationList;
	}



	public void setReservationList(ReservationList reservationList) {
		this.reservationList = reservationList;
	}



	public RequestList getRequestList() {
		return requestList;
	}

	public void setRequestList(RequestList requestList) {
		this.requestList = requestList;
	}

	public GroupList getGroupList() {
		return groupList;
	}

	public void setGroupList(GroupList groupList) {
		this.groupList = groupList;
	}

	public RoomList getRoomList() {
		return roomList;
	}

	public void setRoomList(RoomList roomList) {
		this.roomList = roomList;
	}

	public ExtraList getExtraList() {
		return extraList;
	}

	public void setExtraList(ExtraList extraList) {
		this.extraList = extraList;
	}

	
	public Hotel(RequestList requestList, GroupList groupList,
			RoomList roomList, ExtraList extraList) {
		super();
		this.requestList = requestList;
		this.groupList = groupList;
		this.roomList = roomList;
		this.extraList = extraList;
	}
	

	public Hotel(RoomList roomList, ExtraList extraList) {
		super();
		this.roomList = roomList;
		this.extraList = extraList;
	}

	public Hotel(RequestList requestList, GroupList groupList) {
		super();
		this.requestList = requestList;
		this.groupList = groupList;
	}
	
	

	public Hotel(RequestList requestList, GroupList groupList,
			RoomList roomList, ExtraList extraList,
			ReservationList reservationList) {
		super();
		this.requestList = requestList;
		this.groupList = groupList;
		this.roomList = roomList;
		this.extraList = extraList;
		this.reservationList = reservationList;
	}



	public Hotel() {
		
	}
	
	
	
	
	
	
	
	
}
