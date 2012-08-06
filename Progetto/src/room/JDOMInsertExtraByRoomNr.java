package room;

import java.io.File;
import java.io.FileWriter;
import java.util.*; 

import org.jdom.*; 
import org.jdom.input.*; 
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import room.Extra;
import room.ExtraList;
import room.Room;
import room.RoomList;




// TODO: Auto-generated Javadoc
/**
 * The Class JDOMInsertExtraByRoomNr.
 */
public class JDOMInsertExtraByRoomNr {

	/**
	 * Instantiates a new jDOM insert extra by room nr.
	 *
	 * @param number the number
	 * @param date the date
	 * @param cost the cost
	 * @param descr the descr
	 */
	public JDOMInsertExtraByRoomNr(int number,String date,String cost, String descr) {
		
			    try { 
			      //Creo un SAXBuilder e con esco costruisco un document 
			      SAXBuilder builder = new SAXBuilder(); 
			      Document document = builder.build(new File("rooms.xml")); 
			      
			       //Prendo la radice 
			      Element root = document.getRootElement(); 
			      //Estraggo i figli dalla radice 
			      List children = root.getChildren(); 
			      Iterator iterator = children.iterator(); 
			      RoomList rl=new RoomList();
			      
			       //Per ogni figlio 
			      while(iterator.hasNext()){ 
			         //Mostro il valore dell'elemento figlio "DESCR" e degli 
			         //attributi "importanza", "perc_completamento", e "completata" 
			         //sullo standard output 
			         Element item = (Element)iterator.next();
			         //Room r =new Room();
			         
			         if(Integer.parseInt(item.getAttributeValue("number"))==number){
			        	 
			        	 List room2=root.getChildren("ROOM");
			     		for(int i=0;i<(room2.size());i++){
			     		if(Integer.parseInt(((Element) room2.get(i)).getAttributeValue("number"))==number){
			     		Element extra = new Element("EXTRA").setText(descr);
			     	      extra.setAttribute("cost", cost);
			     	      extra.setAttribute("date", date);
			     		 ((Element)room2.get(i)).addContent(extra);
			     		}
			     		}
			    /*
			         List extra = item.getChildren("EXTRA"); 
			         float costo=0;
			         ExtraList el=new ExtraList();
			         for(int i=0;i<(extra.size());i++){
			        	 costo+=Float.parseFloat(((Element) extra.get(i)).getAttributeValue("cost"));
			        	 Extra e = new Extra(Float.parseFloat(((Element) extra.get(i)).getAttributeValue("cost")), ((Element) extra.get(i)).getAttributeValue("date"), ((Element) extra.get(i)).getText());
			        	 System.out.println(e.toString());
			        	 el.addExtra(e);
			        	 System.out.println(el.toString());
			        	 
			         }
			         //System.out.println("Costi totali: "+costo);
			         System.out.println("Room details:");
	
			         Room r =new Room(Integer.parseInt(item.getAttributeValue("number")), Float.parseFloat(item.getAttributeValue("fee")), item.getAttributeValue("free"), item.getAttributeValue("composizione"), item.getAttributeValue("descrizione"));
			         System.out.println(r.toString());
			         rl.addRoom(r);
			         System.out.println(rl.toString());
			         
			         //costo=0;
			         //break;*/
			         }
			         /*else{
			        	 System.out.println("non ho trovato nessun extra relativo alla room numero "+ number);
			         }*/
			      }
			      
			      XMLOutputter xmlOutput = new XMLOutputter();
			      
					// display nice nice
					xmlOutput.setFormat(Format.getPrettyFormat());
					xmlOutput.output(document, new FileWriter("rooms.xml"));
			 
					//Stampo l'output anche sullo standard output 
				      xmlOutput.output(document, System.out); 
			 
					System.out.println("File updated!");

			    }  
			    catch (Exception e) { 
			      System.err.println("Errore durante la lettura dal file"); 
			      e.printStackTrace(); 
			    } 

			}

}
