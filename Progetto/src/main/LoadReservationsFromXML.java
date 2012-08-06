package main;

import hotel.Hotel;

import java.io.File;
import java.util.*; 
import org.jdom.*; 
import org.jdom.input.*; 

import reservation.Reservation;
import reservation.ReservationList;



// TODO: Auto-generated Javadoc
/**
 * The Class LoadReservationsFromXML.
 */
public class LoadReservationsFromXML {

	/**
	 * Instantiates a new load reservations from xml.
	 */
	public LoadReservationsFromXML(){
		
	}
	
	/**
	 * Load reservations from xml.
	 *
	 * @return the reservation list
	 */
	public ReservationList LoadReservationsFromXML() {
		ReservationList rl =new ReservationList();
			    try { 
			      //Creo un SAXBuilder e con esco costruisco un document 
			      SAXBuilder builder = new SAXBuilder(); 
			      Document document = builder.build(new File("reservation.xml")); 
			      
			       //Prendo la radice 
			      Element root = document.getRootElement(); 
			      //Estraggo i figli dalla radice 
			      List children = root.getChildren(); 
			      Iterator iterator = children.iterator(); 
			      
			       //Per ogni figlio 
			      while(iterator.hasNext()){ 
			         //Mostro il valore dell'elemento figlio "DESCR" e degli 
			         //attributi "importanza", "perc_completamento", e "completata" 
			         //sullo standard output 
			         Element item = (Element)iterator.next();
			         
			         //if(Integer.parseInt(item.getAttributeValue("number"))==number){
			    
			         System.out.println("Reservation details:");
			         Reservation r =new Reservation(Integer.parseInt(item.getAttributeValue("number")), item.getAttributeValue("groupname"), item.getAttributeValue("checkin"), item.getAttributeValue("checkout"), Float.parseFloat(item.getAttributeValue("deposit")), Float.parseFloat(item.getAttributeValue("totcost")));
			         System.out.println(r.toString());
			         rl.addReservation(r);
			         System.out.println(rl.toString());
			       
			        /* }
			         else{
			        	 System.out.println("non ho trovato nessuna prenotazione relativa numero "+ number);
			         }*/
			      }

			    }  
			    catch (Exception e) { 
			      System.err.println("Errore durante la lettura dal file"); 
			      e.printStackTrace(); 
			    }
				return rl; 

			}

}
