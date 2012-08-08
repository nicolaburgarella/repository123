package reservation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;

import main.AssignRooms;

import payment.PayExtraByRoomNr;
import payment.PayRooms;
import room.Room;


import group.ExtractGroupByName;
import group.Group;
import group.JDOMExtractRoomAssigned;
import group.JDOMRemoveChild;
import hotel.Hotel;

// TODO: Auto-generated Javadoc
/**
 * The view Class ReservationView.
 */
public class ReservationView {


/** The reservation ID. */
private int number;

/** The trovato. */
private boolean trovato=false;

/** The scelta. */
private int scelta=0;

/**
 * Instantiates a new reservation view.
 */
public ReservationView(){
       
}

/**
 * Instantiates a new reservation view.
 *
 * @param h the Hotel instance h
 */
public ReservationView(Hotel h){
        Hotel hotel = new Hotel();
        hotel=h;
        System.out.println(h);
        boolean sbagliato=false;
        String sceltaOpzione="";
        boolean continua=true;
        Group g =new Group();
        String sceltaN="";
       
        System.out.println("BENVENUTO NELLA SEZIONE DELLE PRENOTAZIONI, SCEGLI UNA OPZIONE TRA LE SEGUENTI,PREMI 0 PER USCIRE: ");
       
        while(continua){
                do{
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
                                }
                                
                                try{
                        			scelta=Integer.parseInt(sceltaOpzione);
                        			}catch(NumberFormatException nfe){
                        				System.out.print("La scelta deve essere un numero intero");
                        				nfe.getMessage();
                        				sbagliato=true;
                        			}
                                
                        }
                        catch(IOException ioe){
                                ioe.printStackTrace();
                        }
                }while(sbagliato);
                
        			            
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
                        if(h.getGroupList().getGroupReg().isEmpty()){
                        	System.out.println("Non ci sono gruppi memorizzati");
                        	sbagliato=true;
                        }
                        if(!(h.getReservationList().isReservationListEmpty())){
                                System.out.println("Inserisci il nome del gruppo: ");
                                BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
                                try {
                                        sceltaN=prLine.readLine();
                                } catch (IOException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                        sbagliato=true;
                                }
                                String groupName=sceltaN;
                                for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
                                        if(groupName.equalsIgnoreCase(h.getGroupList().getGroupReg().get(i).getName())){
                                                JDOMExtractReservation jder =new JDOMExtractReservation(groupName);
                                        }
                                }

                        }
                        else{
                                System.out.println("Non ci sono prenotazioni memorizzate");
                                sbagliato=true;
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
                                        sceltaN=prLine.readLine();
                                } catch (IOException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                }
                                String groupName=sceltaN;
                                //assegno camere al gruppo e creo la prenotazione(lista di istanze e salvataggio in xml)
                                if(groupName==null||groupName==""||h==null){
                                	System.out.println("Non posso assegnare stanze per valori nulli di input");
                                	sbagliato=true;
                                }
                                for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
                                	if(h.getGroupList().getGroupReg().get(j).getName().equals(groupName)){
                                		trovato=true;
                                		System.out.println("Il nome del gruppo inserito � valido ed stato riconosciuto tra quelli inseriti");
                                		for(int n=0;n<h.getReservationList().getReservReg().size();n++){
                                			if(h.getReservationList().getReservReg().get(n).getGroupName().equalsIgnoreCase((groupName))){
                                				System.out.println("Esiste gi� una prenotazione con quel nome gruppo,non posso procedere nel checkin");
                                				sbagliato=true;
                                			}
                                		}
                                		if(sbagliato==false){
                                		AssignRooms a=new AssignRooms(groupName, h);
                                		}
                                		
                                	}
                                }
                                
                       
                        }
                        else{
                                System.out.println("Non � stato inserito alcun gruppo, non posso procedere nel checkin");
                                sbagliato=true;
                        }
                        break;
                       
                }

                case 4:
                {
                        System.out.println("RIMUOVO UNA PRENOTAZIONE IN BASE AL SUO ID");
                        if(h.getGroupList().getGroupReg().isEmpty()){
                        	System.out.println("Non ci sono gruppi memorizzati");
                        	sbagliato=true;
                        }
                        if(!(h.getReservationList().isReservationListEmpty())){
                                System.out.println("Inserisci il numero di prenotazione da eliminare: ");
                                BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
                                try {
                                        sceltaN=prLine.readLine();
                                } catch (IOException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                }
                                try{
                                number=Integer.parseInt(sceltaN);
                                if(number==0){
                                	System.out.println("il numero di prenotazione non pu� essere nullo,ma intero positivo");
                                	sbagliato=true;
                                }
                                }catch(NumberFormatException nfe){
                                	System.out.println("Il numero di prenotazione deve essere intero positivo");
                                	sbagliato=true;
                                }
                               
                                Reservation res=new Reservation();
                                //System.out.println(h.getReservationList().getReservReg().toString());
                                
                                for(int i=0;i<h.getReservationList().getReservReg().size();i++){
                                	for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
                                	if(h.getReservationList().getReservReg().get(i).getGroupName().equals(h.getGroupList().getGroupReg().get(j).getName())){
                                		System.out.println("Esiste gi� una prenotazio per quel gruppo,errore!");
                                		sbagliato=true;
                                	}
                                	}
                                	
                                	
                                        if((h.getReservationList().getReservReg().get(i).getNumber())==number){
                                        	trovato=true;
                                                res=h.getReservationList().getReservReg().get(i);
                                                System.out.println("Ecco la prenotazione da eliminare\n"+res.toString());
                                               
                                                //gestione del pagamento checkout,da estrarre in base al numero del gruppo,da fare con istanze
                                                System.out.println("Gestione del pagamento del fee e degli extra relativi al gruppo,a seguito del quale elimino il gruppo con la sua prenotazione.");
                                                
                                               
                                                for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
                                                        if(h.getGroupList().getGroupReg().get(i).getNumber()==number){
                                                        	g=h.getGroupList().getGroupReg().get(i);
                                                        	String name=g.getName();
                                                        	ArrayList<Room>r =new ArrayList<Room>();
                                                        	JDOMExtractRoomAssigned dj=new JDOMExtractRoomAssigned();
                                                        	r=dj.JDOMExtractRoomAssigned(h,g.getNumber());
                                                        	g.setRoomAssigned(r);
                                                        	System.out.println("Stanze assegnate al gruppo ricaricate nella istanza:\n"+g.getRoomAssigned().toString());
                                                        
                                                        	System.out.println("Stanze assegnate al gruppo ricaricate nella istanza:\n"+g.getRoomAssigned().toString());

                                                        	
                                                        	System.out.println("Ecco il gruppo a cui la prenotazione si riferisce: "+g.toString());
                                                                PayRooms p=new PayRooms();
                                                                float DiffTotFeeCost=p.PayRooms(g);
                                                                if(DiffTotFeeCost==999999999){
                                                    				System.out.println("checkout non eseguito, perch� non ci sono stanze assegnate al gruppo");
                                                    				sbagliato=true;
                                                    			}
                                                                if(DiffTotFeeCost==999999990){
                                                					System.out.println("Prenotazione non eseguita, perch� � stato passato come parametro un gruppo nullo");
                                                					sbagliato=true;
                                                			}
                                                			if(DiffTotFeeCost==999999909){
                                                				System.out.println("Prenotazione non eseguita, perch� sono state inserite date con valori nulli o errati");
                                                				sbagliato=true;
                                                			}
                                                                else{
                                                                PayExtraByRoomNr pe=new PayExtraByRoomNr(g);
                                                                }
                                                        }
                                                }
                                               
                                               
                                                //elimino la prenotazione
                                                h.getReservationList().getReservReg().remove(i);
                                                JDOMRemoveChild2 jg = new JDOMRemoveChild2(number);
                                                System.out.println("Elimino il gruppo associato alla prenotazione, numero "+ number);
                                                for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
                                                        if((h.getGroupList().getGroupReg().get(j).getNumber())==number){
                                                                h.getGroupList().getGroupReg().remove(j);
                                                                JDOMRemoveChild gr =new JDOMRemoveChild(number);
                                                                System.out.println("Gruppo eliminato assieme alla sua prenotazione");
                                                        }
                                                }
                                        }
                                        else{
                                                System.out.println("Il numero di prenotazione inserito non � stato trovato tra le prenotazioni memorizzate");
                                                sbagliato=true;
                                        }
                                }
                                if(trovato==false){
                                	System.out.println("L'id della prenotazione inserito non � stato trovato");
                                	break;
                                }
      
                        }
                        else{
                                System.out.println("Non � ancora stata inserita alcuna prenotazione");
                        }
                        break;
                }
       
                case 5:
                {
                        System.out.println("RIMUOVO UNA PRENOTAZIONE IN BASE AL NOME DEL GRUPPO INSERITO");
                        if(h.getGroupList().getGroupReg().isEmpty()){
                        	System.out.println("Non ci sono gruppi memorizzati");
                        	sbagliato=true;
                        }
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
                                //System.out.println(h.getReservationList().getReservReg().toString());
                                for(int i=0;i<h.getReservationList().getReservReg().size();i++){
                                        if((h.getReservationList().getReservReg().get(i).getGroupName()).equalsIgnoreCase(groupName)){
                                        	//trovato=true;
                                                res=h.getReservationList().getReservReg().get(i);
                                                System.out.println("Ecco la prenotazione da eliminare\n"+res.toString());
                                               
                                                //gestione del pagamento checkout,da estrarre in base al nome del gruppo,da fare con istanze
                                                System.out.println("Gestione del pagamento del fee e degli extra relativi al gruppo,a seguito del quale elimino il gruppo con la sua prenotazione.");
                                               
                                               
                                                for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
                                                        if((h.getGroupList().getGroupReg().get(i).getName()).equalsIgnoreCase(groupName)){
                                                        	trovato=true;
                                                        	ArrayList<Room>r =new ArrayList<Room>();
                                                        	//r=h.getGroupList().getRoomAssignedFromMap(name);
                                                        	JDOMExtractRoomAssigned dj=new JDOMExtractRoomAssigned();
                                                        	r=dj.JDOMExtractRoomAssigned(h,g.getNumber());
                                                        	g.setRoomAssigned(r);
                                                        	System.out.println("Stanze assegnate al gruppo ricaricate nella istanza:\n"+g.getRoomAssigned().toString());
                                                        
                                                        	
                                                        	System.out.println("Ecco il gruppo a cui la prenotazione si riferisce:\n"+g.toString());
                                                                PayRooms p=new PayRooms();
                                                                float DiffTotFeeCost=p.PayRooms(g);
                                                                if(DiffTotFeeCost==999999999){
                                                    				System.out.println("checkout non eseguito, perch� non ci sono stanze assegnate al gruppo");
                                                    			}
                                                                if(DiffTotFeeCost==999999990){
                                                					System.out.println("Prenotazione non eseguita, perch� � stato passato come parametro un gruppo nullo");
                                                			}
                                                			if(DiffTotFeeCost==999999909){
                                                				System.out.println("Prenotazione non eseguita, perch� sono state inserite date con valori nulli o errati");
                                                			}
                                                                else{
                                                                PayExtraByRoomNr pe=new PayExtraByRoomNr(g);
                                                                }
                                                        }
                                                }
                                                if(trovato==false){
                                                	System.out.println("Il nome del gruppo inserito non � stato trovato");
                                                	break;
                                                }

                                                //elimino la prenotazione
                                                h.getReservationList().getReservReg().remove(i);
                                                JDOMRemoveChild2 jg = new JDOMRemoveChild2(groupName);
                                                System.out.println("Elimino il gruppo associato alla prenotazione, nome"+ groupName);
                                                for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
                                                        if((h.getGroupList().getGroupReg().get(j).getName()).equalsIgnoreCase(groupName)){
                                                                h.getGroupList().getGroupReg().remove(j);
                                                                JDOMRemoveChild gr =new JDOMRemoveChild(groupName);
                                                                System.out.println("Gruppo eliminato assieme alla sua prenotazione");
                                                        }
                                                }
                                               
                                        }
                                        else{
                                            System.out.println("Il nome gruppo inserito non � associato ad alcuna prenotazione memorizzata");
                                            sbagliato=true;
                                        }
                                }
                               
                               
                        }
                        else{
                                System.out.println("Non � ancora stata inserita alcuna prenotazione");
                                sbagliato=true;
                        }
                        break;
                }
               
                case 0:
        		{
        			
        				System.out.println("Vado al menu iniziale");
        				sbagliato=false;
        				continua=false;
        			
        			break;
        		}
        	}
        }
               
}


}
