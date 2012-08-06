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
 * The Class JDOMExtractGroup.
 */
public class JDOMExtractGroup {
	
	
  /**
   * Instantiates a new jDOM extract group.
   *
   * @param name the name
   */
  public JDOMExtractGroup(String name) {
/*String XmlFile = "<Company>" 
  + "<Employee name=\"satya\" age=\"25\"/> "
    + "<Employee  name=\"bharat\" age=\"24\"/>" 
   + "</Company>";*/
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
        	/*else{
       			System.out.println("Gruppo da estrarre non trovato");
       		}*/
        	
        }
           
		
		//Creazione dell'oggetto XMLOutputter 
	      XMLOutputter outputter = new XMLOutputter(); 
	      //Imposto il formato dell'outputter come "bel formato" 
	      outputter.setFormat(Format.getPrettyFormat()); 
	      //Produco l'output sul file xml.foo 
	      outputter.output(document, new FileOutputStream("groups.xml")); 
	      //System.out.println("File creato:"); 
	      //Stampo l'output anche sullo standard output 
	      //outputter.output(document, System.out); 
      
   
    } catch (Exception e) {
      System.out.println(e);
    }
  }
   
}