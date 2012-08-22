package group;

import java.io.*; 
import java.util.*; 

import org.jdom.*; 
import org.jdom.input.*; 
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

	// TODO: Auto-generated Javadoc
/**
	 * The Class JDOMConfirmRequest sets as eseguita the request field into xml data structure groups.xml.
	 */
	public class JDOMConfirmRequest { 

	  /**
  	 * Instantiates a new jDOM confirm request.
  	 *
  	 * @param number the number
  	 */
  	public JDOMConfirmRequest(int number) { 
	    try { 
	      //Creo un SAXBuilder e con esco costruisco un document 
	      SAXBuilder builder = new SAXBuilder(); 
	      Document document = builder.build(new File("groups.xml")); 
	      
	       //Prendo la radice 
	      Element root = document.getRootElement(); 
	      //Estraggo i figli dalla radice 
	      List children = root.getChildren(); 
	      Iterator iterator = children.iterator(); 
	      
	       //Per ogni figlio 
	      while(iterator.hasNext()){ 
	        
	         Element item = (Element)iterator.next();
	    
	         if(Integer.parseInt(item.getAttributeValue("number"))==number){
	        	 item.getChild("RICHIESTA").setText("eseguita");
	         
	         System.out.println("Group details:");
	         System.out.println("\tNumero: " + item.getAttributeValue("number")); 
	         System.out.println("\tNome: " + item.getAttributeValue("name"));
	         System.out.println("\tData checkin: " + item.getAttributeValue("checkin")); 
	         System.out.println("\tData checkout: " + item.getAttributeValue("checkout"));
	         System.out.println("\tAcconto: " + item.getAttributeValue("deposit")+"\n");
	         }
	      }
	      
	      //Creazione dell'oggetto XMLOutputter 
	      XMLOutputter outputter = new XMLOutputter(); 
	      //Imposto il formato dell'outputter come "bel formato" 
	      outputter.setFormat(Format.getPrettyFormat()); 
	      //Produco l'output sul file xml.foo 
	      outputter.output(document, new FileOutputStream("groups.xml")); 
	      System.out.println("File creato:"); 
	      //Stampo l'output anche sullo standard output
	      //stampata a video del documento xml facoltativa
	      outputter.output(document, System.out); 

	    }  
	    catch (Exception e) { 
	      System.err.println("Errore durante la lettura dal file"); 
	      e.printStackTrace(); 
	    } 

	}
	  
	  /**
  	 * Instantiates a new jDOM confirm request.
  	 *
  	 * @param groupname the groupname
  	 */
  	public JDOMConfirmRequest(String groupname) { 
		    try { 
		      //Creo un SAXBuilder e con esco costruisco un document 
		      SAXBuilder builder = new SAXBuilder(); 
		      Document document = builder.build(new File("groups.xml")); 
		      
		       //Prendo la radice 
		      Element root = document.getRootElement(); 
		      //Estraggo i figli dalla radice 
		      List children = root.getChildren(); 
		      Iterator iterator = children.iterator(); 
		      
		       //Per ogni figlio 
		      while(iterator.hasNext()){ 
		       
		         Element item = (Element)iterator.next();
		    
		   
		         if(item.getAttributeValue("name").equalsIgnoreCase(groupname)){
		        	 item.getChild("RICHIESTA").setText("eseguita");
		         
		        // stampata a video del gruppo facoltativa
		         System.out.println("Group details:");
		         System.out.println("\tNumero: " + item.getAttributeValue("number")); 
		         System.out.println("\tNome: " + item.getAttributeValue("name"));
		         System.out.println("\tData checkin: " + item.getAttributeValue("checkin")); 
		         System.out.println("\tData checkout: " + item.getAttributeValue("checkout"));
		         System.out.println("\tAcconto: " + item.getAttributeValue("deposit")+"\n");
		         }
		      }
		      
		      //Creazione dell'oggetto XMLOutputter 
		      XMLOutputter outputter = new XMLOutputter(); 
		      //Imposto il formato dell'outputter come "bel formato" 
		      outputter.setFormat(Format.getPrettyFormat()); 
		      //Produco l'output sul file xml.foo 
		      outputter.output(document, new FileOutputStream("groups.xml")); 
		      System.out.println("File creato:"); 
		      //Stampo l'output anche sullo standard output
		      //stampata a video del documento xml facoltativa
		      outputter.output(document, System.out); 

		    }  
		    catch (Exception e) { 
		      System.err.println("Errore durante la lettura dal file"); 
		      e.printStackTrace(); 
		    } 

		}

	  
	  
	}