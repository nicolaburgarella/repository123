package room;

import org.jdom.input.SAXBuilder;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.output.XMLOutputter;
import org.jdom.output.Format;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class CheckFreeRooms.
 */
public class CheckFreeRooms {
  
  /**
   * Instantiates a new check free rooms.
   */
  public CheckFreeRooms() {
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
        	if(((Element)children.get(i)).getAttributeValue("free").equalsIgnoreCase("yes")){
        		System.out.println("room details:");
        		
                System.out.println("\tNumero: " + ((Element)children.get(i)).getAttributeValue("number")); 
                System.out.println("\tComposizione: " + ((Element)children.get(i)).getAttributeValue("composition"));
                System.out.println("\tDescrizione: " + ((Element)children.get(i)).getAttributeValue("description")); 
                System.out.println("\tCosto: " + ((Element)children.get(i)).getAttributeValue("fee"));
                System.out.println("\tLibera: " + ((Element)children.get(i)).getAttributeValue("free")+"\n");
        	}
        	/*else{
       			System.out.println("Gruppo da estrarre non trovato");
       		}*/
        	
        }
   
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}