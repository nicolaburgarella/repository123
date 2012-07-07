package test;

import hotel.Hotel;

import java.io.File;
import java.util.*; 
import org.jdom.*; 
import org.jdom.input.*; 

import room.Extra;
import room.ExtraList;
import room.Room;
import room.RoomList;




public class LoadExtrasAndRoomsFromXML {

	/**
	 * @param args
	 */
	/*public LoadExtrasAndRoomsFromXML(){
		
	}*/
	
	public Hotel LoadExtrasAndRoomsFromXML() {
		Hotel h=null;
		
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
			      ExtraList el=new ExtraList();
			      
			       //Per ogni figlio 
			      while(iterator.hasNext()){ 
			         //Mostro il valore dell'elemento figlio "DESCR" e degli 
			         //attributi "importanza", "perc_completamento", e "completata" 
			         //sullo standard output 
			         Element item = (Element)iterator.next();
			         //Room r =new Room();
			         
			         //if(Integer.parseInt(item.getAttributeValue("number"))==number){
			    
			         List extra = item.getChildren("EXTRA"); 
			         float costo=0;  
			         for(int i=0;i<(extra.size());i++){
			        	 costo+=Float.parseFloat(((Element) extra.get(i)).getAttributeValue("cost"));
			        	 float cost=Float.parseFloat(((Element) extra.get(i)).getAttributeValue("cost"));
			        	 String date=((Element) extra.get(i)).getAttributeValue("date");
			        	 String type=((Element) extra.get(i)).getText();
			        	 Extra e=new Extra(cost, date, type); 
			        	 System.out.println(e.toString());
			        	 el.addExtra(e);
			        	 System.out.println(el.toString());
			        	 
			         }
			         System.out.println("Costi totali: "+costo);
			         System.out.println("Room details:");
			         int number=Integer.parseInt(item.getAttributeValue("number"));
			         float fee=Float.parseFloat(item.getAttributeValue("fee"));
			         String free=item.getAttributeValue("free");
			         String composition=item.getAttributeValue("composition");
			         String description=item.getAttributeValue("description");
			         Room r = new Room(number, fee, free, composition, description);
			         System.out.println(r.toString());
			         rl.addRoom(r);
			         System.out.println(rl.toString());
			         
			         costo=0;
			         }
			      h=new Hotel(rl, el);
			      System.out.println(h);

			    }  
			    catch (Exception e) { 
			      System.err.println("Errore durante la lettura dal file"); 
			      e.printStackTrace(); 
			    }
				return h; 

			}

}
