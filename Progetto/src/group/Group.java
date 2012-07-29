package group;

import java.util.ArrayList;
import java.util.Map;

import room.Room;

public class Group {
	
	private int number;
	private String name;
	private String checkin;
	private String checkout;
	private float deposit;
	
	private ArrayList <Room> roomsAssigned =new ArrayList<Room>();
	
	
	
	public ArrayList<Room> getRoomAssigned() {
		if(roomsAssigned==null){
			System.out.println("Non ci son stanze assegnate per il gruppo");
			return null;
		}
		return roomsAssigned;
	}
	

	public void setRoomAssigned(ArrayList<Room> roomAssigned) {	
		this.roomsAssigned = roomAssigned;
	}

	public boolean isRoomsAssignedListEmpty(){
		return roomsAssigned.isEmpty();
	}

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
