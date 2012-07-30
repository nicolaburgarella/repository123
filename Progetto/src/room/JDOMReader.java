package room;

import java.io.*; 
import java.util.*; 

import org.jdom.*; 
import org.jdom.input.*; 

public class JDOMReader { 
	

  private boolean ok=false;
private float costo=0;

public JDOMReader() { 
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
    
         List extra = item.getChildren("EXTRA"); 
         for(int i=0;i<(extra.size());i++){
        costo+=Float.parseFloat(((Element) extra.get(i)).getAttributeValue("cost"));
        	if(costo!=0){
        		System.out.print("*" + ((Element) extra.get(i)).getText()+ "\t");
        		System.out.print("\tCosto: " + ((Element) extra.get(i)).getAttributeValue("cost"));
        		System.out.println("\tData: " + ((Element) extra.get(i)).getAttributeValue("date"));
        		ok=true;
        	}
         }
         
         if(ok){
         System.out.println("Costi totali: "+costo);
         System.out.println("Room details:");
         System.out.println("\tNumero: " + item.getAttributeValue("number")); 
         System.out.println("\tComposizione: " + item.getAttributeValue("composition"));
         System.out.println("\tDescrizione: " + item.getAttributeValue("description")); 
         System.out.println("\tCosto: " + item.getAttributeValue("fee") + " giornaliero");
         System.out.println("\tLibera: " + item.getAttributeValue("free")+"\n");
         costo=0;
         }
         if(!ok){
        	 System.out.println("dgsdffdg nada");
         }
      }

    }  
    catch (Exception e) { 
      System.err.println("Errore durante la lettura dal file"); 
      e.printStackTrace(); 
    } 

}
  
  
}