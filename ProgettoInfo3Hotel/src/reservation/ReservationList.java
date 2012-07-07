package reservation;

import java.util.*;

public class ReservationList {
		
	private ArrayList<Reservation> reservReg=new ArrayList<Reservation>();
	
	

		public ArrayList<Reservation> getReservReg() {
		return reservReg;
	}

	public void setReservReg(ArrayList<Reservation> reservReg) {
		this.reservReg = reservReg;
	}

		public ReservationList(ArrayList<Reservation> reservReg) {
		super();
		this.reservReg = reservReg;
	}


		public ReservationList(){
			//Removes all of the elements from this list.
			reservReg.clear();
		}
		
		public boolean isReservationListEmpty(){
			return reservReg.isEmpty();
		}


		public void addReservation(Reservation res){
			for(int i=0;i<reservReg.size();i++){
				if((reservReg.get(i)).equals(res)){
					System.out.println("La prenotazione è già presente nella lista, quindi non la inserisco");
				}
			}
			reservReg.add(res);

			System.out.println("La prenotazione è stata inserita nella lista delle richieste");
		}


/*
		public int searchExtraById(int number){
			for(int i=0;i<extraReg.size();i++){
				if((extraReg.get(i)).getNumber()==number){
					return i;
				}
			}
			return -1;
		}
		*/


		public Reservation getReservByPos(int posizione){
			return reservReg.get(posizione);
		}
		

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