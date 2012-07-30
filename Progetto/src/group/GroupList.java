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
	private HashMap<String, ArrayList<Room>> MapRoomAssigned = new HashMap<String,ArrayList<Room>>();
	private ArrayList<Room> currentRoomAssigned;
	String currentGroupName="";
	
//costruttore
	public GroupList(
			HashMap<String, ArrayList<Room>> mapRoomAssigned) {
		super();
		MapRoomAssigned = mapRoomAssigned;
	}

	//getter della mappa
	public HashMap <String, ArrayList<Room>> getMapRoomAssigned(){
		return this.MapRoomAssigned;
	}
	
	//setter della mappa
	public void setMapRoomAssigned(HashMap <String, ArrayList<Room>> m){
		this.MapRoomAssigned=m;
	}
	
	//ottenere l'arraylist delle stanze assegnate dalla mappa
	public ArrayList<Room> getRoomAssignedFromMap(String groupName){
		this.currentRoomAssigned = MapRoomAssigned.get(groupName);
		return currentRoomAssigned;
		}	
		
	//aggiungere nella mappa l'associazione nomegruppo - stanze assegnate
		public void setRoomAssignedIntoMap(String groupName,ArrayList<Room> roomAssignedp){
			currentGroupName=groupName;
			currentRoomAssigned=roomAssignedp;
			MapRoomAssigned.put(groupName, roomAssignedp);
		}
		
		@Override
		public String toString() {
			return "GroupList [groupReg=" + groupReg + "]";
		}

		
		
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
