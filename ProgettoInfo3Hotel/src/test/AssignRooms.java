package test;

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

	/**
	 * @param args
	 */
	public AssignRooms(String groupName, Hotel h) {
		Group g=null;
		/**
		 * Devo estrarre l'istanza relativa al gruppo passato come paramentro groupname
		 * Estrarre l'istanza relativa alla prenotazione tramite il nomegruppo groupname no la stampo alla fine
		 * Estrarre l'istanza della richiesta in base al nome del gruppo groupname
		 * Segnalare nel file group.xml che la richiesta è stata eseguita
		 * Verifico prima che il numero delle camere disponibili con quella composizione sia sufficiente a coprire la richiesta del gruppo
		 * Se si,assegno alla roomlist del gruppo le camere assegnate(e sarebbe doveroso che esso venisse salvato automaticamente in un file xml apposito)
		 * 
		 */
		//Estraggo il gruppo passato come parametro
		System.out.println("Estraggo il gruppo passato come parametro");
		
		System.out.println("metodo1");
		for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
			if((h.getGroupList().getGroupReg().get(i).getName()).equalsIgnoreCase(groupName)){
				g=h.getGroupList().getGroupReg().get(i);
			}
		}
		System.out.println("Ho istanziato il gruppo che mi serve "+g.toString());
		/*
		System.out.println("metodo2: prende dati da xml, è esattamente equivalente");
		ExtractGroupByName e=new ExtractGroupByName();
		g=e.extractGroupByName(groupName);
		System.out.println(g.toString());
		*/
		
		
		//estraggo la prenotazione in base al nome del gruppo (non ha senso,semmai lo lancio deopo alla fine per vederla)
		//JDOMExtractReservation jder = new JDOMExtractReservation(groupName);
		
		//Setto la richiesta come eseguita
		System.out.println("Carico la richiesta del gruppo come istanza e la visualizzo\nSetto la richesta del gruppo come eseguita sul file xml groups,me lo fa sull'ultimo gruppo nel file xml,non va bene");
		ExtractRequest er=new ExtractRequest();
		Request r=er.ExtractRequestbyGroupName(groupName);
		for(int i=0;i<h.getRequestList().getRequestReg().size();i++){
			if((h.getRequestList().getRequestReg().get(i)).equals(r)){
				h.getRequestList().getRequestReg().get(i).setFlag("eseguita");
				JDOMConfirmRequest s = new JDOMConfirmRequest(groupName);
			}
		}

			
			int doublenum=r.getDoppie();
			int weddingnum=r.getMatrimoniali();
			
			System.out.println("La richiesta del gruppo "+groupName+" riguarda l'assegnamento di\n camere singole "+r.getSingole()+"\t doppie "+doublenum+"\t matrimoniali "+weddingnum+"\n\n");
			System.out.println("Carico e visualizzo l'istanza con tutte le camere roomlist:\n");
			
			int[] singlearray=new int[100];
			int[] doublearray=new int[100];
			int[] weddingarray=new int[100];

			if(r.getSingole()<=h.getRoomList().getFreeRoomsCountByComp("singole")){
				singlearray=h.getRoomList().getFreeSingleRooms();
				for(int n=0;n<singlearray.length;n++){
					System.out.print(singlearray[n]+", ");
				}
				System.out.println();
				
				for(int i=0;i<r.getSingole();i++){
					System.out.println("--Questa è la "+(i+1)+"a stanza singola da assegnare, numero "+singlearray[i]);
					ExtractRoomByNumber ern=new ExtractRoomByNumber();
					Room room=ern.ExtractRoom(singlearray[i]);
					if(room !=null){
					room.setFree("no");
					SetRoomNotFree srnf=new SetRoomNotFree(singlearray[i]);
					g.addRoomAssigned(room);
					}
					else{
						System.out.println("non ho estratto niente,room null");
					}	
				}
			
			
			if(doublenum<=h.getRoomList().getFreeRoomsCountByComp("doppie")){
				doublearray=h.getRoomList().getFreeDoubleRooms();
				for(int n=0;n<doublearray.length;n++){
					System.out.print(doublearray[n]+", ");
				}
				System.out.println();
				for(int i=0;i<doublenum;i++){
					System.out.println("-- Questa è la "+(i+1)+"a stanza doppia da assegnare, la numero "+doublearray[i]);
					ExtractRoomByNumber ern=new ExtractRoomByNumber();
					Room room=ern.ExtractRoom(doublearray[i]);
					if(room !=null){
					room.setFree("no");
					SetRoomNotFree srnf=new SetRoomNotFree(doublearray[i]);
					g.addRoomAssigned(room);
					}
					else{
						System.out.println("non ho estratto niente,room null");
					}
					
				}
				//System.out.println(g.toString()+"\n\n");		
			}
			
			if(weddingnum<=h.getRoomList().getFreeRoomsCountByComp("matrimoniali")){
				weddingarray=h.getRoomList().getFreeWeddingRooms();
				for(int n=0;n<weddingarray.length;n++){
					System.out.print(weddingarray[n]+", ");
				}
				System.out.println();
				for(int i=0;i<weddingnum;i++){
					System.out.println("-- Questa è la "+(i+1)+"a stanza matrimoniale da assegnare, numero "+weddingarray[i]);
					ExtractRoomByNumber ern=new ExtractRoomByNumber();
					Room room=ern.ExtractRoom(weddingarray[i]);
					if(room !=null){
					room.setFree("no");
					SetRoomNotFree srnf=new SetRoomNotFree(weddingarray[i]);
					g.addRoomAssigned(room);
					}
					else{
						System.out.println("non ho estratto niente,room null");
					}
					
				}
				System.out.println("Stampo tutto il gruppo:dati e anche la lista delle camere assegnate al gruppo:\n"+g.toString()+"\n\n");		
			}	
			
			JDOMWriteAssignment  jdwa =new JDOMWriteAssignment(g,"gruppo1");
			
			//Creo la prenotazione
			PayRooms p=new PayRooms();
			float DiffTotFeeCost=p.PayRooms(g);
			int number=g.getNumber();
			String groupname=g.getName();
			String checkin=g.getCheckin();
			String checkout=g.getCheckout();
			float deposit=g.getDeposit();
			Reservation reservation =new Reservation(number, groupname, checkin, checkout, deposit, DiffTotFeeCost);
			h.getReservationList().getReservReg().add(reservation);
			JDOMAddChild j=new JDOMAddChild(reservation);

	}

}
}
