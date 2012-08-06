package main;

import java.io.File;
import java.util.*; 
import org.jdom.*; 
import org.jdom.input.*; 

import room.Extra;
import room.ExtraList;
import room.Room;
import room.RoomList;




// TODO: Auto-generated Javadoc
/**
 * The controller Class ExtractRoomListFromXML.
 */
public class ExtractRoomListFromXML {

	/**
	 * Instantiates a new extract room list.
	 *
	 */
	public ExtractRoomListFromXML(){
		
	}
	
	/**
	 * Extract room list.
	 *
	 * @return the RoomList object
	 */
	public RoomList ExtractRoomList() {
		RoomList rl=new RoomList();
			    try { 
			      //Creo un SAXBuilder e con esco costruisco un document 
			      SAXBuilder builder = new SAXBuilder(); 
			      Document document = builder.build(new File("rooms.xml")); 
			      
			       //Prendo la radice 
			      Element root = document.getRootElement(); 
			      //Estraggo i figli dalla radice 
			      List children = root.getChildren(); 
			      Iterator iterator = children.iterator(); 
			      
			      while(iterator.hasNext()){ 

			         Element item = (Element)iterator.next();
	
			         Room r =new Room(Integer.parseInt(item.getAttributeValue("number")), Float.parseFloat(item.getAttributeValue("fee")), item.getAttributeValue("free"), item.getAttributeValue("composition"), item.getAttributeValue("description"));
			         rl.addRoom(r);
 
			         }
			      System.out.println("Stanze aggiunte alla roomlist\n"+rl.toString());
			         

			    }  
			    catch (Exception e) { 
			      System.err.println("Errore durante la lettura dal file"); 
			      e.printStackTrace(); 
			    }
				return rl; 

			}

}
