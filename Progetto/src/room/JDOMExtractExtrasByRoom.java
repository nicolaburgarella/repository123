package room;

import java.io.*; 
import java.util.*; 

import org.jdom.*; 
import org.jdom.input.*; 

// TODO: Auto-generated Javadoc
/**
 * The controller Class JDOMExtractExtrasByRoom extracts the extras used
 *  by the people who live in the room by selecting these room's numbers.
 */
public class JDOMExtractExtrasByRoom {


	  /** The fatto. */
  	private boolean fatto=false;
	
	/** The ok. */
	private boolean ok=false;
	
/**
 * Instantiates a new jDOM extract extras by room.
 */
public JDOMExtractExtrasByRoom(){
	
}
	
	/**
	 * Extract extras by room number.
	 *
	 * @param number the number
	 */
	public JDOMExtractExtrasByRoom(int number) { 
	    try { 
	      //Creo un SAXBuilder e con esco costruisco un document 
	      SAXBuilder builder = new SAXBuilder(); 
	      Document document = builder.build(new File("rooms.xml")); 
	      float costo=0;
	      
	       //Prendo la radice 
	      Element root = document.getRootElement(); 
	      //Estraggo i figli dalla radice 
	      List children = root.getChildren(); 
	      Iterator iterator = children.iterator(); 
	      
	       //Per ogni figlio 
	      while(iterator.hasNext()){  
	         Element item = (Element)iterator.next();
	         
	         if(Integer.parseInt(item.getAttributeValue("number"))==number){
	    
	         List extra = item.getChildren("EXTRA"); 
	         for(int i=0;i<(extra.size());i++){
	         System.out.print("*" + ((Element) extra.get(i)).getText()+ "\t  ");
	         System.out.print("\t  Costo: " + ((Element) extra.get(i)).getAttributeValue("cost"));
	         System.out.println("\t  Data: " + ((Element) extra.get(i)).getAttributeValue("date"));
	         costo+=Float.parseFloat(((Element) extra.get(i)).getAttributeValue("cost"));
	         ok=true;
	         }
	         if(ok){
	         System.out.println("Costi totali: "+costo);
	         System.out.println("\n\n\nRoom details:");
	         System.out.println("\tNumero: " + item.getAttributeValue("number")); 
	         System.out.println("\tComposizione: " + item.getAttributeValue("composition"));
	         System.out.println("\tDescrizione: " + item.getAttributeValue("description")); 
	         System.out.println("\tCosto: " + item.getAttributeValue("fee") + " giornaliero");
	         System.out.println("\tLibera: " + item.getAttributeValue("free")+"\n");
	         costo=0;
	         fatto=true;
	         }
	         }
	         
	      }
	      if(fatto==false){
	        	 System.out.println("non ho trovato nessun extra relativo alla room numero "+ number);
	         }
	      

	    }  
	    catch (Exception e) { 
	      System.err.println("Errore durante la lettura dal file"); 
	      e.printStackTrace(); 
	    } 

	}
	
	
	/**
	 * JDOM is extract extras by room.
	 *
	 * @param number the number
	 * @return true, if successful
	 */
	public boolean JDOMIsExtractExtrasByRoom(int number) { 
	    try { 
	      //Creo un SAXBuilder e con esco costruisco un document 
	      SAXBuilder builder = new SAXBuilder(); 
	      Document document = builder.build(new File("rooms.xml")); 
	      float costo=0;
	      
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
	         
	         if(Integer.parseInt(item.getAttributeValue("number"))==number){
	    
	         List extra = item.getChildren("EXTRA"); 
	         if(!extra.isEmpty()&&extra.size()>0){
	         fatto=true;
	         }
	         else{
	        	 fatto=false;
	         }
	         }
	         
	      }
	      if(fatto==false){
	        	 System.out.println("non ho trovato nessun extra relativo alla room numero "+ number);
	         }
	      

	    }  
	    catch (Exception e) { 
	      System.err.println("Errore durante la lettura dal file"); 
	      e.printStackTrace(); 
	    }
		return fatto; 

	}
	  
	}

