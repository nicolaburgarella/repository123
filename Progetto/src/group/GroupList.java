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
 * The Class GroupList lists all the group instances inserted into application.
 */
public class GroupList {
	
	/** The group register list. */
	private ArrayList<Group> groupReg=new ArrayList<Group>();
			
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "GroupList [groupReg=" + groupReg + "]";
		}

		
		
	/**
	 * Gets the group register list.
	 *
	 * @return the group register list
	 */
	public ArrayList<Group> getGroupReg() {
		return groupReg;
	}

	/**
	 * Sets the group register.
	 *
	 * @param groupReg the new group register list
	 */
	public void setGroupReg(ArrayList<Group> groupReg) {
		this.groupReg = groupReg;
	}
			

			/**
		 * Instantiates a new group list instance and clear the group register list.
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
