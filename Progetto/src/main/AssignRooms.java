package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import payment.PayRooms;
import group.ExtractGroupByName;
import group.ExtractRequest;
import group.Group;
import group.GroupList;
import group.JDOMConfirmRequest;
import group.JDOMExtractGroup;
import group.JDOMWriteAssignment;
import group.Request;
import hotel.Hotel;
import reservation.JDOMAddChild;
import reservation.JDOMExtractReservation;
import reservation.Reservation;
import room.ExtractRoomByNumber;
import room.JDOMReader;
import room.Room;
import room.RoomList;
import room.SetRoomNotFree;

public class AssignRooms {

	private boolean fatto=false;
	private HashMap<String, Collection<Room>> m;

	/**
	 * @param args
	 */
	public AssignRooms(String groupName, Hotel h) {
		Group g=new Group();
		/**
		 * Devo estrarre l'istanza relativa al gruppo passato come paramentro groupname
		 * Estrarre l'istanza relativa alla prenotazione tramite il nomegruppo groupname no la stampo alla fine
		 * Estrarre l'istanza della richiesta in base al nome del gruppo groupname
		 * Segnalare nel file group.xml che la richiesta è stata eseguita
		 * Verifico prima che il numero delle camere disponibili con quella composizione sia sufficiente a coprire la richiesta del gruppo
		 * Se si,assegno alla roomlist del gruppo le camere assegnate(e sarebbe doveroso che esso venisse salvato automaticamente in un file xml apposito)
		 * 
		 */
		
		System.out.print("•Estraggo il gruppo passato come parametro.");
		for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
			if((h.getGroupList().getGroupReg().get(i).getName()).equalsIgnoreCase(groupName)){
				g=h.getGroupList().getGroupReg().get(i);
			}
		}
		System.out.println("Dettagli del gruppo a cui fare il checkin: \n"+g.toString());
		
		//Setto la richiesta come eseguita
		System.out.println("•Passo base:la richiesta del gruppo deve esserci, la setto come eseguita");
		ExtractRequest er=new ExtractRequest();
		
