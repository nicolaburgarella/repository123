package reservation;

import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ReservationList.
 */
public class ReservationList {
		
	/** The reserv reg. */
	private ArrayList<Reservation> reservReg=new ArrayList<Reservation>();
	
	

		/**
		 * Gets the reserv reg.
		 *
		 * @return the reserv reg
		 */
		public ArrayList<Reservation> getReservReg() {
		return reservReg;
	}

	/**
	 * Sets the reserv reg.
	 *
	 * @param reservReg the new reserv reg
	 */
	public void setReservReg(ArrayList<Reservation> reservReg) {
		this.reservReg = reservReg;
	}

		/**
		 * Instantiates a new reservation list.
		 *
		 * @param reservReg the reserv reg
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
		 * @param res the res
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



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * salva va reso un file xml <GRUPPO id="" nome="" dataArrivo="" anticipo="" richiestaComposizione=""/>
		 * */
		/*
		public void salvaInXML(){
			try{
				File file =new File("extra");
				FileOutputStream outStream= new FileOutputStream(file);
		        BufferedWriter lineWriter= new BufferedWriter(new OutputStreamWriter(outStream));
		        for(int i=0;i<extraReg.size();i++){
		            String LineaTesto="";
		            int index=0;
		            	if((rc.cercaIdCamera((extraReg.get(i)).getCodiceCamera())>0)){
		            		for(int j=0;j<(rc.getRegistroCamere()).size();j++){
		            			LineaTesto="<EXTRA id="+(extraReg.get(i)).getId()+" tipo="+(extraReg.get(i)).getTipo()+" idCamera="+(rc.getRegistroCamere().get(i)).getId()+" dataExtra="+
		            			((extraReg.get(i)).getDataExtra())+" />";
		            			lineWriter.write(LineaTesto);
		            			lineWriter.newLine();
		            			}
		            	}
		            	else{
		            		//System.out.println("Non ci sono extra per questa camera");
		            		break;
		            	}

				}
		        outStream.close();
		        lineWriter.close();
			}
			catch(IOException ioe){
				ioe.printStackTrace();
			}
		}

*/

		


}