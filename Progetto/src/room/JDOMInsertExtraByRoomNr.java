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
 * The controller Class JDOMInsertExtraByRoomNr.
 */
public class JDOMInsertExtraByRoomNr {

	/**
	 * Inserts extra by room number.
	 *
	 * @param number the room number
	 * @param date the date
	 * @param cost the cost
	 * @param descr the description of the room
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
			         Element item = (Element)iterator.next();
			         
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
			  
			         }
			        
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
