package group;

import org.jdom.*; 
import org.jdom.output.*; 
import java.io.*; 

// TODO: Auto-generated Javadoc
/**
 * The Class JDOMWriter.
 */
public class JDOMWriter { 

  /**
   * Instantiates a new jDOM writer.
   */
  public JDOMWriter() { 
    try { 
      //Elemento radice 
      Element root = new Element("GROUP_LIST"); 
      //Documento 
      Document document = new Document(root); 
/*
      //Creazione di tre elementi figli denominato ITEM 
      //a ciascuno dei quali vengono settati tre attributi 
      //e viene aggiunto un elemento figlio contenente 
      //la descrizione della cosa da fare 
      Element item1 = new Element("GROUP"); 
      item1.setAttribute("number", "1"); 
      item1.setAttribute("name", "gruppo1"); 
      item1.setAttribute("checkin", "12/5/2012"); 
      item1.setAttribute("checkout", "20/5/2012"); 
      item1.setAttribute("deposit", "20"); 
      Element descr1 = new Element("RICHIESTA");
      descr1.setAttribute("singole", "2");
      descr1.setAttribute("matrimoniali", "1");
      descr1.setAttribute("doppie", "1"); 
      descr1.setText("non eseguita");
      item1.addContent(descr1);  
      root.addContent(item1); 

      Element item2 = new Element("GROUP"); 
      item2.setAttribute("number", "2"); 
      item2.setAttribute("name", "gruppo2"); 
      item2.setAttribute("checkin", "12/5/2012"); 
      item2.setAttribute("checkout", "20/5/2012"); 
      item2.setAttribute("deposit", "20"); 
      Element descr2 = new Element("RICHIESTA");
      descr2.setAttribute("singole", "1");
      descr2.setAttribute("doppie", "1");
      descr2.setAttribute("matrimoniali", "0");
      descr2.setText("non eseguita");
      item2.addContent(descr2); 
      
      root.addContent(item2); 
      
      Element item3 = new Element("GROUP"); 
      item3.setAttribute("number", "3"); 
      item3.setAttribute("name", "gruppo3"); 
      item3.setAttribute("checkin", "12/5/2012"); 
      item3.setAttribute("checkout", "20/5/2012"); 
      item3.setAttribute("deposit", "20");    
      Element descr3 = new Element("RICHIESTA");
      descr3.setAttribute("singole", "1");
      descr3.setAttribute("doppie", "0");
      descr3.setAttribute("matrimoniali", "0");
      descr3.setText("non eseguita");
      item3.addContent(descr3); 
      root.addContent(item3); 
*/
      //Creazione dell'oggetto XMLOutputter 
      XMLOutputter outputter = new XMLOutputter(); 
      //Imposto il formato dell'outputter come "bel formato" 
      outputter.setFormat(Format.getPrettyFormat()); 
      //Produco l'output sul file xml.foo 
      outputter.output(document, new FileOutputStream("groups.xml")); 
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