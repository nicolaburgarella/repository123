package group;

import java.util.ArrayList;


public class GroupList {
	
	private ArrayList<Group> groupReg=new ArrayList<Group>();



	public ArrayList<Group> getGroupReg() {
		return groupReg;
	}

	public void setGroupReg(ArrayList<Group> groupReg) {
		this.groupReg = groupReg;
	}


			@Override
			public String toString() {
				return "GroupList [registroGruppi=" + groupReg + "]\n";
			}
			
			

			public GroupList(){
					//Removes all of the elements from this list.
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
					//room.setIncrId();
					System.out.println("Gruppo inserito nella lista dei gruppi");
				}
		}
