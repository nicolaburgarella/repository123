package room;

import java.io.*; 
import java.util.*; 

import org.jdom.*; 
import org.jdom.input.*; 

public class ExtractExtrasInstByRoom {
	
	public ExtractExtrasInstByRoom(){
		
	}


	  public ExtraList ExtractExtrasInstByRoom(int number) { 
		  if(number==0){
			  System.out.println("Non ci sono stanze con quel numero");
			  return null;
		  }
		  ExtraList el=new ExtraList();
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
	         for(int i=0;i<(extra.size());i++){
	         String type=((Element) extra.get(i)).getText();
	         float cost=Float.parseFloat(((Element) extra.get(i)).getAttributeValue("cost"));
	         String date=((Element) extra.get(i)).getAttributeValue("date");
	         Extra e =new Extra(cost, date, type);
	         el.addExtra(e);
	         }
	         }
	         else{
	        	 System.out.println("non ho trovato nessun extra relativo alla room numero "+ number);
	         }
	      }

	    }  
	    catch (Exception e) { 
	      System.err.println("Errore durante la lettura dal file"); 
	      e.printStackTrace(); 
	    }
		return el; 

	}
	  
	}

