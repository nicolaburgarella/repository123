package group;

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
 * The Class JDOMExtractGroup extracts groups data details from xml file groups.xml.
 */
public class JDOMExtractGroup {
	
	
  /**
   * Instantiates a new jDOM extract group.
   *
   * @param name the name of the group to be extracted
   */
  public JDOMExtractGroup(String name) {

	  SAXBuilder builder = new SAXBuilder(); 
      Document document = null;
	try {
		document = builder.build(new File("groups.xml"));
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
        List children = root.getChildren("GROUP"); 
        for(int i=0;i<(children.size());i++){
        	if(((Element)children.get(i)).getAttributeValue("name").equalsIgnoreCase(name)){
        		System.out.println("Group details:");
                System.out.println("\tNumero: " + ((Element)children.get(i)).getAttributeValue("number")); 
                System.out.println("\tNome: " + ((Element)children.get(i)).getAttributeValue("name"));
                System.out.println("\tData checkin: " + ((Element)children.get(i)).getAttributeValue("checkin")); 
                System.out.println("\tData checkout: " + ((Element)children.get(i)).getAttributeValue("checkout"));
                System.out.println("\tAcconto: " + ((Element)children.get(i)).getAttributeValue("deposit")+"\n");
        	}
        	
        	
        }
           
		
		//Creazione dell'oggetto XMLOutputter 
	      XMLOutputter outputter = new XMLOutputter(); 
	      //Imposto il formato dell'outputter come "bel formato" 
	      outputter.setFormat(Format.getPrettyFormat()); 
	      //Produco l'output sul file xml.foo 
	      outputter.output(document, new FileOutputStream("groups.xml")); 
      
   
    } catch (Exception e) {
      System.out.println(e);
    }
  }
   
}