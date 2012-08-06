package reservation;

import org.jdom.*; 
import org.jdom.output.*; 
import java.io.*; 

// TODO: Auto-generated Javadoc
/**
 * The controller Class JDOMWriter.
 */
public class JDOMWriter { 

  /**
   * Initialize the file reservation.xml with no entry
   */
  public JDOMWriter() { 
    try { 
      //Elemento radice 
      Element root = new Element("RESERVATION_LIST"); 
      //Documento 
      Document document = new Document(root); 

      /*
      //Creazione di tre elementi figli denominato ITEM 
      //a ciascuno dei quali vengono settati tre attributi 
      //e viene aggiunto un elemento figlio contenente 
      //la descrizione della cosa da fare 
      Element item1 = new Element("RESERVATION"); 
      item1.setAttribute("number", "1"); 
      item1.setAttribute("groupname", "gruppo1"); 
      item1.setAttribute("checkin", "12/5/2012"); 
      item1.setAttribute("checkout", "20/5/2012"); 
      item1.setAttribute("deposit", "20"); 
      item1.setAttribute("totcost", "600");  
      root.addContent(item1); 

      Element item2 = new Element("RESERVATION"); 
      item2.setAttribute("number", "2"); 
      item2.setAttribute("groupname", "gruppo2"); 
      item2.setAttribute("checkin", "12/5/2012"); 
      item2.setAttribute("checkout", "20/5/2012"); 
      item2.setAttribute("deposit", "20"); 
      item2.setAttribute("totcost", "600");  
      root.addContent(item2); 
      
      Element item3 = new Element("RESERVATION"); 
      item3.setAttribute("number", "3"); 
      item3.setAttribute("groupname", "gruppo3"); 
      item3.setAttribute("checkin", "12/5/2012"); 
      item3.setAttribute("checkout", "20/5/2012"); 
      item3.setAttribute("deposit", "20"); 
      item3.setAttribute("totcost", "600");  
      root.addContent(item3); 
*/
      //Creazione dell'oggetto XMLOutputter 
      XMLOutputter outputter = new XMLOutputter(); 
      //Imposto il formato dell'outputter come "bel formato" 
      outputter.setFormat(Format.getPrettyFormat()); 
      //Produco l'output sul file xml.foo 
      outputter.output(document, new FileOutputStream("reservation.xml")); 
      System.out.println("File creato:"); 
      //Stampo l'output anche sullo standard output 
      outputter.output(document, System.out); 
    }  
    catch (IOException e) { 
      System.err.println("Errore durante il parsing del documento");
      e.printStackTrace(); 
    } 
}
}