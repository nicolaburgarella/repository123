package room;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class ExtractRoomByNumber {
	
	public ExtractRoomByNumber(){
		
	}
	
	public Room ExtractRoom(int number) { 
		  //Room r =null;
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
	         //Mostro il valore dell'elemento figlio "DESCR" e degli 
	         //attributi "importanza", "perc_completamento", e "completata" 
	         //sullo standard output 
	         Element item = (Element)iterator.next();
	         
	         if(Integer.parseInt((item.getAttributeValue("number")))==number){
	        	 number=Integer.parseInt(item.getAttributeValue("number"));
	        	 float fee=Float.parseFloat(item.getAttributeValue("fee"));
	        	 String free= item.getAttributeValue("free");
	        	 String composition=item.getAttributeValue("composition");
	        	 String description=item.getAttributeValue("description");
	        	 Room r=new Room(number, fee, free, composition, description);
	             System.out.println(r);
	             return r;
	         }
	         /*else{
	        	 System.out.println("non ho trovato nessuna stanza identificata con il numero "+ number);
	         }*/
	      }

	    }  
	    catch (Exception e) { 
	      System.err.println("Errore durante la lettura dal file"); 
	      e.printStackTrace(); 
	    }
		return null;

	}
	
		  public ExtractRoomByNumber(int number) {
		/*String XmlFile = "<Company>" 
		  + "<Employee name=\"satya\" age=\"25\"/> "
		    + "<Employee  name=\"bharat\" age=\"24\"/>" 
		   + "</Company>";*/
			  SAXBuilder builder = new SAXBuilder(); 
		      Document document = null;
			try {
				document = builder.build(new File("rooms.xml"));
			} catch (JDOMException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 

		    try {
		    	 //Prendo la radice 
		        Element root = document.getRootElement(); 
		        //Estraggo i figli dalla radice 
		        List children = root.getChildren("ROOM"); 
		        for(int i=0;i<(children.size());i++){
		        	if(Integer.parseInt(((Element)children.get(i)).getAttributeValue("number"))==number){
		        		System.out.println("Room details:");
		                System.out.println("\tNumero: " + ((Element)children.get(i)).getAttributeValue("number")); 
		                System.out.println("\tCosto: " + ((Element)children.get(i)).getAttributeValue("fee"));
		                System.out.println("\tLibera: " + ((Element)children.get(i)).getAttributeValue("free")); 
		                System.out.println("\tDescrizione: " + ((Element)children.get(i)).getAttributeValue("description"));
		                System.out.println("\tComposizione: " + ((Element)children.get(i)).getAttributeValue("composition")+"\n");
		        	}
		        	/*else{
		       			System.out.println("Gruppo da estrarre non trovato");
		       		}*/
		        	
		        }
		           
				
				//Creazione dell'oggetto XMLOutputter 
			      XMLOutputter outputter = new XMLOutputter(); 
			      //Imposto il formato dell'outputter come "bel formato" 
			      outputter.setFormat(Format.getPrettyFormat()); 
			      //Produco l'output sul file xml.foo 
			      //outputter.output(document, new FileOutputStream("groups.xml")); 
			      //System.out.println("File creato:"); 
			      //Stampo l'output anche sullo standard output 
			      outputter.output(document, System.out); 
		      
		   
		    } catch (Exception e) {
		      System.out.println(e);
		    }
		  }
	  
	
		  

}
