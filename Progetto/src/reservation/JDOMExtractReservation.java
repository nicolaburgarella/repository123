package reservation;

import group.JDOMExtractGroup;

import java.io.*; 
import java.util.*; 

import org.jdom.*; 
import org.jdom.input.*; 

// TODO: Auto-generated Javadoc
/**
 * The Class JDOMExtractReservation.
 */
public class JDOMExtractReservation { 

  /**
   * Instantiates a new jDOM extract reservation.
   *
   * @param name the name
   */
  public JDOMExtractReservation(String name) { 
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
         
         if(item.getAttributeValue("groupname").equalsIgnoreCase(name)){
    
         System.out.println("Reservation details:");
         System.out.println("\tNumero: " + item.getAttributeValue("number")); 
         System.out.println("\tNome del gruppo: " + item.getAttributeValue("groupname"));
         System.out.println("\tData checkin: " + item.getAttributeValue("checkin")); 
         System.out.println("\tData checkout: " + item.getAttributeValue("checkout"));
         System.out.println("\tAcconto: " + item.getAttributeValue("deposit"));
         System.out.println("\tCosto totale: " + item.getAttributeValue("totcost")+"\n");
         //System.out.println("Dettagli del gruppo "+item.getAttributeValue("groupname"));
         //JDOMExtractGroup jdeg =new JDOMExtractGroup(item.getAttributeValue("groupname"));
         System.out.println();
         }
      }

    }  
    catch (Exception e) { 
      System.err.println("Errore durante la lettura dal file"); 
      e.printStackTrace(); 
    } 

}
  
}