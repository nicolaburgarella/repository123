package group;

import java.util.ArrayList;
import java.util.Map;

import room.Room;

// TODO: Auto-generated Javadoc
/**
 * The Class Group.
 */
public class Group {
	
	/** The number. */
	private int number;
	
	/** The name. */
	private String name;
	
	/** The checkin. */
	private String checkin;
	
	/** The checkout. */
	private String checkout;
	
	/** The deposit. */
	private float deposit;
	
	/** The rooms assigned. */
	private ArrayList <Room> roomsAssigned =new ArrayList<Room>();
	
	
	
	/**
	 * Gets the room assigned.
	 *
	 * @return the room assigned
	 */
	public ArrayList<Room> getRoomAssigned() {
		if(roomsAssigned==null){
			System.out.println("Non ci son stanze assegnate per il gruppo");
			return null;
		}
		return roomsAssigned;
	}
	

	/**
	 * Sets the room assigned.
	 *
	 * @param roomAssigned the new room assigned
	 */
	public void setRoomAssigned(ArrayList<Room> roomAssigned) {	
		this.roomsAssigned = roomAssigned;
	}

	/**
	 * Checks if is rooms assigned list empty.
	 *
	 * @return true, if is rooms assigned list empty
	 */
	public boolean isRoomsAssignedListEmpty(){
		return roomsAssigned.isEmpty();
	}

	/**
	 * Adds the room assigned.
	 *
	 * @param room the room
	 * @return true, if successful
	 */
	public boolean addRoomAssigned(Room room){
		if(room==null){
			System.out.println("Non è possibile aggiungere una stanza con valore nullo");
			return false;
		}
		for(int i=0;i<roomsAssigned.size();i++){
			if((roomsAssigned.get(i)).equals(room)){
				//System.out.println("Stanza già assegnata,quindi non inserita");
				return false;
			}
		}
		roomsAssigned.add(room);
		System.out.println(">>>>Stanza inserita.Ecco la lista delle stanze assegnate finora al gruppo:\n"+roomsAssigned.toString());
		return true;
	}
	
	/**
	 * Instantiates a new group.
	 */
	public Group(){
		this.roomsAssigned.clear();
	}
	
	/**
	 * Instantiates a new group.
	 *
	 * @param number the number
	 * @param name the name
	 * @param checkin the checkin
	 * @param checkout the checkout
	 * @param deposit the deposit
	 */
	public Group(int number, String name, String checkin, String checkout,
			float deposit) {
		super();
		this.number = number;
		this.name = name;
		this.checkin = checkin;
		this.checkout = checkout;
		this.deposit = deposit;
		this.roomsAssigned.clear();
	}
	
	
	/**
	 * Gets the number.
	 *
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * Sets the number.
	 *
	 * @param number the new number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the checkin.
	 *
	 * @return the checkin
	 */
	public String getCheckin() {
		return checkin;
	}
	
	/**
	 * Sets the checkin.
	 *
	 * @param checkin the new checkin
	 */
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	
	/**
	 * Gets the checkout.
	 *
	 * @return the checkout
	 */
	public String getCheckout() {
		return checkout;
	}
	
	/**
	 * Sets the checkout.
	 *
	 * @param checkout the new checkout
	 */
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	
	/**
	 * Gets the deposit.
	 *
	 * @return the deposit
	 */
	public float getDeposit() {
		return deposit;
	}
	
	/**
	 * Sets the deposit.
	 *
	 * @param deposit the new deposit
	 */
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Group [number=" + number + ", name=" + name + ", checkin="
				+ checkin + ", checkout=" + checkout + ", deposit=" + deposit
				+ ", roomsAssigned=" + roomsAssigned + "]";
	}

	
	

}
