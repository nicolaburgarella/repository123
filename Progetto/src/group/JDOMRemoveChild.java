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
 * The Class JDOMRemoveChild.
 */
public class JDOMRemoveChild {
  
  /**
   * Instantiates a new jDOM remove child.
   *
   * @param number the number
   */
  public JDOMRemoveChild(int number) {
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
        	if(Integer.parseInt(((Element)children.get(i)).getAttributeValue("number")) == number){
        		root.removeContent(((Element)children.get(i)));
        	}
        	/*else{
       			System.out.println("Gruppo da eliminare non trovato");
       		}*/
        	
        }
           
		
		//Creazione dell'oggetto XMLOutputter 
	      XMLOutputter outputter = new XMLOutputter(); 
	      //Imposto il formato dell'outputter come "bel formato" 
	      outputter.setFormat(Format.getPrettyFormat()); 
	      //Produco l'output sul file xml.foo 
	      outputter.output(document, new FileOutputStream("groups.xml")); 
	      System.out.println("File creato:"); 
	      //Stampo l'output anche sullo standard output 
	      outputter.output(document, System.out); 
      
   
    } catch (Exception e) {
      System.out.println(e);
    }
  }
  
  /**
   * Instantiates a new jDOM remove child.
   *
   * @param name the name
   */
  public JDOMRemoveChild(String name) {
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
	          		root.removeContent(((Element)children.get(i)));
	          	}
	          	/*else{
	         			System.out.println("Gruppo da eliminare non trovato");
	         		}*/
	          	
	          }
	             
	  		
	  		//Creazione dell'oggetto XMLOutputter 
	  	      XMLOutputter outputter = new XMLOutputter(); 
	  	      //Imposto il formato dell'outputter come "bel formato" 
	  	      outputter.setFormat(Format.getPrettyFormat()); 
	  	      //Produco l'output sul file xml.foo 
	  	      outputter.output(document, new FileOutputStream("groups.xml")); 
	  	      System.out.println("File creato:"); 
	  	      //Stampo l'output anche sullo standard output 
	  	      outputter.output(document, System.out); 
	        
	     
	      } catch (Exception e) {
	        System.out.println(e);
	      }
	    }
}