		/*for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
			for(int q=0;q<h.getGroupList().getGroupReg().size();q++){
			if(h.getGroupList().getGroupReg().get(j).getRequest()==h.getRequestList().getRequestReg().get(q)){
				System.out.println("Riconosco la richiesta del gruppo dentro l'istanza group come una richiesta presente dentro l'arraylist delle richieste");
			}
		}
		}*/
		
		
		if(er.ExtractRequestbyGroupName(groupName)!=null){
			
		Request r=er.ExtractRequestbyGroupName(groupName);
		
		for(int i=0;i<h.getRequestList().getRequestReg().size();i++){
			if((h.getRequestList().getRequestReg().get(i)).equals(r)){
				h.getRequestList().getRequestReg().get(i).setFlag("eseguita");
				JDOMConfirmRequest s = new JDOMConfirmRequest(groupName);
			}
		}

			
			int doublenum=r.getDoppie();
			int weddingnum=r.getMatrimoniali();
			
			System.out.println("•Il gruppo "+groupName+" richiede l'assegnamento di:\ncamere singole "+r.getSingole()+"\t doppie "+doublenum+"\t matrimoniali "+weddingnum);
			
			int[] singlearray=new int[100];
			int[] doublearray=new int[100];
			int[] weddingarray=new int[100];

			if(r.getSingole()<=h.getRoomList().getFreeRoomsCountByComp("singole")){
				singlearray=h.getRoomList().getFreeSingleRooms();
				System.out.print("CAMERE SINGOLE LIBERE DISPONIBILI:\t");
				for(int n=0;n<singlearray.length;n++){
					System.out.print(+singlearray[n]+", ");
				}
				System.out.println();
				
				for(int i=0;i<r.getSingole();i++){
					System.out.print("•"+(i+1)+"A STANZA SINGOLA ASSEGNATA, numero "+singlearray[i]+"\t\tDettagli stanza :");
					ExtractRoomByNumber ern=new ExtractRoomByNumber();
					Room room=ern.ExtractRoom(singlearray[i]);
					if(room !=null){
					room.setFree("no");
					SetRoomNotFree srnf=new SetRoomNotFree(singlearray[i]);
					g.addRoomAssigned(room); 
						//	h.getGroupList().setRoomAssignedIntoMap(g.getName(), g.getRoomAssigned());		
					for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
						if(h.getGroupList().getGroupReg().get(j).getNumber()==g.getNumber()){
						h.getGroupList().getGroupReg().get(j).addRoomAssigned(room);	
						//System.out.println("PROVAAAAAA ISTANZIA la stanza assegnata???"+g.getRoomAssigned().toString()+"\n"+h.getGroupList().getGroupReg().get(j).getRoomAssigned().toString());
						System.out.println();
						fatto=true;
						}
					}

					}
					if(fatto==false){
						System.out.println("non ho estratto niente,stanza con valore nullo");
					}	
				}
			}else{
					System.out.println("La richiesta di camere singole eccede le disponibilità attuali dell'hotel");
				}
			
			
			if(doublenum<=h.getRoomList().getFreeRoomsCountByComp("doppie")){
				doublearray=h.getRoomList().getFreeDoubleRooms();
				System.out.print("CAMERE DOPPIE LIBERE DISPONIBILI:\t");
				for(int n=0;n<doublearray.length;n++){
					System.out.print(doublearray[n]+", ");
				}
				System.out.println();
				for(int i=0;i<r.getDoppie();i++){
					System.out.print("•"+(i+1)+"A STANZA DOPPIA ASSEGNATA, numero "+doublearray[i]+"\t\tDettagli stanza :");
					ExtractRoomByNumber ern=new ExtractRoomByNumber();
					Room room=ern.ExtractRoom(doublearray[i]);
					if(room !=null){
					room.setFree("no");
					SetRoomNotFree srnf=new SetRoomNotFree(doublearray[i]);
					g.addRoomAssigned(room);
					for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
						if(h.getGroupList().getGroupReg().get(j).getNumber()==g.getNumber()){
						h.getGroupList().getGroupReg().get(j).addRoomAssigned(room);	
						//System.out.println("PROVAAAAAA ISTANZIA la stanza assegnata???"+g.getRoomAssigned().toString()+"\n"+h.getGroupList().getGroupReg().get(j).getRoomAssigned().toString());
						System.out.println();
						fatto=true;
						}
					}
					
					}
					if(fatto==false){
						System.out.println("non ho estratto niente,stanza con valore nullo");
					}	
				}	
			}
			else{
				System.out.println("La richiesta di camere doppie eccede le disponibilità attuali dell'hotel");
			}
			
			if(weddingnum<=h.getRoomList().getFreeRoomsCountByComp("matrimoniali")){
				weddingarray=h.getRoomList().getFreeWeddingRooms();
				System.out.print("CAMERE MATRIMONIALI LIBERE DISPONIBILI:\t");
				for(int n=0;n<weddingarray.length;n++){
					System.out.print(weddingarray[n]+", ");
				}
				System.out.println();
				for(int i=0;i<r.getMatrimoniali();i++){
					System.out.print("•"+(i+1)+"A STANZA MATRIMONIALE ASSEGNATA, numero "+weddingarray[i]+"\t\tDettagli stanza :");
					ExtractRoomByNumber ern=new ExtractRoomByNumber();
					Room room=ern.ExtractRoom(weddingarray[i]);
					if(room !=null){
					room.setFree("no");
					SetRoomNotFree srnf=new SetRoomNotFree(weddingarray[i]);
					g.addRoomAssigned(room);
					for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
						if(h.getGroupList().getGroupReg().get(j).getNumber()==g.getNumber()){
						h.getGroupList().getGroupReg().get(j).addRoomAssigned(room);	
						//System.out.println("PROVAAAAAA ISTANZIA la stanza assegnata???"+g.getRoomAssigned().toString()+"\n"+h.getGroupList().getGroupReg().get(j).getRoomAssigned().toString());
						System.out.println();
						fatto=true;
						}
					}
					
					}
					if(fatto==false){
						System.out.println("non ho estratto niente,room null");
					}
					
				}	
			}	
			else{
				System.out.println("La richiesta di camere doppie eccede le disponibilità attuali dell'hotel");
			}
		System.out.println("Stampo tutto il gruppo:dati e anche la lista delle camere assegnate al gruppo:\n"+g.toString()+"\n\n");	
		System.out.println("Memorizzo i valori nella mappa");
		//DA RIVEDEREEEE G.GETROOMASSIGNED è CARICA,MA NON PASSA NIENTE ALLA MAPPA,SOLO IL NOMEDELGRUPPO SENZA VALORE
		//Collection<Room> c=g.getRoomAssigned();
		h.getGroupList().setRoomAssignedIntoMap(g.getName(), g.getRoomAssigned());
		System.out.println("mappa caricata nell'istanza grouplist:\n"+h.getGroupList().toString());
		m=h.getGroupList().getMapRoomAssigned();
		System.out.println(m.toString());
	
			
			JDOMWriteAssignment  jdwa =new JDOMWriteAssignment(g,g.getName());
			
			//Creo la prenotazione
			PayRooms p=new PayRooms();
			float DiffTotFeeCost=p.PayRooms(g);
			if(DiffTotFeeCost==999999999){
				System.out.println("Prenotazione non eseguita, perchè non ci sono stanze assegnate al gruppo");
			}
			if(DiffTotFeeCost==999999990){
					System.out.println("Prenotazione non eseguita, perchè è stato passato come parametro un gruppo nullo");
			}
			if(DiffTotFeeCost==999999909){
				System.out.println("Prenotazione non eseguita, perchè sono state inserite date con valori nulli o errati");
			}
			else{
				
				System.out.println("Vai a vedere il file pdf creato nella cartella pdfHotel!");
			int number=g.getNumber();
			String groupname=g.getName();
			String checkin=g.getCheckin();
			String checkout=g.getCheckout();
			float deposit=g.getDeposit();
			Reservation reservation =new Reservation(number, groupname, checkin, checkout, deposit, DiffTotFeeCost);
			h.getReservationList().getReservReg().add(reservation);
			JDOMAddChild j=new JDOMAddChild(reservation);
			}
			}else{
		System.out.println("E' stato inserito un nome nullo");
	}
}

}

