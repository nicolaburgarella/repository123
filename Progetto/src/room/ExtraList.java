package room;


import java.util.*;
import java.io.*;

// TODO: Auto-generated Javadoc
/**
 * The model Class ExtraList.
 */
public class ExtraList {
		
	/** The extra register. */
	private ArrayList<Extra> extraReg=new ArrayList<Extra>();
	

		/**
		 * Gets the extra register.
		 *
		 * @return the extra register
		 */
		public ArrayList<Extra> getExtraReg() {
		return extraReg;
	}

	/**
	 * Sets the extra register.
	 *
	 * @param extraReg the new extra register
	 */
	public void setExtraReg(ArrayList<Extra> extraReg) {
		this.extraReg = extraReg;
	}

		/**
		 * Instantiates a new extra list cancelling all the entries from the arraylist.
		 */
		public ExtraList(){
			extraReg.clear();
		}
		
		/**
		 * Gets the extra list.
		 *
		 * @return the extra list
		 */
		public ArrayList<Extra> getExtraList(){
			return this.extraReg;
		}


		/**
		 * Adds the extra into the arraylist extraReg.
		 *
		 * @param extra the extra instance
		 */
		public void addExtra(Extra extra){
			for(int i=0;i<extraReg.size();i++){
				if((extraReg.get(i)).equals(extra)){
					System.out.println("L'extra è già presente nella lista, quindi non lo inserisco");
				}
			}
			extraReg.add(extra);

			System.out.println("Extra inserito nella lista degli extra");
		}


		/**
		 * Checks if the arraylist extraReg is empty.
		 *
		 * @return true, if is extra list empty
		 */
		public boolean isExtraListEmpty(){
			return extraReg.isEmpty();
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "ExtraList [extraReg=" + extraReg + "]";
		}

}
