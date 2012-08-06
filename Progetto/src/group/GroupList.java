package group;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import room.Room;


// TODO: Auto-generated Javadoc
/**
 * The Class GroupList.
 */
public class GroupList {
	
	/** The group reg. */
	private ArrayList<Group> groupReg=new ArrayList<Group>();
	
	//
	//Creo Mappa hash dove memorizzare in modo persistente nome del gruppo - stanze assegnate elaborate per ora dentro group
	/** The Map room assigned. */
	private HashMap<String, ArrayList<Room>> MapRoomAssigned = new HashMap<String,ArrayList<Room>>();
	
	/** The current room assigned. */
	private ArrayList<Room> currentRoomAssigned;
	
	/** The current group name. */
	String currentGroupName="";
	
//costruttore
	/**
 * Instantiates a new group list.
 *
 * @param mapRoomAssigned the map room assigned
 */
public GroupList(
			HashMap<String, ArrayList<Room>> mapRoomAssigned) {
		super();
		MapRoomAssigned = mapRoomAssigned;
	}

	//getter della mappa
	/**
	 * Gets the map room assigned.
	 *
	 * @return the map room assigned
	 */
	public HashMap <String, ArrayList<Room>> getMapRoomAssigned(){
		return this.MapRoomAssigned;
	}
	
	//setter della mappa
	/**
	 * Sets the map room assigned.
	 *
	 * @param m the m
	 */
	public void setMapRoomAssigned(HashMap <String, ArrayList<Room>> m){
		this.MapRoomAssigned=m;
	}
	
	//ottenere l'arraylist delle stanze assegnate dalla mappa
	/**
	 * Gets the room assigned from map.
	 *
	 * @param groupName the group name
	 * @return the room assigned from map
	 */
	public ArrayList<Room> getRoomAssignedFromMap(String groupName){
		this.currentRoomAssigned = MapRoomAssigned.get(groupName);
		return this.currentRoomAssigned;
		}	
		
	//aggiungere nella mappa l'associazione nomegruppo - stanze assegnate
		/**
	 * Sets the room assigned into map.
	 *
	 * @param groupName the group name
	 * @param roomAssignedp the room assignedp
	 */
	public void setRoomAssignedIntoMap(String groupName,ArrayList<Room> roomAssignedp){
			this.currentGroupName=groupName;
			this.currentRoomAssigned=roomAssignedp;
			MapRoomAssigned.put(groupName, roomAssignedp);
		}
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "GroupList [groupReg=" + groupReg + "]";
		}

		
		
	/**
	 * Gets the group reg.
	 *
	 * @return the group reg
	 */
	public ArrayList<Group> getGroupReg() {
		return groupReg;
	}

	/**
	 * Sets the group reg.
	 *
	 * @param groupReg the new group reg
	 */
	public void setGroupReg(ArrayList<Group> groupReg) {
		this.groupReg = groupReg;
	}


		/*	@Override
			public String toString() {
				return "GroupList [groupReg=" + groupReg + ", MapRoomAssigned="
						+ MapRoomAssigned + "]";
			}
		*/	
			

			/**
		 * Instantiates a new group list.
		 */
		public GroupList(){
					groupReg.clear();

				}

			/**
			 * Checks if is group list empty.
			 *
			 * @return true, if is group list empty
			 */
			public boolean isGroupListEmpty(){
				return groupReg.isEmpty();
			}

		
				/**
				 * Adds the group.
				 *
				 * @param group the group
				 */
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
