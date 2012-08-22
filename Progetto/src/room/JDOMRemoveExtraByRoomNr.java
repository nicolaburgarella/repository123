package room;

import java.io.File;
import java.io.FileWriter;
import java.util.*; 

import javax.swing.JOptionPane;

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
 * The controller Class JDOMRemoveExtraByRoomNr removes the extra from the xml data structure
 *  by selecting the room number which the extra is referred to.
 */
public class JDOMRemoveExtraByRoomNr {

	private boolean trovato=false;

	/**
	 * Removes extra by room number.
	 *
	 * @param roomId the room id
	 */
	public JDOMRemoveExtraByRoomNr(int roomId) {
		
		try { 
		      //Creo un SAXBuilder e con esco costruisco un document 
		      SAXBuilder builder = new SAXBuilder(); 
		      Document document = builder.build(new File("rooms.xml")); 
		      
		       //Prendo la radice 
		      Element root = document.getRootElement(); 
		      //Estraggo i figli dalla radice 
		      List children = root.getChildren(); 
		      Iterator iterator = children.iterator(); 
		      
		      
		       //Per ogni figlio 
		      while(iterator.hasNext()){  
		         Element item = (Element)iterator.next();
		         
		         if(Integer.parseInt(item.getAttributeValue("number"))==roomId){
		    
		         List extraTag = item.getChildren("EXTRA"); 
		         for(int i=0;i<(extraTag.size());i++){
		         extraTag.clear();
		         trovato=true;
		         }
		         }
		      }
		      if(trovato==false){
		        	 System.out.println("non ho eliminato nessun extra relativo alla camera "+ roomId);
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
