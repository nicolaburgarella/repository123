package room;

import org.jdom.*; 
import org.jdom.output.*; 
import java.io.*; 

// TODO: Auto-generated Javadoc
/**
 * The controller Class JDOMWriter.
 */
public class JDOMWriter { 

  /**
   * Initalize all the rooms from the file rooms.xml.
   */
  public JDOMWriter() {
	// TODO Auto-generated constructor stub
    try { 
      //Elemento radice 
      Element root = new Element("ROOM_LIST"); 
      //Documento 
      Document document = new Document(root); 

      Element item0 = new Element("ROOM"); 
      item0.setAttribute("number", "0"); 
      item0.setAttribute("fee", "75"); 
      item0.setAttribute("free", "yes"); 
      item0.setAttribute("description", "La camera 0 e' una prova"); 
      item0.setAttribute("composition", "2"); 
      Element descr0 = new Element("EXTRA");
      descr0.setAttribute("cost", "50");
      descr0.setAttribute("date", "12/5/2012");
      descr0.setText("Ristorante"); 
      item0.addContent(descr0); 
      Element descr00 = new Element("EXTRA");
      descr00.setAttribute("cost", "50");
      descr00.setAttribute("date", "12/5/2012");
      descr00.setText("Bar"); 
      item0.addContent(descr00);
      root.addContent(item0);
      
      Element item1 = new Element("ROOM"); 
      item1.setAttribute("number", "1"); 
      item1.setAttribute("fee", "75"); 
      item1.setAttribute("free", "yes"); 
      item1.setAttribute("description", "no"); 
      item1.setAttribute("composition", "2"); 
      root.addContent(item1); 

      Element item2 = new Element("ROOM"); 
      item2.setAttribute("number", "2"); 
      item2.setAttribute("fee", "75"); 
      item2.setAttribute("free", "yes"); 
      item2.setAttribute("description", "no"); 
      item2.setAttribute("composition", "1+1"); 
      root.addContent(item2); 
      
      Element item3 = new Element("ROOM"); 
      item3.setAttribute("number", "3"); 
      item3.setAttribute("fee", "75"); 
      item3.setAttribute("free", "yes"); 
      item3.setAttribute("description", "no"); 
      item3.setAttribute("composition", "1"); 
      root.addContent(item3); 
      
      Element item4 = new Element("ROOM"); 
      item4.setAttribute("number", "4"); 
      item4.setAttribute("fee", "75"); 
      item4.setAttribute("free", "yes"); 
      item4.setAttribute("description", "no"); 
      item4.setAttribute("composition", "1"); 
      root.addContent(item4);
      
      
      Element item5 = new Element("ROOM"); 
      item5.setAttribute("number", "5"); 
      item5.setAttribute("fee", "75"); 
      item5.setAttribute("free", "yes"); 
      item5.setAttribute("description", "no"); 
      item5.setAttribute("composition", "1+1"); 
      root.addContent(item5);
      
      
      Element item6 = new Element("ROOM"); 
      item6.setAttribute("number", "6"); 
      item6.setAttribute("fee", "75"); 
      item6.setAttribute("free", "yes"); 
      item6.setAttribute("description", "no"); 
      item6.setAttribute("composition", "2"); 
      root.addContent(item6);
      
      Element item7 = new Element("ROOM"); 
      item7.setAttribute("number", "7"); 
      item7.setAttribute("fee", "75"); 
      item7.setAttribute("free", "yes"); 
      item7.setAttribute("description", "no"); 
      item7.setAttribute("composition", "1"); 
      root.addContent(item7);
      
      
      Element item8 = new Element("ROOM"); 
      item8.setAttribute("number", "8"); 
      item8.setAttribute("fee", "75"); 
      item8.setAttribute("free", "yes"); 
      item8.setAttribute("description", "no"); 
      item8.setAttribute("composition", "1+1");
      root.addContent(item8);
      
      
      Element item9 = new Element("ROOM"); 
      item9.setAttribute("number", "9"); 
      item9.setAttribute("fee", "75"); 
      item9.setAttribute("free", "yes"); 
      item9.setAttribute("description", "no"); 
      item9.setAttribute("composition", "2"); 
      root.addContent(item9);
      
      
      Element item10 = new Element("ROOM"); 
      item10.setAttribute("number", "10"); 
      item10.setAttribute("fee", "75"); 
      item10.setAttribute("free", "yes"); 
      item10.setAttribute("description", "no"); 
      item10.setAttribute("composition", "1");
      root.addContent(item10);
      
      
      Element item11 = new Element("ROOM"); 
      item11.setAttribute("number", "11"); 
      item11.setAttribute("fee", "75"); 
      item11.setAttribute("free", "yes"); 
      item11.setAttribute("description", "no"); 
      item11.setAttribute("composition", "1+1"); 
      root.addContent(item11);
      
      
      Element item12 = new Element("ROOM"); 
      item12.setAttribute("number", "12"); 
      item12.setAttribute("fee", "75"); 
      item12.setAttribute("free", "yes"); 
      item12.setAttribute("description", "no"); 
      item12.setAttribute("composition", "2"); 
      root.addContent(item12);
      
      
      Element item13 = new Element("ROOM"); 
      item13.setAttribute("number", "13"); 
      item13.setAttribute("fee", "75"); 
      item13.setAttribute("free", "yes"); 
      item13.setAttribute("description", "no"); 
      item13.setAttribute("composition", "1"); 
      root.addContent(item13);
      
      
      Element item14 = new Element("ROOM"); 
      item14.setAttribute("number", "14"); 
      item14.setAttribute("fee", "75"); 
      item14.setAttribute("free", "yes"); 
      item14.setAttribute("description", "no"); 
      item14.setAttribute("composition", "1+1");
      root.addContent(item14);
      
      
      Element item15 = new Element("ROOM"); 
      item15.setAttribute("number", "15"); 
      item15.setAttribute("fee", "75"); 
      item15.setAttribute("free", "yes"); 
      item15.setAttribute("description", "no"); 
      item15.setAttribute("composition", "2"); 
      root.addContent(item15);
      
      
      Element item16 = new Element("ROOM"); 
      item16.setAttribute("number", "16"); 
      item16.setAttribute("fee", "75"); 
      item16.setAttribute("free", "yes"); 
      item16.setAttribute("description", "no"); 
      item16.setAttribute("composition", "1"); 
      root.addContent(item16);
      
      
      Element item17 = new Element("ROOM"); 
      item17.setAttribute("number", "17"); 
      item17.setAttribute("fee", "75"); 
      item17.setAttribute("free", "yes"); 
      item17.setAttribute("description", "no"); 
      item17.setAttribute("composition", "1+1"); 
      root.addContent(item17);
      
      
      Element item18 = new Element("ROOM"); 
      item18.setAttribute("number", "18"); 
      item18.setAttribute("fee", "75"); 
      item18.setAttribute("free", "yes"); 
      item18.setAttribute("description", "no"); 
      item18.setAttribute("composition", "2"); 
      root.addContent(item18);
      

      //Creazione dell'oggetto XMLOutputter 
      XMLOutputter outputter = new XMLOutputter(); 
      //Imposto il formato dell'outputter come "bel formato" 
      outputter.setFormat(Format.getPrettyFormat()); 
      //Produco l'output sul file xml.foo 
      outputter.output(document, new FileOutputStream("rooms.xml")); 
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