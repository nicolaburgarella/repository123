package group;

import java.util.ArrayList;

import room.Room;

public class Group {
	
	private int number;
	private String name;
	private String checkin;
	private String checkout;
	private float deposit;
	
	
	private ArrayList <Room> roomsAssigned =new ArrayList<Room>();
	
	public ArrayList<Room> getRoomAssigned() {
		return roomsAssigned;
	}

	public void setRoomAssigned(ArrayList<Room> roomAssigned) {
		this.roomsAssigned = roomAssigned;
	}

	public boolean isRoomsAssignedListEmpty(){
		return roomsAssigned.isEmpty();
	}

	public boolean addRoomAssigned(Room room){
		for(int i=0;i<roomsAssigned.size();i++){
			if((roomsAssigned.get(i)).equals(room)){
				System.out.println("Stanza già assegnata,quindi non inserita");
				return false;
			}
		}
		roomsAssigned.add(room);
		System.out.println("Stanza inserita nella lista delle stanze assegnate al gruppo:\n"+roomsAssigned.toString());
		return true;
	}

//Ritorna la camera in base all'indice della lista passato come parametro
	public Room getRoomAssignedByPos(int posizione){
		return roomsAssigned.get(posizione);
	}
	
	

	public Group(){
		this.roomsAssigned.clear();
	}
	
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
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	
	@Override
	public String toString() {
		return "Group [number=" + number + ", name=" + name + ", checkin="
				+ checkin + ", checkout=" + checkout + ", deposit=" + deposit
				+ ", roomsAssigned=" + roomsAssigned + "]";
	}

}
