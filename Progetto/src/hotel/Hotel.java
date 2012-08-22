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

// TODO: Auto-generated Javadoc
/**
 * The model Class Hotel keeps all the models of the application and their lists loaded
 *  at the beginning of the application if the xml files of the data structures exist .
 */
public class Hotel {
	
	/** The request list entity. */
	RequestList requestList =new RequestList();
	
	/** The group list entity. */
	GroupList groupList = new GroupList();
	
	/** The room list entity. */
	RoomList roomList = new RoomList();
	
	/** The extra list entity. */
	ExtraList extraList=new ExtraList();
	
	/** The reservation list entity. */
	ReservationList reservationList=new ReservationList();
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hotel\n[requestList=\n" + requestList + ",\ngroupList=\n" + groupList
				+ "\nroomList=\n" + roomList + ",\nextraList=\n" + extraList +"\nreservationList=\n" + reservationList + "]";
	}

	
	
	/**
	 * Gets the reservation list.
	 *
	 * @return the reservation list
	 */
	public ReservationList getReservationList() {
		return reservationList;
	}



	/**
	 * Sets the reservation list.
	 *
	 * @param reservationList the new reservation list
	 */
	public void setReservationList(ReservationList reservationList) {
		this.reservationList = reservationList;
	}



	/**
	 * Gets the request list.
	 *
	 * @return the request list
	 */
	public RequestList getRequestList() {
		return requestList;
	}

	/**
	 * Sets the request list.
	 *
	 * @param requestList the new request list
	 */
	public void setRequestList(RequestList requestList) {
		this.requestList = requestList;
	}

	/**
	 * Gets the group list.
	 *
	 * @return the group list
	 */
	public GroupList getGroupList() {
		return groupList;
	}

	/**
	 * Sets the group list.
	 *
	 * @param groupList the new group list
	 */
	public void setGroupList(GroupList groupList) {
		this.groupList = groupList;
	}

	/**
	 * Gets the room list.
	 *
	 * @return the room list
	 */
	public RoomList getRoomList() {
		return roomList;
	}

	/**
	 * Sets the room list.
	 *
	 * @param roomList the new room list
	 */
	public void setRoomList(RoomList roomList) {
		this.roomList = roomList;
	}

	/**
	 * Gets the extra list.
	 *
	 * @return the extra list
	 */
	public ExtraList getExtraList() {
		return extraList;
	}

	/**
	 * Sets the extra list.
	 *
	 * @param extraList the new extra list
	 */
	public void setExtraList(ExtraList extraList) {
		this.extraList = extraList;
	}

	
	/**
	 * Instantiates a new hotel.
	 *
	 * @param requestList the request list
	 * @param groupList the group list
	 * @param roomList the room list
	 * @param extraList the extra list
	 */
	public Hotel(RequestList requestList, GroupList groupList,
			RoomList roomList, ExtraList extraList) {
		super();
		this.requestList = requestList;
		this.groupList = groupList;
		this.roomList = roomList;
		this.extraList = extraList;
	}
	

	/**
	 * Instantiates a new hotel.
	 *
	 * @param roomList the room list
	 * @param extraList the extra list
	 */
	public Hotel(RoomList roomList, ExtraList extraList) {
		super();
		this.roomList = roomList;
		this.extraList = extraList;
	}

	/**
	 * Instantiates a new hotel.
	 *
	 * @param requestList the request list
	 * @param groupList the group list
	 */
	public Hotel(RequestList requestList, GroupList groupList) {
		super();
		this.requestList = requestList;
		this.groupList = groupList;
	}
	
	

	/**
	 * Instantiates a new hotel.
	 *
	 * @param requestList the request list
	 * @param groupList the group list
	 * @param roomList the room list
	 * @param extraList the extra list
	 * @param reservationList the reservation list
	 */
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



	/**
	 * Instantiates a new hotel with a empty constructor.
	 */
	public Hotel() {
		
	}
	
	
	
	
	
	
	
	
}
