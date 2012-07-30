package room;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import group.Group;
import hotel.Hotel;

public class RoomView {


private int roomNumber;
private boolean fatto=false;
private int scelta=0;

public RoomView(){
	
}

public RoomView(Hotel h){
	Hotel hotel = new Hotel();
	hotel=h;
	System.out.println(h);
	boolean sbagliato=false;
	boolean noExtra=false;
	String sceltaOpzione="";
	boolean exit=true;
	
	System.out.println("BENVENUTO NELLA SEZIONE DELLE CAMERE E DEI RISPETTIVI EXTRA, SCEGLI UNA OPZIONE TRA LE SEGUENTI,PREMI 0 PER USCIRE: ");
	
	do{
		do{
			sbagliato=false;
			System.out.println("1 - INSERISCO GLI EXTRA IN BASE AL NUMERO DI CAMERA");
			System.out.println("2 - INSERISCO GLI EXTRA IN BASE AL NOME DEL GRUPPO");
			System.out.println("3 - STAMPO GLI EXTRA IN BASE AL NUMERO DI CAMERA");
			System.out.println("4 - STAMPO TUTTI GLI EXTRA DIVISI PER NUMERO DI CAMERA");
			System.out.println("5 - ELIMINO GLI EXTRA IN BASE AL NUMERO DI CAMERA");
			System.out.println("6 - STAMPO I DETTAGLI DELLA STANZA IN BASE LA NUMERO DI STANZA");
			System.out.println("7 - STAMPO TUTTE LE STANZE LIBERE");
			System.out.println("Inserire la scelta digitando l'apposito numero: ");
			try{
				BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
				sceltaOpzione=promptLine.readLine();

				if(!(sceltaOpzione.equals("1")||(sceltaOpzione.equals("2"))||(sceltaOpzione.equals("3"))||(sceltaOpzione.equals("4"))||(sceltaOpzione.equals("5"))||(sceltaOpzione.equals("6"))||(sceltaOpzione.equals("0"))||(sceltaOpzione.equals("7")))){
					sbagliato=true;
					System.out.println("E' stata scelta un'opzione non valida riprova");
				}
			}
			catch(IOException ioe){
				ioe.printStackTrace();
			}
		}while(sbagliato);

		BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
		try {
			sceltaOpzione=promptLine.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			scelta=Integer.parseInt(sceltaOpzione);
			}catch(NumberFormatException nfe){
				System.out.println("Hai inserito un valore errato,riprova");
				nfe.getMessage();
	         	exit=false;	
			}
		
		
		switch(scelta){
		
		case 1:
		{
			System.out.println("INSERISCO GLI EXTRA IN BASE AL NUMERO DI CAMERA:\ndigita il numero di camera\n");
			
			if(h.getGroupList().getGroupReg().isEmpty()||h.getReservationList().getReservReg().isEmpty()){
				System.out.println("Non sono presenti gruppi o prenotazioni");
				sbagliato=true;
			}
			else{
				
			BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
			try {
				sceltaOpzione=prLine.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try{
			roomNumber=Integer.parseInt(sceltaOpzione);
			if(roomNumber==0){
				System.out.println("La stanza deve avere un valore positivo diverso da 0");
				sbagliato=true;
			}
			}catch(NumberFormatException nfe){
				System.out.println("La camera edeve assumere un valore intero");
				nfe.getMessage();
				sbagliato=true;
			}

				for(int i=0;i<h.getRoomList().getRoomReg().size();i++){
					if(roomNumber==h.getRoomList().getRoomReg().get(i).getNumber()){
						AddExtraView a=new AddExtraView();
						Extra e= new Extra();
						e=a.AddExtraView();
						if(e==null){
						System.out.println("Extra non inserito");	
						sbagliato=true;
						}
						else{
						h.getExtraList().getExtraList().add(e);
						JDOMInsertExtraByRoomNr jier =new JDOMInsertExtraByRoomNr(roomNumber, e.getDate(), Float.toString(e.getCost()), e.getType());
						}
					}
				}
				//System.out.println("Hai inserito un numero di camera errato");
				
			}
			
			
			break;
		}
		
		case 2:
		{
			System.out.println("INSERISCO GLI EXTRA IN BASE AL NOME DEL GRUPPO:\ndigita il nome del gruppo\n");
			if(h.getGroupList().getGroupReg().isEmpty()||h.getReservationList().getReservReg().isEmpty()){
				System.out.println("Non sono presenti gruppi o prenotazioni");
				sbagliato=true;
			}
			else{
				
			
			BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
			try {
				sceltaOpzione=prLine.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String groupName=sceltaOpzione;
			if(h.getGroupList().getGroupReg().isEmpty()){
				System.out.println("Non ci sono gruppi memorizzati");
				sbagliato=true;
			}
			for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
				if((h.getGroupList().getGroupReg().get(i).getName()).equalsIgnoreCase(groupName)||!(h.getGroupList().getGroupReg().get(i).getRoomAssigned()).isEmpty()){
					Group group=new Group();
					group=h.getGroupList().getGroupReg().get(i);
					System.out.println(group.getName()+": elenco delle camere assegnate\n"+"numero tot "+group.getRoomAssigned().size()+"dettagli:\n"+group.getRoomAssigned().toString());
					AddExtraView a=new AddExtraView();
					Extra e= new Extra();
					e=a.AddExtraView();
					h.getExtraList().getExtraList().add(e);
					System.out.println("In quale stanza prenotata va inserito l'extra?Digita il nome della stanza a cui addebitare l'extra tra quelle prenotate dal gruppo");
					for(int j=0;j<h.getGroupList().getGroupReg().get(i).getRoomAssigned().size();j++){
						System.out.println(h.getGroupList().getGroupReg().get(i).getRoomAssigned().toString());
					}
					BufferedReader pLine=new BufferedReader(new InputStreamReader(System.in));
					try {
						sceltaOpzione=pLine.readLine();
					} catch (IOException ee) {
						// TODO Auto-generated catch block
						ee.printStackTrace();
					}
					try{
						roomNumber=Integer.parseInt(sceltaOpzione);
						}catch(NumberFormatException nfe){
							System.out.println("La camera deve assumere un valore intero");
							nfe.getMessage();
						}
					
					
					for(int j=0;j<h.getGroupList().getGroupReg().get(i).getRoomAssigned().size();j++){
						if(h.getGroupList().getGroupReg().get(i).getRoomAssigned().get(j).getNumber()==roomNumber){
						JDOMInsertExtraByRoomNr jier =new JDOMInsertExtraByRoomNr(roomNumber, e.getDate(), Float.toString(e.getCost()), e.getType());
						}
					}
					System.out.println("E' stato scritto un numero di stanza non valido");
					
				}
				else{
					System.out.println("E' stato inserito un gruppo non valido,oppure non è stato ancora fatto il checkin");
				}
			}
			}
			
			break;
		}

		case 3:
		{	
			System.out.println("STAMPO GLI EXTRA IN BASE AL NUMERO DI CAMERA: \n");
			if(h.getGroupList().getGroupReg().isEmpty()){
				System.out.println("Non ci sono gruppi memorizzati");
				sbagliato=true;
			}
			if(!(h.getExtraList().isExtraListEmpty())){
				System.out.println("Inserisci il numero di camera: ");
				BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
				try {
					sceltaOpzione=prLine.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try{
					roomNumber=Integer.parseInt(sceltaOpzione);
					}catch(NumberFormatException nfe){
						System.out.println("La camera edeve assumere un valore intero.\tVedi stanza d'esempio room 0:");
						nfe.getMessage();
					}
				for(int i=0;i<h.getRoomList().getRoomReg().size();i++){
					if(roomNumber==h.getRoomList().getRoomReg().get(i).getNumber()){
						JDOMExtractExtrasByRoom e=new JDOMExtractExtrasByRoom(roomNumber);
						fatto=true;
					}
				}
				if(fatto==false){
					System.out.println("Non è stato trovato il numero di stanza inserito");
				}

			}
			else{
				System.out.println("Non sono ancora stati inseriti gli extra");
			}
			
			break;
		}

		case 4:
		{
			System.out.println("STAMPO TUTTI GLI EXTRA CON IL LORO COSTO TOTALE DIVISI PER NUMERO DI CAMERA: \n");
			if(h.getGroupList().getGroupReg().isEmpty()){
				System.out.println("Non ci sono gruppi memorizzati");
				sbagliato=true;
			}
			if(!(h.getExtraList().isExtraListEmpty())){
				JDOMReader jdre=new JDOMReader();
			}
			else{
				System.out.println("Non sono ancora stati inseriti gli extra in alcuna stanza");
			}
			break;
			
		}

		case 5:
		{
			System.out.println("ELIMINO GLI EXTRA IN BASE AL NUMERO DI CAMERA: digita il numero di camera");
			if(h.getGroupList().getGroupReg().isEmpty()){
				System.out.println("Non ci sono gruppi memorizzati");
				sbagliato=true;
			}
			if(!(h.getExtraList().isExtraListEmpty())){
				ExtraList el=new ExtraList();
				BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
				try {
					sceltaOpzione=prLine.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try{
					roomNumber=Integer.parseInt(sceltaOpzione);
					}catch(NumberFormatException nfe){
						System.out.println("La camera edeve assumere un valore intero");
						nfe.getMessage();
					}
				if(roomNumber==0){
					System.out.println("Non esiste la camera 0");
				}
				else{
					
				for(int i=0;i<h.getRoomList().getRoomReg().size();i++){
					if(roomNumber==h.getRoomList().getRoomReg().get(i).getNumber()){
						ExtractExtrasInstByRoom e=new ExtractExtrasInstByRoom();
						el=e.ExtractExtrasInstByRoom(roomNumber);
						cancelExtras(hotel, el);
						room.JDOMRemoveExtraByRoomNr jdree =new room.JDOMRemoveExtraByRoomNr(roomNumber);
					}
				}
				System.out.println("Non ci sono stanze con quel valore");
				}
			}
			else{
				System.out.println("Non sono ancora stati inseriti gli extra");
			}
			break;
		}
		
		case 6:
		{
			System.out.println("STAMPO I DETTAGLI DELLA STANZA IN BASE AL NUMERO DI STANZA");
			System.out.println("Inserisci il numero di camera: ");
			BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
			try {
				sceltaOpzione=prLine.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
				roomNumber=Integer.parseInt(sceltaOpzione);
				}catch(NumberFormatException nfe){
					System.out.println("La camera edeve assumere un valore intero");
					nfe.getMessage();
				}
			for(int i=0;i<h.getRoomList().getRoomReg().size();i++){
				if(roomNumber==h.getRoomList().getRoomReg().get(i).getNumber()){
					System.out.println("Ecco i dettagli della stanza numero "+roomNumber);
					System.out.println(h.getRoomList().getRoomReg().get(i).toString());
					int number=h.getRoomList().getRoomReg().get(i).getNumber();
					String composition=h.getRoomList().getRoomReg().get(i).getComposition();
					float fee=h.getRoomList().getRoomReg().get(i).getFee();
					String free=h.getRoomList().getRoomReg().get(i).getFree();
					String description=h.getRoomList().getRoomReg().get(i).getDescription();
					System.out.println("*Numero:\t"+number);
					System.out.println("*Composizione:\t"+composition);
					System.out.println("*Costo giornaliero:\t"+fee+" euro");
					System.out.println("*Libera:\t"+free);
					System.out.println("*Descrizione:\t"+description);
					fatto=true;
		
				}
			}
			if(fatto==false){
				System.out.println("La stanza inserita non esiste nel registro delle stanze ");
			}
			break;
		}
		
		case 7:
		{
			System.out.println("STAMPO TUTTE LE STANZE LIBERE");
			CheckFreeRooms cfr =new CheckFreeRooms(); 
			break;
		}
		
		case 0:
		{
			exit=true; 
			break;
		}
		
		 default:{
	         	System.out.println("Hai inserito un valore errato,riprova");
	         	exit=true;
	         }
		
	}
	}while(!exit);
		
}

public void cancelExtras(Hotel h, ExtraList el){
	for(int i=0;i<h.getExtraList().getExtraReg().size();i++){
		for(int j=0;j<el.getExtraReg().size();j++){
			if(h.getExtraList().getExtraReg().get(i).equals(el.getExtraReg().get(j))){
				h.getExtraList().getExtraReg().remove(i);
			}
		}
	}
}






}
