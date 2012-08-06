package group;

import java.io.*; 
import java.util.*; 

import org.jdom.*; 
import org.jdom.input.*; 

// TODO: Auto-generated Javadoc
/**
 * The Class JDOMReader.
 */
public class JDOMReader { 

  /**
   * Instantiates a new jDOM reader.
   */
  public JDOMReader() { 
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
    
         List richiesta = item.getChildren("RICHIESTA"); 
         for(int i=0;i<(richiesta.size());i++){
         System.out.print("*" + ((Element) richiesta.get(i)).getText().toUpperCase()+ "\t");
         }
         System.out.println("Group details:");
         System.out.println("\tNumero: " + item.getAttributeValue("number")); 
         System.out.println("\tNome: " + item.getAttributeValue("name"));
         System.out.println("\tData checkin: " + item.getAttributeValue("checkin")); 
         System.out.println("\tData checkout: " + item.getAttributeValue("checkout"));
         System.out.println("\tAcconto: " + item.getAttributeValue("deposit")+"\n");
      }

    }  
    catch (Exception e) { 
      System.err.println("Errore durante la lettura dal file"); 
      e.printStackTrace(); 
    } 

}
  
}