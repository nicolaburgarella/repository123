package reservation;

import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The model Class ReservationList.
 */
public class ReservationList {
		
	/** The reservation register list. */
	private ArrayList<Reservation> reservReg=new ArrayList<Reservation>();
	
	

		/**
		 * Gets the reservation register.
		 *
		 * @return the reservation register
		 */
		public ArrayList<Reservation> getReservReg() {
		return reservReg;
	}

	/**
	 * Sets the reservation register.
	 *
	 * @param reservReg the new reservation register
	 */
	public void setReservReg(ArrayList<Reservation> reservReg) {
		this.reservReg = reservReg;
	}

		/**
		 * Instantiates a new reservation list.
		 *
		 * @param reservReg the reservation register
		 */
		public ReservationList(ArrayList<Reservation> reservReg) {
		super();
		this.reservReg = reservReg;
	}


		/**
		 * Instantiates a new reservation list.
		 */
		public ReservationList(){
			//Removes all of the elements from this list.
			reservReg.clear();
		}
		
		/**
		 * Checks if is reservation list empty.
		 *
		 * @return true, if is reservation list empty
		 */
		public boolean isReservationListEmpty(){
			return reservReg.isEmpty();
		}


		/**
		 * Adds the reservation.
		 *
		 * @param res the reservation instance
		 */
		public void addReservation(Reservation res){
			for(int i=0;i<reservReg.size();i++){
				if((reservReg.get(i)).equals(res)){
					System.out.println("La prenotazione è già presente nella lista, quindi non la inserisco");
				}
			}
			reservReg.add(res);

			System.out.println("La prenotazione è stata inserita nella lista delle richieste");
		}

		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "ReservationList [reservReg=" + reservReg + "]";
		}

}