package group;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import room.Room;


public class GroupList {
	
	private ArrayList<Group> groupReg=new ArrayList<Group>();
	
	//
	//Creo Mappa hash dove memorizzare in modo persistente nome del gruppo - stanze assegnate elaborate per ora dentro group
	private HashMap<String, Collection<Room>> MapRoomAssigned = new HashMap<String,Collection<Room>>();
	private Collection<Room> roomAssigned;
	
//costruttore
	public GroupList(
			HashMap<String, Collection<Room>> mapRoomAssigned) {
		super();
		MapRoomAssigned = mapRoomAssigned;
	}

	//getter della mappa
	public HashMap <String, Collection<Room>> getMapRoomAssigned(){
		return this.MapRoomAssigned;
	}
	
	//setter della mappa
	public void setMapRoomAssigned(HashMap <String, Collection<Room>> m){
		this.MapRoomAssigned=m;
	}
	
	//ottenere l'arraylist delle stanze assegnate dalla mappa
	public ArrayList<Room> getRoomAssignedFromMap(String groupName){
		roomAssigned = MapRoomAssigned.get(groupName);
		if (roomAssigned==null) {
			System.out.println("Non ci sono camere assegnate con quel nome(chiave)");
			return null;
		}
		else{
		System.out.println("Ecco la col");
		return (ArrayList<Room>) this.roomAssigned;
		}	
	}
		
	//aggiungere nella mappa l'associazione nomegruppo - stanze assegnate
		public void setRoomAssignedIntoMap(String groupName,ArrayList<Room> roomAssignedp){
			roomAssigned=roomAssignedp;
			System.out.println("Interrogo la mappa delle assegnazioni per vedere se sià presente con quel nomegruppo");
			roomAssigned = MapRoomAssigned.get(groupName);
			if (roomAssigned==null) {
				System.out.println("Non sono state ancora assegnate stanze per quel nome(chiave), aggiungo l'associazione nella mappa");
				MapRoomAssigned.put(groupName, roomAssigned);
				System.out.println("Entry inserita.Mappa aggiornata");
				}
			else{
			    System.out.println("Esiste già una assegnazione delle stanze per quel nome");	
			}
			
		}
		
		@Override
		public String toString() {
			return "GroupList [groupReg=" + groupReg + "]";
		}

		
		
		
		
//
		
		
	public ArrayList<Group> getGroupReg() {
		return groupReg;
	}

	public void setGroupReg(ArrayList<Group> groupReg) {
		this.groupReg = groupReg;
	}


		/*	@Override
			public String toString() {
				return "GroupList [groupReg=" + groupReg + ", MapRoomAssigned="
						+ MapRoomAssigned + "]";
			}
		*/	
			

			public GroupList(){
					groupReg.clear();

				}

			public boolean isGroupListEmpty(){
				return groupReg.isEmpty();
			}

		
				public void addGroup(Group group){
					for(int i=0;i<groupReg.size();i++){
						if((groupReg.get(i)).equals(group)){
							System.out.println("Gruppo non inserito nella lista dei gruppi perchè già presente");
						}
					}
					groupReg.add(group);
					System.out.println("Gruppo inserito nella lista dei gruppi");
				}
				
				
				
		}
