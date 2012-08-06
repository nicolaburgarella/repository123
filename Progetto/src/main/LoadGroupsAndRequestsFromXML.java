package main;

import group.Group;
import group.GroupList;
import group.Request;
import group.RequestList;
import hotel.Hotel;

import java.io.File;
import java.util.*; 

import org.jdom.*; 
import org.jdom.input.*; 



// TODO: Auto-generated Javadoc
/**
 * The Class LoadGroupsAndRequestsFromXML.
 */
public class LoadGroupsAndRequestsFromXML {

	/**
	 * Instantiates a new load groups and requests from xml.
	 *
	 */
	public LoadGroupsAndRequestsFromXML(){
		
	}
	
	/**
	 * Load groups and requests from xml.
	 *
	 * @return the hotel
	 */
	public Hotel LoadGroupsAndRequestsFromXML() {
		Hotel h=null;
		
		int count=0;
		
			    try { 
			      //Creo un SAXBuilder e con esco costruisco un document 
			      SAXBuilder builder = new SAXBuilder(); 
			      Document document = builder.build(new File("groups.xml")); 
			      
			       //Prendo la radice 
			      Element root = document.getRootElement(); 
			      //Estraggo i figli dalla radice 
			      List children = root.getChildren(); 
			      Iterator iterator = children.iterator(); 
			      GroupList gl=new GroupList();
			      RequestList rel=new RequestList();
			      
			       //Per ogni figlio 
			      while(iterator.hasNext()){ 
			        Element item = (Element)iterator.next();
			         
			        
			             List richiesta = item.getChildren("RICHIESTA"); 
			             
			            
			             for(int i=0;i<(richiesta.size());i++){
			            	 
			             if(((Element) richiesta.get(i)).getText().toUpperCase().equalsIgnoreCase("non eseguita")){
			            	 count++; 			
			             }
			             
			             int singole=Integer.parseInt(((Element) richiesta.get(i)).getAttributeValue("singole"));
			             int doppie=Integer.parseInt(((Element) richiesta.get(i)).getAttributeValue("doppie"));
			             int matrimoniali=Integer.parseInt(((Element) richiesta.get(i)).getAttributeValue("matrimoniali"));
			             
			             
			             String flag=((Element) richiesta.get(i)).getText();
			             Request r=new Request(singole, doppie, matrimoniali, flag);
					     
			             System.out.println(r.toString());
			        	 rel.addRequest(r);
			        	 System.out.println(rel.toString());
			             }
			             System.out.println("Group details:");
			             
			             int number=Integer.parseInt(item.getAttributeValue("number"));
			             String name=item.getAttributeValue("name");
			             String checkin=item.getAttributeValue("checkin");
			             String checkout=item.getAttributeValue("checkout");
			             float deposit=Float.parseFloat(item.getAttributeValue("deposit"));  
			             Group g=new Group(number, name, checkin, checkout, deposit);
			              System.out.println(g.toString());
			        	 gl.addGroup(g);
			        	 System.out.println(gl.toString());
			         
			      
			      }
			      
			      System.out.println("Ci sono "+count+" richieste non eseguite");
			      h=new Hotel(rel, gl);
			         

			    }  
			    catch (Exception e) { 
			      System.err.println("Errore durante la lettura dal file"); 
			      e.printStackTrace(); 
			    }
				return h; 

			}

}
