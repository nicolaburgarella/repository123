package reservation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

import main.AssignRooms;

import payment.PayExtraByRoomNr;
import payment.PayRooms;


import group.ExtractGroupByName;
import group.Group;
import group.JDOMRemoveChild;
import hotel.Hotel;

public class ReservationView {


public ReservationView(){
	
}

public ReservationView(Hotel h){
	Hotel hotel = new Hotel();
	hotel=h;
	System.out.println(h);
	boolean sbagliato=false;
	int scelta;
	String sceltaOpzione="";
	boolean exit=false;
	
	System.out.println("BENVENUTO NELLA SEZIONE DELLE PRENOTAZIONI, SCEGLI UNA OPZIONE TRA LE SEGUENTI,PREMI 0 PER USCIRE: ");
	
	//do{
		do{
			sbagliato=false;
			System.out.println("1 - STAMPO TUTTE LE PRENOTAZIONI E I DETTAGLI DEI GRUPPI RELATIVI");
			System.out.println("2 - STAMPO LA PRENOTAZIONE RELATIVA AL GRUPPO CON NOME GRUPPO SELEZIONATO");
			System.out.println("3 - CHECKIN:\tAGGIUNGO UN PRENOTAZIONE");
			System.out.println("4 - CHECKOUT:\tRIMUOVO UNA PRENOTAZIONE IN BASE AL SUO ID");
			System.out.println("5 - CHECKOUT:\tRIMUOVO UNA PRENOTAZIONE IN BASE AL NOME DEL GRUPPO INSERITO");

			System.out.println("Inserire la scelta digitando l'apposito numero: ");
			try{
				BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
				sceltaOpzione=promptLine.readLine();

				if(!(sceltaOpzione.equals("1")||(sceltaOpzione.equals("2"))||(sceltaOpzione.equals("3"))||(sceltaOpzione.equals("4"))||(sceltaOpzione.equals("5"))||(sceltaOpzione.equals("0")))){
					sbagliato=true;
					System.out.println("E' stata scelta un'opzione non valida riprova");
					break;
				}
			}
			catch(IOException ioe){
				ioe.printStackTrace();
			}
		}while(sbagliato);
		scelta=Integer.parseInt(sceltaOpzione);
		BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
		try {
			sceltaOpzione=promptLine.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch(scelta){
		
		case 1:
		{
			System.out.println("STAMPO TUTTE LE PRENOTAZIONI E I DETTAGLI DEI GRUPPI RELATIVI:");
			reservation.JDOMReader jdrr=new reservation.JDOMReader();
			
			break;
		}
		

		case 2:
		{	
			System.out.println("STAMPO LA PRENOTAZIONE RELATIVA AL GRUPPO CON NOME GRUPPO SELEZIONATO: \n");
			if(!(h.getReservationList().isReservationListEmpty())){
				System.out.println("Inserisci il nome del gruppo: ");
				BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
				try {
					sceltaOpzione=prLine.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String groupName=sceltaOpzione;
				System.out.println("metodo1:");
				for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
					if(groupName.equalsIgnoreCase(h.getGroupList().getGroupReg().get(i).getName())){
						JDOMExtractReservation jder =new JDOMExtractReservation(groupName);
					}
				}
				/*System.out.println("metodo2:");
				for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
					if(groupName.equalsIgnoreCase(h.getGroupList().getGroupReg().get(i).getName())){
						for(int j=0;j<h.getReservationList().getReservReg().size();j++){
							if((h.getReservationList().getReservReg().get(j).getGroupName()).equalsIgnoreCase(groupName)){
								System.out.println("Ecco i dettagli della prenotazione relativa al gruppo "+groupName);
								System.out.println(h.getReservationList().getReservReg().get(j).toString());
								int number=h.getReservationList().getReservReg().get(j).getNumber();
								String checkin=h.getReservationList().getReservReg().get(j).getCheckin();
								String checkout=h.getReservationList().getReservReg().get(j).getCheckout();
								float deposit=h.getReservationList().getReservReg().get(j).getDeposit();
								float totcost=h.getReservationList().getReservReg().get(j).getTotcost();
								System.out.println("*Numero:\t"+number);
								System.out.println("*Nome:\t"+groupName);
								System.out.println("*Checkin:\t"+checkin);
								System.out.println("*Checkout:\t"+checkout);
								System.out.println("*Acconto:\t"+deposit);
								System.out.println("*Costo pernottamento totale(non considero acconto già pagato):\t"+totcost);
							}
						}
					}
				}*/

			}
			else{
				System.out.println("Non è ancora stato inserito il gruppo con id selezionato");
			}
			
			break;
		}

		case 3:
		{
			System.out.println("CHECKIN:\tAGGIUNGO UN PRENOTAZIONE:");
			if(!(h.getGroupList().isGroupListEmpty())){
				System.out.println("Inserisci il nome del gruppo: ");
				BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
				try {
					sceltaOpzione=prLine.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String groupName=sceltaOpzione;
				//assegno camere al gruppo e creo la prenotazione(lista di istanze e salvataggio in xml)
				AssignRooms a=new AssignRooms(groupName, h);
			
			}
			else{
				System.out.println("Non è ancora stato inserito il gruppo con id selezionato sa cui associare la prenotazione");
			}
			break;
			
		}

		case 4:
		{
			System.out.println("RIMUOVO UNA PRENOTAZIONE IN BASE AL SUO ID");
			if(!(h.getReservationList().isReservationListEmpty())){
				System.out.println("Inserisci il numero di prenotazione da eliminare: ");
				BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
				try {
					sceltaOpzione=prLine.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int number=Integer.parseInt(sceltaOpzione);
				
				Reservation res=new Reservation();
				System.out.println(h.getReservationList().getReservReg().toString());
				for(int i=0;i<h.getReservationList().getReservReg().size();i++){
					if((h.getReservationList().getReservReg().get(i).getNumber())==number){
						res=h.getReservationList().getReservReg().get(i);
						System.out.println("Ecco la prenotazione da eliminare\n"+res.toString());
						
						//gestione del pagamento checkout,da estrarre in base al numero del gruppo,da fare con istanze
						System.out.println("Gestione del pagamento del fee e degli extra relativi al gruppo,a seguito del quale elimino il gruppo con la sua prenotazione.");
						Group g =new Group();
						
						for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
							if(h.getGroupList().getGroupReg().get(i).getNumber()==number){
								PayRooms p=new PayRooms();
								float DiffTotFeeCost=p.PayRooms(g);
								PayExtraByRoomNr pe=new PayExtraByRoomNr(g);
							}
						}
						
						
						//elimino la prenotazione
						h.getReservationList().getReservReg().remove(i);
						JDOMRemoveChild2 jg = new JDOMRemoveChild2(number);
						System.out.println("Elimino il gruppo numero "+ number);
						for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
							if((h.getGroupList().getGroupReg().get(j).getNumber())==number){
								h.getGroupList().getGroupReg().remove(j);
								JDOMRemoveChild gr =new JDOMRemoveChild(number);
								System.out.println("Gruppo eliminato assieme alla sua prenotazione");
							}
						}
					}
					else{
						System.out.println("Non trovo la prenotazione numero "+number);
					}
				}
				
				
				
			}
			else{
				System.out.println("Non è ancora stata inserita alcuna prenotazione");
			}
			break;
		}
	
		case 5:
		{
			System.out.println("RIMUOVO UNA PRENOTAZIONE IN BASE AL NOME DEL GRUPPO INSERITO");
			if(!(h.getReservationList().isReservationListEmpty())){
				System.out.println("Inserisci il nome del gruppo per eliminare la sua prenotazione e il gruppo stesso: ");
				BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
				try {
					sceltaOpzione=prLine.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String groupName=sceltaOpzione;
				
				Reservation res=new Reservation();
				System.out.println(h.getReservationList().getReservReg().toString());
				for(int i=0;i<h.getReservationList().getReservReg().size();i++){
					if((h.getReservationList().getReservReg().get(i).getGroupName()).equalsIgnoreCase(groupName)){
						res=h.getReservationList().getReservReg().get(i);
						System.out.println("Ecco la prenotazione da eliminare\n"+res.toString());
						
						//gestione del pagamento checkout,da estrarre in base al nome del gruppo,da fare con istanze
						System.out.println("Gestione del pagamento del fee e degli extra relativi al gruppo,a seguito del quale elimino il gruppo con la sua prenotazione.");
						Group g =new Group();
						
						for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
							if((h.getGroupList().getGroupReg().get(i).getName()).equalsIgnoreCase(groupName)){
								PayRooms p=new PayRooms();
								float DiffTotFeeCost=p.PayRooms(g);
								PayExtraByRoomNr pe=new PayExtraByRoomNr(g);
							}
						}


						
	
						//elimino la prenotazione
						h.getReservationList().getReservReg().remove(i);
						JDOMRemoveChild2 jg = new JDOMRemoveChild2(groupName);
						System.out.println("Elimino il gruppo"+ groupName);
						for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
							if((h.getGroupList().getGroupReg().get(j).getName()).equalsIgnoreCase(groupName)){
								h.getGroupList().getGroupReg().remove(j);
								JDOMRemoveChild gr =new JDOMRemoveChild(groupName);
								System.out.println("Gruppo eliminato assieme alla sua prenotazione");
							}
						}
						
					}
					else{
						System.out.println("Non trovo la prenotazione avente nome gruppo "+groupName);
					}
				}
				
				
			}
			else{
				System.out.println("Non è ancora stata inserita alcuna prenotazione");
			}
			break;
		}
		
		case 0:
		{
			exit=true; 
			break;
		}
		
	}
	//}while(!exit);
		
}

/*public void cancelRequest(Hotel h, Request r){
	for(int i=0;i<h.getRequestList().getRequestReg().size();i++){
			if(h.getRequestList().getRequestReg().get(i).equals(r)){
				h.getRequestList().getRequestReg().remove(i);
			}
		}
	}*/

}


