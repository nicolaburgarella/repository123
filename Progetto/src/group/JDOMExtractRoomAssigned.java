package group;

import hotel.Hotel;
import java.io.*; 
import java.util.*; 

import main.LoadFromXml;
import org.jdom.*; 
import org.jdom.input.*; 

import room.Room;
import room.RoomList;


public class JDOMExtractRoomAssigned {
	
	private static String roomsAssignedMsg="";
	private static boolean trovato=false;
	static String[] newArray=null;
	static ArrayList<Room> roomAssigned=new ArrayList<Room>();


	public JDOMExtractRoomAssigned(){
		
	}


	  public ArrayList<Room> JDOMExtractRoomAssigned(Hotel hotel,int groupId) {
		  
			Hotel h =new Hotel();
			h=hotel;
		  
		  final String DELIMITER = " ";
		  String[] array = null;
		  roomAssigned.clear();
		  
		  
		  
		  
		  if(groupId==0){
			  System.out.println("Non ci gruppi con id uguale a zero");
			  return null;
		  }
	    try { 
	      //Creo un SAXBuilder e con esco costruisco un document 
	      SAXBuilder builder = new SAXBuilder(); 
	      Document document = builder.build(new File("groups.xml")); 
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
	         
	         if(Integer.parseInt(item.getAttributeValue("number"))==groupId){
	    
	         List assignTag = item.getChildren("ASSIGN"); 
	         for(int i=0;i<(assignTag.size());i++){
	         String assegnate=((Element) assignTag.get(i)).getText();
	         roomsAssignedMsg=((Element) assignTag.get(i)).getAttributeValue("rooms");
	         trovato=true;
	         }
	         }
	      }
	      if(trovato==false){
	        	 System.out.println("non ho trovato nessuna stanza assegnata relativa al gruppo "+ groupId);
	        	 return null;
	      }

	    }  
	    catch (Exception e) { 
	      System.err.println("Errore durante la lettura dal file"); 
	      e.printStackTrace(); 
	    }
	    
	    
	    String string=roomsAssignedMsg;
	    for (String value : string.split(DELIMITER)) { 
		      System.out.println(value);
		      array = string.split(DELIMITER);    
		  }
	    
	    
	    ArrayList<String> list = new ArrayList<String>();
	    for (String s : array) {
	    if (s != null) list.add(s);
	    }
	    newArray = new String[list.size()];
	    list.toArray(newArray); 

		//return newArray;
		//
	
		
	
		boolean trovataCorr=false;
		
		for(int i=0;i<h.getRoomList().getRoomReg().size();i++){
			for(int j=0;j<newArray.length;j++){
			if(newArray[j].equals(Integer.toString(h.getRoomList().getRoomReg().get(i).getNumber()))){
				System.out.println("Trovata corrispondenza tra istanza della stanza e numero di stanza estrapolato dall'xml");
				System.out.println(h.getRoomList().getRoomReg().get(i).toString());
				
				roomAssigned.add(h.getRoomList().getRoomReg().get(i));
				
				trovataCorr=true;
			}
			}
		}
		
		//System.out.println("stampo camere assegnate totali: "+roomAssigned.toString());
		
		if(trovataCorr==false){
			System.out.println("Non ho trovato la corrispondenza tra l'istanza della stanza e il numero estrapolato dall'xml");
		}

			
		return roomAssigned;

	}
	  
	  /*
	  public static void main(String[] args) {
		  
		  Hotel h=new Hotel();
		  LoadFromXml l=new LoadFromXml();
		  h=l.LoadFromXml();
		  System.out.println("-----------------------------------------------------------------------------------------");
		  
		  ArrayList<Room> prova=new ArrayList<Room>();
		  prova.clear();
		 
  
		  //for(int i=1;i<2;i++){
		  int i=1;
				System.out.println("Gruppo "+i+"esimo:");
			System.out.println("\nEcco i singoli valori estratti delle stanze assegnate:");
				prova=JDOMExtractRoomAssigned(h,i);
				System.out.println("Ecco l'arraylist del groupid inserito:\n"+prova);
		//	}
		  
	  }*/
	  
	  
	  
	  
	  }
	  
	  
